package mod.mfm.item;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class ItemNoodle extends ItemFoodRetBaul implements IArrangeMenu{

	public ItemNoodle(Item.Properties property) {
		super(property);
	}

	 @Override
	 public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
		 List<EffectInstance> effects = new ArrayList<EffectInstance>();
		 if (stack.getItem() instanceof IArrangeMenu) {
			 ItemTopping topping = this.getTopping(stack);
			 if (topping != null) {
				 effects.addAll(topping.getEffects());
			 }
		 }
		 ItemStack ret = super.onItemUseFinish(stack, worldIn, entityLiving);
		 for (EffectInstance effect : effects) {
			 entityLiving.addPotionEffect(new EffectInstance(effect));
		 }
		 return ret;
	}

		@Override
		public ItemTopping getTopping(ItemStack stack) {
			ItemTopping retItem = null;
			CompoundNBT compound = stack.getOrCreateTag();
			if (compound.contains("id")) {
				Item arreng = Registry.ITEM.getOrDefault(new ResourceLocation(compound.getString("id")));
				if (arreng instanceof ItemTopping) {
					retItem = (ItemTopping)arreng;
				}
			}
			return retItem;
		}

		@Override
		public ItemStack setTopping(ItemStack stack, ItemTopping topping) {
			CompoundNBT compound = stack.getOrCreateTag();
			compound.putString("id", topping.getRegistryName().toString());
			stack.setTag(compound);
			return stack;
		}
}
