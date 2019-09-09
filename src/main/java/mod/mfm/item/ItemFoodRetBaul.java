package mod.mfm.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class ItemFoodRetBaul extends ItemFoodPieCakes {

	public ItemFoodRetBaul(Item.Properties property) {
		super(property);
		// TODO 自動生成されたコンストラクター・スタブ
	}

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }
}