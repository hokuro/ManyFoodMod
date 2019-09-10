package mod.mfm.entity;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.NetworkHooks;

public abstract class AbstractEntityIce extends Entity implements IEntityAdditionalSpawnData, IProjectile {
	public boolean isDispensed;
	protected static final DataParameter<Boolean> DISPENCE = EntityDataManager.<Boolean>createKey(EntityCrashedIce.class, DataSerializers.BOOLEAN);

	protected double velX;
	protected double velY;
	protected double velZ;

	protected double iceX;
	protected double iceY;
	protected double iceZ;


	protected double iceYaw;
	protected double icePitch;

	protected int posIncrements;
	protected int timelimit;

	public AbstractEntityIce(EntityType<? extends AbstractEntityIce> etype, World worldIn) {
		super(etype, worldIn);
		this.preventEntitySpawning = true;
		isDispensed = false;
	}

	@Override
	protected boolean canTriggerWalking(){
		return false;
	}

	@Override
	public double getYOffset(){
		return 0.0F;
	}


	@Override
	protected void registerData() {
		this.dataManager.register(DISPENCE, isDispensed);
	}

	@Override
	public AxisAlignedBB getCollisionBox(Entity par1Entity) {
		return par1Entity.getBoundingBox();
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox() {
		return this.getBoundingBox();
	}

	@Override
	public boolean canBePushed() {
		return true;
	}

	@Override
	public boolean handleWaterMovement() {
		// 独自の水没判定
		AxisAlignedBB  bbbox = this.getBoundingBox();
		MutableBoundingBox box = new MutableBoundingBox((int)bbbox.minX, (int)bbbox.minY,(int)bbbox.minZ,(int)bbbox.maxX+1,(int)bbbox.maxY+1,(int)bbbox.maxZ+1);
		if (!this.world.isAreaLoaded(this.getPosition(),1)) {
			return false;
		} else {
			boolean ret = false;

			for (int x = box.minX; x < box.maxX; ++x) {
				for (int y = box.minY; y < box.maxY; ++y) {
					for (int z = box.minZ; z < box.maxZ; ++z) {
						BlockState state =  this.world.getBlockState(new BlockPos(x,y,z));
						Block blk = state.getBlock();
						if (blk != null && blk.getMaterial(null) == Material.WATER) {
							inWater = true;
							int level = (int)state.getValues().get(FlowingFluidBlock.LEVEL);
							if (level < 8) {level = 0;}
							double var16 = (double)((float)(y + 1) - (level+1)/9.0F);
							if ((double)box.maxY >= var16) {
								ret = true;
							}
						} else {
							inWater = false;
						}
					}
				}
			}
			return ret;
		}
	}


	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float pDammage) {
		// 攻撃したもの
		Entity entity = damagesource.getTrueSource();
		if(this.world.isRemote || !this.isAlive()) {
			return true;
		}
		markVelocityChanged();
		if (entity instanceof PlayerEntity) {
			// プレイヤーからの攻撃ならアイテムドロップ
			dropItem();
			remove();
		}
		return true;
	}


	@Override
	public boolean canBeCollidedWith() {
		return this.isAlive();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean p_180426_10_)
     {		this.iceX = x;
		this.iceY = y;
		this.iceZ = z;
		this.iceYaw = (double)yaw;
		this.icePitch = (double)pitch;
		this.posIncrements = posRotationIncrements + 2;
		this.setMotion(velX, velY, velZ);
		this.setPosition(x, y, z);
		this.setRotation(yaw, pitch);
	}

	@Override
	public void setVelocity(double d, double d1, double d2) {
		velX = d;
		velY = d1;
		velZ = d2;
		setMotion(d,d1,d2);
	}

	@Override
	public void tick() {

		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		super.tick();

		// ボートの判定のコピー
		// ボートは直接サーバーと位置情報を同期させているわけではなく、予測位置計算系に値を渡している。
		// 因みにボートの座標同期間隔は結構長めなので動きが変。

		if (timelimit > 0){
			checkMelting();
		}

		if (this.world.isRemote) {
			// Client
			if (this.posIncrements > 0) {
				// 移動
				double calcX = this.posX + (this.iceX - this.posX) / (double)this.posIncrements;
				double calcY = this.posY + (this.iceY - this.posY) / (double)this.posIncrements;
				double calcZ = this.posZ + (this.iceZ - this.posZ) / (double)this.posIncrements;
				double calcYank = MathHelper.wrapDegrees(this.iceYaw - (double)this.rotationYaw);
				this.rotationYaw = (float)((double)this.rotationYaw + calcYank / (double)this.posIncrements);
				this.rotationPitch = (float)((double)this.rotationPitch + (this.icePitch - (double)this.rotationPitch) / (double)this.posIncrements);
				--this.posIncrements;
				this.setPosition(calcX, calcY, calcZ);
				this.setRotation(this.rotationYaw, this.rotationPitch);
			} else {
				this.setPosition(this.posX, this.posY, this.posZ);
				this.setRotation(this.rotationYaw, this.rotationPitch);
			}
		} else {
			// Server
			double motx = this.getMotion().getX();
			double moty = this.getMotion().getY();
			double motz = this.getMotion().getZ();
			// 落下
			moty -= 0.08D;

			// 最高速度判定
			double lmaxspeed = isDispensed() ? 10.0D : 0.35D;
			double spd = Math.sqrt(motx * motx + motz * motz);
			if (spd > lmaxspeed) {
				double vel = lmaxspeed / spd;
				motx *= vel;
				motz *= vel;
				spd = lmaxspeed;
				setMotion(motx,moty,motz);
			}
			if (this.onGround) {
				motx *= 0.5D;
				moty *= 0.5D;
				motz *= 0.5D;
				setDispensed(false);
				setMotion(motx,moty,motz);
			}
			this.move(MoverType.PLAYER, new Vec3d(motx,moty,motz));

			motx *= 0.9900000095367432D;
			moty *= 0.949999988079071D;
			motz *= 0.9900000095367432D;

			// ヘッディング
			this.rotationPitch = 0.0F;
			double yaw = (double)this.rotationYaw;
			double x = this.prevPosX - this.posX;
			double z = this.prevPosZ - this.posZ;

			if (x * x + z * z > 0.001D) {
				yaw = (double)((float)(Math.atan2(z, x) * 180.0D / Math.PI));
			}

			double nextYaw = MathHelper.wrapDegrees(yaw - (double)this.rotationYaw);
			if (nextYaw > 20.0D) {
				nextYaw = 20.0D;
			}
			if (nextYaw < -20.0D) {
				nextYaw = -20.0D;
			}

			this.rotationYaw = (float)((double)this.rotationYaw + nextYaw);
			this.setRotation(this.rotationYaw, this.rotationPitch);


			// 当たり判定
			List<Entity> entList = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getBoundingBox().expand(0.0D, 1.0D, 0.0D));
			if (entList != null && !entList.isEmpty()) {
				Iterator itentList = entList.iterator();
				while (itentList.hasNext()) {
					Entity ent = (Entity)itentList.next();
					if (ent.canBePushed() && !(ent instanceof EntityCrashedIce)){
						this.applyEntityCollision(ent);
					}
				}
			}
			if (inWater){
				// 水にぬれるとアイテム化
				dropItem();
				this.remove();
			}
		}
	}

	protected abstract void checkMelting();
	protected abstract ItemStack getIce();
	protected abstract void dropItem();

	//////////////////////////////////////////////////////////////////////////////////////////////////
	// Dispenser
	public void setDispensed(boolean isDispensed) {
		this.dataManager.set(DISPENCE, isDispensed);
	}

	// 射出判定
	public boolean isDispensed() {
		try{
			return dataManager.get(DISPENCE);
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
		float f2 = MathHelper.sqrt(x*x+y*y+z*z);
		y /= f2;
		x /= f2;
		z /= f2;

		x += rand.nextGaussian() * 0.0074999998323619366D * (double)inaccuracy;
		y += rand.nextGaussian() * 0.0074999998323619366D * (double)inaccuracy;
		z += rand.nextGaussian() * 0.0074999998323619366D * (double)inaccuracy;

		x *= velocity;
		y *= velocity;
		z *= velocity;

		this.setMotion(x,y,z);
		float f3 = MathHelper.sqrt(x*x+z*z);
		prevRotationYaw = rotationYaw = (float)((Math.atan2(x, z) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float)((Math.atan2(y, f3) * 180D) / 3.1415927410125732D);
		setDispensed(true);
	}

	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}
