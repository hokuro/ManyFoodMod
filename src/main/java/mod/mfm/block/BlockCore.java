package mod.mfm.block;

import java.util.HashMap;
import java.util.Map;

import mod.mfm.block.item.ItemBlockMeet;
import mod.mfm.core.ModCommon;
import mod.mfm.item.ItemCore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
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
	public static final String NAME_FISH_PUFFER = "fishfuffer";
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
	public static final String NAME_FISH_PUFFER_COOKED = "fishfuffer_cooked";
	public static final String NAME_FIHS_TURTLE_COOKED = "fishturtle_cooked";
	public static final String NAME_FISH_SQUID_COOKED = "fishsquid_cooked";

	public static Block block_cow;
	public static Block block_pig;
	public static Block block_chikin;
	public static Block block_mutton;
	public static Block block_rabitt;
	public static Block block_zombie;
	public static Block block_fish;
	public static Block block_salmon;
	public static Block block_clown;
	public static Block block_puffer;

	public static Block block_cow_cooked;
	public static Block block_pig_cooked;
	public static Block block_chikin_cooked;
	public static Block block_mutton_cooked;
	public static Block block_rabitt_cooked;
	public static Block block_zombie_cooked;
	public static Block block_fish_cooked;
	public static Block block_salmon_cooked;
	public static Block block_clown_cooked;
	public static Block block_puffer_cooked;

	public static Block block_meetwolf;
	public static Block block_meetcat;
	public static Block block_meethorse;
	public static Block block_meetbear;
	public static Block block_meetllamas;
	public static Block block_meetfox;
	public static Block block_meetdolphin;
	public static Block block_meetflesh;
	public static Block block_fishturtle;
	public static Block block_fishsquid;
	public static Block block_meetwolf_cooked;
	public static Block block_meetcat_cooked;
	public static Block block_meethorse_cooked;
	public static Block block_meetbear_cooked;
	public static Block block_meetllamas_cooked;
	public static Block block_meetfox_cooked;
	public static Block block_meetdolphin_cooked;
	public static Block block_meetflesh_cooked;
	public static Block block_fishturtle_cooked;
	public static Block block_fishsquid_cooked;


	private static final String[] NAME_LIST = new String[]{
			NAME_MEET_COW,
			NAME_MEET_PIG,
			NAME_MEET_CHIKIN,
			NAME_MEET_MUTTON,
			NAME_MEET_RABITT,
			NAME_MEET_ZOMBIE,
			NAME_MEET_WOLF,
			NAME_MEET_CAT,
			NAME_MEET_HORSE,
			NAME_MEET_BEAR,
			NAME_MEET_LLAMAS,
			NAME_MEET_FOX,
			NAME_MEET_DOLPHIN,
			NAME_MEET_FLESH,
			NAME_FISH_FISH,
			NAME_FISH_SALMON,
			NAME_FISH_CLOWN,
			NAME_FISH_PUFFER,
			NAME_FISH_TURTLE,
			NAME_FISH_SQUID,
			NAME_MEET_COW_COOKED,
			NAME_MEET_PIG_COOKED,
			NAME_MEET_CHIKIN_COOKED,
			NAME_MEET_MUTTON_COOKED,
			NAME_MEET_RABITT_COOKED,
			NAME_MEET_ZOMBIE_COOKED,
			NAME_MEET_WOLF_COOKED,
			NAME_MEET_CAT_COOKED,
			NAME_MEET_HORSE_COOKED,
			NAME_MEET_BEAR_COOKED,
			NAME_MEET_LLAMAS_COOKED,
			NAME_MEET_FOX_COOKED,
			NAME_MEET_DOLPHIN_COOKED,
			NAME_FISH_FISH_COOKED,
			NAME_FISH_SALMON_COOKED,
			NAME_FISH_CLOWN_COOKED,
			NAME_FISH_PUFFER_COOKED,
			NAME_MEET_FLESH_COOKED,
			NAME_FIHS_TURTLE_COOKED,
			NAME_FISH_SQUID_COOKED
	};

	private static Map<String,Block> blockMap;
	private static Map<String,Item> itemMap;

	public static void init(){
		block_cow_cooked = new BlockMeet(Items.COOKED_BEEF,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_COW_COOKED));
		block_pig_cooked = new BlockMeet(Items.COOKED_PORKCHOP,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_PIG_COOKED));
		block_chikin_cooked = new BlockMeet(Items.COOKED_CHICKEN,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_CHIKIN_COOKED));
		block_mutton_cooked = new BlockMeet(Items.COOKED_MUTTON,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_MUTTON_COOKED));
		block_rabitt_cooked = new BlockMeet(Items.COOKED_RABBIT,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_RABITT_COOKED));
		block_zombie_cooked = new BlockMeet(ItemCore.cooked_rotten_flesh,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_ZOMBIE_COOKED));
		block_fish_cooked = new BlockMeet(Items.COOKED_COD,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FISH_FISH_COOKED));
		block_salmon_cooked = new BlockMeet(Items.COOKED_SALMON,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FISH_SALMON_COOKED));
		block_clown_cooked = new BlockMeet(ItemCore.cooked_clown,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FISH_CLOWN_COOKED));
		block_puffer_cooked = new BlockMeet(ItemCore.cooked_puffer,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FISH_PUFFER_COOKED));
		block_meetwolf_cooked = new BlockMeet(ItemCore.cooked_wolf,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_WOLF_COOKED));
		block_meetcat_cooked = new BlockMeet(ItemCore.cooked_cat,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_CAT_COOKED));
		block_meethorse_cooked = new BlockMeet(ItemCore.cooked_horse,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_HORSE_COOKED));
		block_meetbear_cooked = new BlockMeet(ItemCore.cooked_bear,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_BEAR_COOKED));
		block_meetllamas_cooked = new BlockMeet(ItemCore.cooked_llamas,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_LLAMAS_COOKED));
		block_meetfox_cooked = new BlockMeet(ItemCore.cooked_fox,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_FOX_COOKED));
		block_meetdolphin_cooked = new BlockMeet(ItemCore.cooked_dolphin,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_DOLPHIN_COOKED));
		block_meetflesh_cooked = new BlockMeet(ItemCore.cooked_flesh,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_MEET_FLESH_COOKED));
		block_fishturtle_cooked = new BlockMeet(ItemCore.cooked_turtle,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FIHS_TURTLE_COOKED));
		block_fishsquid_cooked = new BlockMeet(ItemCore.cooked_squid,true)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+ NAME_FISH_SQUID_COOKED));


		block_cow = new BlockMeet(Items.BEEF, false, block_cow_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_COW));
		block_pig = new BlockMeet(Items.PORKCHOP,false,block_pig_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_PIG));
		block_chikin = new BlockMeet(Items.CHICKEN, false,block_chikin_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_CHIKIN));
		block_mutton = new BlockMeet(Items.MUTTON, false,block_mutton_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_MUTTON));
		block_rabitt = new BlockMeet(Items.RABBIT, false,block_rabitt_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_RABITT));
		block_zombie = new BlockMeet(Items.ROTTEN_FLESH, false,block_zombie_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_ZOMBIE));
		block_fish = new BlockMeet(Items.COD,false,block_fish_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_FISH));
		block_salmon = new BlockMeet(Items.SALMON, false,block_salmon_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_SALMON));
		block_clown = new BlockMeet(Items.TROPICAL_FISH,false,block_clown_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_CLOWN));
		block_puffer = new BlockMeet(Items.PUFFERFISH,false,block_puffer_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_PUFFER));
		block_meetwolf = new BlockMeet(ItemCore.meet_wolf,false,block_meetwolf_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_WOLF));
		block_meetcat = new BlockMeet(ItemCore.meet_cat,false,block_meetcat_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_CAT));
		block_meethorse = new BlockMeet(ItemCore.meet_horse,false,block_meethorse_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_HORSE));
		block_meetbear = new BlockMeet(ItemCore.meet_bear,false,block_meetbear_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_BEAR));
		block_meetllamas = new BlockMeet(ItemCore.meet_llamas,false,block_meetllamas_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_LLAMAS));
		block_meetfox = new BlockMeet(ItemCore.meet_fox,false,block_meetfox_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_FOX));
		block_meetdolphin = new BlockMeet(ItemCore.meet_dolphin,false,block_meetdolphin_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_DOLPHIN));
		block_meetflesh = new BlockMeet(ItemCore.raw_flesh,false,block_meetflesh_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_MEET_FLESH));
		block_fishturtle = new BlockMeet(ItemCore.raw_turtle,false,block_fishturtle_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_TURTLE));
		block_fishsquid = new BlockMeet(ItemCore.cooked_squid,false,block_fishsquid_cooked)
				.setRegistryName(new ResourceLocation(ModCommon.MOD_ID+":"+NAME_FISH_SQUID));


		blockMap = new HashMap<String,Block>(){
			{put(NAME_MEET_COW,block_cow);}
			{put(NAME_MEET_PIG,block_pig);}
			{put(NAME_MEET_CHIKIN,block_chikin);}
			{put(NAME_MEET_MUTTON,block_mutton);}
			{put(NAME_MEET_RABITT,block_rabitt);}
			{put(NAME_MEET_ZOMBIE,block_zombie);}
			{put(NAME_MEET_WOLF,block_meetwolf);}
			{put(NAME_MEET_CAT,block_meetcat);}
			{put(NAME_MEET_HORSE,block_meethorse);}
			{put(NAME_MEET_BEAR,block_meetbear);}
			{put(NAME_MEET_LLAMAS,block_meetllamas);}
			{put(NAME_MEET_FOX,block_meetfox);}
			{put(NAME_MEET_DOLPHIN,block_meetdolphin);}
			{put(NAME_MEET_FLESH,block_meetflesh);}
			{put(NAME_FISH_FISH,block_fish);}
			{put(NAME_FISH_SALMON,block_salmon);}
			{put(NAME_FISH_CLOWN,block_clown);}
			{put(NAME_FISH_PUFFER,block_puffer);}
			{put(NAME_FISH_TURTLE,block_fishturtle);}
			{put(NAME_FISH_SQUID,block_fishsquid);}

			{put(NAME_MEET_COW_COOKED,block_cow_cooked);}
			{put(NAME_MEET_PIG_COOKED,block_pig_cooked);}
			{put(NAME_MEET_CHIKIN_COOKED,block_chikin_cooked);}
			{put(NAME_MEET_MUTTON_COOKED,block_mutton_cooked);}
			{put(NAME_MEET_RABITT_COOKED,block_rabitt_cooked);}
			{put(NAME_MEET_ZOMBIE_COOKED,block_zombie_cooked);}
			{put(NAME_MEET_WOLF_COOKED,block_meetwolf_cooked);}
			{put(NAME_MEET_CAT_COOKED,block_meetcat_cooked);}
			{put(NAME_MEET_HORSE_COOKED,block_meethorse_cooked);}
			{put(NAME_MEET_BEAR_COOKED,block_meetbear_cooked);}
			{put(NAME_MEET_LLAMAS_COOKED,block_meetllamas_cooked);}
			{put(NAME_MEET_FOX_COOKED,block_meetfox_cooked);}
			{put(NAME_MEET_DOLPHIN_COOKED,block_meetdolphin_cooked);}
			{put(NAME_MEET_FLESH_COOKED,block_meetflesh_cooked);}
			{put(NAME_FISH_FISH_COOKED,block_fish_cooked);}
			{put(NAME_FISH_SALMON_COOKED,block_salmon_cooked);}
			{put(NAME_FISH_CLOWN_COOKED,block_clown_cooked);}
			{put(NAME_FISH_PUFFER_COOKED,block_puffer_cooked);}
			{put(NAME_FIHS_TURTLE_COOKED,block_fishturtle_cooked);}
			{put(NAME_FISH_SQUID_COOKED,block_fishsquid_cooked);}
		};


		itemMap = new HashMap<String,Item>(){
			{put(NAME_MEET_COW,new ItemBlockMeet(block_cow, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_COW));}
			{put(NAME_MEET_PIG,new ItemBlockMeet(block_pig, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_PIG));}
			{put(NAME_MEET_CHIKIN,new ItemBlockMeet(block_chikin, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_CHIKIN));}
			{put(NAME_MEET_MUTTON,new ItemBlockMeet(block_mutton, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_MUTTON));}
			{put(NAME_MEET_RABITT,new ItemBlockMeet(block_rabitt, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_RABITT));}
			{put(NAME_MEET_ZOMBIE,new ItemBlockMeet(block_zombie, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_ZOMBIE));}
			{put(NAME_FISH_FISH,new ItemBlockMeet(block_fish, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_FISH));}
			{put(NAME_FISH_SALMON,new ItemBlockMeet(block_salmon, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_SALMON));}
			{put(NAME_FISH_CLOWN,new ItemBlockMeet(block_clown, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_CLOWN));}
			{put(NAME_FISH_PUFFER,new ItemBlockMeet(block_puffer, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_PUFFER));}

			{put(NAME_MEET_COW_COOKED,new ItemBlockMeet(block_cow_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_COW_COOKED));}
			{put(NAME_MEET_PIG_COOKED,new ItemBlockMeet(block_pig_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_PIG_COOKED));}
			{put(NAME_MEET_CHIKIN_COOKED,new ItemBlockMeet(block_chikin_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_CHIKIN_COOKED));}
			{put(NAME_MEET_MUTTON_COOKED,new ItemBlockMeet(block_mutton_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_MUTTON_COOKED));}
			{put(NAME_MEET_RABITT_COOKED,new ItemBlockMeet(block_rabitt_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_RABITT_COOKED));}
			{put(NAME_MEET_ZOMBIE_COOKED,new ItemBlockMeet(block_zombie_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_MEET_ZOMBIE_COOKED));}
			{put(NAME_FISH_FISH_COOKED,new ItemBlockMeet(block_fish_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_FISH_COOKED));}
			{put(NAME_FISH_SALMON_COOKED,new ItemBlockMeet(block_salmon_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_SALMON_COOKED));}
			{put(NAME_FISH_CLOWN_COOKED,new ItemBlockMeet(block_clown_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_CLOWN_COOKED));}
			{put(NAME_FISH_PUFFER_COOKED,new ItemBlockMeet(block_puffer_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" + NAME_FISH_PUFFER_COOKED));}

			{put(NAME_MEET_WOLF,new ItemBlockMeet(block_meetwolf, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_WOLF));}
			{put(NAME_MEET_CAT,new ItemBlockMeet(block_meetcat, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_CAT));}
			{put(NAME_MEET_HORSE,new ItemBlockMeet(block_meethorse, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_HORSE));}
			{put(NAME_MEET_BEAR,new ItemBlockMeet(block_meetbear, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_BEAR));}
			{put(NAME_MEET_LLAMAS,new ItemBlockMeet(block_meetllamas, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_LLAMAS));}
			{put(NAME_MEET_FOX,new ItemBlockMeet(block_meetfox, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_FOX));}
			{put(NAME_MEET_DOLPHIN,new ItemBlockMeet(block_meetdolphin, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_DOLPHIN));}
			{put(NAME_MEET_FLESH,new ItemBlockMeet(block_meetflesh, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_FLESH));}
			{put(NAME_FISH_TURTLE,new ItemBlockMeet(block_fishturtle, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_FISH_TURTLE));}
			{put(NAME_FISH_SQUID,new ItemBlockMeet(block_fishsquid, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_FISH_SQUID));}
			{put(NAME_MEET_WOLF_COOKED,new ItemBlockMeet(block_meetwolf_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_WOLF_COOKED));}
			{put(NAME_MEET_CAT_COOKED,new ItemBlockMeet(block_meetcat_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_CAT_COOKED));}
			{put(NAME_MEET_HORSE_COOKED,new ItemBlockMeet(block_meethorse_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_HORSE_COOKED));}
			{put(NAME_MEET_BEAR_COOKED,new ItemBlockMeet(block_meetbear_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_BEAR_COOKED));}
			{put(NAME_MEET_LLAMAS_COOKED,new ItemBlockMeet(block_meetllamas_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_LLAMAS_COOKED));}
			{put(NAME_MEET_FOX_COOKED,new ItemBlockMeet(block_meetfox_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_FOX_COOKED));}
			{put(NAME_MEET_DOLPHIN_COOKED,new ItemBlockMeet(block_meetdolphin_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_DOLPHIN_COOKED));}
			{put(NAME_MEET_FLESH_COOKED,new ItemBlockMeet(block_meetflesh_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_MEET_FLESH_COOKED));}
			{put(NAME_FIHS_TURTLE_COOKED,new ItemBlockMeet(block_fishturtle_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_FIHS_TURTLE_COOKED));}
			{put(NAME_FISH_SQUID_COOKED,new ItemBlockMeet(block_fishsquid_cooked, (new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(ModCommon.MOD_ID + ":" +NAME_FISH_SQUID_COOKED));}

			};
	}

	public static void registerBlock(final RegistryEvent.Register<Block> event){
		for (String name : NAME_LIST){
			if (blockMap.containsKey(name)) {
				event.getRegistry().register(blockMap.get(name));
			}
		}
	}

	public static void registerBlockItem(final RegistryEvent.Register<Item> event){
		for (String name : NAME_LIST){
			if (itemMap.containsKey(name)) {
				event.getRegistry().register(itemMap.get(name));
			}
		}
	}
}
