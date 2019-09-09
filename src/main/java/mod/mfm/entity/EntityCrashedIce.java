package mod.mfm.entity;

import mod.mfm.config.ConfigValue;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.item.ItemCore;
import mod.mfm.item.ItemCore.EnumFlapeSyrup;
import mod.mfm.item.ItemCrashedIce;
import mod.mfm.item.ItemSyrup;
import mod.mfm.util.ModUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class EntityCrashedIce extends AbstractEntityIce {

	public static final String NAME = "entitycrashedice";
	public static final int LIMIT_TIME = 12000;
	private EnumFlapeSyrup flavor;
	private boolean isMillk;

	public EntityCrashedIce(EntityType<? extends EntityCrashedIce> etype, World worldIn) {
		super(etype, worldIn);
		this.preventEntitySpawning = true;
		timelimit = ConfigValue.crashedice.MelltingTime();
		flavor = EnumFlapeSyrup.SYRUP_NONE;
		isDispensed = false;
	}

	public EntityCrashedIce(World world, BlockPos blockpos, EnumFlapeSyrup itemFlavor, boolean millk) {
		this(Mod_ManyFoods.RegistryEvents.CRASHEDICE, world);
		flavor = itemFlavor;
		isMillk = millk;
		setPositionAndRotation(blockpos.getX()+0.5f,blockpos.getY(),blockpos.getZ()+0.5f,0F,0F);
		this.setMotion(Vec3d.ZERO);
		this.prevPosX = blockpos.getX();
		this.prevPosY = blockpos.getY();
		this.prevPosZ = blockpos.getZ();
	}

	public EnumFlapeSyrup getFlavor(){
		return flavor;
	}

	public boolean isMillk() {
		return isMillk;
	}

	public int countdown(){
		return timelimit;
	}

	@Override
	public void writeSpawnData(PacketBuffer data) {
		data.writeInt(flavor.getDamage());
		data.writeInt(timelimit);
		data.writeFloat(rotationYaw);
		data.writeBoolean(isMillk);
	}

	@Override
	public void readSpawnData(PacketBuffer data) {
		flavor = EnumFlapeSyrup.getValue(data.readInt());
		timelimit = data.readInt();
		setRotation(data.readFloat(), 0.0F);
		isMillk = data.readBoolean();
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void checkMelting() {
		boolean flagMelt = ConfigValue.crashedice.MelltingFlag();
		BlockPos pos = new BlockPos(this.posX,this.posY,this.posZ);
		// 周囲に氷があるか確認
		for ( int x = -1; x <= 1 && flagMelt; x++){
			for (int y = -1; y <= 1 && flagMelt; y++){
				for ( int z = -1; z <= 1 && flagMelt; z++){
					BlockState state =  this.world.getBlockState(pos.add(x,y,z));
					if ( state.getMaterial() == Material.ICE || state.getBlock() == Blocks.PACKED_ICE || state.getBlock() == Blocks.FROSTED_ICE || state.getBlock() == Blocks.BLUE_ICE){
						flagMelt = false;
					}
				}
			}
		}

		if (flagMelt){
			Biome biome = this.world.getBiome(pos);
			int dec = 2;
			float temp = biome.getTemperature(pos);
			if (temp > 0.9){
				dec = 4;
			}else if(temp > 0 && temp < 0.4){
				dec = 1;
			}else if (temp <= 0){
				dec = 0;
			}
			timelimit -=dec;
		}
	}

	@Override
	public boolean processInitialInteract(PlayerEntity entityplayer, Hand hand){

		if (timelimit > 0){
			// 練乳を持っている場合
			if (ModUtil.compareItemStacks(entityplayer.getHeldItem(hand), new ItemStack(ItemCore.item_syrupmilk)) && !isMillk ){
				// 練乳を所持しており、かき氷事態に練乳がかかっていない場合
				// 練乳かき氷に変える
				this.isMillk = true;
				if (!this.world.isRemote){
					entityplayer.getHeldItem(hand).shrink(1);;
					if (entityplayer.getHeldItem(hand).getCount() <= 0){
						entityplayer.setHeldItem(hand, ItemStack.EMPTY);
					}
		            if (!entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET,1))){
		            	entityplayer.dropItem(new ItemStack(Items.BUCKET), false);
		            }
				}
				// シロップを持っている場合
			}else if ( entityplayer.getHeldItem(hand).getItem() instanceof ItemSyrup && this.flavor == EnumFlapeSyrup.SYRUP_NONE){
				// ただのかき氷にシロップを持って接触した場合
				// 持っているシロップをかける
				this.flavor = ((ItemSyrup)entityplayer.getHeldItem(hand).getItem()).getFlavor();
				if (!this.world.isRemote){
					entityplayer.getHeldItem(hand).shrink(1);;
					if (entityplayer.getHeldItem(hand).getCount() <= 0){
						entityplayer.setHeldItem(hand, ItemStack.EMPTY);
					}
					if (!entityplayer.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE,1))){
			            	entityplayer.dropItem(new ItemStack(Items.GLASS_BOTTLE), false);
			        }
				}
			}else{
				if (hand == Hand.MAIN_HAND){
					if (entityplayer.canEat(ConfigValue.crashedice.CanEatAllways())){
						if (!this.world.isRemote){
							ItemCrashedIce.onEat(getIce(), this.world, entityplayer);
						}
			            timelimit = 0;
					}else{
						if (!this.world.isRemote){
							entityplayer.sendStatusMessage(new StringTextComponent("Not hungry"),false);
						}
					}
				}
			}
		}else{
			if (!this.world.isRemote){
				if (hand == Hand.MAIN_HAND){
					// 完全に溶けている場合、秋ガラスを回収する
					dropItem();
					remove();
				}
			}
		}

		return true;
	}

	@Override
	protected ItemStack getIce() {
		if (this.isMillk) {
			return new ItemStack(this.flavor.getMilkCrushIce());
		}else {
			return new ItemStack(this.flavor.getCrushIce());
		}
	}

	@Override
	public void writeAdditional(CompoundNBT tagCompund) {
		tagCompund.putInt("Flavor",flavor.getDamage());
		tagCompund.putInt("Limit",timelimit);
		tagCompund.putBoolean("IsMillk", isMillk);
	}

	@Override
	public void readAdditional(CompoundNBT tagCompund) {
		flavor = EnumFlapeSyrup.getValue(tagCompund.getInt("Flavor"));
		timelimit = tagCompund.getShort("Limit");
		isMillk = tagCompund.getBoolean("IsMillk");
	}

	@Override
	protected void dropItem(){
		if (timelimit > 0){
			entityDropItem(getIce(), 0.0F);
		}else{
			entityDropItem(new ItemStack(ItemCore.item_icefoodbowl, 1),0.0F);
		}
	}
}
