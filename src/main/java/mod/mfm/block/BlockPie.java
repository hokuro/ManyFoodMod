package mod.mfm.block;

import java.util.List;

import javax.annotation.Nullable;

import mod.mfm.config.ConfigValue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BlockPie extends CakeBlock {

	private EffectInstance[] _effect;
	private int _heall;
	private float _saturationLevel;

	private BlockPie(Block.Properties property){
		this(2, 0.2F, property);
	}

	public BlockPie(int heal, float saturation, Block.Properties property){
		this(2, 0.2F, null,property);
	}

	public BlockPie(int heal, float saturation, EffectInstance[] effect, Block.Properties property)
    {
		super(property);
		this.setHeal(heal,  saturation);
		this.setPotionEffect(effect);
    }

	@Override
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn, Hand handIn, BlockRayTraceResult hit) {
        this.eatPie(worldIn, pos, state, playerIn);
        return true;
    }

	@Override
	public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity playerIn) {
        this.eatPie(worldIn, pos, worldIn.getBlockState(pos), playerIn);
    }

    private void eatPie(World worldIn, BlockPos pos, BlockState state, PlayerEntity player)
    {
    	// 回復
        if (player.canEat(ConfigValue.piecake.CanEatAllways()) || player.isCreative())
        {
            player.getFoodStats().addStats(_heall, _saturationLevel);
            int i = ((Integer)state.getValues().get(BITES)).intValue();

            if (i < 6)
            {
                worldIn.setBlockState(pos, state.with(BITES, Integer.valueOf(i + 1)), 3);
            }
            else
            {
                worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
            }
        }

        // ポーション効果
        if (!worldIn.isRemote)
        {
            if (_effect != null)
            {
                for (EffectInstance potioneffect : _effect)
                {
                	player.addPotionEffect(new EffectInstance(potioneffect));
                }
            }
        }
    }


    public Block setHeal(int heal, float saturation){
    	this._heall = heal;
    	this._saturationLevel = saturation;
    	return this;
    }

    public Block setPotionEffect(EffectInstance[] effect){
		_effect = effect;
		return this;
    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        PotionUtils.addPotionTooltip(stack, tooltip, 1.0F);
    }


    public boolean hasEffect(ItemStack stack)
    {
        return !PotionUtils.getEffectsFromStack(stack).isEmpty();
    }
}
