package mod.mfm.recipie;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;

import mod.mfm.block.BlockCore;
import mod.mfm.item.ItemCore;
import mod.mfm.util.ModUtil;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class OriginalRecipie {

	private Map<ItemStack, ItemStack> millingList = Maps.<ItemStack,ItemStack>newHashMap();
	private Map<ItemStack, ItemStack> crashingList = Maps.<ItemStack,ItemStack>newHashMap();
	private Map<ItemStack, ItemStack> freezingList = Maps.<ItemStack,ItemStack>newHashMap();

	private static final OriginalRecipie instance = new OriginalRecipie();

	private OriginalRecipie(){
		// Milling
		addRecipie(new ItemStack(Items.BEEF), new ItemStack(ItemCore.item_millbeef,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.PORKCHOP), new ItemStack(ItemCore.item_millpoke), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.CHICKEN), new ItemStack(ItemCore.item_millchikin), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.MUTTON), new ItemStack(ItemCore.item_millmutton), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.WHEAT),new ItemStack(ItemCore.item_flour), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.SUNFLOWER,1), new ItemStack(ItemCore.item_flowerdust_sunflower,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.ROSE_BUSH,1), new ItemStack(ItemCore.item_flowerdust_rose,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.PEONY,1), new ItemStack(ItemCore.item_flowerdust_peony,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.LILAC,1), new ItemStack(ItemCore.item_flowerdust_lilac,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.ALLIUM,1), new ItemStack(ItemCore.item_flowerdust_allium,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.PINK_TULIP,1), new ItemStack(ItemCore.item_flowerdust_tulip,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.ORANGE_TULIP,1), new ItemStack(ItemCore.item_flowerdust_tulip,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.RED_TULIP,1), new ItemStack(ItemCore.item_flowerdust_tulip,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.WHITE_TULIP,1), new ItemStack(ItemCore.item_flowerdust_tulip,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.BLUE_ORCHID,1), new ItemStack(ItemCore.item_flowerdust_orchid,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.DANDELION), new ItemStack(ItemCore.item_flowerdust_dandelion,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.AZURE_BLUET,1), new ItemStack(ItemCore.item_flowerdust_azurebluet,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.OXEYE_DAISY,1), new ItemStack(ItemCore.item_flowerdust_oxeydaisy,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.POPPY,1), new ItemStack(ItemCore.item_flowerdust_popy,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);

		addRecipie(new ItemStack(BlockCore.block_cow), new ItemStack(ItemCore.item_millbeef,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_pig), new ItemStack(ItemCore.item_millpoke,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_chikin), new ItemStack(ItemCore.item_millchikin,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_mutton), new ItemStack(ItemCore.item_millmutton,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_rabitt), new ItemStack(ItemCore.item_millrabit,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetwolf), new ItemStack(ItemCore.item_millwolf,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetcat), new ItemStack(ItemCore.item_millcat,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meethorse), new ItemStack(ItemCore.item_millhorse,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetllamas), new ItemStack(ItemCore.item_millllamas,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetbear), new ItemStack(ItemCore.item_millbear,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetfox), new ItemStack(ItemCore.item_millfox,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetdolphin), new ItemStack(ItemCore.item_milldolphin,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_meetflesh), new ItemStack(ItemCore.item_millflesh,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_fishturtle), new ItemStack(ItemCore.item_millturtle,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.COD), new ItemStack(ItemCore.item_millcod,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.COOKED_SALMON), new ItemStack(ItemCore.item_millsalmon,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.TROPICAL_FISH), new ItemStack(ItemCore.item_millclown,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.PUFFERFISH), new ItemStack(ItemCore.item_millpuffer,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(BlockCore.block_fishsquid), new ItemStack(ItemCore.item_millsquid,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.RABBIT), new ItemStack(ItemCore.item_millrabit,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_wolf), new ItemStack(ItemCore.item_millwolf,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_cat), new ItemStack(ItemCore.item_millcat,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_horse), new ItemStack(ItemCore.item_millhorse,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_llamas), new ItemStack(ItemCore.item_millllamas,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_bear), new ItemStack(ItemCore.item_millbear,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_fox), new ItemStack(ItemCore.item_millfox,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.meet_dolphin), new ItemStack(ItemCore.item_milldolphin,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.raw_flesh), new ItemStack(ItemCore.item_millflesh,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.raw_turtle), new ItemStack(ItemCore.item_millturtle,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.COD), new ItemStack(ItemCore.item_millcod,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.SALMON), new ItemStack(ItemCore.item_millsalmon,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.TROPICAL_FISH), new ItemStack(ItemCore.item_millclown,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.PUFFERFISH), new ItemStack(ItemCore.item_millpuffer,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(ItemCore.raw_squid), new ItemStack(ItemCore.item_millsquid,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.CORNFLOWER), new ItemStack(ItemCore.item_flowerdust_corm,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.WITHER_ROSE), new ItemStack(ItemCore.item_flowerdust_witherrose,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BRAIN_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BRAIN_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,4), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BRAIN_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BUBBLE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BUBBLE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,4), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.BUBBLE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.FIRE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.FIRE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,4), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.FIRE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.HORN_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.HORN_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,4), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.HORN_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.TUBE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.TUBE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,4), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.TUBE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BRAIN_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BRAIN_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BRAIN_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BUBBLE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BUBBLE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_BUBBLE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_FIRE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_FIRE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_FIRE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_HORN_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_HORN_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_HORN_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_TUBE_CORAL), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_TUBE_CORAL_BLOCK), new ItemStack(ItemCore.item_flowerdust_coral,2), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DEAD_TUBE_CORAL_FAN), new ItemStack(ItemCore.item_flowerdust_coral,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.ACACIA_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.BIRCH_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.DARK_OAK_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.JUNGLE_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.DARK_OAK_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Blocks.SPRUCE_LEAVES), new ItemStack(ItemCore.item_greendust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DRIED_KELP), new ItemStack(ItemCore.item_kelpdust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);
		addRecipie(new ItemStack(Items.DRIED_KELP_BLOCK), new ItemStack(ItemCore.item_kelpdust,1), ORIGINAL_RECIPIES.RECIPIE_MILLING);


		// Chasshing
		addRecipie(new ItemStack(Blocks.ICE,1), new ItemStack(ItemCore.item_crashedice_none,1), ORIGINAL_RECIPIES.RECIPIE_CRASHING);
		addRecipie(new ItemStack(Blocks.PACKED_ICE,1), new ItemStack(ItemCore.item_crashedice_none,1), ORIGINAL_RECIPIES.RECIPIE_CRASHING);
		addRecipie(new ItemStack(Blocks.BLUE_ICE,1), new ItemStack(ItemCore.item_crashedice_none,1), ORIGINAL_RECIPIES.RECIPIE_CRASHING);

		// Freezing
		addRecipie(new ItemStack(ItemCore.item_ice_mix_vanila,1), new ItemStack(ItemCore.item_icecream_vanila,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_black,1), new ItemStack(ItemCore.item_icecream_black,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_red,1), new ItemStack(ItemCore.item_icecream_red,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_green,1), new ItemStack(ItemCore.item_icecream_green,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_brown,1), new ItemStack(ItemCore.item_icecream_brown,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_blue,1), new ItemStack(ItemCore.item_icecream_blue,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_purple,1), new ItemStack(ItemCore.item_icecream_purple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_cyan,1), new ItemStack(ItemCore.item_icecream_cyan,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_silver,1), new ItemStack(ItemCore.item_icecream_silver,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_gray,1), new ItemStack(ItemCore.item_icecream_gray,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_pink,1), new ItemStack(ItemCore.item_icecream_pink,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_lime,1), new ItemStack(ItemCore.item_icecream_lime,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_yellow,1), new ItemStack(ItemCore.item_icecream_yellow,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_light_blue,1), new ItemStack(ItemCore.item_icecream_light_blue,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_magenta,1), new ItemStack(ItemCore.item_icecream_magenta,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_orange,1), new ItemStack(ItemCore.item_icecream_orange,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_white,1), new ItemStack(ItemCore.item_icecream_white,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_apple,1), new ItemStack(ItemCore.item_icecream_apple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_cactus,1), new ItemStack(ItemCore.item_icecream_cactus,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_pumpkin,1), new ItemStack(ItemCore.item_icecream_pumpkin,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_potato,1), new ItemStack(ItemCore.item_icecream_potato,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_carrot,1), new ItemStack(ItemCore.item_icecream_carrot,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_melon,1), new ItemStack(ItemCore.item_icecream_melon,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_greentea,1), new ItemStack(ItemCore.item_icecream_greentea,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_ink_sac,1), new ItemStack(ItemCore.item_icecream_ink_sac,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_cocoa,1), new ItemStack(ItemCore.item_icecream_cocoa,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_berry,1), new ItemStack(ItemCore.item_icecream_berry,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_kelp,1), new ItemStack(ItemCore.item_icecream_kelp,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_goldapple,1), new ItemStack(ItemCore.item_icecream_goldapple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_ice_mix_goldappleenc,1), new ItemStack(ItemCore.item_icecream_goldappleenc,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);


		addRecipie(new ItemStack(ItemCore.item_sugar_water_none,1), new ItemStack(ItemCore.item_icecandy_none,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_sugar,1), new ItemStack(ItemCore.item_icecandy_sugar,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_black,1), new ItemStack(ItemCore.item_icecandy_black,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_red,1), new ItemStack(ItemCore.item_icecandy_red,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_green,1), new ItemStack(ItemCore.item_icecandy_green,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_brown,1), new ItemStack(ItemCore.item_icecandy_brown,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_blue,1), new ItemStack(ItemCore.item_icecandy_blue,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_purple,1), new ItemStack(ItemCore.item_icecandy_purple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_cyan,1), new ItemStack(ItemCore.item_icecandy_cyan,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_silver,1), new ItemStack(ItemCore.item_icecandy_silver,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_gray,1), new ItemStack(ItemCore.item_icecandy_gray,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_pink,1), new ItemStack(ItemCore.item_icecandy_pink,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_lime,1), new ItemStack(ItemCore.item_icecandy_lime,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_yellow,1), new ItemStack(ItemCore.item_icecandy_yellow,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_light_blue,1), new ItemStack(ItemCore.item_icecandy_light_blue,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_magenta,1), new ItemStack(ItemCore.item_icecandy_magenta,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_orange,1), new ItemStack(ItemCore.item_icecandy_orange,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_white,1), new ItemStack(ItemCore.item_icecandy_white,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_apple,1), new ItemStack(ItemCore.item_icecandy_apple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_cactus,1), new ItemStack(ItemCore.item_icecandy_cactus,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_melon,1), new ItemStack(ItemCore.item_icecandy_melon,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_pumpkin,1), new ItemStack(ItemCore.item_icecandy_pumpkin,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_greentea,1), new ItemStack(ItemCore.item_icecandy_greentea,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_ink_sac,1), new ItemStack(ItemCore.item_icecandy_ink_sac,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_cocoa,1), new ItemStack(ItemCore.item_icecandy_cocoa,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_berry,1), new ItemStack(ItemCore.item_icecandy_berry,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_kelp,1), new ItemStack(ItemCore.item_icecandy_kelp,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_goldapple,1), new ItemStack(ItemCore.item_icecandy_goldapple,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
		addRecipie(new ItemStack(ItemCore.item_sugar_water_goldappleenc,1), new ItemStack(ItemCore.item_icecandy_goldappleenc,1), ORIGINAL_RECIPIES.RECIPIE_FREEZING);

		addRecipie(new ItemStack(Items.WATER_BUCKET), new ItemStack(Blocks.ICE), ORIGINAL_RECIPIES.RECIPIE_FREEZING);
	}

	public static OriginalRecipie Instance(){return instance;}

	private Map<ItemStack, ItemStack> getList(ORIGINAL_RECIPIES kind){
		switch(kind){
		case RECIPIE_CRASHING:
			return crashingList;
		case RECIPIE_FREEZING:
			return freezingList;
		case RECIPIE_MILLING:
			return millingList;
		default:
			break;

		}
		return null;
	}


	public void addRecipie(ItemStack input, ItemStack output, ORIGINAL_RECIPIES kind) throws IllegalArgumentException{

		Map<ItemStack,ItemStack> list = getList(kind);
		if (list == null) {new IllegalArgumentException();}
        list.put(input, output);
	}

	public boolean canConvert(ORIGINAL_RECIPIES kind, ItemStack input)throws IllegalArgumentException{
		if ( input == null) {return false;}
		Map<ItemStack,ItemStack> list = getList(kind);
		if (list == null) {new IllegalArgumentException();}

		return (getResultItem(list,input)!=null);
	}

	public ItemStack getResultItem(ORIGINAL_RECIPIES kind, ItemStack input)throws IllegalArgumentException{
		if ( input == null) {return null;}
		Map<ItemStack,ItemStack> list = getList(kind);
		if (list == null) {new IllegalArgumentException();}

		return getResultItem(list,input);
	}

    private ItemStack getResultItem(Map<ItemStack,ItemStack> list, ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : list.entrySet())
        {
            if (ModUtil.compareItemStacks(stack, (ItemStack)entry.getKey()))
            {
                return (ItemStack)entry.getValue().copy();
            }
        }

        return null;
    }


	public static enum ORIGINAL_RECIPIES{
		RECIPIE_MILLING,
		RECIPIE_CRASHING,
		RECIPIE_FREEZING,
		RECIPIE_FREEZING_ICE
	}
}
