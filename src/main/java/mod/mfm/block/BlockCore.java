package mod.mfm.block;

import java.util.HashMap;
import java.util.Map;

import mod.mfm.block.item.ItemBlockMeet;
import mod.mfm.block.item.ItemBlockPie;
import mod.mfm.core.ModCommon;
import mod.mfm.core.Mod_ManyFoods;
import mod.mfm.core.log.ModLog;
import mod.mfm.item.ItemCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

public class BlockCore{

	public static final String NAME_MEET_COW = "meetcow";
	public static final String NAME_MEET_PIG = "meetpig";
	public static final String NAME_MEET_CHIKIN = "meetchikin";
	public static final String NAME_MEET_MUTTON = "meetmutton";
	public static final String NAME_MEET_RABITT = "meetrabitt";
	public static final String NAME_MEET_ZOMBIE = "meetzombie";
	public static final String NAME_MEET_WOLF = "meetwolf";
	public static final String NAME_MEET_CAT = "meetcat";
	public static final String NAME_MEET_HORSE = "meethorse";
	public static final String NAME_MEET_BEAR = "meetbear";
	public static final String NAME_MEET_LLAMAS = "meetllamas";
	public static final String NAME_MEET_FOX = "meetfox";
	public static final String NAME_MEET_DOLPHIN = "meetdolphin";
	public static final String NAME_MEET_FLESH = "meetflesh";
	public static final String NAME_FISH_FISH = "fishfish";
	public static final String NAME_FISH_SALMON = "fishsalmon";
	public static final String NAME_FISH_CLOWN = "fishclown";
	public static final String NAME_FISH_PUFFER = "fishpuffer";
	public static final String NAME_FISH_TURTLE = "fishturtle";
	public static final String NAME_FISH_SQUID = "fishsquid";
	public static final String NAME_MEET_COW_COOKED = "meetcow_cooked";
	public static final String NAME_MEET_PIG_COOKED = "meetpig_cooked";
	public static final String NAME_MEET_CHIKIN_COOKED = "meetchikin_cooked";
	public static final String NAME_MEET_MUTTON_COOKED = "meetmutton_cooked";
	public static final String NAME_MEET_RABITT_COOKED = "meetrabitt_cooked";
	public static final String NAME_MEET_ZOMBIE_COOKED = "meetzombie_cooked";
	public static final String NAME_MEET_WOLF_COOKED = "meetwolf_cooked";
	public static final String NAME_MEET_CAT_COOKED = "meetcat_cooked";
	public static final String NAME_MEET_HORSE_COOKED = "meethorse_cooked";
	public static final String NAME_MEET_BEAR_COOKED = "meetbear_cooked";
	public static final String NAME_MEET_LLAMAS_COOKED = "meetllamas_cooked";
	public static final String NAME_MEET_FOX_COOKED = "meetfox_cooked";
	public static final String NAME_MEET_DOLPHIN_COOKED = "meetdolphin_cooked";
	public static final String NAME_MEET_FLESH_COOKED = "meetflesh_cooked";
	public static final String NAME_FISH_FISH_COOKED = "fishfish_cooked";
	public static final String NAME_FISH_SALMON_COOKED = "fishsalmon_cooked";
	public static final String NAME_FISH_CLOWN_COOKED = "fishclown_cooked";
	public static final String NAME_FISH_PUFFER_COOKED = "fishpuffer_cooked";
	public static final String NAME_FIHS_TURTLE_COOKED = "fishturtle_cooked";
	public static final String NAME_FISH_SQUID_COOKED = "fishsquid_cooked";
	public static final String NAME_COOKINGWORKBENCH = "cworkbench";
	public static final String NAME_FREEZER = "freezer";
	public static final String NAME_ICECRASHER = "icecrasher";
	public static final String NAME_MILLSTONE = "millstone";
	public static final String NAME_SALTPAN = "saltpan";
	public static final String NAME_PIE_HALL = "piehall";
	public static final String NAME_CHOCOPIE_HALL = "piehallchoco";
	public static final String NAME_SALADA_HALL = "piehallsalada";
	public static final String NAME_MEETPIE_HALL = "piehallmeet";
	public static final String NAME_FISHPIE_HALL = "piehallfish";
	public static final String NAME_PUMPKINPIE_HALL = "piehallpumpkin";
	public static final String NAME_ZOMBIPEI_HALL = "piehallzombi";
	public static final String NAME_APPLEPIE_HALL = "piehallapple";
	public static final String NAME_CARAMELPIE_HALL = "piehallcaramel";
	public static final String NAME_BLACK_PIE_HALL = "piehallblack";
	public static final String NAME_GOLDAPPLE_PIE_HALL = "piehallgoldapple";
	public static final String NAME_GOLDAPPLEENC_PIE_HALL = "piehallgoldappleenc";
	public static final String NAME_BERRY_PIE_HALL = "piehallberry";
	public static final String NAME_KELP_PIE_HALL = "piehallkelp";
	public static final String NAME_CHOCO_CAKE = "cakechoco";
	public static final String NAME_APPLE_CAKE = "cakeapple";
	public static final String NAME_SALADA_CAKE = "cakesalada";
	public static final String NAME_MELLON_CAKE ="cakemelon";
	public static final String NAME_PUMPKIN_CAKE ="cakepumpkin";
	public static final String NAME_REACHEESE_CAKE ="cakereacheese";
	public static final String NAME_BAKEDCHEESE_CAKE = "cakebakedcheese";
	public static final String NAME_BLACK_CAEK = "cakeblack";
	public static final String NAME_ZOMBI_CAKE = "cakezombi";
	public static final String NAME_BERRY_CAEK = "cakeberry";
	public static final String NAME_KELP_CAKE = "cakekelp";
	public static final String NAME_GOLDAPPLE_CAKE = "cakegoldapple";
	public static final String NAME_GOLDAPPLEENC_CAKE = "cakegoldappleenc";
	public static final String NAME_PIZZA = "pizza";
	public static final String NAME_MEETPIZZA ="pizzameet";
	public static final String NAME_FISHPIZZA = "pizzafish";
	public static final String NAME_CHEESE ="cheese";
	public static final String NAME_BLUECHEESE = "cheeseblue";




	public static Block block_cow_cooked = new BlockMeet(Items.COOKED_BEEF,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_COW_COOKED));
	public static Block block_pig_cooked = new BlockMeet(Items.COOKED_PORKCHOP,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_PIG_COOKED));
	public static Block block_chikin_cooked = new BlockMeet(Items.COOKED_CHICKEN,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_CHIKIN_COOKED));
	public static Block block_mutton_cooked = new BlockMeet(Items.COOKED_MUTTON,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_MUTTON_COOKED));
	public static Block block_rabitt_cooked = new BlockMeet(Items.COOKED_RABBIT,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_RABITT_COOKED));
	public static Block block_zombie_cooked = new BlockMeet(ItemCore.cooked_rotten_flesh,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_ZOMBIE_COOKED));
	public static Block block_fish_cooked = new BlockMeet(Items.COOKED_COD,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_FISH_COOKED));
	public static Block block_salmon_cooked = new BlockMeet(Items.COOKED_SALMON,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_SALMON_COOKED));
	public static Block block_clown_cooked = new BlockMeet(ItemCore.cooked_clown,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_CLOWN_COOKED));
	public static Block block_puffer_cooked = new BlockMeet(ItemCore.cooked_puffer,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_PUFFER_COOKED));
	public static Block block_meetwolf_cooked = new BlockMeet(ItemCore.cooked_wolf,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_WOLF_COOKED));
	public static Block block_meetcat_cooked = new BlockMeet(ItemCore.cooked_cat,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_CAT_COOKED));
	public static Block block_meethorse_cooked = new BlockMeet(ItemCore.cooked_horse,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_HORSE_COOKED));
	public static Block block_meetbear_cooked = new BlockMeet(ItemCore.cooked_bear,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_BEAR_COOKED));
	public static Block block_meetllamas_cooked = new BlockMeet(ItemCore.cooked_llamas,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_LLAMAS_COOKED));
	public static Block block_meetfox_cooked = new BlockMeet(ItemCore.cooked_fox,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_FOX_COOKED));
	public static Block block_meetdolphin_cooked = new BlockMeet(ItemCore.cooked_dolphin,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_DOLPHIN_COOKED));
	public static Block block_meetflesh_cooked = new BlockMeet(ItemCore.cooked_flesh,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_FLESH_COOKED));
	public static Block block_fishturtle_cooked = new BlockMeet(ItemCore.cooked_turtle,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FIHS_TURTLE_COOKED));
	public static Block block_fishsquid_cooked = new BlockMeet(ItemCore.cooked_squid,true).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_SQUID_COOKED));
	public static Block block_cow = new BlockMeet(Items.BEEF, false, block_cow_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_COW));
	public static Block block_pig = new BlockMeet(Items.PORKCHOP,false,block_pig_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_PIG));
	public static Block block_chikin = new BlockMeet(Items.CHICKEN, false,block_chikin_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_CHIKIN));
	public static Block block_mutton = new BlockMeet(Items.MUTTON, false,block_mutton_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_MUTTON));
	public static Block block_rabitt = new BlockMeet(Items.RABBIT, false,block_rabitt_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_RABITT));
	public static Block block_zombie = new BlockMeet(Items.ROTTEN_FLESH, false,block_zombie_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_ZOMBIE));
	public static Block block_fish = new BlockMeet(Items.COD,false,block_fish_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_FISH));
	public static Block block_salmon = new BlockMeet(Items.SALMON, false,block_salmon_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_SALMON));
	public static Block block_clown = new BlockMeet(Items.TROPICAL_FISH,false,block_clown_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_CLOWN));
	public static Block block_puffer = new BlockMeet(Items.PUFFERFISH,false,block_puffer_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_PUFFER));
	public static Block block_meetwolf = new BlockMeet(ItemCore.meet_wolf,false,block_meetwolf_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_WOLF));
	public static Block block_meetcat = new BlockMeet(ItemCore.meet_cat,false,block_meetcat_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_CAT));
	public static Block block_meethorse = new BlockMeet(ItemCore.meet_horse,false,block_meethorse_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_HORSE));
	public static Block block_meetbear = new BlockMeet(ItemCore.meet_bear,false,block_meetbear_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_BEAR));
	public static Block block_meetllamas = new BlockMeet(ItemCore.meet_llamas,false,block_meetllamas_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_LLAMAS));
	public static Block block_meetfox = new BlockMeet(ItemCore.meet_fox,false,block_meetfox_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_FOX));
	public static Block block_meetdolphin = new BlockMeet(ItemCore.meet_dolphin,false,block_meetdolphin_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_DOLPHIN));
	public static Block block_meetflesh = new BlockMeet(ItemCore.raw_flesh,false,block_meetflesh_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_MEET_FLESH));
	public static Block block_fishturtle = new BlockMeet(ItemCore.raw_turtle,false,block_fishturtle_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_TURTLE));
	public static Block block_fishsquid = new BlockMeet(ItemCore.cooked_squid,false,block_fishsquid_cooked).setRegistryName(new ResourceLocation(ModCommon.MOD_ID ,NAME_FISH_SQUID));

	private static final int EffectLevel = 1;
	private static final int EffectTime = 1600;

	public static  Block block_cookingworkbench = new BlockCookingWorkBench(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1.0F,0.98F)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_COOKINGWORKBENCH));
	public static  Block block_freezer          = new BlockFreezer(Block.Properties.create(Material.GLASS).sound(SoundType.METAL).hardnessAndResistance(1.0F,5.0F)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FREEZER));
	public static  Block block_icecrasher       = new BlockIceCrasher(Block.Properties.create(Material.GLASS).sound(SoundType.METAL).hardnessAndResistance(1.0F,5.0F)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ICECRASHER));
	public static  Block block_millstone        = new BlockMillStone(Block.Properties.create(Material.GLASS).sound(SoundType.STONE).hardnessAndResistance(1.0F,5.0F)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MILLSTONE));
	public static  Block block_saltpan          = new BlockSaltPan(Block.Properties.create(Material.GLASS).sound(SoundType.WOOD).hardnessAndResistance(0.5F,0.1F)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALTPAN));

	public static  Block block_pie_hall         = new BlockPie(4,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PIE_HALL));
	public static  Block block_caramelpie_hall  = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CARAMELPIE_HALL));
	public static  Block block_chocopie_hall    = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHOCOPIE_HALL));
	public static  Block block_salada_hall      = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALADA_HALL));
	public static  Block block_meetpie_hall     = new BlockPie(8,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEETPIE_HALL));
	public static  Block block_fishpie_hall     = new BlockPie(8,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISHPIE_HALL));
	public static  Block block_pumpkinpie_hall  = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PUMPKINPIE_HALL));
	public static  Block block_applepie_hall    = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_APPLEPIE_HALL));
	public static  Block block_black_pie        = new BlockPie(6,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLACK_PIE_HALL));
	public static  Block block_zombipei_hall    = new BlockPie(2,0.1F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.HUNGER, 600, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ZOMBIPEI_HALL));
	public static  Block block_berrypie_hall        = new BlockPie(4,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BERRY_PIE_HALL));
	public static  Block block_kelppie_hall         = new BlockPie(4,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_KELP_PIE_HALL));
	public static  Block block_goldapplepie_hall         = new BlockPie(4,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setPotionEffect(new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 100, 1),new EffectInstance(Effects.ABSORPTION, 2400, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLE_PIE_HALL));
	public static  Block block_goldappleencpie_hall         = new BlockPie(4,0.6F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH)).setPotionEffect(new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 400, 1),new EffectInstance(Effects.RESISTANCE, 6000, 0),new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0),new EffectInstance(Effects.ABSORPTION, 2400, 3)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLEENC_PIE_HALL));

	public static  Block block_choco_cake       = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.NIGHT_VISION,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHOCO_CAKE));
	public static  Block block_apple_cake       = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.REGENERATION,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_APPLE_CAKE));
	public static  Block block_salada_cake      = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.HASTE,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALADA_CAKE));
	public static  Block block_mellon_cake      = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.INSTANT_HEALTH,EffectLevel, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MELLON_CAKE));
	public static  Block block_pumpkin_cake     = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.INVISIBILITY,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PUMPKIN_CAKE));
	public static  Block block_reacheese_cake   = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.JUMP_BOOST,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_REACHEESE_CAKE));
	public static  Block block_bakedcheese_cake = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.FIRE_RESISTANCE,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BAKEDCHEESE_CAKE));
	public static  Block block_black_cake       = new BlockPie(2,0.1F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.WATER_BREATHING,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLACK_CAEK));
	public static  Block block_zombi_cake       = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.HUNGER, 600, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ZOMBI_CAKE));
	public static  Block block_berry_cake       = new BlockPie(2,0.1F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.INSTANT_HEALTH,EffectLevel, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BERRY_CAEK));
	public static  Block block_kelp_cake        = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.WATER_BREATHING, EffectTime, EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_KELP_CAKE));
	public static  Block block_goldapple_cake   = new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 100, 1),new EffectInstance(Effects.ABSORPTION, 2400, 0)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLE_CAKE));
	public static  Block block_goldappleenc_cake= new BlockPie(2,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 400, 1),new EffectInstance(Effects.RESISTANCE, 6000, 0),new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0),new EffectInstance(Effects.ABSORPTION, 2400, 3)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLEENC_CAKE));

	public static  Block block_pizza            = new BlockPie(2,0.5F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.REGENERATION,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PIZZA));
	public static  Block block_meet_pizza       = new BlockPie(4,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.STRENGTH,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEETPIZZA));
	public static  Block block_fish_pizza       = new BlockPie(4,0.4F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.SPEED,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISHPIZZA));

	public static  Block block_cheese           = new BlockPie(2,0.1F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHEESE));
	public static  Block block_bluecheese       = new BlockPie(2,0.1F, Block.Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH).noDrops()).setPotionEffect(new EffectInstance[]{new EffectInstance(Effects.REGENERATION,EffectTime,EffectLevel)}).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLUECHEESE));

	private static final String[] NAME_LIST = new String[]{
			NAME_COOKINGWORKBENCH,
			NAME_FREEZER,
			NAME_ICECRASHER,
			NAME_MILLSTONE,
			NAME_SALTPAN,
			NAME_MEET_COW_COOKED,
			NAME_MEET_PIG_COOKED,
			NAME_MEET_CHIKIN_COOKED,
			NAME_MEET_MUTTON_COOKED,
			NAME_MEET_RABITT_COOKED,
			NAME_MEET_ZOMBIE_COOKED,
			NAME_FISH_FISH_COOKED,
			NAME_FISH_SALMON_COOKED,
			NAME_FISH_CLOWN_COOKED,
			NAME_FISH_PUFFER_COOKED,
			NAME_MEET_WOLF_COOKED,
			NAME_MEET_CAT_COOKED,
			NAME_MEET_HORSE_COOKED,
			NAME_MEET_BEAR_COOKED,
			NAME_MEET_LLAMAS_COOKED,
			NAME_MEET_FOX_COOKED,
			NAME_MEET_DOLPHIN_COOKED,
			NAME_MEET_FLESH_COOKED,
			NAME_FIHS_TURTLE_COOKED,
			NAME_FISH_SQUID_COOKED,
			NAME_MEET_COW,
			NAME_MEET_PIG,
			NAME_MEET_CHIKIN,
			NAME_MEET_MUTTON,
			NAME_MEET_RABITT,
			NAME_MEET_ZOMBIE,
			NAME_FISH_FISH,
			NAME_FISH_SALMON,
			NAME_FISH_CLOWN,
			NAME_FISH_PUFFER,
			NAME_MEET_WOLF,
			NAME_MEET_CAT,
			NAME_MEET_HORSE,
			NAME_MEET_BEAR,
			NAME_MEET_LLAMAS,
			NAME_MEET_FOX,
			NAME_MEET_DOLPHIN,
			NAME_MEET_FLESH,
			NAME_FISH_TURTLE,
			NAME_FISH_SQUID,
			NAME_PIE_HALL,
			NAME_CARAMELPIE_HALL,
			NAME_CHOCOPIE_HALL,
			NAME_SALADA_HALL,
			NAME_MEETPIE_HALL,
			NAME_FISHPIE_HALL,
			NAME_PUMPKINPIE_HALL,
			NAME_APPLEPIE_HALL,
			NAME_BLACK_PIE_HALL,
			NAME_ZOMBIPEI_HALL,
			NAME_BERRY_PIE_HALL,
			NAME_KELP_PIE_HALL,
			NAME_GOLDAPPLE_PIE_HALL,
			NAME_GOLDAPPLEENC_PIE_HALL,
			NAME_CHOCO_CAKE,
			NAME_APPLE_CAKE,
			NAME_SALADA_CAKE,
			NAME_MELLON_CAKE,
			NAME_PUMPKIN_CAKE,
			NAME_REACHEESE_CAKE,
			NAME_BAKEDCHEESE_CAKE,
			NAME_BLACK_CAEK,
			NAME_ZOMBI_CAKE,
			NAME_BERRY_CAEK,
			NAME_KELP_CAKE,
			NAME_GOLDAPPLE_CAKE,
			NAME_GOLDAPPLEENC_CAKE,
			NAME_PIZZA,
			NAME_MEETPIZZA,
			NAME_FISHPIZZA,
			NAME_CHEESE,
			NAME_BLUECHEESE
	};

	private static Map<String,Block> blockMap;
	private static Map<String,Item> itemMap;

	public static void init(){
		blockMap = new HashMap<String,Block>(){
			{put(NAME_MEET_COW_COOKED,block_cow_cooked);}
			{put(NAME_MEET_PIG_COOKED,block_pig_cooked);}
			{put(NAME_MEET_CHIKIN_COOKED,block_chikin_cooked);}
			{put(NAME_MEET_MUTTON_COOKED,block_mutton_cooked);}
			{put(NAME_MEET_RABITT_COOKED,block_rabitt_cooked);}
			{put(NAME_MEET_ZOMBIE_COOKED,block_zombie_cooked);}
			{put(NAME_FISH_FISH_COOKED,block_fish_cooked);}
			{put(NAME_FISH_SALMON_COOKED,block_salmon_cooked);}
			{put(NAME_FISH_CLOWN_COOKED,block_clown_cooked);}
			{put(NAME_FISH_PUFFER_COOKED,block_puffer_cooked);}
			{put(NAME_MEET_WOLF_COOKED,block_meetwolf_cooked);}
			{put(NAME_MEET_CAT_COOKED,block_meetcat_cooked);}
			{put(NAME_MEET_HORSE_COOKED,block_meethorse_cooked);}
			{put(NAME_MEET_BEAR_COOKED,block_meetbear_cooked);}
			{put(NAME_MEET_LLAMAS_COOKED,block_meetllamas_cooked);}
			{put(NAME_MEET_FOX_COOKED,block_meetfox_cooked);}
			{put(NAME_MEET_DOLPHIN_COOKED,block_meetdolphin_cooked);}
			{put(NAME_MEET_FLESH_COOKED,block_meetflesh_cooked);}
			{put(NAME_FIHS_TURTLE_COOKED,block_fishturtle_cooked);}
			{put(NAME_FISH_SQUID_COOKED,block_fishsquid_cooked);}
			{put(NAME_MEET_COW,block_cow);}
			{put(NAME_MEET_PIG,block_pig);}
			{put(NAME_MEET_CHIKIN,block_chikin);}
			{put(NAME_MEET_MUTTON,block_mutton);}
			{put(NAME_MEET_RABITT,block_rabitt);}
			{put(NAME_MEET_ZOMBIE,block_zombie);}
			{put(NAME_FISH_FISH,block_fish);}
			{put(NAME_FISH_SALMON,block_salmon);}
			{put(NAME_FISH_CLOWN,block_clown);}
			{put(NAME_FISH_PUFFER,block_puffer);}
			{put(NAME_MEET_WOLF,block_meetwolf);}
			{put(NAME_MEET_CAT,block_meetcat);}
			{put(NAME_MEET_HORSE,block_meethorse);}
			{put(NAME_MEET_BEAR,block_meetbear);}
			{put(NAME_MEET_LLAMAS,block_meetllamas);}
			{put(NAME_MEET_FOX,block_meetfox);}
			{put(NAME_MEET_DOLPHIN,block_meetdolphin);}
			{put(NAME_MEET_FLESH,block_meetflesh);}
			{put(NAME_FISH_TURTLE,block_fishturtle);}
			{put(NAME_FISH_SQUID,block_fishsquid);}

			{put(NAME_COOKINGWORKBENCH,block_cookingworkbench);}
			{put(NAME_FREEZER,block_freezer);}
			{put(NAME_ICECRASHER,block_icecrasher);}
			{put(NAME_MILLSTONE,block_millstone);}
			{put(NAME_SALTPAN,block_saltpan);}

			{put(NAME_PIE_HALL,block_pie_hall);}
			{put(NAME_CARAMELPIE_HALL,block_caramelpie_hall);}
			{put(NAME_CHOCOPIE_HALL,block_chocopie_hall);}
			{put(NAME_SALADA_HALL,block_salada_hall);}
			{put(NAME_MEETPIE_HALL,block_meetpie_hall);}
			{put(NAME_FISHPIE_HALL,block_fishpie_hall);}
			{put(NAME_PUMPKINPIE_HALL,block_pumpkinpie_hall);}
			{put(NAME_APPLEPIE_HALL,block_applepie_hall);}
			{put(NAME_BLACK_PIE_HALL,block_black_pie);}
			{put(NAME_ZOMBIPEI_HALL,block_zombipei_hall);}
			{put(NAME_BERRY_PIE_HALL,block_berrypie_hall);}
			{put(NAME_KELP_PIE_HALL,block_kelppie_hall);}
			{put(NAME_GOLDAPPLE_PIE_HALL,block_goldapplepie_hall);}
			{put(NAME_GOLDAPPLEENC_PIE_HALL,block_goldappleencpie_hall);}

			{put(NAME_CHOCO_CAKE,block_choco_cake);}
			{put(NAME_APPLE_CAKE,block_apple_cake);}
			{put(NAME_SALADA_CAKE,block_salada_cake);}
			{put(NAME_MELLON_CAKE,block_mellon_cake);}
			{put(NAME_PUMPKIN_CAKE,block_pumpkin_cake);}
			{put(NAME_REACHEESE_CAKE,block_reacheese_cake);}
			{put(NAME_BAKEDCHEESE_CAKE,block_bakedcheese_cake);}
			{put(NAME_BLACK_CAEK,block_black_cake);}
			{put(NAME_ZOMBI_CAKE,block_zombi_cake);}
			{put(NAME_BERRY_CAEK,block_berry_cake);}
			{put(NAME_KELP_CAKE,block_kelp_cake);}
			{put(NAME_GOLDAPPLE_CAKE,block_goldapple_cake);}
			{put(NAME_GOLDAPPLEENC_CAKE,block_goldappleenc_cake);}

			{put(NAME_PIZZA,block_pizza);}
			{put(NAME_MEETPIZZA,block_meet_pizza);}
			{put(NAME_FISHPIZZA,block_fish_pizza);}

			{put(NAME_CHEESE,block_cheese);}
			{put(NAME_BLUECHEESE,block_bluecheese);}
		};


		itemMap = new HashMap<String,Item>(){
			{put(NAME_MEET_COW,new ItemBlockMeet(block_cow, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_COW)));}
			{put(NAME_MEET_PIG,new ItemBlockMeet(block_pig, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_PIG)));}
			{put(NAME_MEET_CHIKIN,new ItemBlockMeet(block_chikin, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_CHIKIN)));}
			{put(NAME_MEET_MUTTON,new ItemBlockMeet(block_mutton, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_MUTTON)));}
			{put(NAME_MEET_RABITT,new ItemBlockMeet(block_rabitt, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_RABITT)));}
			{put(NAME_MEET_ZOMBIE,new ItemBlockMeet(block_zombie, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_ZOMBIE)));}
			{put(NAME_FISH_FISH,new ItemBlockMeet(block_fish, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_FISH)));}
			{put(NAME_FISH_SALMON,new ItemBlockMeet(block_salmon, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_SALMON)));}
			{put(NAME_FISH_CLOWN,new ItemBlockMeet(block_clown, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_CLOWN)));}
			{put(NAME_FISH_PUFFER,new ItemBlockMeet(block_puffer, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_PUFFER)));}

			{put(NAME_MEET_COW_COOKED,new ItemBlockMeet(block_cow_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_COW_COOKED)));}
			{put(NAME_MEET_PIG_COOKED,new ItemBlockMeet(block_pig_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_PIG_COOKED)));}
			{put(NAME_MEET_CHIKIN_COOKED,new ItemBlockMeet(block_chikin_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_CHIKIN_COOKED)));}
			{put(NAME_MEET_MUTTON_COOKED,new ItemBlockMeet(block_mutton_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_MUTTON_COOKED)));}
			{put(NAME_MEET_RABITT_COOKED,new ItemBlockMeet(block_rabitt_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_RABITT_COOKED)));}
			{put(NAME_MEET_ZOMBIE_COOKED,new ItemBlockMeet(block_zombie_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_ZOMBIE_COOKED)));}
			{put(NAME_FISH_FISH_COOKED,new ItemBlockMeet(block_fish_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_FISH_COOKED)));}
			{put(NAME_FISH_SALMON_COOKED,new ItemBlockMeet(block_salmon_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_SALMON_COOKED)));}
			{put(NAME_FISH_CLOWN_COOKED,new ItemBlockMeet(block_clown_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_CLOWN_COOKED)));}
			{put(NAME_FISH_PUFFER_COOKED,new ItemBlockMeet(block_puffer_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_PUFFER_COOKED)));}

			{put(NAME_MEET_WOLF,new ItemBlockMeet(block_meetwolf, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_WOLF)));}
			{put(NAME_MEET_CAT,new ItemBlockMeet(block_meetcat, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_CAT)));}
			{put(NAME_MEET_HORSE,new ItemBlockMeet(block_meethorse, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_HORSE)));}
			{put(NAME_MEET_BEAR,new ItemBlockMeet(block_meetbear, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_BEAR)));}
			{put(NAME_MEET_LLAMAS,new ItemBlockMeet(block_meetllamas, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_LLAMAS)));}
			{put(NAME_MEET_FOX,new ItemBlockMeet(block_meetfox, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_FOX)));}
			{put(NAME_MEET_DOLPHIN,new ItemBlockMeet(block_meetdolphin, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_DOLPHIN)));}
			{put(NAME_MEET_FLESH,new ItemBlockMeet(block_meetflesh, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_FLESH)));}
			{put(NAME_FISH_TURTLE,new ItemBlockMeet(block_fishturtle, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISH_TURTLE)));}
			{put(NAME_FISH_SQUID,new ItemBlockMeet(block_fishsquid, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISH_SQUID)));}
			{put(NAME_MEET_WOLF_COOKED,new ItemBlockMeet(block_meetwolf_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_WOLF_COOKED)));}
			{put(NAME_MEET_CAT_COOKED,new ItemBlockMeet(block_meetcat_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_CAT_COOKED)));}
			{put(NAME_MEET_HORSE_COOKED,new ItemBlockMeet(block_meethorse_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_HORSE_COOKED)));}
			{put(NAME_MEET_BEAR_COOKED,new ItemBlockMeet(block_meetbear_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_BEAR_COOKED)));}
			{put(NAME_MEET_LLAMAS_COOKED,new ItemBlockMeet(block_meetllamas_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_LLAMAS_COOKED)));}
			{put(NAME_MEET_FOX_COOKED,new ItemBlockMeet(block_meetfox_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_FOX_COOKED)));}
			{put(NAME_MEET_DOLPHIN_COOKED,new ItemBlockMeet(block_meetdolphin_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_DOLPHIN_COOKED)));}
			{put(NAME_MEET_FLESH_COOKED,new ItemBlockMeet(block_meetflesh_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEET_FLESH_COOKED)));}
			{put(NAME_FIHS_TURTLE_COOKED,new ItemBlockMeet(block_fishturtle_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FIHS_TURTLE_COOKED)));}
			{put(NAME_FISH_SQUID_COOKED,new ItemBlockMeet(block_fishsquid_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISH_SQUID_COOKED)));}
			{put(NAME_COOKINGWORKBENCH, (new BlockItem(block_cookingworkbench,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_COOKINGWORKBENCH))));}
			{put(NAME_FREEZER, (new BlockItem(block_freezer,(new Item.Properties()).group(Mod_ManyFoods.tabColdFood))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FREEZER)));}
			{put(NAME_ICECRASHER,(new BlockItem(block_icecrasher,(new Item.Properties()).group(Mod_ManyFoods.tabColdFood))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ICECRASHER)));}
			{put(NAME_MILLSTONE, (new BlockItem(block_millstone,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MILLSTONE)));}
			{put(NAME_SALTPAN, (new BlockItem(block_saltpan,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALTPAN)));}
			{put(NAME_PIE_HALL, (new ItemBlockPie(block_pie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PIE_HALL)));}
			{put(NAME_CARAMELPIE_HALL, (new ItemBlockPie(block_caramelpie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CARAMELPIE_HALL)));}
			{put(NAME_CHOCOPIE_HALL, (new ItemBlockPie(block_chocopie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHOCOPIE_HALL)));}
			{put(NAME_SALADA_HALL, (new ItemBlockPie(block_salada_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALADA_HALL)));}
			{put(NAME_MEETPIE_HALL, (new ItemBlockPie(block_meetpie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEETPIE_HALL)));}
			{put(NAME_FISHPIE_HALL, (new ItemBlockPie(block_fishpie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISHPIE_HALL)));}
			{put(NAME_PUMPKINPIE_HALL, (new ItemBlockPie(block_pumpkinpie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PUMPKINPIE_HALL)));}
			{put(NAME_ZOMBIPEI_HALL, (new ItemBlockPie(block_zombipei_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ZOMBIPEI_HALL)));}
			{put(NAME_APPLEPIE_HALL, (new ItemBlockPie(block_applepie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_APPLEPIE_HALL)));}
			{put(NAME_BLACK_PIE_HALL, (new ItemBlockPie(block_black_pie,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLACK_PIE_HALL)));}
			{put(NAME_BERRY_PIE_HALL, (new ItemBlockPie(block_berrypie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BERRY_PIE_HALL)));}
			{put(NAME_KELP_PIE_HALL, (new ItemBlockPie(block_kelppie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_KELP_PIE_HALL)));}
			{put(NAME_GOLDAPPLE_PIE_HALL, (new ItemBlockPie(block_goldapplepie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLE_PIE_HALL)));}
			{put(NAME_GOLDAPPLEENC_PIE_HALL, (new ItemBlockPie(block_goldappleencpie_hall,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(16))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLEENC_PIE_HALL)));}
			{put(NAME_PIZZA, (new ItemBlockPie(block_pizza,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(32))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PIZZA)));}
			{put(NAME_MEETPIZZA, (new ItemBlockPie(block_meet_pizza,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(32))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MEETPIZZA)));}
			{put(NAME_FISHPIZZA, (new ItemBlockPie(block_fish_pizza,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(32))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_FISHPIZZA)));}
			{put(NAME_CHEESE, (new ItemBlockPie(block_cheese,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(64))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHEESE)));}
			{put(NAME_BLUECHEESE, (new ItemBlockPie(block_bluecheese,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(64))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLUECHEESE)));}
			{put(NAME_CHOCO_CAKE, (new ItemBlockPie(block_choco_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_CHOCO_CAKE)));}
			{put(NAME_APPLE_CAKE, (new ItemBlockPie(block_apple_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_APPLE_CAKE)));}
			{put(NAME_SALADA_CAKE, (new ItemBlockPie(block_salada_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_SALADA_CAKE)));}
			{put(NAME_MELLON_CAKE, (new ItemBlockPie(block_mellon_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_MELLON_CAKE)));}
			{put(NAME_PUMPKIN_CAKE, (new ItemBlockPie(block_pumpkin_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_PUMPKIN_CAKE)));}
			{put(NAME_REACHEESE_CAKE, (new ItemBlockPie(block_reacheese_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_REACHEESE_CAKE)));}
			{put(NAME_BAKEDCHEESE_CAKE, (new mod.mfm.block.item.ItemBlockPie(block_bakedcheese_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BAKEDCHEESE_CAKE)));}
			{put(NAME_BLACK_CAEK, (new ItemBlockPie(block_black_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BLACK_CAEK)));}
			{put(NAME_ZOMBI_CAKE, (new ItemBlockPie(block_zombi_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_ZOMBI_CAKE)));}
			{put(NAME_BERRY_CAEK, (new ItemBlockPie(block_berry_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_BERRY_CAEK)));}
			{put(NAME_KELP_CAKE, (new ItemBlockPie(block_kelp_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_KELP_CAKE)));}
			{put(NAME_GOLDAPPLE_CAKE, (new ItemBlockPie(block_goldapple_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLE_CAKE)));}
			{put(NAME_GOLDAPPLEENC_CAKE, (new ItemBlockPie(block_goldappleenc_cake,(new Item.Properties()).group(Mod_ManyFoods.tabPieCakes).maxStackSize(1))).setRegistryName(new ResourceLocation(ModCommon.MOD_ID,NAME_GOLDAPPLEENC_CAKE)));}

			};
	}

	public static void registerBlock(final RegistryEvent.Register<Block> event){
		for (String name : NAME_LIST){
			if (blockMap.containsKey(name)) {
				event.getRegistry().register(blockMap.get(name));
			}else {
				ModLog.log().info("can't register :" + name);
			}
		}
	}

	public static void registerBlockItem(final RegistryEvent.Register<Item> event){
		for (String name : NAME_LIST){
			if (itemMap.containsKey(name)) {
				event.getRegistry().register(itemMap.get(name));
			}else {
				ModLog.log().info("can't register :" + name);
			}
		}
	}
}
