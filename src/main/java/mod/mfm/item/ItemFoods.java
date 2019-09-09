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
	public static Food food_cooked_dolphin = new Food.Builder().hunger(4).saturation(0.3F).effect(new EffectInstance(Effects.DOLPHINS_GRACE,1200,3), 1.0F).meat().build();
	public static Food food_raw_turtle = new Food.Builder().hunger(4).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).effect(new EffectInstance(Effects.HEALTH_BOOST,0,3),1.0F).meat().build();
	public static Food food_cooked_turtle = new Food.Builder().hunger(4).saturation(0.3F).effect(new EffectInstance(Effects.HEALTH_BOOST,0,3), 1.0F).meat().build();
	public static Food food_raw_squid = new Food.Builder().hunger(2).saturation(0.1F).effect(new EffectInstance(Effects.POISON,600,2),0.3F).meat().build();
	public static Food food_cooked_squid = new Food.Builder().hunger(4).saturation(0.1F).meat().build();
	public static Food food_raw_flesh = new Food.Builder().hunger(1).saturation(0.1F).effect(new EffectInstance(Effects.HUNGER,600,2),0.3F).meat().build();
	public static Food food_cooked_flesh = new Food.Builder().hunger(1).saturation(0.1F).meat().build();
	public static Food food_choco = new Food.Builder().hunger(1).saturation(0.1F).build();
	public static Food food_whitechoco = new Food.Builder().hunger(1).saturation(0.5F).build();
	public static Food food_caramel = new Food.Builder().hunger(1).saturation(0.1F).build();
	public static Food food_pudding = new Food.Builder().hunger(2).saturation(0.25F).build();
	public static Food food_pumpkinpudding = new Food.Builder().hunger(2).saturation(0.4F).build();
	public static Food food_pie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_chocopie = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_saladapie = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_meetpie = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_fishpie = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_pumpkinpie = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_zombipie = new Food.Builder().hunger(2).saturation(0.2F).effect(new EffectInstance(Effects.HUNGER,600,0), 0.3F).build();
	public static Food food_applepie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_blackpie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_caramelpie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_berrypie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_kelppie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food good_goldapplepie = (new Food.Builder()).hunger(4).saturation(0.6F).effect(new EffectInstance(Effects.REGENERATION, 100, 1), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 2400, 0), 1.0F).build();
	public static Food food_goldappleencpie = (new Food.Builder()).hunger(4).saturation(0.6F).effect(new EffectInstance(Effects.REGENERATION, 400, 1), 1.0F).effect(new EffectInstance(Effects.RESISTANCE, 6000, 0), 1.0F).effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1.0F).effect(new EffectInstance(Effects.ABSORPTION, 2400, 3), 1.0F).build();

	public static Food food_eggsandwich = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_potetosaladasandwich = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_pumpkinsaladasandwich = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_hamsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_muttonsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_stakesandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_chikensandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_rabitsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_wolfsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_catsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_bearandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_horsesandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_foxsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_llamassandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_dolphinsandwich = new Food.Builder().hunger(6).saturation(0.6F).effect(new EffectInstance(Effects.DOLPHINS_GRACE,1200,3), 1.0F).build();
	public static Food food_fleshsandwich = new Food.Builder().hunger(6).saturation(0.6F).build();
	public static Food food_zombiesandwich = new Food.Builder().hunger(6).saturation(0.6F).effect(new EffectInstance(Effects.HUNGER,600,0), 0.3F).build();
	public static Food food_turtlesandwich = new Food.Builder().hunger(4).saturation(0.4F).effect(new EffectInstance(Effects.HEALTH_BOOST,0,3),1.0F).build();
	public static Food food_codsandwich = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_salmonsandwich = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_clownhandwich = new Food.Builder().hunger(4).saturation(0.4F).build();
	public static Food food_puffersandwich = new Food.Builder().hunger(4).saturation(0.4F).effect(new EffectInstance(Effects.POISON,300,1), 0.3F).build();
	public static Food food_chocosandwich = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_potatosalada = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_pumpkinsalada = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_icecream = new Food.Builder().hunger(1).saturation(0.1F).build();
	public static Food food_icecream_cookie = new Food.Builder().hunger(2).saturation(0.2F).build();
	public static Food food_crashedice = new Food.Builder().hunger(0).saturation(0.1F).build();
	public static Food food_crashedice_milk = new Food.Builder().hunger(0).saturation(0.1F).build();
	public static Food food_icecandy = new Food.Builder().hunger(0).saturation(0.1F).setAlwaysEdible().build();
	public static Food food_meetpasta = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_fishpasta = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_blackpasta = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_zaruudon = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_kakeudon = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_tsukimiudon = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_nikuudon = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_meetramen = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_fishramen = new Food.Builder().hunger(10).saturation(0.8F).build();
	public static Food food_tsukimiramen = new Food.Builder().hunger(10).saturation(0.8F).build();
}
