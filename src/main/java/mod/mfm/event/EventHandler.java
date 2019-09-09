package mod.mfm.event;


import mod.mfm.item.ItemCore;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class EventHandler {
	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event) {
		if(event.getEntityLiving().world.isRemote) {
			return;
		}
		LivingEntity target = event.getEntityLiving();
		EntityType<?> etype = target.getType();
		if(etype.equals(EntityType.WOLF)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_wolf,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_wolf,1));
				}
			}
		}else if(etype.equals(EntityType.CAT) || etype.equals(EntityType.OCELOT)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_cat,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_cat,1));
				}
			}
		}else if(etype.equals(EntityType.HORSE) || etype.equals(EntityType.DONKEY)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_horse,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_horse,1));
				}
			}
		}else if(etype.equals(EntityType.POLAR_BEAR) || etype.equals(EntityType.PANDA)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_bear,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_bear,1));
				}
			}
		}else if(etype.equals(EntityType.LLAMA)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_llamas,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_llamas,1));
				}
			}
		}else if(etype.equals(EntityType.FOX)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_fox,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_fox,1));
				}
			}
		}else if(etype.equals(EntityType.DOLPHIN)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_dolphin,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.meet_dolphin,1));
				}
			}
		}else if(etype.equals(EntityType.TURTLE)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_turtle,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.raw_turtle,1));
				}
			}
		}else if(etype.equals(EntityType.SQUID)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(ItemCore.cooked_squid,1));
				}else {
					target.entityDropItem(new ItemStack(ItemCore.raw_squid,1));
				}
			}
		}else if(etype.equals(EntityType.PARROT)) {
			if(target.world.rand.nextInt(10) < 8) {
				if (event.getSource() == DamageSource.ON_FIRE ||
						event.getSource() == DamageSource.IN_FIRE ||
						event.getSource() == DamageSource.LAVA) {
					target.entityDropItem(new ItemStack(Items.COOKED_CHICKEN,1));
				}else {
					target.entityDropItem(new ItemStack(Items.CHICKEN,1));
				}
			}
		}else if(etype.equals(EntityType.COW)) {
			if(target.isChild() && (target.world.rand.nextInt(10) < 5)) {
				target.entityDropItem(new ItemStack(ItemCore.item_rennet,1));
			}
		}
	}
}
