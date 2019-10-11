package mod.mfm.block;

import javax.annotation.Nullable;

import mod.mfm.tileentity.TileEntityIceCrasher;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockIceCrasher extends BlockHorizontalContainer {
	//public static final PropertyBool ISRUN = PropertyBool.create("isrun");

	protected VoxelShape bBox = Block.makeCuboidShape(0.25D,    0.25D, 0.25D,    0.75D,    0.75D, 0.75D);
	protected static final VoxelShape[][] colligBoxeis = new VoxelShape[][] {
			//South
			 {Block.makeCuboidShape(1,0,1,3,1,14),
			  Block.makeCuboidShape(12,0,1,14,1,14),
			  Block.makeCuboidShape(11.5,1,1,13.5,13,4),
			  Block.makeCuboidShape(11.5,1,11,13.5,13,14),
			  Block.makeCuboidShape(1.5,1,1,3.5,13,4),
			  Block.makeCuboidShape(1.5,1,11,3.5,13,14),
			  Block.makeCuboidShape(2,13,3,13,15,12),
			  Block.makeCuboidShape(2,6,3,13,15,12),
			  Block.makeCuboidShape(15,12,4.5,16,13,5.5),
			  Block.makeCuboidShape(14,9,4.5,15,16,11.5)},

			 //West
			 {Block.makeCuboidShape(2,0,1,15,1,3),
			  Block.makeCuboidShape(2,0,12,15,1,14),
			  Block.makeCuboidShape(2,1,11.5,5,13,13.5),
			  Block.makeCuboidShape(12,1,11.5,15,13,13.5),
			  Block.makeCuboidShape(2,1,1.5,5,13,3.5),
			  Block.makeCuboidShape(12,1,1.5,15,13,3.5),
			  Block.makeCuboidShape(4,13,2,13,15,13),
			  Block.makeCuboidShape(4,6,2,13,15,13),
			  Block.makeCuboidShape(5.5,12,15,6.5,13,16),
			  Block.makeCuboidShape(5.5,9,14,12.5,16,15)},

			 //North
			 {Block.makeCuboidShape(15,0,15,13,1,2),
			  Block.makeCuboidShape(4,0,15,2,1,2),
			  Block.makeCuboidShape(4.5,1,15,2.5,13,12),
			  Block.makeCuboidShape(4.5,1,5,2.5,13,2),
			  Block.makeCuboidShape(14.5,1,15,12.5,13,12),
			  Block.makeCuboidShape(14.5,1,5,12.5,13,2),
			  Block.makeCuboidShape(14,13,13,3,15,4),
			  Block.makeCuboidShape(14,6,13,3,15,4),
			  Block.makeCuboidShape(1,12,11.5,0,13,10.5),
			  Block.makeCuboidShape(2,9,11.5,1,16,4.5)},

			 //East
			 {Block.makeCuboidShape(14,0,15,1,1,13),
			  Block.makeCuboidShape(14,0,4,1,1,2),
			  Block.makeCuboidShape(14,1,4.5,2,13,2.5),
			  Block.makeCuboidShape(4,1,4.5,1,13,2.5),
			  Block.makeCuboidShape(14,1,14.5,2,13,12.5),
			  Block.makeCuboidShape(4,1,14.5,1,13,12.5),
			  Block.makeCuboidShape(12,13,14,3,15,3),
			  Block.makeCuboidShape(12,6,14,3,15,3),
			  Block.makeCuboidShape(10.5,12,1,9.5,13,0),
			  Block.makeCuboidShape(10.5,9,2,3.5,16,1)}
	};
    // あたり判定
    private static final AxisAlignedBB[] colligeBox =  new AxisAlignedBB[] {
    		new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 1.0D,   1.0D, 0.875D),	// SOUTH
    		new AxisAlignedBB(0.125D, 0.0D, 0.0625D, 0.9375D, 1.0D, 1.0D),	    // WEST
    		new AxisAlignedBB(0.9375D, 0.0D, 0.9375D, 0.0D,   1.0D, 0.125D),	// NORTH
    		new AxisAlignedBB(0.875D, 0.0D, 0.9375D, 0.0625D, 1.0D, 0.0D)		// EAST
    };

    protected BlockIceCrasher(Block.Properties property)
    {
        super(property);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
    }

	@Override
	public TileEntity createNewTileEntity(IBlockReader world) {
		return createTileEntity(null,world);
	}
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new TileEntityIceCrasher();
	}


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    	VoxelShape sh = Block.makeCuboidShape(0,0,0,0,0,0);
    	int idx = ((Direction)state.getValues().get(FACING)).getHorizontalIndex();
    	if (idx >= 0) {
	        for(int lp = 0; lp < colligBoxeis[idx].length; lp++){
	        	sh = VoxelShapes.or(sh, colligBoxeis[idx][lp]);
	        }
    	}
	    return sh;
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
    	VoxelShape sh = Block.makeCuboidShape(0,0,0,0,0,0);
    	int idx = ((Direction)state.getValues().get(FACING)).getHorizontalIndex();
    	if (idx >= 0) {
	        for(int lp = 0; lp < colligBoxeis[idx].length; lp++){
	        	sh = VoxelShapes.or(sh, colligBoxeis[idx][lp]);
	        }
    	}
	    return sh;
	}

    @Override
    protected AxisAlignedBB getRealBoundingBox(BlockState state){
    	return colligeBox[((Direction)state.getValues().get(FACING)).getHorizontalIndex()];
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityIceCrasher)
            {
            	NetworkHooks.openGui((ServerPlayerEntity)playerIn,
            		(INamedContainerProvider)tileentity,
        			(buf)->{
						buf.writeInt(pos.getX());
						buf.writeInt(pos.getY());
						buf.writeInt(pos.getZ());
					});
            	//playerIn.openGui(Mod_DiningFurniture.instance, ModCommon.MOD_GUI_ID_ICECRASHER, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }

            return true;
        }
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.with(FACING, placer.getHorizontalFacing().getOpposite()), 2);

        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityIceCrasher)
            {
                ((TileEntityIceCrasher)tileentity).setCustomInventoryName(stack.getDisplayName().getFormattedText());
            }
        }
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
    	if (state.getBlock() != newState.getBlock()) {
    		TileEntity tileentity = worldIn.getTileEntity(pos);

    		if (tileentity instanceof TileEntityIceCrasher) {
    			InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
    			worldIn.updateComparatorOutputLevel(pos, this);
    		}
    		super.onReplaced(state,worldIn, pos, newState, isMoving);
    	}
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockCore.block_icecrasher);
    }

    @Override
	public boolean hasCustomBreakingProgress(BlockState state){
    	return true;
    }
}
