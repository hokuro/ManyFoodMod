package mod.mfm.item;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ItemFoods {
	public static Food food_cooked_rooten_flesh = new Food.Builder().hunger(4).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER,600,2),1.0F).meat().build();
	public static Food food_cooked_clown = new Food.Builder().hunger(4).saturation(0.1F).build();
	public static Food food_cooked_puffer = new Food.Builder().hunger(4).saturation(0.1F).effect(new EffectInstance(Effects.POISON,1200,3),1.0F).build();
	public static Food food_raw_wolf = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),1.0F).meat().build();
	public static Food food_cooked_wolf = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_cat = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),1.0F).meat().build();
	public static Food food_cooked_cat = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_horse = new Food.Builder().hunger(4).saturation(0.2F).meat().build();
	public static Food food_cooked_horse = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_bear = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_bear = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_llamas = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_llamas = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_fox = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_fox = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_dolphin = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_dolphin = new Food.Builder().hunger(4).saturation(0.3F).effect(new EffectInstance(Effects.WATER_BREATHING,1200,3), 0.5F).meat().build();
	public static Food food_raw_turtle = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_turtle = new Food.Builder().hunger(4).saturation(0.3F).meat().build();
	public static Food food_raw_squid = new Food.Builder().hunger(2).saturation(0.1F).effect(new EffectInstance(Effects.POISON,600,2),0.3F).meat().build();
	public static Food food_cooked_squid = new Food.Builder().hunger(4).saturation(0.1F).meat().build();
	public static Food food_raw_flesh = new Food.Builder().hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.NAUSEA,6000,2),0.3F).meat().build();
	public static Food food_cooked_flesh = new Food.Builder().hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.NAUSEA,6000,2),0.3F).meat().build();
}
