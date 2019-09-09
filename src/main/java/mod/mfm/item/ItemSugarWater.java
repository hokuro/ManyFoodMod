package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumFlapeSyrup;
import net.minecraft.item.Item;

public class ItemSugarWater extends Item{
	private EnumFlapeSyrup flavor;

	public ItemSugarWater(EnumFlapeSyrup flavorIn, Item.Properties property){
		super(property);
		flavor = flavorIn;
	}

	public EnumFlapeSyrup getFlavor() {
		return flavor;
	}

}
