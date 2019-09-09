package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumFlowerHalb;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class ItemFlowerTea extends PotionItem {

	private EnumFlowerHalb kind;

	public ItemFlowerTea(EnumFlowerHalb kindin, Item.Properties property) {
		super(property);
		kind = kindin;
	}

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {

        if (!worldIn.isRemote)
        {
        	EnumFlowerHalb halb = ((ItemFlowerTea)stack.getItem()).getKind();
        	if (halb == EnumFlowerHalb.PEONY){entityLiving.extinguish();}
        	else{
        		Effect[] effect = halb.getPotion();
            	if (effect != null){
            		if (halb.isClean()){
                		for (int i = 0; i < effect.length; i++){
            				entityLiving.removePotionEffect(effect[i]);
                		}
            		}else{
            			for (int i = 0; i < effect.length; i++){
            				entityLiving.addPotionEffect(new EffectInstance(effect[i],20*10,1));
            			}
            		}
            	}
        	}
        }
        if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).isCreative())
        {
        	stack.shrink(1);
        }

        return stack.getCount() <= 0 ? new ItemStack(Items.GLASS_BOTTLE) : stack;
    }

    public EnumFlowerHalb getKind() {
    	return kind;
    }

    @Override
    public void fillItemGroup(ItemGroup group, NonNullList<ItemStack> items) {
        if (this.isInGroup(group)) {
           items.add(new ItemStack(this));
        }

     }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return this.getTranslationKey();
     }


}
