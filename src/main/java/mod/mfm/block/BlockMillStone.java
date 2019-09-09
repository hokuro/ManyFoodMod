package mod.mfm.block;

import mod.mfm.tileentity.TileEntityMillStone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockMillStone extends ContainerBlock {
    // あたり判定
    //private static final AxisAlignedBB colligeBox = new AxisAlignedBB(0.125D, 0D, 0.125D, 0.875D, 0.75D, 0.875D);
    protected VoxelShape colligeBox = Block.makeCuboidShape(2D,    0D, 2D,    14D,    12D, 14D);

	protected BlockMillStone(Block.Properties property) {
        super(property);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
	    return colligeBox;
	}


	@Override
	public TileEntity createNewTileEntity(IBlockReader world) {
		return new TileEntityMillStone();
	}

	@Override
    public BlockRenderType getRenderType(BlockState state)
    {
        return BlockRenderType.INVISIBLE;
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

            if (tileentity instanceof TileEntityMillStone)
            {
            	NetworkHooks.openGui((ServerPlayerEntity)playerIn,
            		(INamedContainerProvider)tileentity,
        			(buf)->{
						buf.writeInt(pos.getX());
						buf.writeInt(pos.getY());
						buf.writeInt(pos.getZ());
					});
            	//playerIn.openGui(Mod_DiningFurniture.instance, ModCommon.MOD_GUI_ID_MILLSTONE, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }

            return true;
        }
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof TileEntityMillStone)
        {
        	if (!((TileEntityMillStone)tileentity).isEmpty()){
        		InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
        	}
            worldIn.updateComparatorOutputLevel(pos, this);
        }
        super.onReplaced(state, worldIn, pos, newState,isMoving);
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(BlockCore.block_millstone);
    }

    @Override
	public boolean hasCustomBreakingProgress(BlockState state){
    	return true;
    }
}
