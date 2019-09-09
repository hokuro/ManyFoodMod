package mod.mfm.group;

import mod.mfm.item.ItemCore;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGroupColdFood extends ItemGroup {

	public ItemGroupColdFood(String name){
		super(name);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public String getTabLabel() {
		return "ColdFood";
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemCore.item_icecream_vanila);
	}
}

