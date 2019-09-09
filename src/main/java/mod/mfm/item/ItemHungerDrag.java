package mod.mfm.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ItemHungerDrag extends Item {

	public ItemHungerDrag(Item.Properties property) {
		super(property);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack stack = playerIn.getHeldItem(handIn);

		if (stack.getItem() instanceof ItemHungerDrag) {
			playerIn.removePotionEffect(Effects.HUNGER);
			if (!playerIn.isCreative()) {
				playerIn.getFoodStats().setFoodLevel(0);
				playerIn.getFoodStats().setFoodSaturationLevel(0.0F);
				stack.shrink(1);
			}
			return new ActionResult<>(ActionResultType.SUCCESS, stack);
		}

		return new ActionResult<>(ActionResultType.PASS, stack);
	}


}
