package mod.mfm.item;

import java.util.Arrays;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;

public class ItemTopping extends Item {

	private List<EffectInstance> effects;

	public ItemTopping(EffectInstance[] effect, Item.Properties property) {
		super(property);
		effects = Arrays.asList(effect);
	}

	public List<EffectInstance> getEffects() {
		return effects;
	}
}
