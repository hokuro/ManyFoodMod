package mod.mfm.item;

import net.minecraft.item.ItemStack;

public interface IArrangeMenu {
	ItemTopping getTopping(ItemStack stack);
	ItemStack setTopping(ItemStack stack, ItemTopping topping);
}
