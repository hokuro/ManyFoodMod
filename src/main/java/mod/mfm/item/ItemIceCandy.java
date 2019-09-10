package mod.mfm.item;

import mod.mfm.item.ItemCore.EnumFlapeSyrup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ItemIceCandy extends Item {

	private final EnumFlapeSyrup flavor;

	public ItemIceCandy(EnumFlapeSyrup syrup, Item.Properties property) {
		super(property);
		flavor = syrup;
	}

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
    {

        if (entityLiving instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity)entityLiving;
            player.getFoodStats().addStats(this.getFood().getHealing(), this.getFood().getSaturation());
            worldIn.playSound((PlayerEntity)player, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, player);

			if (!worldIn.isRemote){
	            if (!((PlayerEntity)entityLiving).inventory.addItemStackToInventory(new ItemStack(Items.STICK,1))){
	            	((PlayerEntity)entityLiving).dropItem(new ItemStack(Items.STICK), false);
	            }
			}
        }
        stack.shrink(1);

        return stack;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, PlayerEntity player)
    {
    	EnumFlapeSyrup flavor = ((ItemIceCandy)stack.getItem()).getFlavor();
    	if (!worldIn.isRemote && flavor.getEffects() != null){
    		for (int i = 0; i < flavor.getEffects().length; i++){
    			player.addPotionEffect(flavor.getEffects()[i]);
    		}
    	}
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        // 鎮火
        target.extinguish();
        // 移動速度低下
        target.addPotionEffect(new EffectInstance(Effects.SLOWNESS,300,100) );
        // 火炎耐性1分
        target.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE,1200,1));

        attacker.sendBreakAnimation(Hand.MAIN_HAND);
        stack.shrink(1);

        return true;
    }

    public EnumFlapeSyrup getFlavor() {
    	return flavor;
    }
}
