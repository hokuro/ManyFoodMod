package mod.mfm.entity;

import mod.mfm.config.ConfigValue;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.item.ItemCore.EnumIceFlavor;
import mod.mfm.item.ItemIceCream;
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
import net.minecraftforge.fml.network.FMLPlayMessages;

public class EntityIceCream extends AbstractEntityIce {

	public static final String NAME = "entityicecream";
	public static final int LIMIT_TIME = 12000;
	private EnumIceFlavor flavor;
	private boolean inCookie;

	public EntityIceCream(FMLPlayMessages.SpawnEntity packet, World world) {
		this(Mod_ManyFoods.RegistryEvents.ICECREAM, world);
	}

	public EntityIceCream(EntityType<? extends EntityIceCream> etype, World worldIn) {
		super(etype, worldIn);
		this.preventEntitySpawning = true;

		timelimit = ConfigValue.icecream.MelltingTime();
		flavor = EnumIceFlavor.ICE_VANILA;
		isDispensed = false;
	}

	public EntityIceCream(World world, BlockPos blockpos, EnumIceFlavor itemDamage, boolean cookie) {
		this(Mod_ManyFoods.RegistryEvents.ICECREAM, world);
		flavor = itemDamage;
		inCookie = cookie;
		setPositionAndRotation(blockpos.getX()+0.5f,blockpos.getY(),blockpos.getZ()+0.5f,0F,0F);
		setMotion(Vec3d.ZERO);
	}

	public EnumIceFlavor getFlavor(){
		return flavor;
	}

	public boolean isInCookie(){
		return this.inCookie;
	}

	public int countdown(){
		return timelimit;
	}

	@Override
	public void writeSpawnData(PacketBuffer data) {
		data.writeInt(flavor.getDamage());
		data.writeInt(timelimit);
		data.writeFloat(rotationYaw);
		data.writeBoolean(inCookie);
	}

	@Override
	public void readSpawnData(PacketBuffer data) {
		flavor = EnumIceFlavor.getValue(data.readInt());
		timelimit = data.readInt();
		setRotation(data.readFloat(), 0.0F);
		inCookie = data.readBoolean();
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void checkMelting() {
		boolean flagMelt = ConfigValue.icecream.MelltingFlag();
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
	public boolean processInitialInteract(PlayerEntity entityplayer,  Hand hand){
		if (this.timelimit > 0){
			if (ModUtil.compareItemStacks(entityplayer.getHeldItem(hand), new ItemStack(Items.COOKIE))
					&& !inCookie){
				if (!this.world.isRemote){
					entityplayer.getHeldItem(hand).shrink(1);;
					if (entityplayer.getHeldItem(hand).getCount() <= 0){
						entityplayer.setHeldItem(hand, ItemStack.EMPTY);
					}
				}
				inCookie = true;
			}else if (hand == Hand.MAIN_HAND){
				if (entityplayer.canEat(ConfigValue.icecream.CanEatAllways())){
					if (!this.world.isRemote){
						ItemIceCream.onEat(getIce(), this.world, entityplayer);
					}
					this.timelimit = 0;
				}else{
					if (!this.world.isRemote){
						entityplayer.sendStatusMessage(new StringTextComponent("Not hungry"),false);
					}
				}
			}
		}else{
			if (!this.world.isRemote){
				if (hand == Hand.MAIN_HAND){
					dropItem();
					remove();
				}
			}
		}
		return true;
	}

	@Override
	protected ItemStack getIce() {
		if (this.inCookie) {
			return new ItemStack(flavor.getIceCookie());
		}else {
			return new ItemStack(flavor.getIcecream());
		}
	}

	@Override
	protected void readAdditional(CompoundNBT tagCompund) {
		flavor = EnumIceFlavor.getValue(tagCompund.getInt("Flavor"));
		timelimit = tagCompund.getShort("Limit");
		inCookie = tagCompund.getBoolean("InCookie");
	}

	@Override
	protected void writeAdditional(CompoundNBT tagCompound) {
		tagCompound.putInt("Flavor",flavor.getDamage());
		tagCompound.putInt("Limit",timelimit);
		tagCompound.putBoolean("InCookie", inCookie);
	}

	@Override
	protected void dropItem(){
		if (timelimit > 0){
			entityDropItem(getIce(),0.0F);
		}else{
			entityDropItem(new ItemStack(Items.GLASS_BOTTLE,1),0.0F);
		}
	}
}
