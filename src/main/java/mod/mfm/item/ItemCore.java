package mod.mfm.item;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;

public class ItemCore {
	public static final String NAME_COOKED_ROTTEN_FLESH = "cooked_rotten_flesh";
	public static final String NAME_COOKED_CLOWN = "cooked_clown";
	public static final String NAME_COOKED_PUFFER ="cooked_puffer";

	public static final String NAME_MEET_WOLF = "wolf_meet";
	public static final String NAME_COOKED_WOLF = "cooked_wolf";
	public static final String NAME_MEET_CAT = "cat_meet";
	public static final String NAME_COOKED_CAT = "cooked_cat";
	public static final String NAME_MEET_HORSE = "horse_meet";
	public static final String NAME_COOKED_HORSE = "cooked_horse";
	public static final String NAME_MEET_BEAR = "bear_meet";
	public static final String NAME_COOKED_BEAR = "cooked_bear";
	public static final String NAME_MEET_LLAMAS = "llamas_meet";
	public static final String NAME_COOKED_LLAMAS = "cooked_llamas";
	public static final String NAME_MEET_FOX = "fox_meet";
	public static final String NAME_COOKED_FOX = "cooked_fox";
	public static final String NAME_MEET_DOLPHIN = "dolpin_meet";
	public static final String NAME_COOKED_DOLPHIN = "cooked_dolphin";
	public static final String NAME_RAW_TURTLE = "raw_turtle";
	public static final String NAME_COOKED_TURTLE = "cooked_turtle";
	public static final String NAME_RAW_SQUID = "raw_squid";
	public static final String NAME_COOKED_SQUID = "cooked_squid";
	public static final String NAME_FLESH = "flesh";
	public static final String NAME_COOKED_FLESH = "cooked_flesh";


	public static final String[] NAME_LIST = new String[]{
			NAME_COOKED_ROTTEN_FLESH,
			NAME_COOKED_CLOWN,
			NAME_COOKED_PUFFER,
			NAME_MEET_WOLF,
			NAME_COOKED_WOLF,
			NAME_MEET_CAT,
			NAME_COOKED_CAT,
			NAME_MEET_HORSE,
			NAME_COOKED_HORSE,
			NAME_MEET_BEAR,
			NAME_COOKED_BEAR,
			NAME_MEET_LLAMAS,
			NAME_COOKED_LLAMAS,
			NAME_MEET_FOX,
			NAME_COOKED_FOX,
			NAME_MEET_DOLPHIN,
			NAME_COOKED_DOLPHIN,
			NAME_RAW_TURTLE,
			NAME_COOKED_TURTLE,
			NAME_RAW_SQUID,
			NAME_COOKED_SQUID,
			NAME_FLESH,
			NAME_COOKED_FLESH
	};

	public final static Item cooked_rotten_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_rooten_flesh)).setRegistryName(NAME_COOKED_ROTTEN_FLESH);
	public final static Item cooked_clown = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_clown)).setRegistryName(NAME_COOKED_CLOWN);
	public final static Item cooked_puffer =  new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_puffer)).setRegistryName(NAME_COOKED_PUFFER);
	public final static Item meet_wolf = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_wolf)).setRegistryName(NAME_MEET_WOLF);
	public final static Item cooked_wolf = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_wolf)).setRegistryName(NAME_COOKED_WOLF);
	public final static Item meet_cat = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_cat)).setRegistryName(NAME_MEET_CAT);
	public final static Item cooked_cat = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_cat)).setRegistryName(NAME_COOKED_CAT);
	public final static Item meet_horse = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_horse)).setRegistryName(NAME_MEET_HORSE);
	public final static Item cooked_horse = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_horse)).setRegistryName(NAME_COOKED_HORSE);
	public final static Item meet_bear = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_bear)).setRegistryName(NAME_MEET_BEAR);
	public final static Item cooked_bear = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_bear)).setRegistryName(NAME_COOKED_BEAR);
	public final static Item meet_llamas = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_llamas)).setRegistryName(NAME_MEET_LLAMAS);
	public final static Item cooked_llamas = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_llamas)).setRegistryName(NAME_COOKED_LLAMAS);
	public final static Item meet_fox = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_fox)).setRegistryName(NAME_MEET_FOX);
	public final static Item cooked_fox = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_fox)).setRegistryName(NAME_COOKED_FOX);
	public final static Item meet_dolphin = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_dolphin)).setRegistryName(NAME_MEET_DOLPHIN);
	public final static Item cooked_dolphin = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_dolphin)).setRegistryName(NAME_COOKED_DOLPHIN);
	public final static Item raw_turtle = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_turtle)).setRegistryName(NAME_RAW_TURTLE);
	public final static Item cooked_turtle = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_turtle)).setRegistryName(NAME_COOKED_TURTLE);
	public final static Item raw_squid = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_squid)).setRegistryName(NAME_RAW_SQUID);
	public final static Item cooked_squid = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_squid)).setRegistryName(NAME_COOKED_SQUID);
	public final static Item raw_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_flesh)).setRegistryName(NAME_FLESH);
	public final static Item cooked_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_flesh)).setRegistryName(NAME_COOKED_FLESH);


	private static Map<String,Item> itemMap;
	public static void init(){
		if (itemMap != null){return;}
//		cooked_rotten_flesh
//		cooked_clown =
//		cooked_puffer

		itemMap = new HashMap<String,Item>(){
			{put(NAME_COOKED_ROTTEN_FLESH,cooked_rotten_flesh);}
			{put(NAME_COOKED_CLOWN,cooked_clown);}
			{put(NAME_COOKED_PUFFER,cooked_puffer);}
			{put(NAME_MEET_WOLF,meet_wolf);}
			{put(NAME_COOKED_WOLF,cooked_wolf);}
			{put(NAME_MEET_CAT,meet_cat);}
			{put(NAME_COOKED_CAT,cooked_cat);}
			{put(NAME_MEET_HORSE,meet_horse);}
			{put(NAME_COOKED_HORSE,cooked_horse);}
			{put(NAME_MEET_BEAR,meet_bear);}
			{put(NAME_COOKED_BEAR,cooked_bear);}
			{put(NAME_MEET_LLAMAS,meet_llamas);}
			{put(NAME_COOKED_LLAMAS,cooked_llamas);}
			{put(NAME_MEET_FOX,meet_fox);}
			{put(NAME_COOKED_FOX,cooked_fox);}
			{put(NAME_MEET_DOLPHIN,meet_dolphin);}
			{put(NAME_COOKED_DOLPHIN,cooked_dolphin);}
			{put(NAME_RAW_TURTLE,raw_turtle);}
			{put(NAME_COOKED_TURTLE,cooked_turtle);}
			{put(NAME_RAW_SQUID,raw_squid);}
			{put(NAME_COOKED_SQUID,cooked_squid);}
			{put(NAME_FLESH,raw_flesh);}
			{put(NAME_COOKED_FLESH,cooked_flesh);}
		};
	}

	public static void register(final RegistryEvent.Register<Item> itemRegistryEvent){
		for (String name : NAME_LIST){
			if (itemMap.containsKey(name)) {
				itemRegistryEvent.getRegistry().register(itemMap.get(name));
			}
		}

	}
}
