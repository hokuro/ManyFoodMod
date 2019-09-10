package mod.mfm.block;

import mod.mfm.tileentity.TileEntityFreezer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockFreezer extends BlockHorizontalContainer {

    private static boolean keepInventory;
    private static final AxisAlignedBB[] colligeBox =  new AxisAlignedBB[] {
    		new AxisAlignedBB(0D, 0D, 0D, 0D, 0D, 0D), // 不使用
    		new AxisAlignedBB(0D, 0D, 0D, 0D, 0D, 0D), // 不使用
    		new AxisAlignedBB(0.9375D, 0D, 0.0625D, 0.0625D, 1D, 1D),	// NORTH
    		new AxisAlignedBB(0.0625D, 0D, 1D, 0.9375, 1D, 0.0625D),	// SOUTH
    		new AxisAlignedBB(0.0D, 0D, 0.0625D, 0.9375D, 1D, 0.9375D),	// WEST
    		new AxisAlignedBB(1D, 0D, 0.0625D, 0.0625D, 1D, 0.9375D)	// EAST
    };

    protected static final VoxelShape[] colligBoxeis = new VoxelShape[]{
	    Block.makeCuboidShape(0,0,0,0,0,0), // 不使用
	    Block.makeCuboidShape(0,0,0,0,0,0), // 不使用
	    Block.makeCuboidShape(15,0,0,1,16,15),// NORTH
	    Block.makeCuboidShape(1,0,16,15,16,1),// SOUTH
	    Block.makeCuboidShape(0,0,1,15,16,15),// WEST
	    Block.makeCuboidShape(16,0,1,1,16,15)// EAST
	};

	protected BlockFreezer(Block.Properties property) {
		super(property);
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		// TODO 自動生成されたメソッド・スタブ
		return createTileEntity(null,worldIn);
	}


	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new TileEntityFreezer();
	}

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
    	int idx = ((Direction)state.getValues().get(FACING)).getIndex();
	    return colligBoxeis[idx];
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader worldIn, BlockPos pos) {
    	int idx = ((Direction)state.getValues().get(FACING)).getIndex();
	    return colligBoxeis[idx];
	}

    @Override
    protected AxisAlignedBB getRealBoundingBox(BlockState state){
    	int idx = ((Direction)state.getValues().get(FACING)).getIndex();
    	if (idx >= 2 &&  6 > idx){
            return colligeBox[idx];
    	}
    	return colligeBox[2];
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand hand, BlockRayTraceResult hit) {
    	if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
        	ItemStack stack = playerIn.getHeldItem(hand);
            TileEntity tileentity = worldIn.getTileEntity(pos);
            if (tileentity instanceof TileEntityFreezer)
            {
                if (stack.getItem() == Items.WATER_BUCKET){
                    if (((TileEntityFreezer) tileentity).InjectionTank()){
                    	if (!playerIn.isCreative()){
                    		playerIn.setHeldItem(hand, new ItemStack(Items.BUCKET,1));
                    	}
                    	playerIn.sendStatusMessage(new StringTextComponent(((TileEntityFreezer) tileentity).getField(TileEntityFreezer.FLDIDX_TNKCNT)+"/" + TileEntityFreezer.TANK_MAX),false);
                    }else{
                    	playerIn.sendStatusMessage( new StringTextComponent("water tank is max"),false);
                    }
                }else{
                	NetworkHooks.openGui((ServerPlayerEntity)playerIn,
                			(INamedContainerProvider)tileentity,
                			(buf)->{
        						buf.writeInt(pos.getX());
        						buf.writeInt(pos.getY());
        						buf.writeInt(pos.getZ());
        					});
                	//playerIn.openGui(Mod_DiningFurniture.instance, ModCommon.MOD_GUI_ID_FREEZER, worldIn, pos.getX(),pos.getY(),pos.getZ());
                }
            }

            return true;
        }
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack)
    {
        worldIn.setBlockState(pos, state.with(FACING, placer.getHorizontalFacing().getOpposite()), 2);

        if (stack.hasDisplayName())
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityFreezer)
            {
                ((TileEntityFreezer)tileentity).setCustomInventoryName(stack.getDisplayName().getFormattedText());
            }
        }
    }

    @Override
    public void onReplaced(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!keepInventory)
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);

            if (tileentity instanceof TileEntityFreezer)
            {
                InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
                worldIn.updateComparatorOutputLevel(pos, this);
            }
        }

        super.onReplaced(state,worldIn, pos, newState,isMoving);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, BlockState state)
    {
        return new ItemStack(BlockCore.block_freezer);
    }

    @Override
	public boolean hasCustomBreakingProgress(BlockState state){
    	return true;
    }



}
