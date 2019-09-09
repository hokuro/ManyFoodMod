package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumFlowerHalb;
import net.minecraft.item.Item;

public class ItemFlowerDust extends Item {
	private EnumFlowerHalb kind;

	public ItemFlowerDust(EnumFlowerHalb kindin, Item.Properties property) {
		super(property);
		kind = kind;
	}

	public EnumFlowerHalb getKind() {
		return kind;
	}
}
