package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumIceFlavor;
import net.minecraft.item.Item;

public class ItemIceCreamMix extends Item {

	private final EnumIceFlavor flavor;

	public ItemIceCreamMix(EnumIceFlavor flavorIn, Item.Properties property){
		super(property);
		flavor = flavorIn;
	}


    public EnumIceFlavor getFlavor() {
    	return flavor;
    }
}