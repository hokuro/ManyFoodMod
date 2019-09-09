package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumFlapeSyrup;
import net.minecraft.item.Item;

public class ItemSyrup extends Item {

	private EnumFlapeSyrup flavor;
	public ItemSyrup(EnumFlapeSyrup flavorIn, Item.Properties propety){
		super(propety);
		flavor = flavorIn;
	}

	public EnumFlapeSyrup getFlavor() {
		return flavor;
	}
}
