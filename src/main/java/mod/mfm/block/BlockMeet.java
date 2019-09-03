package mod.mfm.block;

import java.util.Random;

import javax.annotation.Nullable;

import mod.mfm.core.Mod_MeetBlock;
import mod.mfm.item.ItemCore;
import mod.mfm.network.MessageHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockMeet extends Block {

	protected final Item rawItem;
	protected final boolean isCooked;
	protected int heal = 0;
	protected float saturationLevel = 0;
	protected Block cookedBlock;


	public BlockMeet(Item itm, boolean cooked) {
		this(itm,cooked,Blocks.AIR);
	}

	public BlockMeet(Item rawitem, boolean cancooked, Block cooked) {
		super(Properties.create(Mod_MeetBlock.materialMeet)
				.sound(SoundType.SLIME)
				.hardnessAndResistance(0.3F,0.0F)
				.tickRandomly());
		rawItem = rawitem;
		isCooked = cancooked;
		cookedBlock = cooked!=null?cooked:Blocks.AIR;

		if (rawitem.isFood()) {
			heal= rawitem.getFood().getHealing();
			saturationLevel = rawitem.getFood().getSaturation();
		}else {
			heal= 1;
			saturationLevel =  0.20F;
		}
	}

    @Override
    @Deprecated
    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return false;
    }

    @Override
    @Deprecated
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
    	if (!worldIn.isRemote){
    		setTimeBuren(worldIn,pos);
    	}
    }

    @Override
    @Deprecated
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
    	if (!worldIn.isRemote){
    		setTimeBuren(worldIn,pos);
    	}
    }

//    @Override
//    @Deprecated
//    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
//		return new ArrayList<ItemStack>(){
//			{add(new ItemStack(rawItem,4));}
//		};
//    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        //super.harvestBlock(worldIn, player, pos, state, te, stack);
        if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {
        	worldIn.removeBlock(pos, false);
            spawnDrops(state, worldIn, pos, te, player, new ItemStack(rawItem,4));
        }
     }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult hit) {
        ItemStack stack = playerIn.getHeldItemMainhand();
        if (stack.getItem() == Items.FLINT_AND_STEEL){
        	if (isCooked){
        		// 調理済みなら消し炭に
        		worldIn.setBlockState(pos,Blocks.AIR.getDefaultState());
				if (worldIn.isRemote){
					DisplayParticle(worldIn,pos);
				}
        	}else{
        		// 未調理なら調理済みに
        		worldIn.setBlockState(pos, cookedBlock.getDefaultState());
				if (worldIn.isRemote){
					DisplayParticle(worldIn,pos);
				}
        	}
        	return true;
        }else if(playerIn.isSneaking()){
        	if (playerIn.canEat(false) || playerIn.isCreative()){
        		boolean cooked = this.getCooked(state);
        		onEat(worldIn,playerIn, this, cooked);
        		worldIn.setBlockState(pos,Blocks.AIR.getDefaultState());
            	return true;
        	}
        }
        return false;
    }

//    @Override
//    protected ItemStack getSilkTouchDrop(BlockState state)
//    {
//        return new ItemStack(this, 1);
//    }

    @Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

	@Override
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		if (getBurnAround(worldIn,pos)){
			if (this.getCooked(state)){
				worldIn.setBlockState(pos,Blocks.AIR.getDefaultState());
			}else{
				worldIn.setBlockState(pos, cookedBlock.getDefaultState());
			}
			for (PlayerEntity pl : worldIn.getPlayers()){
				if (pl instanceof ServerPlayerEntity && pl.getDistanceSq(pos.getX(),pos.getY(),pos.getZ()) < 100){
					MessageHandler.SendBurnSound(pos.getX(),pos.getY(),pos.getZ(),(ServerPlayerEntity)pl);
				}
			}
		}
	}

    public boolean getCooked(BlockState state){
    	return isCooked;
    }

    public BlockState setCooked(BlockState state, boolean cook){
    	return this.getDefaultState();
    }

    protected void setTimeBuren(World worldIn, BlockPos pos){
    	if (getBurnAround(worldIn, pos)){
    		//worldIn.scheduleBlockUpdate(pos, this, 3*20 + worldIn.rand.nextInt(200),1);
    	}
    }

    protected boolean getBurnAround(World worldIn, BlockPos pos){
    	boolean buren = false;
    	if (worldIn.getBlockState(pos.offset(Direction.NORTH)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}else if (worldIn.getBlockState(pos.offset(Direction.SOUTH)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}else if (worldIn.getBlockState(pos.offset(Direction.EAST)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}else if (worldIn.getBlockState(pos.offset(Direction.WEST)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}else if (worldIn.getBlockState(pos.offset(Direction.DOWN)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}else if (worldIn.getBlockState(pos.offset(Direction.UP)).getBlock() == Blocks.FIRE){
    		buren = true;
    	}
    	return buren;
    }

    public static void DisplayParticle(World worldIn, BlockPos pos){
		double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + worldIn.rand.nextDouble();
        double d2 = (double)pos.getZ() + 0.5D;
        double d4 = worldIn.rand.nextDouble() * 0.6D - 0.3D;
	    worldIn.addParticle(ParticleTypes.SMOKE, d0 - 0.52D, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
	    worldIn.playSound((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F + worldIn.rand.nextFloat(), worldIn.rand.nextFloat() * 0.7F + 0.3F, false);

    }

    public static void onEat(World worldIn, PlayerEntity playerIn, BlockMeet blk, boolean cooked){
    		playerIn.getFoodStats().addStats(blk.heal, blk.saturationLevel);
    		if (!cooked || blk.rawItem == ItemCore.cooked_rotten_flesh){
    			if (worldIn.rand.nextFloat() < 0.7){
        			playerIn.addPotionEffect(new EffectInstance(Effects.NAUSEA,20*60*4,4));
        			playerIn.addPotionEffect(new EffectInstance(Effects.HUNGER,20*60*4,4));
    			}
    		}
    }
}
