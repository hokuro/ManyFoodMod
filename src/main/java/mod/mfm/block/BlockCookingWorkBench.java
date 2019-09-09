package mod.mfm.block;

import mod.mfm.inventory.ContainerCookingWorkBench;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockCookingWorkBench extends HorizontalBlock {

	private static final ITextComponent containerName = new TranslationTextComponent("cookingworkbench");

	protected BlockCookingWorkBench(Block.Properties property){
		super(property);
		this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH));
	}

	@Override
    public BlockState rotate(BlockState state, Rotation rot)
    {
        return state.with(HORIZONTAL_FACING, rot.rotate((Direction)state.get(HORIZONTAL_FACING)));
    }

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(HORIZONTAL_FACING, context.getPlacementHorizontalFacing().getOpposite());
    }


	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	   builder.add(HORIZONTAL_FACING);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote)
        {
        	NetworkHooks.openGui((ServerPlayerEntity)playerIn,
        			getContainer(state, worldIn, pos),
        			(buf)->{
						buf.writeInt(pos.getX());
						buf.writeInt(pos.getY());
						buf.writeInt(pos.getZ());
					});
        	return true;
        }
        return true;
    }

	@Override
	public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
		return new SimpleNamedContainerProvider((id,playerInv,x)-> {
			return new ContainerCookingWorkBench(id,playerInv);
		}, containerName);
	}
}
