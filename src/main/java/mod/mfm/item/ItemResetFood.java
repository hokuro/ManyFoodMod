package mod.mfm.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemResetFood  extends Item {
	private int foodLevel;
	private float foodSaturation;

	public ItemResetFood(Item.Properties builder) {
		super(builder);
		foodLevel = this.getFood().getHealing();
		foodSaturation = this.getFood().getSaturation();
	}

    public int getHealAmount(ItemStack stack)
    {
        return this.foodLevel;
    }

    public float getSaturationModifier(ItemStack stack)
    {
        return this.foodSaturation;
    }

	public void setHealAmount(int value){
		this.foodLevel = value;
	}

	public void setSaturation(float saturation){
		this.foodSaturation = saturation;
	}
}
