package mod.mfm.item;

import java.util.HashMap;
import java.util.Map;

import mod.mfm.core.ModCommon;
import mod.mfm.core.Mod_ManyFoods;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;

public class ItemCore {


	public static final String NAME_MEET_WOLF = "wolf_meet";
	public static final String NAME_MEET_CAT = "cat_meet";
	public static final String NAME_MEET_HORSE = "horse_meet";
	public static final String NAME_MEET_BEAR = "bear_meet";
	public static final String NAME_MEET_LLAMAS = "llamas_meet";
	public static final String NAME_MEET_FOX = "fox_meet";
	public static final String NAME_MEET_DOLPHIN = "dolpin_meet";
	public static final String NAME_RAW_TURTLE = "raw_turtle";
	public static final String NAME_RAW_SQUID = "raw_squid";
	public static final String NAME_FLESH = "flesh";
	public static final String NAME_COOKED_ROTTEN_FLESH = "cooked_rotten_flesh";
	public static final String NAME_COOKED_CLOWN = "cooked_clown";
	public static final String NAME_COOKED_PUFFER ="cooked_puffer";
	public static final String NAME_COOKED_WOLF = "cooked_wolf";
	public static final String NAME_COOKED_CAT = "cooked_cat";
	public static final String NAME_COOKED_HORSE = "cooked_horse";
	public static final String NAME_COOKED_BEAR = "cooked_bear";
	public static final String NAME_COOKED_LLAMAS = "cooked_llamas";
	public static final String NAME_COOKED_FOX = "cooked_fox";
	public static final String NAME_COOKED_DOLPHIN = "cooked_dolphin";
	public static final String NAME_COOKED_TURTLE = "cooked_turtle";
	public static final String NAME_COOKED_SQUID = "cooked_squid";
	public static final String NAME_COOKED_FLESH = "cooked_flesh";
	public static final String NAME_HUNGERDRAG = "hungerdrag";

	public static final String NAME_ICEFOOD_BOWL = "icefoodbowl";// アイスの器
	public static final String NAME_OBON = "obon";


	public static final String NAME_CHOCO = "chocolate";//	チョコレート
	public static final String NAME_WHITECHOCO ="whitechocolate";//	ホワイトチョコレート
	public static final String NAME_CARAMEL = "caramel";//	キャラメル
	public static final String NAME_PUDDING = "pudding";//	プリン
	public static final String NAME_PUMPKINPUDDING = "pumpukinpudding";//	かぼちゃプリン
	public static final String NAME_PIECEPIE = "piecepie";//	パイ
	public static final String NAME_PIECECHOCOPIE ="piecepiechoco";//	チョコレートパイ
	public static final String NAME_PIECESALADAPIE = "piecepiesalada";//	サラダパイ
	public static final String NAME_PIECEMEETPIE = "piecepiemeet";//	ミートパイ
	public static final String NAME_PIECEFISHPIE="piecepiefish";//	フィッシュパイ
	public static final String NAME_PIECEPUMPUKINPIE ="piecepiepumpkin";//	かぼちゃパイ
	public static final String NAME_PIECEZOMBIPIE="piecepiezombi";//	ゾンビーフパイ
	public static final String NAME_PIECEAPPLEPIE="piecepieapple";//	アップルパイ
	public static final String NAME_PIECEblackPIE="piecepieblack";//	烏賊墨パイ
	public static final String NAME_PIECECARAMELPIE="piecepiecaramel";//	カラメルパイ
	public static final String NAME_PIECECBERRYPIE="piecepieberry";
	public static final String NAME_PIECECKELPPIE="piecepiekelp";
	public static final String NAME_PIECECGOLDAPPLEPIE="piecepiegoldapple";
	public static final String NAME_PIECECGOLDAPPLEENCPIE="piecepiegoldappleenc";

	public static final String NAME_EGGSANDWICH="sandwichegg";//	卵サンド
	public static final String NAME_POTATSALADASANDWICH="sandwichpotato";//	ポテトサラダサンド
	public static final String NAME_HAMSANDWICH="sandwichhum";//	ハムサンド
	public static final String NAME_MUTTONSANDWICH="sandwichmutton";//	ジンギスカンサンド
	public static final String NAME_STAKESANDWICH="sandwichstake";//	ステーキサンド
	public static final String NAME_CHIKENSANDWICH="sandwichchikin";//	てりやきサンド
	public static final String NAME_CHOCOSANDWICH="sandwichchoco";//	チョコサンド
	public static final String NAME_POTATOSALADA = "potatosalada";//	ポテトサラダ
	public static final String NAME_PUMPKINSALDADA = "pumpukinsalada";//	パンプキンサラダ
	public static final String NAME_PUMPKINSALADASANDWICH ="sandwichpumpkin";//	パンプキンサラダサンド
	public static final String NAME_RABITSANDWICH = "sandwichrabit";
	public static final String NAME_WOLFSANDWICH = "sandwichwolf";
	public static final String NAME_CATSANDWICH = "sandwichcat";
	public static final String NAME_BEARSANDWICH = "sandwichbear";
	public static final String NAME_HORSESANDWICH = "sandwichhorse";
	public static final String NAME_LLAMASSANDWICH = "sandwichllamas";
	public static final String NAME_FOXSANDWICH = "sandwichfox";
	public static final String NAME_DOLPHINSANDWICH = "sandwichdolphin";
	public static final String NAME_FLESHSANDWICH = "sandwichflesh";
	public static final String NAME_ZOMBIESANDWICH = "sandwichzombie";
	public static final String NAME_TURTLESANDWICH = "sandwichturtle";
	public static final String NAME_CODSANDWICH = "sandwichcod";
	public static final String NAME_SALMONSANDWICH = "sandwichsalmon";
	public static final String NAME_CLOWNSANDWICH = "sandwichclown";
	public static final String NAME_PUFFERSANDWICH = "sandwichpuffer";
	public static final String NAME_BUTTER = "butter";//	バター
	public static final String NAME_MOLD = "modl";	// カビ
	public static final String NAME_BLUEMOLD = "bluemold";	// 青カビ
	public static final String NAME_SALT = "salt";	// 塩
	public static final String NAME_RENNET = "rennet";	// レンネット

	public static final String NAME_RAW_PIE_HALL = "raw_piehall";	// パイ
	public static final String NAME_RAW_CHOCOPIE_HALL = "raw_piehallchoco";	// チョコパイ
	public static final String NAME_RAW_SALADA_HALL = "raw_piehallsalada";	// 野菜パイ
	public static final String NAME_RAW_MEETPIE_HALL = "raw_piehallmeet";	// ミートパイ
	public static final String NAME_RAW_FISHPIE_HALL = "raw_piehallfish";	// 魚パイ
	public static final String NAME_RAW_PUMPKINPIE_HALL = "raw_piehallpumpkin";	// かぼちゃパイ
	public static final String NAME_RAW_APPLEPIE_HALL = "raw_piehallapple";	// リンゴパイ
	public static final String NAME_RAW_BLACK_PIE_HALL = "raw_piehallblack";	// 烏賊墨パイ
	public static final String NAME_RAW_ZOMBIPEI_HALL = "raw_piehallzombi";	// ゾンビパイ
	public static final String NAME_RAW_BERRY_PIE_HALL = "raw_piehallberry";
	public static final String NAME_RAW_KELP_PIE_HALL = "raw_piehallkelp";
	public static final String NAME_RAW_GOLDAPPLE_PIE_HALL = "raw_piehallgoldapple";
	public static final String NAME_RAW_GOLDAPPLEENC_PIE_HALL = "raw_piehallgldappleenc";
	public static final String NAME_RAW_PIZZA = "raw_pizza";
	public static final String NAME_RAW_MEETPIZZA ="raw_pizzameet";	// 肉ピザ
	public static final String NAME_RAW_FISHPIZZA = "raw_pizafish";	// アンチョビピザ

	// アイスクリーム液
	public static final String NAME_ICE_MIX_VANILA = "icemix_vanila";
	public static final String NAME_ICE_MIX_BLACK = "icemix_black";
	public static final String NAME_ICE_MIX_RED = "icemix_red";
	public static final String NAME_ICE_MIX_GREEN = "icemix_green";
	public static final String NAME_ICE_MIX_BROWN = "icemix_brown";
	public static final String NAME_ICE_MIX_BLUE = "icemix_blue";
	public static final String NAME_ICE_MIX_PURPLE = "icemix_purple";
	public static final String NAME_ICE_MIX_CYAN = "icemix_cyan";
	public static final String NAME_ICE_MIX_SILVER = "icemix_silver";
	public static final String NAME_ICE_MIX_GRAY = "icemix_gray";
	public static final String NAME_ICE_MIX_PINK = "icemix_pink";
	public static final String NAME_ICE_MIX_LIME = "icemix_lime";
	public static final String NAME_ICE_MIX_YELLOW = "icemix_yellow";
	public static final String NAME_ICE_MIX_LIGHT_BLUE = "icemix_light_blue";
	public static final String NAME_ICE_MIX_MAGENTA = "icemix_magenta";
	public static final String NAME_ICE_MIX_ORANGE = "icemix_orange";
	public static final String NAME_ICE_MIX_WHITE = "icemix_white";
	public static final String NAME_ICE_MIX_APPLE = "icemix_apple";
	public static final String NAME_ICE_MIX_CACTUS = "icemix_cactus";
	public static final String NAME_ICE_MIX_PUMPKIN = "icemix_pumpkin";
	public static final String NAME_ICE_MIX_POTATO = "icemix_potato";
	public static final String NAME_ICE_MIX_CARROT = "icemix_carrot";
	public static final String NAME_ICE_MIX_MELON = "icemix_melon";
	public static final String NAME_ICE_MIX_GREENTEA = "icemix_greentea";
	public static final String NAME_ICE_MIX_INK_SAK = "icemix_ink_sac";
	public static final String NAME_ICE_MIX_COCOA = "icemix_cocoa";
	public static final String NAME_ICE_MIX_BERRY = "icemix_berry";
	public static final String NAME_ICE_MIX_KELP = "icemix_kelp";
	public static final String NAME_ICE_MIX_GOLDAPPLE = "icemix_goldapple";
	public static final String NAME_ICE_MIX_GOLDAPPLEENC = "icemix_goldappleenc";

	//	アイスクリーム
	public static final String NAME_ICECREAM_VANILA ="icecream_vanila";
	public static final String NAME_ICECREAM_BLACK ="icecream_black";
	public static final String NAME_ICECREAM_RED ="icecream_red";
	public static final String NAME_ICECREAM_GREEN ="icecream_green";
	public static final String NAME_ICECREAM_BROWN ="icecream_brown";
	public static final String NAME_ICECREAM_BLUE ="icecream_blue";
	public static final String NAME_ICECREAM_PURPLE ="icecream_purple";
	public static final String NAME_ICECREAM_CYAN ="icecream_cyan";
	public static final String NAME_ICECREAM_SILVER ="icecream_silver";
	public static final String NAME_ICECREAM_GRAY ="icecream_gray";
	public static final String NAME_ICECREAM_PINK ="icecream_pink";
	public static final String NAME_ICECREAM_LIME ="icecream_lime";
	public static final String NAME_ICECREAM_YELLOW ="icecream_yellow";
	public static final String NAME_ICECREAM_LIGHT_BLUE ="icecream_light_blue";
	public static final String NAME_ICECREAM_MAGENTA ="icecream_magenta";
	public static final String NAME_ICECREAM_ORANGE ="icecream_orange";
	public static final String NAME_ICECREAM_WHITE ="icecream_white";
	public static final String NAME_ICECREAM_APPLE ="icecream_apple";
	public static final String NAME_ICECREAM_CACTUS ="icecream_cactus";
	public static final String NAME_ICECREAM_PUMPKIN ="icecream_pumpkin";
	public static final String NAME_ICECREAM_POTATO ="icecream_potato";
	public static final String NAME_ICECREAM_CARROT ="icecream_carrot";
	public static final String NAME_ICECREAM_MELON ="icecream_melon";
	public static final String NAME_ICECREAM_GREENTEA ="icecream_greentea";
	public static final String NAME_ICECREAM_INK_SAC ="icecream_ink_sac";
	public static final String NAME_ICECREAM_COCOA ="icecream_cocoa";
	public static final String NAME_ICECREAM_BERRY ="icecream_berry";
	public static final String NAME_ICECREAM_KELP ="icecream_kelp";
	public static final String NAME_ICECREAM_GOLDAPPLE ="icecream_goldapple";
	public static final String NAME_ICECREAM_GOLDAPPLEENC ="icecream_goldappleenc";

	// クッキー入りアイス
	public static final String NAME_ICECREAM_COOKIE_VANILA = "ck_icecream_vanila";
	public static final String NAME_ICECREAM_COOKIE_BLACK ="ck_icecream_black";
	public static final String NAME_ICECREAM_COOKIE_RED ="ck_icecream_red";
	public static final String NAME_ICECREAM_COOKIE_GREEN ="ck_icecream_green";
	public static final String NAME_ICECREAM_COOKIE_BROWN ="ck_icecream_brown";
	public static final String NAME_ICECREAM_COOKIE_BLUE ="ck_icecream_blue";
	public static final String NAME_ICECREAM_COOKIE_PURPLE ="ck_icecream_purple";
	public static final String NAME_ICECREAM_COOKIE_CYAN ="ck_icecream_cyan";
	public static final String NAME_ICECREAM_COOKIE_SILVER ="ck_icecream_silver";
	public static final String NAME_ICECREAM_COOKIE_GRAY ="ck_icecream_gray";
	public static final String NAME_ICECREAM_COOKIE_PINK ="ck_icecream_pink";
	public static final String NAME_ICECREAM_COOKIE_LIME ="ck_icecream_lime";
	public static final String NAME_ICECREAM_COOKIE_YELLOW ="ck_icecream_yellow";
	public static final String NAME_ICECREAM_COOKIE_LIGHT_BLUE ="ck_icecream_light_blue";
	public static final String NAME_ICECREAM_COOKIE_MAGENTA ="ck_icecream_magenta";
	public static final String NAME_ICECREAM_COOKIE_ORANGE ="ck_icecream_orange";
	public static final String NAME_ICECREAM_COOKIE_WHITE ="ck_icecream_white";
	public static final String NAME_ICECREAM_COOKIE_APPLE ="ck_icecream_apple";
	public static final String NAME_ICECREAM_COOKIE_CACTUS ="ck_icecream_cactus";
	public static final String NAME_ICECREAM_COOKIE_PUMPKIN ="ck_icecream_pumpkin";
	public static final String NAME_ICECREAM_COOKIE_POTATO ="ck_icecream_potato";
	public static final String NAME_ICECREAM_COOKIE_CARROT ="ck_icecream_carrot";
	public static final String NAME_ICECREAM_COOKIE_MELON ="ck_icecream_melon";
	public static final String NAME_ICECREAM_COOKIE_GREENTEA ="ck_icecream_greentea";
	public static final String NAME_ICECREAM_COOKIE_INK_SAC ="ck_icecream_ink_sac";
	public static final String NAME_ICECREAM_COOKIE_COCOA ="ck_icecream_cocoa";
	public static final String NAME_ICECREAM_COOKIE_BERRY ="ck_icecream_berry";
	public static final String NAME_ICECREAM_COOKIE_KELP ="ck_icecream_kelp";
	public static final String NAME_ICECREAM_COOKIE_GOLDAPPLE ="ck_icecream_goldapple";
	public static final String NAME_ICECREAM_COOKIE_GOLDAPPLEENC ="ck_icecream_goldappleenc";

	// シロップ
	public static final String NAME_SYRUP_SUGAR = "syrup_sugar";
	public static final String NAME_SYRUP_BLACK = "syrup_black";
	public static final String NAME_SYRUP_RED = "syrup_red";
	public static final String NAME_SYRUP_GREEN = "syrup_green";
	public static final String NAME_SYRUP_BROWN = "syrup_brown";
	public static final String NAME_SYRUP_BLUE = "syrup_blue";
	public static final String NAME_SYRUP_PURPLE = "syrup_purple";
	public static final String NAME_SYRUP_CYAN = "syrup_cyan";
	public static final String NAME_SYRUP_SILVER = "syrup_silver";
	public static final String NAME_SYRUP_GRAY = "syrup_gray";
	public static final String NAME_SYRUP_PINK = "syrup_pink";
	public static final String NAME_SYRUP_LIME = "syrup_lime";
	public static final String NAME_SYRUP_YELLOW = "syrup_yellow";
	public static final String NAME_SYRUP_LIGHT_BLUE = "syrup_light_blue";
	public static final String NAME_SYRUP_MAGENTA = "syrup_magenta";
	public static final String NAME_SYRUP_ORANGE = "syrup_orange";
	public static final String NAME_SYRUP_WHITE = "syrup_white";
	public static final String NAME_SYRUP_APPLE = "syrup_apple";
	public static final String NAME_SYRUP_CACTUS = "syrup_cactus";
	public static final String NAME_SYRUP_MELON = "syrup_melon";
	public static final String NAME_SYRUP_PUMPKIN = "syrup_pumpkin";
	public static final String NAME_SYRUP_GREENTEA = "syrup_greentea";
	public static final String NAME_SYRUP_INK_SAC = "syrup_ink_sac";
	public static final String NAME_SYRUP_COCOA = "syrup_cocoa";
	public static final String NAME_SYRUP_BERRY = "syrup_berry";
	public static final String NAME_SYRUP_KELP = "syrup_kelp";
	public static final String NAME_SYRUP_GOLDAPPLE = "syrup_goldapple";
	public static final String NAME_SYRUP_GOLDAPPLEENC = "syrup_goldappleenc";


	// 砂糖入り牛乳
	public static final String NAME_SUGARMILK = "sugarmillk";
	// 練乳
	public static final String NAME_SYRUP_MILK = "condencedmilk";
	// 練乳かき氷
	public static final String NAME_CRASHEDICE_NONE = "crashedice_none";
	public static final String NAME_CRASHEDICE_SUGAR = "crashedice_sugar";
	public static final String NAME_CRASHEDICE_BLACK = "crashedice_black";
	public static final String NAME_CRASHEDICE_RED = "crashedice_red";
	public static final String NAME_CRASHEDICE_GREEN = "crashedice_green";
	public static final String NAME_CRASHEDICE_BROWN = "crashedice_brown";
	public static final String NAME_CRASHEDICE_BLUE = "crashedice_blue";
	public static final String NAME_CRASHEDICE_PURPLE = "crashedice_purple";
	public static final String NAME_CRASHEDICE_CYAN = "crashedice_cyan";
	public static final String NAME_CRASHEDICE_SILVER = "crashedice_silver";
	public static final String NAME_CRASHEDICE_GRAY = "crashedice_gray";
	public static final String NAME_CRASHEDICE_PINK = "crashedice_pink";
	public static final String NAME_CRASHEDICE_LIME = "crashedice_lime";
	public static final String NAME_CRASHEDICE_YELLOW = "crashedice_yellow";
	public static final String NAME_CRASHEDICE_LIGHT_BLUE = "crashedice_light_blue";
	public static final String NAME_CRASHEDICE_MAGENTA = "crashedice_magenta";
	public static final String NAME_CRASHEDICE_ORANGE = "crashedice_orange";
	public static final String NAME_CRASHEDICE_WHITE = "crashedice_white";
	public static final String NAME_CRASHEDICE_APPLE = "crashedice_apple";
	public static final String NAME_CRASHEDICE_CACTUS = "crashedice_cactus";
	public static final String NAME_CRASHEDICE_MELON = "crashedice_melon";
	public static final String NAME_CRASHEDICE_PUMPKIN = "crashedice_pumpkin";
	public static final String NAME_CRASHEDICE_GREENTEA = "crashedice_greentea";
	public static final String NAME_CRASHEDICE_INK_SAC = "crashedice_ink_sac";
	public static final String NAME_CRASHEDICE_COCOA = "crashedice_cocoa";
	public static final String NAME_CRASHEDICE_BERRY = "crashedice_berry";
	public static final String NAME_CRASHEDICE_KELP = "crashedice_kelp";
	public static final String NAME_CRASHEDICE_GOLDAPPLE = "crashedice_goldapple";
	public static final String NAME_CRASHEDICE_GOLDAPPLEENC = "crashedice_goldappleenc";

	// 練乳かき氷
	public static final String NAME_CRASHEDICE_MILK_NONE = "mk_crashedice_none";
	public static final String NAME_CRASHEDICE_MILK_SUGAR = "mk_crashedice_sugar";
	public static final String NAME_CRASHEDICE_MILK_BLACK = "mk_crashedice_black";
	public static final String NAME_CRASHEDICE_MILK_RED = "mk_crashedice_red";
	public static final String NAME_CRASHEDICE_MILK_GREEN = "mk_crashedice_green";
	public static final String NAME_CRASHEDICE_MILK_BROWN = "mk_crashedice_brown";
	public static final String NAME_CRASHEDICE_MILK_BLUE = "mk_crashedice_blue";
	public static final String NAME_CRASHEDICE_MILK_PURPLE = "mk_crashedice_purple";
	public static final String NAME_CRASHEDICE_MILK_CYAN = "mk_crashedice_cyan";
	public static final String NAME_CRASHEDICE_MILK_SILVER = "mk_crashedice_silver";
	public static final String NAME_CRASHEDICE_MILK_GRAY = "mk_crashedice_gray";
	public static final String NAME_CRASHEDICE_MILK_PINK = "mk_crashedice_pink";
	public static final String NAME_CRASHEDICE_MILK_LIME = "mk_crashedice_lime";
	public static final String NAME_CRASHEDICE_MILK_YELLOW = "mk_crashedice_yellow";
	public static final String NAME_CRASHEDICE_MILK_LIGHT_BLUE = "mk_crashedice_light_blue";
	public static final String NAME_CRASHEDICE_MILK_MAGENTA = "mk_crashedice_magenta";
	public static final String NAME_CRASHEDICE_MILK_ORANGE = "mk_crashedice_orange";
	public static final String NAME_CRASHEDICE_MILK_WHITE = "mk_crashedice_white";
	public static final String NAME_CRASHEDICE_MILK_APPLE = "mk_crashedice_apple";
	public static final String NAME_CRASHEDICE_MILK_CACTUS = "mk_crashedice_cactus";
	public static final String NAME_CRASHEDICE_MILK_MELON = "mk_crashedice_melon";
	public static final String NAME_CRASHEDICE_MILK_PUMPKIN = "mk_crashedice_pumpkin";
	public static final String NAME_CRASHEDICE_MILK_GREENTEA = "mk_crashedice_greentea";
	public static final String NAME_CRASHEDICE_MILK_INK_SAC = "mk_crashedice_ink_sac";
	public static final String NAME_CRASHEDICE_MILK_COCOA = "mk_crashedice_cocoa";
	public static final String NAME_CRASHEDICE_MILK_BERRY = "mk_crashedice_berry";
	public static final String NAME_CRASHEDICE_MILK_KELP = "mk_crashedice_kelp";
	public static final String NAME_CRASHEDICE_MILK_GOLDAPPLE = "mk_crashedice_goldapple";
	public static final String NAME_CRASHEDICE_MILK_GOLDAPPLEENC = "mk_crashedice_goldappleenc";

	// キャンディ液
	public static final String NAME_SUGAR_WATER_NONE = "icesugarwater_none";
	public static final String NAME_SUGAR_WATER_SUGAR = "icesugarwater_sugar";
	public static final String NAME_SUGAR_WATER_BLACK = "icesugarwater_black";
	public static final String NAME_SUGAR_WATER_RED = "icesugarwater_red";
	public static final String NAME_SUGAR_WATER_GREEN = "icesugarwater_green";
	public static final String NAME_SUGAR_WATER_BROWN = "icesugarwater_brown";
	public static final String NAME_SUGAR_WATER_BLUE = "icesugarwater_blue";
	public static final String NAME_SUGAR_WATER_PURPLE = "icesugarwater_purple";
	public static final String NAME_SUGAR_WATER_CYAN = "icesugarwater_cyan";
	public static final String NAME_SUGAR_WATER_SILVER = "icesugarwater_silver";
	public static final String NAME_SUGAR_WATER_GRAY = "icesugarwater_gray";
	public static final String NAME_SUGAR_WATER_PINK = "icesugarwater_pink";
	public static final String NAME_SUGAR_WATER_LIME = "icesugarwater_lime";
	public static final String NAME_SUGAR_WATER_YELLOW = "icesugarwater_yellow";
	public static final String NAME_SUGAR_WATER_LIGHT_BLUE = "icesugarwater_light_blue";
	public static final String NAME_SUGAR_WATER_MAGENTA = "icesugarwater_magenta";
	public static final String NAME_SUGAR_WATER_ORANGE = "icesugarwater_orange";
	public static final String NAME_SUGAR_WATER_WHITE = "icesugarwater_white";
	public static final String NAME_SUGAR_WATER_APPLE = "icesugarwater_apple";
	public static final String NAME_SUGAR_WATER_CACTUS = "icesugarwater_cactus";
	public static final String NAME_SUGAR_WATER_MELON = "icesugarwater_melon";
	public static final String NAME_SUGAR_WATER_PUMPKIN = "icesugarwater_pumpkin";
	public static final String NAME_SUGAR_WATER_GREENTEA = "icesugarwater_greentea";
	public static final String NAME_SUGAR_WATER_INK_SAC = "icesugarwater_ink_sac";
	public static final String NAME_SUGAR_WATER_COCOA = "icesugarwater_cocoa";
	public static final String NAME_SUGAR_WATER_BERRY = "icesugarwater_berry";
	public static final String NAME_SUGAR_WATER_KELP = "icesugarwater_kelp";
	public static final String NAME_SUGAR_WATER_GOLDAPPLE = "icesugarwater_goldapple";
	public static final String NAME_SUGAR_WATER_GOLDAPPLEENC = "icesugarwater_goldappleenc";

	// アイスキャンディ
	public static final String NAME_ICECANDY_NONE = "icecandy_none";
	public static final String NAME_ICECANDY_SUGAR = "icecandy_sugar";
	public static final String NAME_ICECANDY_BLACK = "icecandy_black";
	public static final String NAME_ICECANDY_RED = "icecandy_red";
	public static final String NAME_ICECANDY_GREEN = "icecandy_green";
	public static final String NAME_ICECANDY_BROWN = "icecandy_brown";
	public static final String NAME_ICECANDY_BLUE = "icecandy_blue";
	public static final String NAME_ICECANDY_PURPLE = "icecandy_purple";
	public static final String NAME_ICECANDY_CYAN = "icecandy_cyan";
	public static final String NAME_ICECANDY_SILVER = "icecandy_silver";
	public static final String NAME_ICECANDY_GRAY = "icecandy_gray";
	public static final String NAME_ICECANDY_PINK = "icecandy_pink";
	public static final String NAME_ICECANDY_LIME = "icecandy_lime";
	public static final String NAME_ICECANDY_YELLOW = "icecandy_yellow";
	public static final String NAME_ICECANDY_LIGHT_BLUE = "icecandy_light_blue";
	public static final String NAME_ICECANDY_MAGENTA = "icecandy_magenta";
	public static final String NAME_ICECANDY_ORANGE = "icecandy_orange";
	public static final String NAME_ICECANDY_WHITE = "icecandy_white";
	public static final String NAME_ICECANDY_APPLE = "icecandy_apple";
	public static final String NAME_ICECANDY_CACTUS = "icecandy_cactus";
	public static final String NAME_ICECANDY_MELON = "icecandy_melon";
	public static final String NAME_ICECANDY_PUMPKIN = "icecandy_pumpkin";
	public static final String NAME_ICECANDY_GREENTEA = "icecandy_greentea";
	public static final String NAME_ICECANDY_INK_SAC = "icecandy_ink_sac";
	public static final String NAME_ICECANDY_COCOA = "icecandy_cocoa";
	public static final String NAME_ICECANDY_BERRY = "icecandy_berry";
	public static final String NAME_ICECANDY_KELP = "icecandy_kelp";
	public static final String NAME_ICECANDY_GOLDAPPLE = "icecandy_goldapple";
	public static final String NAME_ICECANDY_GOLDAPPLEENC = "icecandy_goldappleenc";

	public static final String NAME_FLOUR = "flour";// 小麦粉
	public static final String NAME_UDON = "udon";// うどん
	public static final String NAME_PASTA = "pasta";	// パスタ
	public static final String NAME_LAMEN = "ramen";// ラーメン
	public static final String NAME_MEET_PASTA = "pastameet";// ミートスパ
	public static final String NAME_FISH_PASTA = "pastafish";	// シーフードスパ
	public static final String NAME_BLACK_PASTA = "pastablack";// イカスミス
	public static final String NAME_ZARUUDON = "udonzaru";	// ざるうどん
	public static final String NAME_KAKEUDON = "udonkake";// かけうどん
	public static final String NAME_TUKIMIUDON ="udontukimi";// 月見うどん
	public static final String NAME_NIKUUDON = "udonniku";// 肉うどん
	public static final String NAME_MEETRAMEN = "ramenmeet";// チャーシューメン
	public static final String NAME_FISHRAMEN = "ramenfish";// シーフードラーメン
	public static final String NAME_EGGRAMEN = "ramenegg";// 月見ラーメン
	public static final String NAME_MEETMILL_BEEF = "meetmillbeef";// 牛ひき肉
	public static final String NAME_MEETMILL_POKE = "meetmillpoke";// 豚ひき肉
	public static final String NAME_MEETMILL_CHIKIN = "meetmillchikin";// 鶏ひき
	public static final String NAME_MEETMILL_MUTTON = "meetmillmutton";
	public static final String NAME_MEETMILL_RABIT ="meetmillrabit";
	public static final String NAME_MEETMILL_WOLF ="meetmillwolf";
	public static final String NAME_MEETMILL_CAT ="meetmillcat";
	public static final String NAME_MEETMILL_HORSE ="meetmillhorse";
	public static final String NAME_MEETMILL_LLAMAS ="meetmillllamas";
	public static final String NAME_MEETMILL_BEAR ="meetmillbear";
	public static final String NAME_MEETMILL_FOX ="meetmillfox";
	public static final String NAME_MEETMILL_DOLPHIN ="meetmilldolphin";
	public static final String NAME_MEETMILL_FLESH = "meetmillflesh";
	public static final String NAME_MEETMILL_TURTLE ="meetmillturtle";
	public static final String NAME_MEETMILL_COD ="meetmillcod";
	public static final String NAME_MEETMILL_SALMON ="meetmillsalmon";
	public static final String NAME_MEETMILL_CLOWN ="meetmillclown";
	public static final String NAME_MEETMILL_PUFFER ="meetmillpuffer";
	public static final String NAME_MEETMILL_SQUID ="meetmillsquid";

	// 花の粉末
	public static final String NAME_DUST_FLOWER_DANDELION="flowerdust_dandelion";
	public static final String NAME_DUST_FLOWER_POPY="flowerdust_popy";
	public static final String NAME_DUST_FLOWER_ORCHID="flowerdust_orchid";
	public static final String NAME_DUST_FLOWER_ALLIUM="flowerdust_allium";
	public static final String NAME_DUST_FLOWER_AZUREBLUET="flowerdust_azurebluet";
	public static final String NAME_DUST_FLOWER_TULIP="flowerdust_tulip";
	public static final String NAME_DUST_FLOWER_OXEYDAISY="flowerdust_oxeydaisy";
	public static final String NAME_DUST_FLOWER_SUNFLOWER="flowerdust_sunflower";
	public static final String NAME_DUST_FLOWER_LILAC="flowerdust_lilac";
	public static final String NAME_DUST_FLOWER_ROSE="flowerdust_rose";
	public static final String NAME_DUST_FLOWER_PEONY="flowerdust_peony";
	public static final String NAME_DUST_FLOWER_PANACEA="flowerdust_panacea";
	public static final String NAME_DUST_FLOWER_CORM = "flowerdust_corm";
	public static final String NAME_DUST_FLOWER_LILY = "flowerdust_lily";
	public static final String NAME_DUST_FLOWER_WITHERROSE="flowerdust_witherrose";
	public static final String NAME_DUST_FLOWER_CORAL = "flowerdust_coral";

	// 花のお茶
	public static final String NAME_TEA_FLOWER_DANDELION="flowertea_dandelion";
	public static final String NAME_TEA_FLOWER_POPY="flowertea_popy";
	public static final String NAME_TEA_FLOWER_ORCHID="flowertea_orchid";
	public static final String NAME_TEA_FLOWER_ALLIUM="flowertea_allium";
	public static final String NAME_TEA_FLOWER_AZUREBLUET="flowertea_azurebluet";
	public static final String NAME_TEA_FLOWER_TULIP="flowertea_tulip";
	public static final String NAME_TEA_FLOWER_OXEYDAISY="flowertea_oxeydaisy";
	public static final String NAME_TEA_FLOWER_SUNFLOWER="flowertea_sunflower";
	public static final String NAME_TEA_FLOWER_LILAC="flowertea_lilac";
	public static final String NAME_TEA_FLOWER_ROSE="flowertea_rose";
	public static final String NAME_TEA_FLOWER_PEONY="flowertea_peony";
	public static final String NAME_TEA_FLOWER_PANACEA="flowertea_panacea";
	public static final String NAME_TEA_FLOWER_CORM = "flowertea_corm";
	public static final String NAME_TEA_FLOWER_LILY = "flowertea_lily";
	public static final String NAME_TEA_FLOWER_WITHERROSE ="flowertea_witherrose";
	public static final String NAME_TEA_FLOWER_CORAL = "flowertea_coral";

	public static final String NAME_DUST_GREENDUST = "dust_green";
	public static final String NAME_DUST_KELPDUST = "dust_kelp";


	public static final String[] NAME_LIST = new String[]{
			NAME_MEET_WOLF,
			NAME_MEET_CAT,
			NAME_MEET_HORSE,
			NAME_MEET_BEAR,
			NAME_MEET_LLAMAS,
			NAME_MEET_FOX,
			NAME_MEET_DOLPHIN,
			NAME_RAW_TURTLE,
			NAME_RAW_SQUID,
			NAME_FLESH,
			NAME_COOKED_ROTTEN_FLESH,
			NAME_COOKED_CLOWN,
			NAME_COOKED_PUFFER,
			NAME_COOKED_WOLF,
			NAME_COOKED_CAT,
			NAME_COOKED_HORSE,
			NAME_COOKED_BEAR,
			NAME_COOKED_LLAMAS,
			NAME_COOKED_DOLPHIN,
			NAME_COOKED_TURTLE,
			NAME_COOKED_SQUID,
			NAME_COOKED_FLESH,
			NAME_COOKED_FOX,
			NAME_HUNGERDRAG,
			NAME_OBON,
			NAME_ICEFOOD_BOWL,
			NAME_CHOCO,
			NAME_WHITECHOCO,
			NAME_CARAMEL,
			NAME_PUDDING,
			NAME_PUMPKINPUDDING,
			NAME_PIECEPIE,
			NAME_PIECECHOCOPIE,
			NAME_PIECESALADAPIE,
			NAME_PIECEMEETPIE,
			NAME_PIECEFISHPIE,
			NAME_PIECEPUMPUKINPIE,
			NAME_PIECEZOMBIPIE,
			NAME_PIECEAPPLEPIE,
			NAME_PIECEblackPIE,
			NAME_PIECECARAMELPIE,
			NAME_PIECECBERRYPIE,
			NAME_PIECECKELPPIE,
			NAME_PIECECGOLDAPPLEPIE,
			NAME_PIECECGOLDAPPLEENCPIE,
			NAME_EGGSANDWICH,
			NAME_POTATSALADASANDWICH,
			NAME_HAMSANDWICH,
			NAME_MUTTONSANDWICH,
			NAME_STAKESANDWICH,
			NAME_CHIKENSANDWICH,
			NAME_CHOCOSANDWICH,
			NAME_PUMPKINSALADASANDWICH,
			NAME_RABITSANDWICH,
			NAME_WOLFSANDWICH,
			NAME_CATSANDWICH,
			NAME_BEARSANDWICH,
			NAME_HORSESANDWICH,
			NAME_LLAMASSANDWICH,
			NAME_FOXSANDWICH,
			NAME_DOLPHINSANDWICH,
			NAME_FLESHSANDWICH,
			NAME_ZOMBIESANDWICH,
			NAME_TURTLESANDWICH,
			NAME_CODSANDWICH,
			NAME_SALMONSANDWICH,
			NAME_CLOWNSANDWICH,
			NAME_PUFFERSANDWICH,
			NAME_POTATOSALADA,
			NAME_PUMPKINSALDADA,
			NAME_RENNET,
			NAME_BUTTER,
			NAME_MOLD,
			NAME_SALT,
			NAME_BLUEMOLD,
			NAME_RAW_PIE_HALL,
			NAME_RAW_CHOCOPIE_HALL,
			NAME_RAW_SALADA_HALL,
			NAME_RAW_MEETPIE_HALL,
			NAME_RAW_FISHPIE_HALL,
			NAME_RAW_PUMPKINPIE_HALL,
			NAME_RAW_ZOMBIPEI_HALL,
			NAME_RAW_APPLEPIE_HALL,
			NAME_RAW_BLACK_PIE_HALL,
			NAME_RAW_BERRY_PIE_HALL,
			NAME_RAW_KELP_PIE_HALL,
			NAME_RAW_GOLDAPPLE_PIE_HALL,
			NAME_RAW_GOLDAPPLEENC_PIE_HALL,
			NAME_RAW_PIZZA,
			NAME_RAW_MEETPIZZA,
			NAME_RAW_FISHPIZZA,
			NAME_SUGARMILK,
			NAME_SYRUP_MILK,
			NAME_ICE_MIX_VANILA,
			NAME_ICE_MIX_BLACK,
			NAME_ICE_MIX_RED,
			NAME_ICE_MIX_GREEN,
			NAME_ICE_MIX_BROWN,
			NAME_ICE_MIX_BLUE,
			NAME_ICE_MIX_PURPLE,
			NAME_ICE_MIX_CYAN,
			NAME_ICE_MIX_SILVER,
			NAME_ICE_MIX_GRAY,
			NAME_ICE_MIX_PINK,
			NAME_ICE_MIX_LIME,
			NAME_ICE_MIX_YELLOW,
			NAME_ICE_MIX_LIGHT_BLUE,
			NAME_ICE_MIX_MAGENTA,
			NAME_ICE_MIX_ORANGE,
			NAME_ICE_MIX_WHITE,
			NAME_ICE_MIX_APPLE,
			NAME_ICE_MIX_CACTUS,
			NAME_ICE_MIX_PUMPKIN,
			NAME_ICE_MIX_POTATO,
			NAME_ICE_MIX_CARROT,
			NAME_ICE_MIX_MELON,
			NAME_ICE_MIX_GREENTEA,
			NAME_ICE_MIX_INK_SAK,
			NAME_ICE_MIX_COCOA,
			NAME_ICE_MIX_BERRY,
			NAME_ICE_MIX_KELP,
			NAME_ICE_MIX_GOLDAPPLE,
			NAME_ICE_MIX_GOLDAPPLEENC,
			NAME_ICECREAM_VANILA,
			NAME_ICECREAM_BLACK,
			NAME_ICECREAM_RED,
			NAME_ICECREAM_GREEN,
			NAME_ICECREAM_BROWN,
			NAME_ICECREAM_BLUE,
			NAME_ICECREAM_PURPLE,
			NAME_ICECREAM_CYAN,
			NAME_ICECREAM_SILVER,
			NAME_ICECREAM_GRAY,
			NAME_ICECREAM_PINK,
			NAME_ICECREAM_LIME,
			NAME_ICECREAM_YELLOW,
			NAME_ICECREAM_LIGHT_BLUE,
			NAME_ICECREAM_MAGENTA,
			NAME_ICECREAM_ORANGE,
			NAME_ICECREAM_WHITE,
			NAME_ICECREAM_APPLE,
			NAME_ICECREAM_CACTUS,
			NAME_ICECREAM_PUMPKIN,
			NAME_ICECREAM_POTATO,
			NAME_ICECREAM_CARROT,
			NAME_ICECREAM_MELON,
			NAME_ICECREAM_GREENTEA,
			NAME_ICECREAM_INK_SAC,
			NAME_ICECREAM_COCOA,
			NAME_ICECREAM_BERRY,
			NAME_ICECREAM_KELP,
			NAME_ICECREAM_GOLDAPPLE,
			NAME_ICECREAM_GOLDAPPLEENC,
			NAME_ICECREAM_COOKIE_VANILA,
			NAME_ICECREAM_COOKIE_BLACK,
			NAME_ICECREAM_COOKIE_RED,
			NAME_ICECREAM_COOKIE_GREEN,
			NAME_ICECREAM_COOKIE_BROWN,
			NAME_ICECREAM_COOKIE_BLUE,
			NAME_ICECREAM_COOKIE_PURPLE,
			NAME_ICECREAM_COOKIE_CYAN,
			NAME_ICECREAM_COOKIE_SILVER,
			NAME_ICECREAM_COOKIE_GRAY,
			NAME_ICECREAM_COOKIE_PINK,
			NAME_ICECREAM_COOKIE_LIME,
			NAME_ICECREAM_COOKIE_YELLOW,
			NAME_ICECREAM_COOKIE_LIGHT_BLUE,
			NAME_ICECREAM_COOKIE_MAGENTA,
			NAME_ICECREAM_COOKIE_ORANGE,
			NAME_ICECREAM_COOKIE_WHITE,
			NAME_ICECREAM_COOKIE_APPLE,
			NAME_ICECREAM_COOKIE_CACTUS,
			NAME_ICECREAM_COOKIE_PUMPKIN,
			NAME_ICECREAM_COOKIE_POTATO,
			NAME_ICECREAM_COOKIE_CARROT,
			NAME_ICECREAM_COOKIE_MELON,
			NAME_ICECREAM_COOKIE_GREENTEA,
			NAME_ICECREAM_COOKIE_INK_SAC,
			NAME_ICECREAM_COOKIE_COCOA,
			NAME_ICECREAM_COOKIE_BERRY,
			NAME_ICECREAM_COOKIE_KELP,
			NAME_ICECREAM_COOKIE_GOLDAPPLE,
			NAME_ICECREAM_COOKIE_GOLDAPPLEENC,
			NAME_SYRUP_SUGAR,
			NAME_SYRUP_BLACK,
			NAME_SYRUP_RED,
			NAME_SYRUP_GREEN,
			NAME_SYRUP_BROWN,
			NAME_SYRUP_BLUE,
			NAME_SYRUP_PURPLE,
			NAME_SYRUP_CYAN,
			NAME_SYRUP_SILVER,
			NAME_SYRUP_GRAY,
			NAME_SYRUP_PINK,
			NAME_SYRUP_LIME,
			NAME_SYRUP_YELLOW,
			NAME_SYRUP_LIGHT_BLUE,
			NAME_SYRUP_MAGENTA,
			NAME_SYRUP_ORANGE,
			NAME_SYRUP_WHITE,
			NAME_SYRUP_APPLE,
			NAME_SYRUP_CACTUS,
			NAME_SYRUP_MELON,
			NAME_SYRUP_PUMPKIN,
			NAME_SYRUP_GREENTEA,
			NAME_SYRUP_INK_SAC,
			NAME_SYRUP_COCOA,
			NAME_SYRUP_BERRY,
			NAME_SYRUP_KELP,
			NAME_SYRUP_GOLDAPPLE,
			NAME_SYRUP_GOLDAPPLEENC,
			NAME_CRASHEDICE_NONE,
			NAME_CRASHEDICE_SUGAR,
			NAME_CRASHEDICE_BLACK,
			NAME_CRASHEDICE_RED,
			NAME_CRASHEDICE_GREEN,
			NAME_CRASHEDICE_BROWN,
			NAME_CRASHEDICE_BLUE,
			NAME_CRASHEDICE_PURPLE,
			NAME_CRASHEDICE_CYAN,
			NAME_CRASHEDICE_SILVER,
			NAME_CRASHEDICE_GRAY,
			NAME_CRASHEDICE_PINK,
			NAME_CRASHEDICE_LIME,
			NAME_CRASHEDICE_YELLOW,
			NAME_CRASHEDICE_LIGHT_BLUE,
			NAME_CRASHEDICE_MAGENTA,
			NAME_CRASHEDICE_ORANGE,
			NAME_CRASHEDICE_WHITE,
			NAME_CRASHEDICE_APPLE,
			NAME_CRASHEDICE_CACTUS,
			NAME_CRASHEDICE_MELON,
			NAME_CRASHEDICE_PUMPKIN,
			NAME_CRASHEDICE_GREENTEA,
			NAME_CRASHEDICE_INK_SAC,
			NAME_CRASHEDICE_COCOA,
			NAME_CRASHEDICE_BERRY,
			NAME_CRASHEDICE_KELP,
			NAME_CRASHEDICE_GOLDAPPLE,
			NAME_CRASHEDICE_GOLDAPPLEENC,
			NAME_CRASHEDICE_MILK_NONE,
			NAME_CRASHEDICE_MILK_SUGAR,
			NAME_CRASHEDICE_MILK_BLACK,
			NAME_CRASHEDICE_MILK_RED,
			NAME_CRASHEDICE_MILK_GREEN,
			NAME_CRASHEDICE_MILK_BROWN,
			NAME_CRASHEDICE_MILK_BLUE,
			NAME_CRASHEDICE_MILK_PURPLE,
			NAME_CRASHEDICE_MILK_CYAN,
			NAME_CRASHEDICE_MILK_SILVER,
			NAME_CRASHEDICE_MILK_GRAY,
			NAME_CRASHEDICE_MILK_PINK,
			NAME_CRASHEDICE_MILK_LIME,
			NAME_CRASHEDICE_MILK_YELLOW,
			NAME_CRASHEDICE_MILK_LIGHT_BLUE,
			NAME_CRASHEDICE_MILK_MAGENTA,
			NAME_CRASHEDICE_MILK_ORANGE,
			NAME_CRASHEDICE_MILK_WHITE,
			NAME_CRASHEDICE_MILK_APPLE,
			NAME_CRASHEDICE_MILK_CACTUS,
			NAME_CRASHEDICE_MILK_MELON,
			NAME_CRASHEDICE_MILK_PUMPKIN,
			NAME_CRASHEDICE_MILK_GREENTEA,
			NAME_CRASHEDICE_MILK_INK_SAC,
			NAME_CRASHEDICE_MILK_COCOA,
			NAME_CRASHEDICE_MILK_BERRY,
			NAME_CRASHEDICE_MILK_KELP,
			NAME_CRASHEDICE_MILK_GOLDAPPLE,
			NAME_CRASHEDICE_MILK_GOLDAPPLEENC,
			NAME_SUGAR_WATER_NONE,
			NAME_SUGAR_WATER_SUGAR,
			NAME_SUGAR_WATER_BLACK,
			NAME_SUGAR_WATER_RED,
			NAME_SUGAR_WATER_GREEN,
			NAME_SUGAR_WATER_BROWN,
			NAME_SUGAR_WATER_BLUE,
			NAME_SUGAR_WATER_PURPLE,
			NAME_SUGAR_WATER_CYAN,
			NAME_SUGAR_WATER_SILVER,
			NAME_SUGAR_WATER_GRAY,
			NAME_SUGAR_WATER_PINK,
			NAME_SUGAR_WATER_LIME,
			NAME_SUGAR_WATER_YELLOW,
			NAME_SUGAR_WATER_LIGHT_BLUE,
			NAME_SUGAR_WATER_MAGENTA,
			NAME_SUGAR_WATER_ORANGE,
			NAME_SUGAR_WATER_WHITE,
			NAME_SUGAR_WATER_APPLE,
			NAME_SUGAR_WATER_CACTUS,
			NAME_SUGAR_WATER_MELON,
			NAME_SUGAR_WATER_PUMPKIN,
			NAME_SUGAR_WATER_GREENTEA,
			NAME_SUGAR_WATER_INK_SAC,
			NAME_SUGAR_WATER_COCOA,
			NAME_SUGAR_WATER_BERRY,
			NAME_SUGAR_WATER_KELP,
			NAME_SUGAR_WATER_GOLDAPPLE,
			NAME_SUGAR_WATER_GOLDAPPLEENC,
			NAME_ICECANDY_NONE,
			NAME_ICECANDY_SUGAR,
			NAME_ICECANDY_BLACK,
			NAME_ICECANDY_RED,
			NAME_ICECANDY_GREEN,
			NAME_ICECANDY_BROWN,
			NAME_ICECANDY_BLUE,
			NAME_ICECANDY_PURPLE,
			NAME_ICECANDY_CYAN,
			NAME_ICECANDY_SILVER,
			NAME_ICECANDY_GRAY,
			NAME_ICECANDY_PINK,
			NAME_ICECANDY_LIME,
			NAME_ICECANDY_YELLOW,
			NAME_ICECANDY_LIGHT_BLUE,
			NAME_ICECANDY_MAGENTA,
			NAME_ICECANDY_ORANGE,
			NAME_ICECANDY_WHITE,
			NAME_ICECANDY_APPLE,
			NAME_ICECANDY_CACTUS,
			NAME_ICECANDY_MELON,
			NAME_ICECANDY_PUMPKIN,
			NAME_ICECANDY_GREENTEA,
			NAME_ICECANDY_INK_SAC,
			NAME_ICECANDY_COCOA,
			NAME_ICECANDY_BERRY,
			NAME_ICECANDY_KELP,
			NAME_ICECANDY_GOLDAPPLE,
			NAME_ICECANDY_GOLDAPPLEENC,
			NAME_FLOUR,
			NAME_UDON,
			NAME_PASTA,
			NAME_LAMEN,
			NAME_MEET_PASTA,
			NAME_FISH_PASTA,
			NAME_BLACK_PASTA,
			NAME_ZARUUDON,
			NAME_KAKEUDON,
			NAME_TUKIMIUDON,
			NAME_NIKUUDON,
			NAME_MEETRAMEN,
			NAME_FISHRAMEN,
			NAME_EGGRAMEN,
			NAME_MEETMILL_BEEF,
			NAME_MEETMILL_POKE,
			NAME_MEETMILL_CHIKIN,
			NAME_MEETMILL_MUTTON,
			NAME_MEETMILL_RABIT,
			NAME_MEETMILL_WOLF,
			NAME_MEETMILL_CAT,
			NAME_MEETMILL_HORSE,
			NAME_MEETMILL_LLAMAS,
			NAME_MEETMILL_BEAR,
			NAME_MEETMILL_FOX,
			NAME_MEETMILL_DOLPHIN,
			NAME_MEETMILL_FLESH,
			NAME_MEETMILL_TURTLE,
			NAME_MEETMILL_COD,
			NAME_MEETMILL_SALMON,
			NAME_MEETMILL_CLOWN,
			NAME_MEETMILL_PUFFER,
			NAME_MEETMILL_SQUID,
			NAME_DUST_FLOWER_DANDELION,
			NAME_DUST_FLOWER_POPY,
			NAME_DUST_FLOWER_ORCHID,
			NAME_DUST_FLOWER_ALLIUM,
			NAME_DUST_FLOWER_AZUREBLUET,
			NAME_DUST_FLOWER_TULIP,
			NAME_DUST_FLOWER_OXEYDAISY,
			NAME_DUST_FLOWER_SUNFLOWER,
			NAME_DUST_FLOWER_LILAC,
			NAME_DUST_FLOWER_ROSE,
			NAME_DUST_FLOWER_PEONY,
			NAME_DUST_FLOWER_PANACEA,
			NAME_DUST_FLOWER_CORM,
			NAME_DUST_FLOWER_LILY,
			NAME_DUST_FLOWER_WITHERROSE,
			NAME_DUST_FLOWER_CORAL,
			NAME_TEA_FLOWER_DANDELION,
			NAME_TEA_FLOWER_POPY,
			NAME_TEA_FLOWER_ORCHID,
			NAME_TEA_FLOWER_ALLIUM,
			NAME_TEA_FLOWER_AZUREBLUET,
			NAME_TEA_FLOWER_TULIP,
			NAME_TEA_FLOWER_OXEYDAISY,
			NAME_TEA_FLOWER_SUNFLOWER,
			NAME_TEA_FLOWER_LILAC,
			NAME_TEA_FLOWER_ROSE,
			NAME_TEA_FLOWER_PEONY,
			NAME_TEA_FLOWER_PANACEA,
			NAME_TEA_FLOWER_CORM,
			NAME_TEA_FLOWER_WITHERROSE,
			NAME_TEA_FLOWER_LILY,
			NAME_TEA_FLOWER_CORAL,
			NAME_DUST_GREENDUST,
			NAME_DUST_KELPDUST
	};

	public static Item meet_wolf = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_wolf)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_WOLF));
	public static Item meet_cat = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_cat)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_CAT));
	public static Item meet_horse = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_horse)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_HORSE));
	public static Item meet_bear = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_bear)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_BEAR));
	public static Item meet_llamas = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_llamas)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_LLAMAS));
	public static Item meet_fox = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_fox)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_FOX));
	public static Item meet_dolphin = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_dolphin)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_DOLPHIN));
	public static Item raw_turtle = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_turtle)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_TURTLE));
	public static Item raw_squid = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_squid)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_SQUID));
	public static Item raw_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_raw_flesh)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FLESH));
	public static Item cooked_rotten_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_rooten_flesh)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_ROTTEN_FLESH));
	public static Item cooked_clown = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_clown)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_CLOWN));
	public static Item cooked_puffer =  new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_puffer)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_PUFFER));
	public static Item cooked_wolf = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_wolf)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_WOLF));
	public static Item cooked_cat = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_cat)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_CAT));
	public static Item cooked_horse = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_horse)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_HORSE));
	public static Item cooked_bear = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_bear)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_BEAR));
	public static Item cooked_llamas = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_llamas)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_LLAMAS));
	public static Item cooked_dolphin = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_dolphin)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_DOLPHIN));
	public static Item cooked_turtle = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_turtle)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_TURTLE));
	public static Item cooked_squid = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_squid)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_SQUID));
	public static Item cooked_flesh = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_flesh)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_FLESH));
	public static Item cooked_fox = new Item((new Item.Properties()).group(ItemGroup.FOOD).food(ItemFoods.food_cooked_fox)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_COOKED_FOX));
	public static Item hungerdrag = new ItemHungerDrag((new Item.Properties()).group(ItemGroup.FOOD)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_HUNGERDRAG));

	public static Item item_icefoodbowl            = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICEFOOD_BOWL));
	public static Item item_obon                  = new ItemObon(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_OBON));
	public static Item item_choco                 = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_choco)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CHOCO));
	public static Item item_whitechoco            = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_whitechoco)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_WHITECHOCO));

	public static Item item_caramel               = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_caramel)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CARAMEL));
	public static Item item_pudding               = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_pudding)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PUDDING));
	public static Item item_pumpkinpudding        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_pumpkinpudding)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PUMPKINPUDDING));

	public static Item item_piecepie              = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_pie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEPIE));
	public static Item item_piecechocopie         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_chocopie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECHOCOPIE));
	public static Item item_piecesaladapie        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_saladapie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECESALADAPIE));
	public static Item item_piecemeetpie          = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_meetpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEMEETPIE));
	public static Item item_piecefishpie          = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_fishpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEFISHPIE));
	public static Item item_piecepumpukinpie      = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_pumpkinpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEPUMPUKINPIE));
	public static Item item_piecezombipie         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_zombipie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEZOMBIPIE));
	public static Item item_pieceapplepie         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_applepie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEAPPLEPIE));
	public static Item item_pieceblackpie         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_blackpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECEblackPIE));
	public static Item item_piececaramelpie       = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_caramelpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECARAMELPIE));
	public static Item item_pieceberrypie         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_berrypie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECBERRYPIE));
	public static Item item_piecekelppie          = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_kelppie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECKELPPIE));
	public static Item item_piecegoldapplepie     = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.good_goldapplepie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECGOLDAPPLEPIE));
	public static Item item_piecegoldappleencpie  = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_goldappleencpie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PIECECGOLDAPPLEENCPIE));

	public static Item item_eggsandwich           = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_eggsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_EGGSANDWICH));
	public static Item item_potatsaladasandwich   = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_potetosaladasandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_POTATSALADASANDWICH));
	public static Item item_hamsandwich           = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_hamsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_HAMSANDWICH));
	public static Item item_muttonsandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_muttonsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MUTTONSANDWICH));
	public static Item item_stakesandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_stakesandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_STAKESANDWICH));
	public static Item item_chikensandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_chikensandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CHIKENSANDWICH));
	public static Item item_chocosandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_chocosandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CHOCOSANDWICH));
	public static Item item_pumpkinsaladasandwich = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_pumpkinsaladasandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PUMPKINSALADASANDWICH));
	public static Item item_rabitsandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_rabitsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RABITSANDWICH));
	public static Item item_wolfsandwich          = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_wolfsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_WOLFSANDWICH));
	public static Item item_catsandwich           = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_catsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CATSANDWICH));
	public static Item item_bearsandwich          = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_bearandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_BEARSANDWICH));
	public static Item item_horsesandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_horsesandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_HORSESANDWICH));
	public static Item item_llamassandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_llamassandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_LLAMASSANDWICH));
	public static Item item_foxsandwich           = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_foxsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FOXSANDWICH));
	public static Item item_dolphinsandwich       = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_dolphinsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DOLPHINSANDWICH));
	public static Item item_fleshsandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_fleshsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FLESHSANDWICH));
	public static Item item_zombiesandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_zombiesandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ZOMBIESANDWICH));
	public static Item item_turtlesandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_turtlesandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TURTLESANDWICH));
	public static Item item_codsandwich           = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_codsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CODSANDWICH));
	public static Item item_salmonsandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_salmonsandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SALMONSANDWICH));
	public static Item item_clownsandwich         = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_clownhandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CLOWNSANDWICH));
	public static Item item_puffersandwich        = new ItemFoodPieCakes(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).food(ItemFoods.food_puffersandwich)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PUFFERSANDWICH));

	public static Item item_potatosalada          = new ItemSalada(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_potatosalada)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_POTATOSALADA));
	public static Item item_pumpkinsalada         = new ItemSalada(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_pumpkinsalada)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PUMPKINSALDADA));

	public static Item item_rennet                = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RENNET));
	public static Item item_butter                = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_BUTTER));
	public static Item item_mold                  = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MOLD));
	public static Item item_salt                  = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SALT));
	public static Item item_bluemold              = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_BLUEMOLD));
	public static Item item_raw_hallpie           = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_PIE_HALL));
	public static Item item_raw_chocohallpie      = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_CHOCOPIE_HALL));
	public static Item item_raw_saladahallpie     = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_SALADA_HALL));
	public static Item item_raw_meethallpie       = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_MEETPIE_HALL));
	public static Item item_raw_fishhallpie       = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_FISHPIE_HALL));
	public static Item item_raw_pumpkinhallpie    = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_PUMPKINPIE_HALL));
	public static Item item_raw_zombihallpie      = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_ZOMBIPEI_HALL));
	public static Item item_raw_applehallpie      = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_APPLEPIE_HALL));
	public static Item item_raw_blackhallpie      = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_BLACK_PIE_HALL));
	public static Item item_raw_berryhallpie      = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_BERRY_PIE_HALL));
	public static Item item_raw_kelphallpie       = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_KELP_PIE_HALL));
	public static Item item_raw_goldapplehallpie  = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_GOLDAPPLE_PIE_HALL));
	public static Item item_raw_goldappleenchallpie= new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_GOLDAPPLEENC_PIE_HALL));
	public static Item item_raw_pizza             = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_PIZZA));
	public static Item item_raw_meetpizza         = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_MEETPIZZA));
	public static Item item_raw_fishpizza         = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_RAW_FISHPIZZA));

	public static Item item_sugarmilk             = new MilkBucketItem(new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGARMILK));
	public static Item item_syrupmilk             = new Item(new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_MILK));
	public static Item item_ice_mix_vanila        = new ItemIceCreamMix(EnumIceFlavor.ICE_VANILA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_VANILA));
	public static Item item_ice_mix_black         = new ItemIceCreamMix(EnumIceFlavor.ICE_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_BLACK));
	public static Item item_ice_mix_red           = new ItemIceCreamMix(EnumIceFlavor.ICE_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_RED));
	public static Item item_ice_mix_green         = new ItemIceCreamMix(EnumIceFlavor.ICE_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_GREEN));
	public static Item item_ice_mix_brown         = new ItemIceCreamMix(EnumIceFlavor.ICE_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_BROWN));
	public static Item item_ice_mix_blue          = new ItemIceCreamMix(EnumIceFlavor.ICE_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_BLUE));
	public static Item item_ice_mix_purple        = new ItemIceCreamMix(EnumIceFlavor.ICE_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_PURPLE));
	public static Item item_ice_mix_cyan          = new ItemIceCreamMix(EnumIceFlavor.ICE_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_CYAN));
	public static Item item_ice_mix_silver        = new ItemIceCreamMix(EnumIceFlavor.ICE_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_SILVER));
	public static Item item_ice_mix_gray          = new ItemIceCreamMix(EnumIceFlavor.ICE_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_GRAY));
	public static Item item_ice_mix_pink          = new ItemIceCreamMix(EnumIceFlavor.ICE_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_PINK));
	public static Item item_ice_mix_lime          = new ItemIceCreamMix(EnumIceFlavor.ICE_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_LIME));
	public static Item item_ice_mix_yellow        = new ItemIceCreamMix(EnumIceFlavor.ICE_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_YELLOW));
	public static Item item_ice_mix_light_blue    = new ItemIceCreamMix(EnumIceFlavor.ICE_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_LIGHT_BLUE));
	public static Item item_ice_mix_magenta       = new ItemIceCreamMix(EnumIceFlavor.ICE_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_MAGENTA));
	public static Item item_ice_mix_orange        = new ItemIceCreamMix(EnumIceFlavor.ICE_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_ORANGE));
	public static Item item_ice_mix_white         = new ItemIceCreamMix(EnumIceFlavor.ICE_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_WHITE));
	public static Item item_ice_mix_apple         = new ItemIceCreamMix(EnumIceFlavor.ICE_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_APPLE));
	public static Item item_ice_mix_cactus        = new ItemIceCreamMix(EnumIceFlavor.ICE_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_CACTUS));
	public static Item item_ice_mix_pumpkin       = new ItemIceCreamMix(EnumIceFlavor.ICE_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_PUMPKIN));
	public static Item item_ice_mix_potato        = new ItemIceCreamMix(EnumIceFlavor.ICE_POTATO, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_POTATO));
	public static Item item_ice_mix_carrot        = new ItemIceCreamMix(EnumIceFlavor.ICE_CARROT, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_CARROT));
	public static Item item_ice_mix_melon         = new ItemIceCreamMix(EnumIceFlavor.ICE_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_MELON));
	public static Item item_ice_mix_greentea      = new ItemIceCreamMix(EnumIceFlavor.ICE_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_GREENTEA));
	public static Item item_ice_mix_ink_sac       = new ItemIceCreamMix(EnumIceFlavor.ICE_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_INK_SAK));
	public static Item item_ice_mix_cocoa         = new ItemIceCreamMix(EnumIceFlavor.ICE_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_COCOA));
	public static Item item_ice_mix_berry         = new ItemIceCreamMix(EnumIceFlavor.ICE_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_BERRY));
	public static Item item_ice_mix_kelp          = new ItemIceCreamMix(EnumIceFlavor.ICE_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_KELP));
	public static Item item_ice_mix_goldapple     = new ItemIceCreamMix(EnumIceFlavor.ICE_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_GOLDAPPLE));
	public static Item item_ice_mix_goldappleenc  = new ItemIceCreamMix(EnumIceFlavor.ICE_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICE_MIX_GOLDAPPLEENC));

	public static Item item_icecream_vanila       = new ItemIceCream(EnumIceFlavor.ICE_VANILA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_VANILA));
	public static Item item_icecream_black        = new ItemIceCream(EnumIceFlavor.ICE_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_BLACK));
	public static Item item_icecream_red          = new ItemIceCream(EnumIceFlavor.ICE_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_RED));
	public static Item item_icecream_green        = new ItemIceCream(EnumIceFlavor.ICE_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_GREEN));
	public static Item item_icecream_brown        = new ItemIceCream(EnumIceFlavor.ICE_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_BROWN));
	public static Item item_icecream_blue         = new ItemIceCream(EnumIceFlavor.ICE_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_BLUE));
	public static Item item_icecream_purple       = new ItemIceCream(EnumIceFlavor.ICE_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_PURPLE));
	public static Item item_icecream_cyan         = new ItemIceCream(EnumIceFlavor.ICE_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_CYAN));
	public static Item item_icecream_silver       = new ItemIceCream(EnumIceFlavor.ICE_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_SILVER));
	public static Item item_icecream_gray         = new ItemIceCream(EnumIceFlavor.ICE_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_GRAY));
	public static Item item_icecream_pink         = new ItemIceCream(EnumIceFlavor.ICE_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_PINK));
	public static Item item_icecream_lime         = new ItemIceCream(EnumIceFlavor.ICE_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_LIME));
	public static Item item_icecream_yellow       = new ItemIceCream(EnumIceFlavor.ICE_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_YELLOW));
	public static Item item_icecream_light_blue   = new ItemIceCream(EnumIceFlavor.ICE_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_LIGHT_BLUE));
	public static Item item_icecream_magenta      = new ItemIceCream(EnumIceFlavor.ICE_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_MAGENTA));
	public static Item item_icecream_orange       = new ItemIceCream(EnumIceFlavor.ICE_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_ORANGE));
	public static Item item_icecream_white        = new ItemIceCream(EnumIceFlavor.ICE_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_WHITE));
	public static Item item_icecream_apple        = new ItemIceCream(EnumIceFlavor.ICE_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_APPLE));
	public static Item item_icecream_cactus       = new ItemIceCream(EnumIceFlavor.ICE_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_CACTUS));
	public static Item item_icecream_pumpkin      = new ItemIceCream(EnumIceFlavor.ICE_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_PUMPKIN));
	public static Item item_icecream_potato       = new ItemIceCream(EnumIceFlavor.ICE_POTATO, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_POTATO));
	public static Item item_icecream_carrot       = new ItemIceCream(EnumIceFlavor.ICE_CARROT, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_CARROT));
	public static Item item_icecream_melon        = new ItemIceCream(EnumIceFlavor.ICE_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_MELON));
	public static Item item_icecream_greentea     = new ItemIceCream(EnumIceFlavor.ICE_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_GREENTEA));
	public static Item item_icecream_ink_sac      = new ItemIceCream(EnumIceFlavor.ICE_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_INK_SAC));
	public static Item item_icecream_cocoa        = new ItemIceCream(EnumIceFlavor.ICE_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COCOA));
	public static Item item_icecream_berry        = new ItemIceCream(EnumIceFlavor.ICE_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_BERRY));
	public static Item item_icecream_kelp         = new ItemIceCream(EnumIceFlavor.ICE_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_KELP));
	public static Item item_icecream_goldapple    = new ItemIceCream(EnumIceFlavor.ICE_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_GOLDAPPLE));
	public static Item item_icecream_goldappleenc = new ItemIceCream(EnumIceFlavor.ICE_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_GOLDAPPLEENC));

	public static Item item_icecream_cookie_vanila     = new ItemIceCream(EnumIceFlavor.ICE_VANILA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_VANILA));
	public static Item item_icecream_cookie_black      = new ItemIceCream(EnumIceFlavor.ICE_BLACK, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_BLACK));
	public static Item item_icecream_cookie_red        = new ItemIceCream(EnumIceFlavor.ICE_RED, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_RED));
	public static Item item_icecream_cookie_green      = new ItemIceCream(EnumIceFlavor.ICE_GREEN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_GREEN));
	public static Item item_icecream_cookie_brown      = new ItemIceCream(EnumIceFlavor.ICE_BROWN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_BROWN));
	public static Item item_icecream_cookie_blue       = new ItemIceCream(EnumIceFlavor.ICE_BLUE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_BLUE));
	public static Item item_icecream_cookie_purple     = new ItemIceCream(EnumIceFlavor.ICE_PURPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_PURPLE));
	public static Item item_icecream_cookie_cyan       = new ItemIceCream(EnumIceFlavor.ICE_CYAN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_CYAN));
	public static Item item_icecream_cookie_silver     = new ItemIceCream(EnumIceFlavor.ICE_SILVER, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_SILVER));
	public static Item item_icecream_cookie_gray       = new ItemIceCream(EnumIceFlavor.ICE_GRAY, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_GRAY));
	public static Item item_icecream_cookie_pink       = new ItemIceCream(EnumIceFlavor.ICE_PINK, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_PINK));
	public static Item item_icecream_cookie_lime       = new ItemIceCream(EnumIceFlavor.ICE_LIME, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_LIME));
	public static Item item_icecream_cookie_yellow     = new ItemIceCream(EnumIceFlavor.ICE_YELLOW, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_YELLOW));
	public static Item item_icecream_cookie_light_blue = new ItemIceCream(EnumIceFlavor.ICE_LIGHT_BLUE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_LIGHT_BLUE));
	public static Item item_icecream_cookie_magenta    = new ItemIceCream(EnumIceFlavor.ICE_MAGENTA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_MAGENTA));
	public static Item item_icecream_cookie_orange     = new ItemIceCream(EnumIceFlavor.ICE_ORANGE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_ORANGE));
	public static Item item_icecream_cookie_white      = new ItemIceCream(EnumIceFlavor.ICE_WHITE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_WHITE));
	public static Item item_icecream_cookie_apple      = new ItemIceCream(EnumIceFlavor.ICE_APPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_APPLE));
	public static Item item_icecream_cookie_cactus     = new ItemIceCream(EnumIceFlavor.ICE_CACTUS, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_CACTUS));
	public static Item item_icecream_cookie_pumpkin    = new ItemIceCream(EnumIceFlavor.ICE_PUMPKIN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_PUMPKIN));
	public static Item item_icecream_cookie_potato     = new ItemIceCream(EnumIceFlavor.ICE_POTATO, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_POTATO));
	public static Item item_icecream_cookie_carrot     = new ItemIceCream(EnumIceFlavor.ICE_CARROT, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_CARROT));
	public static Item item_icecream_cookie_melon      = new ItemIceCream(EnumIceFlavor.ICE_MELON, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_MELON));
	public static Item item_icecream_cookie_greentea   = new ItemIceCream(EnumIceFlavor.ICE_GREENTEA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_GREENTEA));
	public static Item item_icecream_cookie_ink_sac      = new ItemIceCream(EnumIceFlavor.ICE_INK_SAC, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_INK_SAC));
	public static Item item_icecream_cookie_cocoa        = new ItemIceCream(EnumIceFlavor.ICE_COCOA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_COCOA));
	public static Item item_icecream_cookie_berry        = new ItemIceCream(EnumIceFlavor.ICE_BERRY, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_BERRY));
	public static Item item_icecream_cookie_kelp         = new ItemIceCream(EnumIceFlavor.ICE_KELP, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_KELP));
	public static Item item_icecream_cookie_goldapple    = new ItemIceCream(EnumIceFlavor.ICE_GOLDAPPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_GOLDAPPLE));
	public static Item item_icecream_cookie_goldappleenc = new ItemIceCream(EnumIceFlavor.ICE_GOLDAPPLEENC, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecream_cookie)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECREAM_COOKIE_GOLDAPPLEENC));

	public static Item item_syrup_sugar                = new ItemSyrup(EnumFlapeSyrup.SYRUP_SUGAR, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_SUGAR));
	public static Item item_syrup_black                = new ItemSyrup(EnumFlapeSyrup.SYRUP_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_BLACK));
	public static Item item_syrup_red                  = new ItemSyrup(EnumFlapeSyrup.SYRUP_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_RED));
	public static Item item_syrup_green                = new ItemSyrup(EnumFlapeSyrup.SYRUP_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_GREEN));
	public static Item item_syrup_brown                = new ItemSyrup(EnumFlapeSyrup.SYRUP_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_BROWN));
	public static Item item_syrup_blue                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_BLUE));
	public static Item item_syrup_purple               = new ItemSyrup(EnumFlapeSyrup.SYRUP_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_PURPLE));
	public static Item item_syrup_cyan                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_CYAN));
	public static Item item_syrup_silver               = new ItemSyrup(EnumFlapeSyrup.SYRUP_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_SILVER));
	public static Item item_syrup_gray                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_GRAY));
	public static Item item_syrup_pink                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_PINK));
	public static Item item_syrup_lime                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_LIME));
	public static Item item_syrup_yellow               = new ItemSyrup(EnumFlapeSyrup.SYRUP_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_YELLOW));
	public static Item item_syrup_light_blue           = new ItemSyrup(EnumFlapeSyrup.SYRUP_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_LIGHT_BLUE));
	public static Item item_syrup_magenta              = new ItemSyrup(EnumFlapeSyrup.SYRUP_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_MAGENTA));
	public static Item item_syrup_orange               = new ItemSyrup(EnumFlapeSyrup.SYRUP_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_ORANGE));
	public static Item item_syrup_white                = new ItemSyrup(EnumFlapeSyrup.SYRUP_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_WHITE));
	public static Item item_syrup_apple                = new ItemSyrup(EnumFlapeSyrup.SYRUP_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_APPLE));
	public static Item item_syrup_cactus               = new ItemSyrup(EnumFlapeSyrup.SYRUP_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_CACTUS));
	public static Item item_syrup_melon                = new ItemSyrup(EnumFlapeSyrup.SYRUP_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_MELON));
	public static Item item_syrup_pumpkin              = new ItemSyrup(EnumFlapeSyrup.SYRUP_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_PUMPKIN));
	public static Item item_syrup_greentea             = new ItemSyrup(EnumFlapeSyrup.SYRUP_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_GREENTEA));
	public static Item item_syrup_ink_sac              = new ItemSyrup(EnumFlapeSyrup.SYRUP_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_INK_SAC));
	public static Item item_syrup_cocoa                = new ItemSyrup(EnumFlapeSyrup.SYRUP_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_COCOA));
	public static Item item_syrup_berry                = new ItemSyrup(EnumFlapeSyrup.SYRUP_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_BERRY));
	public static Item item_syrup_kelp                 = new ItemSyrup(EnumFlapeSyrup.SYRUP_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_KELP));
	public static Item item_syrup_goldapple            = new ItemSyrup(EnumFlapeSyrup.SYRUP_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_GOLDAPPLE));
	public static Item item_syrup_goldappleenc         = new ItemSyrup(EnumFlapeSyrup.SYRUP_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SYRUP_GOLDAPPLEENC));

	public static Item item_crashedice_none                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_NONE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_NONE));
	public static Item item_crashedice_sugar               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_SUGAR, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_SUGAR));
	public static Item item_crashedice_black               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_BLACK));
	public static Item item_crashedice_red                 = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_RED));
	public static Item item_crashedice_green               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_GREEN));
	public static Item item_crashedice_brown               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_BROWN));
	public static Item item_crashedice_blue                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_BLUE));
	public static Item item_crashedice_purple              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_PURPLE));
	public static Item item_crashedice_cyan                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_CYAN));
	public static Item item_crashedice_silver              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_SILVER));
	public static Item item_crashedice_gray                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_GRAY));
	public static Item item_crashedice_pink                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_PINK));
	public static Item item_crashedice_lime                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_LIME));
	public static Item item_crashedice_yellow              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_YELLOW));
	public static Item item_crashedice_light_blue          = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_LIGHT_BLUE));
	public static Item item_crashedice_magenta             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MAGENTA));
	public static Item item_crashedice_orange              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_ORANGE));
	public static Item item_crashedice_white               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_WHITE));
	public static Item item_crashedice_apple               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_APPLE));
	public static Item item_crashedice_cactus              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_CACTUS));
	public static Item item_crashedice_melon               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MELON));
	public static Item item_crashedice_pumpkin             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_PUMPKIN));
	public static Item item_crashedice_greentea            = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_GREENTEA));
	public static Item item_crashedice_ink_sac             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_INK_SAC));
	public static Item item_crashedice_cocoa               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_COCOA));
	public static Item item_crashedice_berry               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_BERRY));
	public static Item item_crashedice_kelp                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_KELP));
	public static Item item_crashedice_goldenapple         = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_GOLDAPPLE));
	public static Item item_crashedice_goldappleenc        = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_GOLDAPPLEENC));


	public static Item item_crashedice_milk_none                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_NONE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_NONE));
	public static Item item_crashedice_milk_sugar               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_SUGAR, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_SUGAR));
	public static Item item_crashedice_milk_black               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BLACK, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_BLACK));
	public static Item item_crashedice_milk_red                 = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_RED, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_RED));
	public static Item item_crashedice_milk_green               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GREEN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_GREEN));
	public static Item item_crashedice_milk_brown               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BROWN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_BROWN));
	public static Item item_crashedice_milk_blue                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BLUE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_BLUE));
	public static Item item_crashedice_milk_purple              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PURPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_PURPLE));
	public static Item item_crashedice_milk_cyan                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_CYAN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_CYAN));
	public static Item item_crashedice_milk_silver              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_SILVER, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_SILVER));
	public static Item item_crashedice_milk_gray                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GRAY, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_GRAY));
	public static Item item_crashedice_milk_pink                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PINK, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_PINK));
	public static Item item_crashedice_milk_lime                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_LIME, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_LIME));
	public static Item item_crashedice_milk_yellow              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_YELLOW, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_YELLOW));
	public static Item item_crashedice_milk_light_blue          = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_LIGHT_BLUE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_LIGHT_BLUE));
	public static Item item_crashedice_milk_magenta             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_MAGENTA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_MAGENTA));
	public static Item item_crashedice_milk_orange              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_ORANGE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_ORANGE));
	public static Item item_crashedice_milk_white               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_WHITE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_WHITE));
	public static Item item_crashedice_milk_apple               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_APPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_APPLE));
	public static Item item_crashedice_milk_cactus              = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_CACTUS, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_CACTUS));
	public static Item item_crashedice_milk_melon               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_MELON, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_MELON));
	public static Item item_crashedice_milk_pumpkin             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_PUMPKIN, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_PUMPKIN));
	public static Item item_crashedice_milk_greentea            = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GREENTEA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_GREENTEA));
	public static Item item_crashedice_milk_ink_sac             = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_INK_SAC, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_INK_SAC));
	public static Item item_crashedice_milk_cocoa               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_COCOA, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_COCOA));
	public static Item item_crashedice_milk_berry               = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_BERRY, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_BERRY));
	public static Item item_crashedice_milk_kelp                = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_KELP, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_KELP));
	public static Item item_crashedice_milk_goldapple           = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GOLDAPPLE, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_GOLDAPPLE));
	public static Item item_crashedice_milk_goldappleenc        = new ItemCrashedIce(EnumFlapeSyrup.SYRUP_GOLDAPPLEENC, true, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_crashedice_milk)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_CRASHEDICE_MILK_GOLDAPPLEENC));

	public static Item item_sugar_water_none                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_NONE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_NONE));
	public static Item item_sugar_water_sugar               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_SUGAR, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_SUGAR));
	public static Item item_sugar_water_black               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_BLACK));
	public static Item item_sugar_water_red                 = new ItemSugarWater(EnumFlapeSyrup.SYRUP_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_RED));
	public static Item item_sugar_water_green               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_GREEN));
	public static Item item_sugar_water_brown               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_BROWN));
	public static Item item_sugar_water_blue                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_BLUE));
	public static Item item_sugar_water_purple              = new ItemSugarWater(EnumFlapeSyrup.SYRUP_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_PURPLE));
	public static Item item_sugar_water_cyan                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_CYAN));
	public static Item item_sugar_water_silver              = new ItemSugarWater(EnumFlapeSyrup.SYRUP_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_SILVER));
	public static Item item_sugar_water_gray                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_GRAY));
	public static Item item_sugar_water_pink                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_PINK));
	public static Item item_sugar_water_lime                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_LIME));
	public static Item item_sugar_water_yellow              = new ItemSugarWater(EnumFlapeSyrup.SYRUP_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_YELLOW));
	public static Item item_sugar_water_light_blue          = new ItemSugarWater(EnumFlapeSyrup.SYRUP_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_LIGHT_BLUE));
	public static Item item_sugar_water_magenta             = new ItemSugarWater(EnumFlapeSyrup.SYRUP_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_MAGENTA));
	public static Item item_sugar_water_orange              = new ItemSugarWater(EnumFlapeSyrup.SYRUP_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_ORANGE));
	public static Item item_sugar_water_white               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_WHITE));
	public static Item item_sugar_water_apple               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_APPLE));
	public static Item item_sugar_water_cactus              = new ItemSugarWater(EnumFlapeSyrup.SYRUP_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_CACTUS));
	public static Item item_sugar_water_melon               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_MELON));
	public static Item item_sugar_water_pumpkin             = new ItemSugarWater(EnumFlapeSyrup.SYRUP_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_PUMPKIN));
	public static Item item_sugar_water_greentea            = new ItemSugarWater(EnumFlapeSyrup.SYRUP_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_GREENTEA));
	public static Item item_sugar_water_ink_sac             = new ItemSugarWater(EnumFlapeSyrup.SYRUP_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_INK_SAC));
	public static Item item_sugar_water_cocoa               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_COCOA));
	public static Item item_sugar_water_berry               = new ItemSugarWater(EnumFlapeSyrup.SYRUP_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_BERRY));
	public static Item item_sugar_water_kelp                = new ItemSugarWater(EnumFlapeSyrup.SYRUP_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_KELP));
	public static Item item_sugar_water_goldapple           = new ItemSugarWater(EnumFlapeSyrup.SYRUP_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_GOLDAPPLE));
	public static Item item_sugar_water_goldappleenc        = new ItemSugarWater(EnumFlapeSyrup.SYRUP_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_SUGAR_WATER_GOLDAPPLEENC));

	public static Item item_icecandy_none                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_NONE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_NONE));
	public static Item item_icecandy_sugar               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_SUGAR, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_SUGAR));
	public static Item item_icecandy_black               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_BLACK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_BLACK));
	public static Item item_icecandy_red                 = new ItemIceCandy(EnumFlapeSyrup.SYRUP_RED, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_RED));
	public static Item item_icecandy_green               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_GREEN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_GREEN));
	public static Item item_icecandy_brown               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_BROWN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_BROWN));
	public static Item item_icecandy_blue                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_BLUE));
	public static Item item_icecandy_purple              = new ItemIceCandy(EnumFlapeSyrup.SYRUP_PURPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_PURPLE));
	public static Item item_icecandy_cyan                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_CYAN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_CYAN));
	public static Item item_icecandy_silver              = new ItemIceCandy(EnumFlapeSyrup.SYRUP_SILVER, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_SILVER));
	public static Item item_icecandy_gray                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_GRAY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_GRAY));
	public static Item item_icecandy_pink                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_PINK, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_PINK));
	public static Item item_icecandy_lime                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_LIME, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_LIME));
	public static Item item_icecandy_yellow              = new ItemIceCandy(EnumFlapeSyrup.SYRUP_YELLOW, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_YELLOW));
	public static Item item_icecandy_light_blue          = new ItemIceCandy(EnumFlapeSyrup.SYRUP_LIGHT_BLUE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_LIGHT_BLUE));
	public static Item item_icecandy_magenta             = new ItemIceCandy(EnumFlapeSyrup.SYRUP_MAGENTA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_MAGENTA));
	public static Item item_icecandy_orange              = new ItemIceCandy(EnumFlapeSyrup.SYRUP_ORANGE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_ORANGE));
	public static Item item_icecandy_white               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_WHITE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_WHITE));
	public static Item item_icecandy_apple               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_APPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_APPLE));
	public static Item item_icecandy_cactus              = new ItemIceCandy(EnumFlapeSyrup.SYRUP_CACTUS, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_CACTUS));
	public static Item item_icecandy_melon               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_MELON, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_MELON));
	public static Item item_icecandy_pumpkin             = new ItemIceCandy(EnumFlapeSyrup.SYRUP_PUMPKIN, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_PUMPKIN));
	public static Item item_icecandy_greentea            = new ItemIceCandy(EnumFlapeSyrup.SYRUP_GREENTEA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_GREENTEA));
	public static Item item_icecandy_ink_sac             = new ItemIceCandy(EnumFlapeSyrup.SYRUP_INK_SAC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_INK_SAC));
	public static Item item_icecandy_cocoa               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_COCOA, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_COCOA));
	public static Item item_icecandy_berry               = new ItemIceCandy(EnumFlapeSyrup.SYRUP_BERRY, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_BERRY));
	public static Item item_icecandy_kelp                = new ItemIceCandy(EnumFlapeSyrup.SYRUP_KELP, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_KELP));
	public static Item item_icecandy_goldapple           = new ItemIceCandy(EnumFlapeSyrup.SYRUP_GOLDAPPLE, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_GOLDAPPLE));
	public static Item item_icecandy_goldappleenc        = new ItemIceCandy(EnumFlapeSyrup.SYRUP_GOLDAPPLEENC, new Item.Properties().group(Mod_ManyFoods.tabColdFood).food(ItemFoods.food_icecandy)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ICECANDY_GOLDAPPLEENC));

	public static Item item_flour                 = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FLOUR));
	public static Item item_udon                  = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_UDON));
	public static Item item_pasta                 = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_PASTA));
	public static Item item_ramen                 = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_LAMEN));
	public static Item item_meetpasta             = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_meetpasta)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEET_PASTA));
	public static Item item_fishpasta             = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_fishpasta)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISH_PASTA));
	public static Item item_blackpasta            = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_blackpasta)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_BLACK_PASTA));
	public static Item item_zaruudon              = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_zaruudon)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_ZARUUDON));
	public static Item item_kakeudon              = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_kakeudon)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_KAKEUDON));
	public static Item item_tsukimiuudon          = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_tsukimiudon)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TUKIMIUDON));
	public static Item item_nikuudon              = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_nikuudon)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_NIKUUDON));
	public static Item item_meetramen             = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_meetramen)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETRAMEN));
	public static Item item_fishramen             = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_fishramen)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_FISHRAMEN));
	public static Item item_tsukimiramen          = new ItemNoodle(new Item.Properties().group(Mod_ManyFoods.tabPieCakes).maxStackSize(1).food(ItemFoods.food_tsukimiramen)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_EGGRAMEN));

	public static Item item_millbeef              = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_BEEF));
	public static Item item_millpoke              = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.HASTE,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_POKE));
	public static Item item_millchikin            = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.SLOW_FALLING,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_CHIKIN));
	public static Item item_millmutton            = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_MUTTON));
	public static Item item_millrabit             = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.JUMP_BOOST,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_RABIT));
	public static Item item_millwolf              = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.STRENGTH,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_WOLF));
	public static Item item_millcat               = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.SPEED,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_CAT));
	public static Item item_millhorse             = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.REGENERATION,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_HORSE));
	public static Item item_millllamas            = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.REGENERATION,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_LLAMAS));
	public static Item item_millbear              = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.STRENGTH,1200,1),new EffectInstance(Effects.REGENERATION,1200,1),new EffectInstance(Effects.HEALTH_BOOST,0,5)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_BEAR));
	public static Item item_millfox               = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.STRENGTH,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_FOX));
	public static Item item_milldolphin           = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.DOLPHINS_GRACE,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_DOLPHIN));
	public static Item item_millflesh             = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_FLESH));
	public static Item item_millturtle            = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.WATER_BREATHING,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_TURTLE));
	public static Item item_millcod               = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_COD));
	public static Item item_millsalmon            = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_SALMON));
	public static Item item_millclown             = new ItemTopping(new EffectInstance[] {},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_CLOWN));
	public static Item item_millpuffer            = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.POISON,300,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_PUFFER));
	public static Item item_millsquid             = new ItemTopping(new EffectInstance[] {new EffectInstance(Effects.NIGHT_VISION,1200,1)},new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_MEETMILL_SQUID));

	public static Item item_flowerdust_dandelion       = new ItemFlowerDust(EnumFlowerHalb.DANDELION, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_DANDELION));
	public static Item item_flowerdust_popy            = new ItemFlowerDust(EnumFlowerHalb.POPY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_POPY));
	public static Item item_flowerdust_orchid          = new ItemFlowerDust(EnumFlowerHalb.ORCHID, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_ORCHID));
	public static Item item_flowerdust_allium          = new ItemFlowerDust(EnumFlowerHalb.ALLIUM, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_ALLIUM));
	public static Item item_flowerdust_azurebluet      = new ItemFlowerDust(EnumFlowerHalb.AZUREBLUET, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_AZUREBLUET));
	public static Item item_flowerdust_tulip           = new ItemFlowerDust(EnumFlowerHalb.TULIP, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_TULIP));
	public static Item item_flowerdust_oxeydaisy       = new ItemFlowerDust(EnumFlowerHalb.OXEYDAISY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_OXEYDAISY));
	public static Item item_flowerdust_sunflower       = new ItemFlowerDust(EnumFlowerHalb.SUNFLOWER, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_SUNFLOWER));
	public static Item item_flowerdust_lilac           = new ItemFlowerDust(EnumFlowerHalb.LILAC, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_LILAC));
	public static Item item_flowerdust_rose            = new ItemFlowerDust(EnumFlowerHalb.ROSE, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_ROSE));
	public static Item item_flowerdust_peony           = new ItemFlowerDust(EnumFlowerHalb.PEONY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_PEONY));
	public static Item item_flowerdust_panacea         = new ItemFlowerDust(EnumFlowerHalb.PANACEA, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_PANACEA));
	public static Item item_flowerdust_corm            = new ItemFlowerDust(EnumFlowerHalb.CORN, new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_CORM));
	public static Item item_flowerdust_lily            = new ItemFlowerDust(EnumFlowerHalb.LILY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_LILY));
	public static Item item_flowerdust_witherrose      = new ItemFlowerDust(EnumFlowerHalb.WITHERROSE, new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_WITHERROSE));
	public static Item item_flowerdust_coral           = new ItemFlowerDust(EnumFlowerHalb.CORAL, new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_FLOWER_CORAL));

	public static Item item_flowertea_dandelion        = new ItemFlowerTea(EnumFlowerHalb.DANDELION, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_DANDELION));
	public static Item item_flowertea_popy             = new ItemFlowerTea(EnumFlowerHalb.POPY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_POPY));
	public static Item item_flowertea_orchid           = new ItemFlowerTea(EnumFlowerHalb.ORCHID, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_ORCHID));
	public static Item item_flowertea_allium           = new ItemFlowerTea(EnumFlowerHalb.ALLIUM, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_ALLIUM));
	public static Item item_flowertea_azurebluet       = new ItemFlowerTea(EnumFlowerHalb.AZUREBLUET, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_AZUREBLUET));
	public static Item item_flowertea_tulip            = new ItemFlowerTea(EnumFlowerHalb.TULIP, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_TULIP));
	public static Item item_flowertea_oxeydaisy        = new ItemFlowerTea(EnumFlowerHalb.OXEYDAISY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_OXEYDAISY));
	public static Item item_flowertea_sunflower        = new ItemFlowerTea(EnumFlowerHalb.SUNFLOWER, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_SUNFLOWER));
	public static Item item_flowertea_lilac            = new ItemFlowerTea(EnumFlowerHalb.LILAC, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_LILAC));
	public static Item item_flowertea_rose             = new ItemFlowerTea(EnumFlowerHalb.ROSE, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_ROSE));
	public static Item item_flowertea_peony            = new ItemFlowerTea(EnumFlowerHalb.PEONY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_PEONY));
	public static Item item_flowertea_panacea          = new ItemFlowerTea(EnumFlowerHalb.PANACEA, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_PANACEA));
	public static Item item_flowertea_corm             = new ItemFlowerTea(EnumFlowerHalb.CORN, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_CORM));
	public static Item item_flowertea_lily             = new ItemFlowerTea(EnumFlowerHalb.LILY, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_LILY));
	public static Item item_flowertea_witherrose       = new ItemFlowerTea(EnumFlowerHalb.WITHERROSE, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_WITHERROSE));
	public static Item item_flowertea_coral            = new ItemFlowerTea(EnumFlowerHalb.CORAL, new Item.Properties().group( Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_TEA_FLOWER_CORAL));

	public static Item item_greendust                  = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_GREENDUST));
	public static Item item_kelpdust                   = new Item(new Item.Properties().group(Mod_ManyFoods.tabPieCakes)).setRegistryName(new ResourceLocation(ModCommon.MOD_ID, NAME_DUST_KELPDUST));


	private static Map<String,Item> itemMap;
	public static void init(){
		if (itemMap != null){return;}
		itemMap = new HashMap<String,Item>(){
			{put(NAME_MEET_WOLF, meet_wolf);}
			{put(NAME_MEET_CAT, meet_cat);}
			{put(NAME_MEET_HORSE, meet_horse);}
			{put(NAME_MEET_BEAR, meet_bear);}
			{put(NAME_MEET_LLAMAS, meet_llamas);}
			{put(NAME_MEET_FOX, meet_fox);}
			{put(NAME_MEET_DOLPHIN, meet_dolphin);}
			{put(NAME_RAW_TURTLE, raw_turtle);}
			{put(NAME_RAW_SQUID, raw_squid);}
			{put(NAME_FLESH, raw_flesh);}
			{put(NAME_COOKED_ROTTEN_FLESH, cooked_rotten_flesh);}
			{put(NAME_COOKED_CLOWN, cooked_clown);}
			{put(NAME_COOKED_PUFFER, cooked_puffer);}
			{put(NAME_COOKED_WOLF, cooked_wolf);}
			{put(NAME_COOKED_CAT, cooked_cat);}
			{put(NAME_COOKED_HORSE, cooked_horse);}
			{put(NAME_COOKED_BEAR, cooked_bear);}
			{put(NAME_COOKED_LLAMAS, cooked_llamas);}
			{put(NAME_COOKED_DOLPHIN, cooked_dolphin);}
			{put(NAME_COOKED_TURTLE, cooked_turtle);}
			{put(NAME_COOKED_SQUID, cooked_squid);}
			{put(NAME_COOKED_FLESH, cooked_flesh);}
			{put(NAME_COOKED_FOX, cooked_fox);}
			{put(NAME_HUNGERDRAG, hungerdrag);}

			{put(NAME_ICEFOOD_BOWL, item_icefoodbowl);}
			{put(NAME_OBON, item_obon);}
			{put(NAME_CHOCO, item_choco);}
			{put(NAME_WHITECHOCO, item_whitechoco);}

			{put(NAME_CARAMEL, item_caramel);}
			{put(NAME_PUDDING, item_pudding);}
			{put(NAME_PUMPKINPUDDING, item_pumpkinpudding);}

			{put(NAME_PIECEPIE, item_piecepie);}
			{put(NAME_PIECECHOCOPIE, item_piecechocopie);}
			{put(NAME_PIECESALADAPIE, item_piecesaladapie);}
			{put(NAME_PIECEMEETPIE, item_piecemeetpie);}
			{put(NAME_PIECEFISHPIE, item_piecefishpie);}
			{put(NAME_PIECEPUMPUKINPIE, item_piecepumpukinpie);}
			{put(NAME_PIECEZOMBIPIE, item_piecezombipie);}
			{put(NAME_PIECEAPPLEPIE, item_pieceapplepie);}
			{put(NAME_PIECEblackPIE, item_pieceblackpie);}
			{put(NAME_PIECECARAMELPIE, item_piececaramelpie);}
			{put(NAME_PIECECBERRYPIE, item_pieceberrypie);}
			{put(NAME_PIECECKELPPIE, item_piecekelppie);}
			{put(NAME_PIECECGOLDAPPLEPIE, item_piecegoldapplepie);}
			{put(NAME_PIECECGOLDAPPLEENCPIE, item_piecegoldappleencpie);}

			{put(NAME_EGGSANDWICH, item_eggsandwich);}
			{put(NAME_POTATSALADASANDWICH, item_potatsaladasandwich);}
			{put(NAME_HAMSANDWICH, item_hamsandwich);}
			{put(NAME_MUTTONSANDWICH, item_muttonsandwich);}
			{put(NAME_STAKESANDWICH, item_stakesandwich);}
			{put(NAME_CHIKENSANDWICH, item_chikensandwich);}
			{put(NAME_CHOCOSANDWICH, item_chocosandwich);}
			{put(NAME_PUMPKINSALADASANDWICH, item_pumpkinsaladasandwich);}
			{put(NAME_RABITSANDWICH, item_rabitsandwich);}
			{put(NAME_WOLFSANDWICH, item_wolfsandwich);}
			{put(NAME_CATSANDWICH, item_catsandwich);}
			{put(NAME_BEARSANDWICH, item_bearsandwich);}
			{put(NAME_HORSESANDWICH, item_horsesandwich);}
			{put(NAME_LLAMASSANDWICH, item_llamassandwich);}
			{put(NAME_FOXSANDWICH, item_foxsandwich);}
			{put(NAME_DOLPHINSANDWICH, item_dolphinsandwich);}
			{put(NAME_FLESHSANDWICH, item_fleshsandwich);}
			{put(NAME_ZOMBIESANDWICH, item_zombiesandwich);}
			{put(NAME_TURTLESANDWICH, item_turtlesandwich);}
			{put(NAME_CODSANDWICH, item_codsandwich);}
			{put(NAME_SALMONSANDWICH, item_salmonsandwich);}
			{put(NAME_CLOWNSANDWICH, item_clownsandwich);}
			{put(NAME_PUFFERSANDWICH, item_puffersandwich);}

			{put(NAME_POTATOSALADA, item_potatosalada);}
			{put(NAME_PUMPKINSALDADA, item_pumpkinsalada);}

			{put(NAME_RENNET, item_rennet);}
			{put(NAME_BUTTER, item_butter);}
			{put(NAME_MOLD, item_mold);}
			{put(NAME_SALT, item_salt);}
			{put(NAME_BLUEMOLD, item_bluemold);}
			{put(NAME_RAW_PIE_HALL, item_raw_hallpie);}
			{put(NAME_RAW_CHOCOPIE_HALL, item_raw_chocohallpie);}
			{put(NAME_RAW_SALADA_HALL, item_raw_saladahallpie);}
			{put(NAME_RAW_MEETPIE_HALL, item_raw_meethallpie);}
			{put(NAME_RAW_FISHPIE_HALL, item_raw_fishhallpie);}
			{put(NAME_RAW_PUMPKINPIE_HALL, item_raw_pumpkinhallpie);}
			{put(NAME_RAW_ZOMBIPEI_HALL, item_raw_zombihallpie);}
			{put(NAME_RAW_APPLEPIE_HALL, item_raw_applehallpie);}
			{put(NAME_RAW_BLACK_PIE_HALL, item_raw_blackhallpie);}
			{put(NAME_RAW_BERRY_PIE_HALL, item_raw_berryhallpie);}
			{put(NAME_RAW_KELP_PIE_HALL, item_raw_kelphallpie);}
			{put(NAME_RAW_GOLDAPPLE_PIE_HALL, item_raw_goldapplehallpie);}
			{put(NAME_RAW_GOLDAPPLEENC_PIE_HALL, item_raw_goldappleenchallpie);}
			{put(NAME_RAW_PIZZA, item_raw_pizza);}
			{put(NAME_RAW_MEETPIZZA, item_raw_meetpizza);}
			{put(NAME_RAW_FISHPIZZA, item_raw_fishpizza);}

			{put(NAME_SUGARMILK, item_sugarmilk);}
			{put(NAME_SYRUP_MILK, item_syrupmilk);}
			{put(NAME_ICE_MIX_VANILA, item_ice_mix_vanila);}
			{put(NAME_ICE_MIX_BLACK, item_ice_mix_black);}
			{put(NAME_ICE_MIX_RED, item_ice_mix_red);}
			{put(NAME_ICE_MIX_GREEN, item_ice_mix_green);}
			{put(NAME_ICE_MIX_BROWN, item_ice_mix_brown);}
			{put(NAME_ICE_MIX_BLUE, item_ice_mix_blue);}
			{put(NAME_ICE_MIX_PURPLE, item_ice_mix_purple);}
			{put(NAME_ICE_MIX_CYAN, item_ice_mix_cyan);}
			{put(NAME_ICE_MIX_SILVER, item_ice_mix_silver);}
			{put(NAME_ICE_MIX_GRAY, item_ice_mix_gray);}
			{put(NAME_ICE_MIX_PINK, item_ice_mix_pink);}
			{put(NAME_ICE_MIX_LIME, item_ice_mix_lime);}
			{put(NAME_ICE_MIX_YELLOW, item_ice_mix_yellow);}
			{put(NAME_ICE_MIX_LIGHT_BLUE, item_ice_mix_light_blue);}
			{put(NAME_ICE_MIX_MAGENTA, item_ice_mix_magenta);}
			{put(NAME_ICE_MIX_ORANGE, item_ice_mix_orange);}
			{put(NAME_ICE_MIX_WHITE, item_ice_mix_white);}
			{put(NAME_ICE_MIX_APPLE, item_ice_mix_apple);}
			{put(NAME_ICE_MIX_CACTUS, item_ice_mix_cactus);}
			{put(NAME_ICE_MIX_PUMPKIN, item_ice_mix_pumpkin);}
			{put(NAME_ICE_MIX_POTATO, item_ice_mix_potato);}
			{put(NAME_ICE_MIX_CARROT, item_ice_mix_carrot);}
			{put(NAME_ICE_MIX_MELON, item_ice_mix_melon);}
			{put(NAME_ICE_MIX_GREENTEA, item_ice_mix_greentea);}
			{put(NAME_ICE_MIX_INK_SAK, item_ice_mix_ink_sac);}
			{put(NAME_ICE_MIX_COCOA, item_ice_mix_cocoa);}
			{put(NAME_ICE_MIX_BERRY, item_ice_mix_berry);}
			{put(NAME_ICE_MIX_KELP, item_ice_mix_kelp);}
			{put(NAME_ICE_MIX_GOLDAPPLE, item_ice_mix_goldapple);}
			{put(NAME_ICE_MIX_GOLDAPPLEENC, item_ice_mix_goldappleenc);}

			{put(NAME_ICECREAM_VANILA, item_icecream_vanila);}
			{put(NAME_ICECREAM_BLACK, item_icecream_black);}
			{put(NAME_ICECREAM_RED, item_icecream_red);}
			{put(NAME_ICECREAM_GREEN, item_icecream_green);}
			{put(NAME_ICECREAM_BROWN, item_icecream_brown);}
			{put(NAME_ICECREAM_BLUE, item_icecream_blue);}
			{put(NAME_ICECREAM_PURPLE, item_icecream_purple);}
			{put(NAME_ICECREAM_CYAN, item_icecream_cyan);}
			{put(NAME_ICECREAM_SILVER, item_icecream_silver);}
			{put(NAME_ICECREAM_GRAY, item_icecream_gray);}
			{put(NAME_ICECREAM_PINK, item_icecream_pink);}
			{put(NAME_ICECREAM_LIME, item_icecream_lime);}
			{put(NAME_ICECREAM_YELLOW, item_icecream_yellow);}
			{put(NAME_ICECREAM_LIGHT_BLUE, item_icecream_light_blue);}
			{put(NAME_ICECREAM_MAGENTA, item_icecream_magenta);}
			{put(NAME_ICECREAM_ORANGE, item_icecream_orange);}
			{put(NAME_ICECREAM_WHITE, item_icecream_white);}
			{put(NAME_ICECREAM_APPLE, item_icecream_apple);}
			{put(NAME_ICECREAM_CACTUS, item_icecream_cactus);}
			{put(NAME_ICECREAM_PUMPKIN, item_icecream_pumpkin);}
			{put(NAME_ICECREAM_POTATO, item_icecream_potato);}
			{put(NAME_ICECREAM_CARROT, item_icecream_carrot);}
			{put(NAME_ICECREAM_MELON, item_icecream_melon);}
			{put(NAME_ICECREAM_GREENTEA, item_icecream_greentea);}
			{put(NAME_ICECREAM_INK_SAC, item_icecream_ink_sac);}
			{put(NAME_ICECREAM_COCOA, item_icecream_cocoa);}
			{put(NAME_ICECREAM_BERRY, item_icecream_berry);}
			{put(NAME_ICECREAM_KELP, item_icecream_kelp);}
			{put(NAME_ICECREAM_GOLDAPPLE, item_icecream_goldapple);}
			{put(NAME_ICECREAM_GOLDAPPLEENC, item_icecream_goldappleenc);}

			{put(NAME_ICECREAM_COOKIE_VANILA, item_icecream_cookie_vanila);}
			{put(NAME_ICECREAM_COOKIE_BLACK, item_icecream_cookie_black);}
			{put(NAME_ICECREAM_COOKIE_RED, item_icecream_cookie_red);}
			{put(NAME_ICECREAM_COOKIE_GREEN, item_icecream_cookie_green);}
			{put(NAME_ICECREAM_COOKIE_BROWN, item_icecream_cookie_brown);}
			{put(NAME_ICECREAM_COOKIE_BLUE, item_icecream_cookie_blue);}
			{put(NAME_ICECREAM_COOKIE_PURPLE, item_icecream_cookie_purple);}
			{put(NAME_ICECREAM_COOKIE_CYAN, item_icecream_cookie_cyan);}
			{put(NAME_ICECREAM_COOKIE_SILVER, item_icecream_cookie_silver);}
			{put(NAME_ICECREAM_COOKIE_GRAY, item_icecream_cookie_gray);}
			{put(NAME_ICECREAM_COOKIE_PINK, item_icecream_cookie_pink);}
			{put(NAME_ICECREAM_COOKIE_LIME, item_icecream_cookie_lime);}
			{put(NAME_ICECREAM_COOKIE_YELLOW, item_icecream_cookie_yellow);}
			{put(NAME_ICECREAM_COOKIE_LIGHT_BLUE, item_icecream_cookie_light_blue);}
			{put(NAME_ICECREAM_COOKIE_MAGENTA, item_icecream_cookie_magenta);}
			{put(NAME_ICECREAM_COOKIE_ORANGE, item_icecream_cookie_orange);}
			{put(NAME_ICECREAM_COOKIE_WHITE, item_icecream_cookie_white);}
			{put(NAME_ICECREAM_COOKIE_APPLE, item_icecream_cookie_apple);}
			{put(NAME_ICECREAM_COOKIE_CACTUS, item_icecream_cookie_cactus);}
			{put(NAME_ICECREAM_COOKIE_PUMPKIN, item_icecream_cookie_pumpkin);}
			{put(NAME_ICECREAM_COOKIE_POTATO, item_icecream_cookie_potato);}
			{put(NAME_ICECREAM_COOKIE_CARROT, item_icecream_cookie_carrot);}
			{put(NAME_ICECREAM_COOKIE_MELON, item_icecream_cookie_melon);}
			{put(NAME_ICECREAM_COOKIE_GREENTEA, item_icecream_cookie_greentea);}
			{put(NAME_ICECREAM_COOKIE_INK_SAC, item_icecream_cookie_ink_sac);}
			{put(NAME_ICECREAM_COOKIE_COCOA, item_icecream_cookie_cocoa);}
			{put(NAME_ICECREAM_COOKIE_BERRY, item_icecream_cookie_berry);}
			{put(NAME_ICECREAM_COOKIE_KELP, item_icecream_cookie_kelp);}
			{put(NAME_ICECREAM_COOKIE_GOLDAPPLE, item_icecream_cookie_goldapple);}
			{put(NAME_ICECREAM_COOKIE_GOLDAPPLEENC, item_icecream_cookie_goldappleenc);}

			{put(NAME_SYRUP_SUGAR, item_syrup_sugar);}
			{put(NAME_SYRUP_BLACK, item_syrup_black);}
			{put(NAME_SYRUP_RED, item_syrup_red);}
			{put(NAME_SYRUP_GREEN, item_syrup_green);}
			{put(NAME_SYRUP_BROWN, item_syrup_brown);}
			{put(NAME_SYRUP_BLUE, item_syrup_blue);}
			{put(NAME_SYRUP_PURPLE, item_syrup_purple);}
			{put(NAME_SYRUP_CYAN, item_syrup_cyan);}
			{put(NAME_SYRUP_SILVER, item_syrup_silver);}
			{put(NAME_SYRUP_GRAY, item_syrup_gray);}
			{put(NAME_SYRUP_PINK, item_syrup_pink);}
			{put(NAME_SYRUP_LIME, item_syrup_lime);}
			{put(NAME_SYRUP_YELLOW, item_syrup_yellow);}
			{put(NAME_SYRUP_LIGHT_BLUE, item_syrup_light_blue);}
			{put(NAME_SYRUP_MAGENTA, item_syrup_magenta);}
			{put(NAME_SYRUP_ORANGE, item_syrup_orange);}
			{put(NAME_SYRUP_WHITE, item_syrup_white);}
			{put(NAME_SYRUP_APPLE, item_syrup_apple);}
			{put(NAME_SYRUP_CACTUS, item_syrup_cactus);}
			{put(NAME_SYRUP_MELON, item_syrup_melon);}
			{put(NAME_SYRUP_PUMPKIN, item_syrup_pumpkin);}
			{put(NAME_SYRUP_GREENTEA, item_syrup_greentea);}
			{put(NAME_SYRUP_INK_SAC, item_syrup_ink_sac);}
			{put(NAME_SYRUP_COCOA, item_syrup_cocoa);}
			{put(NAME_SYRUP_BERRY, item_syrup_berry);}
			{put(NAME_SYRUP_KELP, item_syrup_kelp);}
			{put(NAME_SYRUP_GOLDAPPLE, item_syrup_goldapple);}
			{put(NAME_SYRUP_GOLDAPPLEENC, item_syrup_goldappleenc);}

			{put(NAME_CRASHEDICE_NONE, item_crashedice_none);}
			{put(NAME_CRASHEDICE_SUGAR, item_crashedice_sugar);}
			{put(NAME_CRASHEDICE_BLACK, item_crashedice_black);}
			{put(NAME_CRASHEDICE_RED, item_crashedice_red);}
			{put(NAME_CRASHEDICE_GREEN, item_crashedice_green);}
			{put(NAME_CRASHEDICE_BROWN, item_crashedice_brown);}
			{put(NAME_CRASHEDICE_BLUE, item_crashedice_blue);}
			{put(NAME_CRASHEDICE_PURPLE, item_crashedice_purple);}
			{put(NAME_CRASHEDICE_CYAN, item_crashedice_cyan);}
			{put(NAME_CRASHEDICE_SILVER, item_crashedice_silver);}
			{put(NAME_CRASHEDICE_GRAY, item_crashedice_gray);}
			{put(NAME_CRASHEDICE_PINK, item_crashedice_pink);}
			{put(NAME_CRASHEDICE_LIME, item_crashedice_lime);}
			{put(NAME_CRASHEDICE_YELLOW, item_crashedice_yellow);}
			{put(NAME_CRASHEDICE_LIGHT_BLUE, item_crashedice_light_blue);}
			{put(NAME_CRASHEDICE_MAGENTA, item_crashedice_magenta);}
			{put(NAME_CRASHEDICE_ORANGE, item_crashedice_orange);}
			{put(NAME_CRASHEDICE_WHITE, item_crashedice_white);}
			{put(NAME_CRASHEDICE_APPLE, item_crashedice_apple);}
			{put(NAME_CRASHEDICE_CACTUS, item_crashedice_cactus);}
			{put(NAME_CRASHEDICE_MELON, item_crashedice_melon);}
			{put(NAME_CRASHEDICE_PUMPKIN, item_crashedice_pumpkin);}
			{put(NAME_CRASHEDICE_GREENTEA, item_crashedice_greentea);}
			{put(NAME_CRASHEDICE_INK_SAC, item_crashedice_ink_sac);}
			{put(NAME_CRASHEDICE_COCOA, item_crashedice_cocoa);}
			{put(NAME_CRASHEDICE_BERRY, item_crashedice_berry);}
			{put(NAME_CRASHEDICE_KELP, item_crashedice_kelp);}
			{put(NAME_CRASHEDICE_GOLDAPPLE, item_crashedice_goldenapple);}
			{put(NAME_CRASHEDICE_GOLDAPPLEENC, item_crashedice_goldappleenc);}


			{put(NAME_CRASHEDICE_MILK_NONE, item_crashedice_milk_none);}
			{put(NAME_CRASHEDICE_MILK_SUGAR, item_crashedice_milk_sugar);}
			{put(NAME_CRASHEDICE_MILK_BLACK, item_crashedice_milk_black);}
			{put(NAME_CRASHEDICE_MILK_RED, item_crashedice_milk_red);}
			{put(NAME_CRASHEDICE_MILK_GREEN, item_crashedice_milk_green);}
			{put(NAME_CRASHEDICE_MILK_BROWN, item_crashedice_milk_brown);}
			{put(NAME_CRASHEDICE_MILK_BLUE, item_crashedice_milk_blue);}
			{put(NAME_CRASHEDICE_MILK_PURPLE, item_crashedice_milk_purple);}
			{put(NAME_CRASHEDICE_MILK_CYAN, item_crashedice_milk_cyan);}
			{put(NAME_CRASHEDICE_MILK_SILVER, item_crashedice_milk_silver);}
			{put(NAME_CRASHEDICE_MILK_GRAY, item_crashedice_milk_gray);}
			{put(NAME_CRASHEDICE_MILK_PINK, item_crashedice_milk_pink);}
			{put(NAME_CRASHEDICE_MILK_LIME, item_crashedice_milk_lime);}
			{put(NAME_CRASHEDICE_MILK_YELLOW, item_crashedice_milk_yellow);}
			{put(NAME_CRASHEDICE_MILK_LIGHT_BLUE, item_crashedice_milk_light_blue);}
			{put(NAME_CRASHEDICE_MILK_MAGENTA, item_crashedice_milk_magenta);}
			{put(NAME_CRASHEDICE_MILK_ORANGE, item_crashedice_milk_orange);}
			{put(NAME_CRASHEDICE_MILK_WHITE, item_crashedice_milk_white);}
			{put(NAME_CRASHEDICE_MILK_APPLE, item_crashedice_milk_apple);}
			{put(NAME_CRASHEDICE_MILK_CACTUS, item_crashedice_milk_cactus);}
			{put(NAME_CRASHEDICE_MILK_MELON, item_crashedice_milk_melon);}
			{put(NAME_CRASHEDICE_MILK_PUMPKIN, item_crashedice_milk_pumpkin);}
			{put(NAME_CRASHEDICE_MILK_GREENTEA, item_crashedice_milk_greentea);}
			{put(NAME_CRASHEDICE_MILK_INK_SAC, item_crashedice_milk_ink_sac);}
			{put(NAME_CRASHEDICE_MILK_COCOA, item_crashedice_milk_cocoa);}
			{put(NAME_CRASHEDICE_MILK_BERRY, item_crashedice_milk_berry);}
			{put(NAME_CRASHEDICE_MILK_KELP, item_crashedice_milk_kelp);}
			{put(NAME_CRASHEDICE_MILK_GOLDAPPLE, item_crashedice_milk_goldapple);}
			{put(NAME_CRASHEDICE_MILK_GOLDAPPLEENC, item_crashedice_milk_goldappleenc);}

			{put(NAME_SUGAR_WATER_NONE, item_sugar_water_none);}
			{put(NAME_SUGAR_WATER_SUGAR, item_sugar_water_sugar);}
			{put(NAME_SUGAR_WATER_BLACK, item_sugar_water_black);}
			{put(NAME_SUGAR_WATER_RED, item_sugar_water_red);}
			{put(NAME_SUGAR_WATER_GREEN, item_sugar_water_green);}
			{put(NAME_SUGAR_WATER_BROWN, item_sugar_water_brown);}
			{put(NAME_SUGAR_WATER_BLUE, item_sugar_water_blue);}
			{put(NAME_SUGAR_WATER_PURPLE, item_sugar_water_purple);}
			{put(NAME_SUGAR_WATER_CYAN, item_sugar_water_cyan);}
			{put(NAME_SUGAR_WATER_SILVER, item_sugar_water_silver);}
			{put(NAME_SUGAR_WATER_GRAY, item_sugar_water_gray);}
			{put(NAME_SUGAR_WATER_PINK, item_sugar_water_pink);}
			{put(NAME_SUGAR_WATER_LIME, item_sugar_water_lime);}
			{put(NAME_SUGAR_WATER_YELLOW, item_sugar_water_yellow);}
			{put(NAME_SUGAR_WATER_LIGHT_BLUE, item_sugar_water_light_blue);}
			{put(NAME_SUGAR_WATER_MAGENTA, item_sugar_water_magenta);}
			{put(NAME_SUGAR_WATER_ORANGE, item_sugar_water_orange);}
			{put(NAME_SUGAR_WATER_WHITE, item_sugar_water_white);}
			{put(NAME_SUGAR_WATER_APPLE, item_sugar_water_apple);}
			{put(NAME_SUGAR_WATER_CACTUS, item_sugar_water_cactus);}
			{put(NAME_SUGAR_WATER_MELON, item_sugar_water_melon);}
			{put(NAME_SUGAR_WATER_PUMPKIN, item_sugar_water_pumpkin);}
			{put(NAME_SUGAR_WATER_GREENTEA, item_sugar_water_greentea);}
			{put(NAME_SUGAR_WATER_INK_SAC, item_sugar_water_ink_sac);}
			{put(NAME_SUGAR_WATER_COCOA, item_sugar_water_cocoa);}
			{put(NAME_SUGAR_WATER_BERRY, item_sugar_water_berry);}
			{put(NAME_SUGAR_WATER_KELP, item_sugar_water_kelp);}
			{put(NAME_SUGAR_WATER_GOLDAPPLE, item_sugar_water_goldapple);}
			{put(NAME_SUGAR_WATER_GOLDAPPLEENC, item_sugar_water_goldappleenc);}

			{put(NAME_ICECANDY_NONE, item_icecandy_none);}
			{put(NAME_ICECANDY_SUGAR, item_icecandy_sugar);}
			{put(NAME_ICECANDY_BLACK, item_icecandy_black);}
			{put(NAME_ICECANDY_RED, item_icecandy_red);}
			{put(NAME_ICECANDY_GREEN, item_icecandy_green);}
			{put(NAME_ICECANDY_BROWN, item_icecandy_brown);}
			{put(NAME_ICECANDY_BLUE, item_icecandy_blue);}
			{put(NAME_ICECANDY_PURPLE, item_icecandy_purple);}
			{put(NAME_ICECANDY_CYAN, item_icecandy_cyan);}
			{put(NAME_ICECANDY_SILVER, item_icecandy_silver);}
			{put(NAME_ICECANDY_GRAY, item_icecandy_gray);}
			{put(NAME_ICECANDY_PINK, item_icecandy_pink);}
			{put(NAME_ICECANDY_LIME, item_icecandy_lime);}
			{put(NAME_ICECANDY_YELLOW, item_icecandy_yellow);}
			{put(NAME_ICECANDY_LIGHT_BLUE, item_icecandy_light_blue);}
			{put(NAME_ICECANDY_MAGENTA, item_icecandy_magenta);}
			{put(NAME_ICECANDY_ORANGE, item_icecandy_orange);}
			{put(NAME_ICECANDY_WHITE, item_icecandy_white);}
			{put(NAME_ICECANDY_APPLE, item_icecandy_apple);}
			{put(NAME_ICECANDY_CACTUS, item_icecandy_cactus);}
			{put(NAME_ICECANDY_MELON, item_icecandy_melon);}
			{put(NAME_ICECANDY_PUMPKIN, item_icecandy_pumpkin);}
			{put(NAME_ICECANDY_GREENTEA, item_icecandy_greentea);}
			{put(NAME_ICECANDY_INK_SAC, item_icecandy_ink_sac);}
			{put(NAME_ICECANDY_COCOA, item_icecandy_cocoa);}
			{put(NAME_ICECANDY_BERRY, item_icecandy_berry);}
			{put(NAME_ICECANDY_KELP, item_icecandy_kelp);}
			{put(NAME_ICECANDY_GOLDAPPLE, item_icecandy_goldapple);}
			{put(NAME_ICECANDY_GOLDAPPLEENC, item_icecandy_goldappleenc);}

			{put(NAME_FLOUR, item_flour);}
			{put(NAME_UDON, item_udon);}
			{put(NAME_PASTA, item_pasta);}
			{put(NAME_LAMEN, item_ramen);}
			{put(NAME_MEET_PASTA, item_meetpasta);}
			{put(NAME_FISH_PASTA, item_fishpasta);}
			{put(NAME_BLACK_PASTA, item_blackpasta);}
			{put(NAME_ZARUUDON, item_zaruudon);}
			{put(NAME_KAKEUDON, item_kakeudon);}
			{put(NAME_TUKIMIUDON, item_tsukimiuudon);}
			{put(NAME_NIKUUDON, item_nikuudon);}
			{put(NAME_MEETRAMEN, item_meetramen);}
			{put(NAME_FISHRAMEN, item_fishramen);}
			{put(NAME_EGGRAMEN, item_tsukimiramen);}
			{put(NAME_MEETMILL_BEEF, item_millbeef);}
			{put(NAME_MEETMILL_POKE, item_millpoke);}
			{put(NAME_MEETMILL_CHIKIN, item_millchikin);}
			{put(NAME_MEETMILL_MUTTON, item_millmutton);}
			{put(NAME_MEETMILL_RABIT, item_millrabit);}
			{put(NAME_MEETMILL_WOLF, item_millwolf);}
			{put(NAME_MEETMILL_CAT, item_millcat);}
			{put(NAME_MEETMILL_HORSE, item_millhorse);}
			{put(NAME_MEETMILL_LLAMAS, item_millllamas);}
			{put(NAME_MEETMILL_BEAR, item_millbear);}
			{put(NAME_MEETMILL_FOX, item_millfox);}
			{put(NAME_MEETMILL_DOLPHIN, item_milldolphin);}
			{put(NAME_MEETMILL_FLESH, item_millflesh);}
			{put(NAME_MEETMILL_TURTLE, item_millturtle);}
			{put(NAME_MEETMILL_COD, item_millcod);}
			{put(NAME_MEETMILL_SALMON, item_millsalmon);}
			{put(NAME_MEETMILL_CLOWN, item_millclown);}
			{put(NAME_MEETMILL_PUFFER, item_millpuffer);}
			{put(NAME_MEETMILL_SQUID, item_millsquid);}

			{put(NAME_DUST_FLOWER_DANDELION, item_flowerdust_dandelion);}
			{put(NAME_DUST_FLOWER_POPY, item_flowerdust_popy);}
			{put(NAME_DUST_FLOWER_ORCHID, item_flowerdust_orchid);}
			{put(NAME_DUST_FLOWER_ALLIUM, item_flowerdust_allium);}
			{put(NAME_DUST_FLOWER_AZUREBLUET, item_flowerdust_azurebluet);}
			{put(NAME_DUST_FLOWER_TULIP, item_flowerdust_tulip);}
			{put(NAME_DUST_FLOWER_OXEYDAISY, item_flowerdust_oxeydaisy);}
			{put(NAME_DUST_FLOWER_SUNFLOWER, item_flowerdust_sunflower);}
			{put(NAME_DUST_FLOWER_LILAC, item_flowerdust_lilac);}
			{put(NAME_DUST_FLOWER_ROSE, item_flowerdust_rose);}
			{put(NAME_DUST_FLOWER_PEONY, item_flowerdust_peony);}
			{put(NAME_DUST_FLOWER_PANACEA, item_flowerdust_panacea);}
			{put(NAME_DUST_FLOWER_CORM, item_flowerdust_corm);}
			{put(NAME_DUST_FLOWER_LILY, item_flowerdust_lily);}
			{put(NAME_DUST_FLOWER_WITHERROSE, item_flowerdust_witherrose);}
			{put(NAME_DUST_FLOWER_CORAL, item_flowerdust_coral);}

			{put(NAME_TEA_FLOWER_DANDELION, item_flowertea_dandelion);}
			{put(NAME_TEA_FLOWER_POPY, item_flowertea_popy);}
			{put(NAME_TEA_FLOWER_ORCHID, item_flowertea_orchid);}
			{put(NAME_TEA_FLOWER_ALLIUM, item_flowertea_allium);}
			{put(NAME_TEA_FLOWER_AZUREBLUET, item_flowertea_azurebluet);}
			{put(NAME_TEA_FLOWER_TULIP, item_flowertea_tulip);}
			{put(NAME_TEA_FLOWER_OXEYDAISY, item_flowertea_oxeydaisy);}
			{put(NAME_TEA_FLOWER_SUNFLOWER, item_flowertea_sunflower);}
			{put(NAME_TEA_FLOWER_LILAC, item_flowertea_lilac);}
			{put(NAME_TEA_FLOWER_ROSE, item_flowertea_rose);}
			{put(NAME_TEA_FLOWER_PEONY, item_flowertea_peony);}
			{put(NAME_TEA_FLOWER_PANACEA, item_flowertea_panacea);}
			{put(NAME_TEA_FLOWER_CORM, item_flowertea_corm);}
			{put(NAME_TEA_FLOWER_LILY, item_flowertea_lily);}
			{put(NAME_TEA_FLOWER_WITHERROSE, item_flowertea_witherrose);}
			{put(NAME_TEA_FLOWER_CORAL, item_flowertea_coral);}

			{put(NAME_DUST_GREENDUST, item_greendust);}
			{put(NAME_DUST_KELPDUST, item_kelpdust);}
		};
	}

	public static void register(final RegistryEvent.Register<Item> itemRegistryEvent){
		for (String name : NAME_LIST){
			if (itemMap.containsKey(name)) {
				itemRegistryEvent.getRegistry().register(itemMap.get(name));
			}
		}

	}


	public static enum EnumIceFlavor{
		ICE_VANILA    (0,     "vanila",                       new EffectInstance[] {}, new ItemStack[]{ItemStack.EMPTY},	NAME_ICE_MIX_VANILA,NAME_ICECREAM_VANILA,NAME_ICECREAM_COOKIE_VANILA,	new ResourceLocation("mfm:textures/entity/icecream_vanila.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_vanila.png")),
		ICE_BLACK     (1,     DyeColor.BLACK.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BLACK_DYE,1)},	NAME_ICE_MIX_BLACK,NAME_ICECREAM_BLACK,NAME_ICECREAM_COOKIE_BLACK,	new ResourceLocation("mfm:textures/entity/icecream_black.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_black.png")),
		ICE_RED       (2,     DyeColor.RED.toString(),        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.RED_DYE,1)},	NAME_ICE_MIX_RED,NAME_ICECREAM_RED,NAME_ICECREAM_COOKIE_RED,	new ResourceLocation("mfm:textures/entity/icecream_red.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_red.png")),
		ICE_GREEN     (3,     DyeColor.GREEN.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.GREEN_DYE,1)},	NAME_ICE_MIX_GREEN,NAME_ICECREAM_GREEN,NAME_ICECREAM_COOKIE_GREEN,	new ResourceLocation("mfm:textures/entity/icecream_green.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_green.png")),
		ICE_BROWN     (4,     DyeColor.BROWN.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BROWN_DYE,1)},	NAME_ICE_MIX_BROWN,NAME_ICECREAM_BROWN,NAME_ICECREAM_COOKIE_BROWN,	new ResourceLocation("mfm:textures/entity/icecream_brown.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_brown.png")),
		ICE_BLUE      (5,     DyeColor.BLUE.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BLUE_DYE,1)},	NAME_ICE_MIX_BLUE,NAME_ICECREAM_BLUE,NAME_ICECREAM_COOKIE_BLUE,	new ResourceLocation("mfm:textures/entity/icecream_blue.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_blue.png")),
		ICE_PURPLE    (6,     DyeColor.PURPLE.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.PURPLE_DYE,1)},	NAME_ICE_MIX_PURPLE,NAME_ICECREAM_PURPLE,NAME_ICECREAM_COOKIE_PURPLE,	new ResourceLocation("mfm:textures/entity/icecream_purple.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_purple.png")),
		ICE_CYAN      (7,     DyeColor.CYAN.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.CYAN_DYE,1)},	NAME_ICE_MIX_CYAN,NAME_ICECREAM_CYAN,NAME_ICECREAM_COOKIE_CYAN,	new ResourceLocation("mfm:textures/entity/icecream_cyan.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_cyan.png")),
		ICE_SILVER    (8,     DyeColor.LIGHT_GRAY.toString(), new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIGHT_GRAY_DYE,1)},	NAME_ICE_MIX_SILVER,NAME_ICECREAM_SILVER,NAME_ICECREAM_COOKIE_SILVER,	new ResourceLocation("mfm:textures/entity/icecream_silver.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_silver.png")),
		ICE_GRAY      (9,     DyeColor.GRAY.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.GRAY_DYE,1)},	NAME_ICE_MIX_GRAY,NAME_ICECREAM_GRAY,NAME_ICECREAM_COOKIE_GRAY,	new ResourceLocation("mfm:textures/entity/icecream_gray.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_gray.png")),
		ICE_PINK      (10,    DyeColor.PINK.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.PINK_DYE,1)},	NAME_ICE_MIX_PINK,NAME_ICECREAM_PINK,NAME_ICECREAM_COOKIE_PINK,	new ResourceLocation("mfm:textures/entity/icecream_pink.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_pink.png")),
		ICE_LIME      (11,    DyeColor.LIME.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIME_DYE,1)},	NAME_ICE_MIX_LIME,NAME_ICECREAM_LIME,NAME_ICECREAM_COOKIE_LIME,	new ResourceLocation("mfm:textures/entity/icecream_lime.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_lime.png")),
		ICE_YELLOW    (12,    DyeColor.YELLOW.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.YELLOW_DYE,1)},	NAME_ICE_MIX_YELLOW,NAME_ICECREAM_YELLOW,NAME_ICECREAM_COOKIE_YELLOW,	new ResourceLocation("mfm:textures/entity/icecream_yellow.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_yellow.png")),
		ICE_LIGHT_BLUE(13,    DyeColor.LIGHT_BLUE.toString(), new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIGHT_BLUE_DYE,1)},	NAME_ICE_MIX_LIGHT_BLUE,NAME_ICECREAM_LIGHT_BLUE,NAME_ICECREAM_COOKIE_LIGHT_BLUE,	new ResourceLocation("mfm:textures/entity/icecream_light_blue.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_light_blue.png")),
		ICE_MAGENTA   (14,    DyeColor.MAGENTA.toString(),    new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.MAGENTA_DYE,1)},	NAME_ICE_MIX_MAGENTA,NAME_ICECREAM_MAGENTA,NAME_ICECREAM_COOKIE_MAGENTA,	new ResourceLocation("mfm:textures/entity/icecream_magenta.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_magenta.png")),
		ICE_ORANGE    (15,    DyeColor.ORANGE.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.ORANGE_DYE,1)},	NAME_ICE_MIX_ORANGE,NAME_ICECREAM_ORANGE,NAME_ICECREAM_COOKIE_ORANGE,	new ResourceLocation("mfm:textures/entity/icecream_orange.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_orange.png")),
		ICE_WHITE     (16,    DyeColor.WHITE.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.WHITE_DYE,1)},	NAME_ICE_MIX_WHITE,NAME_ICECREAM_WHITE,NAME_ICECREAM_COOKIE_WHITE,	new ResourceLocation("mfm:textures/entity/icecream_white.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_white.png")),
		ICE_APPLE     (17,    "apple",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.APPLE,1)},	NAME_ICE_MIX_APPLE,NAME_ICECREAM_APPLE,NAME_ICECREAM_COOKIE_APPLE,	new ResourceLocation("mfm:textures/entity/icecream_apple.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_apple.png")),
		ICE_CACTUS    (18,    "cactus",                       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Blocks.CACTUS,1)},	NAME_ICE_MIX_CACTUS,NAME_ICECREAM_CACTUS,NAME_ICECREAM_COOKIE_CACTUS,	new ResourceLocation("mfm:textures/entity/icecream_cactus.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_cactus.png")),
		ICE_PUMPKIN   (19,    "pumpkin",                      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Blocks.PUMPKIN,1)},	NAME_ICE_MIX_PUMPKIN,NAME_ICECREAM_PUMPKIN,NAME_ICECREAM_COOKIE_PUMPKIN,	new ResourceLocation("mfm:textures/entity/icecream_pumpkin.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_pumpkin.png")),
		ICE_POTATO    (20,    "potato",                       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.POTATO,1)},	NAME_ICE_MIX_POTATO,NAME_ICECREAM_POTATO,NAME_ICECREAM_COOKIE_POTATO,	new ResourceLocation("mfm:textures/entity/icecream_potato.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_potato.png")),
		ICE_CARROT    (21,    "carrot",                       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.CARROT,1)},	NAME_ICE_MIX_CARROT,NAME_ICECREAM_CARROT,NAME_ICECREAM_COOKIE_CARROT,	new ResourceLocation("mfm:textures/entity/icecream_callot.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_callot.png")),
		ICE_MELON     (22,    "melon",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.MELON_SLICE,1), new ItemStack(Blocks.MELON,1)},	NAME_ICE_MIX_MELON,NAME_ICECREAM_MELON,NAME_ICECREAM_COOKIE_MELON,	new ResourceLocation("mfm:textures/entity/icecream_mellon.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_mellon.png")),
		ICE_GREENTEA  (23,    "greentea",                     new EffectInstance[] {}, new ItemStack[]{new ItemStack(ItemCore.item_greendust,1)},	NAME_ICE_MIX_GREENTEA,NAME_ICECREAM_GREENTEA,NAME_ICECREAM_COOKIE_GREENTEA,	new ResourceLocation("mfm:textures/entity/icecream_greentea.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_greentea.png")),
		ICE_INK_SAC   (24,    "ink_sac",                      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.INK_SAC,1)},	NAME_ICE_MIX_INK_SAK,NAME_ICECREAM_INK_SAC,NAME_ICECREAM_COOKIE_INK_SAC,	new ResourceLocation("mfm:textures/entity/icecream_ink_sac.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_ink_sac.png")),
		ICE_COCOA     (25,    "cocoa",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.COCOA_BEANS,1)},	NAME_ICE_MIX_COCOA,NAME_ICECREAM_COCOA,NAME_ICECREAM_COOKIE_COCOA,	new ResourceLocation("mfm:textures/entity/icecream_cocoa.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_cocoa.png")),
		ICE_BERRY     (26,    "berry",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.SWEET_BERRIES,1)},	NAME_ICE_MIX_BERRY,NAME_ICECREAM_BERRY,NAME_ICECREAM_COOKIE_BERRY,	new ResourceLocation("mfm:textures/entity/icecream_berry.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_berry.png")),
		ICE_KELP      (27,    "kelp",                         new EffectInstance[] {new EffectInstance(Effects.WATER_BREATHING, 1200, 1)}, new ItemStack[]{new ItemStack(ItemCore.item_kelpdust,1)},	NAME_ICE_MIX_KELP,NAME_ICECREAM_KELP,NAME_ICECREAM_COOKIE_KELP,	new ResourceLocation("mfm:textures/entity/icecream_kelp.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_kelp.png")),
		ICE_GOLDAPPLE (28,    "goldapple",                    new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 100, 1), new EffectInstance(Effects.ABSORPTION, 2400, 0)}, new ItemStack[]{new ItemStack(Items.GOLDEN_APPLE,1)},	NAME_ICE_MIX_GOLDAPPLE,NAME_ICECREAM_GOLDAPPLE,NAME_ICECREAM_COOKIE_GOLDAPPLE,	new ResourceLocation("mfm:textures/entity/icecream_goldapple.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_goldapple.png")),
		ICE_GOLDAPPLEENC (29, "goldappleenc",                 new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 400, 1), new EffectInstance(Effects.RESISTANCE, 6000, 0), new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), new EffectInstance(Effects.ABSORPTION, 2400, 3)}, new ItemStack[]{new ItemStack(Items.ENCHANTED_GOLDEN_APPLE,1)},	NAME_ICE_MIX_GOLDAPPLEENC,NAME_ICECREAM_GOLDAPPLEENC,NAME_ICECREAM_COOKIE_GOLDAPPLEENC,	new ResourceLocation("mfm:textures/entity/icecream_goldappleenc.png"),	new ResourceLocation("mfm:textures/entity/icecream_cookie_goldappleenc.png"));

		private int index;
		private int damage;
		private String fravor;
		private EffectInstance[] effects;
		private ItemStack[] baseItem;
		private String icemix;
		private String icecream;
		private String icecookie;
		private ResourceLocation iceTexture;
		private ResourceLocation icecookieTexture;

		private EnumIceFlavor(int idx, String name, EffectInstance[] effect, ItemStack[] item, String item1, String item2, String item3, ResourceLocation tex1, ResourceLocation tex2){
			index = idx;
			damage = idx;
			fravor = name;
			effects = effect;
			baseItem = item;
			icemix = item1;
			icecream = item2;
			icecookie = item3;
			iceTexture = tex1;
			icecookieTexture = tex2;
		}

		public static final EnumIceFlavor[] values = {ICE_VANILA,ICE_BLACK,ICE_RED,ICE_GREEN,ICE_BROWN,ICE_BLUE,ICE_PURPLE,
				ICE_CYAN,ICE_SILVER,ICE_GRAY,ICE_PINK,ICE_LIME,ICE_YELLOW,ICE_LIGHT_BLUE,ICE_MAGENTA,ICE_ORANGE,ICE_WHITE,
				ICE_APPLE,ICE_CACTUS,ICE_PUMPKIN,ICE_POTATO,ICE_CARROT,ICE_MELON,ICE_GREENTEA,ICE_INK_SAC,ICE_COCOA,ICE_BERRY,
				ICE_KELP,ICE_GOLDAPPLE,ICE_GOLDAPPLEENC};

		public int getIndex(){return this.index;}
		public int getDamage(){return this.damage;}
		public String getFlavor(){return this.fravor;}
		public ItemStack[] getBaseItem(){return this.baseItem;}
		public static EnumIceFlavor getValue(int index){return values[index];}

		public Item getIcemix(){return  ItemCore.itemMap.get(icemix);}
		public Item getIcecream(){return ItemCore.itemMap.get(icecream);}
		public Item getIceCookie(){return ItemCore.itemMap.get(icecookie);}
		public ResourceLocation getIceTexture(){return iceTexture;}
		public ResourceLocation getIceCookieTexture(){return icecookieTexture;}
		public EffectInstance[] getEffects() {return effects;}
	}

	public static enum EnumFlapeSyrup{
		SYRUP_NONE      (0,     "none",                         new EffectInstance[] {}, new ItemStack[]{}, 	"",NAME_CRASHEDICE_NONE,NAME_CRASHEDICE_MILK_NONE,NAME_SUGAR_WATER_NONE,NAME_ICECANDY_NONE,	new ResourceLocation("mfm:textures/entity/crashedice_none.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_none.png")),
		SYRUP_SUGAR     (1,     "sugar",                        new EffectInstance[] {}, new ItemStack[]{},	NAME_SYRUP_SUGAR,NAME_CRASHEDICE_SUGAR,NAME_CRASHEDICE_MILK_SUGAR,NAME_SUGAR_WATER_SUGAR,NAME_ICECANDY_SUGAR,	new ResourceLocation("mfm:textures/entity/crashedice_sugar.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_sugar.png")),
		SYRUP_BLACK     (2,     DyeColor.BLACK.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BLACK_DYE,1)},	NAME_SYRUP_BLACK,NAME_CRASHEDICE_BLACK,NAME_CRASHEDICE_MILK_BLACK,NAME_SUGAR_WATER_BLACK,NAME_ICECANDY_BLACK,	new ResourceLocation("mfm:textures/entity/crashedice_black.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_black.png")),
		SYRUP_RED       (3,     DyeColor.RED.toString(),        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.RED_DYE,1)},	NAME_SYRUP_RED,NAME_CRASHEDICE_RED,NAME_CRASHEDICE_MILK_RED,NAME_SUGAR_WATER_RED,NAME_ICECANDY_RED,	new ResourceLocation("mfm:textures/entity/crashedice_red.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_red.png")),
		SYRUP_GREEN     (4,     DyeColor.GREEN.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.GREEN_DYE,1)},	NAME_SYRUP_GREEN,NAME_CRASHEDICE_GREEN,NAME_CRASHEDICE_MILK_GREEN,NAME_SUGAR_WATER_GREEN,NAME_ICECANDY_GREEN,	new ResourceLocation("mfm:textures/entity/crashedice_green.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_green.png")),
		SYRUP_BROWN     (5,     DyeColor.BROWN.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BROWN_DYE,1)},	NAME_SYRUP_BROWN,NAME_CRASHEDICE_BROWN,NAME_CRASHEDICE_MILK_BROWN,NAME_SUGAR_WATER_BROWN,NAME_ICECANDY_BROWN,	new ResourceLocation("mfm:textures/entity/crashedice_brown.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_brown.png")),
		SYRUP_BLUE      (6,     DyeColor.BLUE.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.BLUE_DYE,1)},	NAME_SYRUP_BLUE,NAME_CRASHEDICE_BLUE,NAME_CRASHEDICE_MILK_BLUE,NAME_SUGAR_WATER_BLUE,NAME_ICECANDY_BLUE,	new ResourceLocation("mfm:textures/entity/crashedice_blue.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_blue.png")),
		SYRUP_PURPLE    (7,     DyeColor.PURPLE.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.PURPLE_DYE,1)},	NAME_SYRUP_PURPLE,NAME_CRASHEDICE_PURPLE,NAME_CRASHEDICE_MILK_PURPLE,NAME_SUGAR_WATER_PURPLE,NAME_ICECANDY_PURPLE,	new ResourceLocation("mfm:textures/entity/crashedice_purple.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_purple.png")),
		SYRUP_CYAN      (8,     DyeColor.CYAN.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.CYAN_DYE,1)},	NAME_SYRUP_CYAN,NAME_CRASHEDICE_CYAN,NAME_CRASHEDICE_MILK_CYAN,NAME_SUGAR_WATER_CYAN,NAME_ICECANDY_CYAN,	new ResourceLocation("mfm:textures/entity/crashedice_cyan.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_cyan.png")),
		SYRUP_SILVER    (9,     DyeColor.LIGHT_GRAY.toString(), new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIGHT_GRAY_DYE,1)},	NAME_SYRUP_SILVER,NAME_CRASHEDICE_SILVER,NAME_CRASHEDICE_MILK_SILVER,NAME_SUGAR_WATER_SILVER,NAME_ICECANDY_SILVER,	new ResourceLocation("mfm:textures/entity/crashedice_silver.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_silver.png")),
		SYRUP_GRAY      (10,    DyeColor.GRAY.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.GRAY_DYE,1)},	NAME_SYRUP_GRAY,NAME_CRASHEDICE_GRAY,NAME_CRASHEDICE_MILK_GRAY,NAME_SUGAR_WATER_GRAY,NAME_ICECANDY_GRAY,	new ResourceLocation("mfm:textures/entity/crashedice_gray.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_gray.png")),
		SYRUP_PINK      (11,    DyeColor.PINK.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.PINK_DYE,1)},	NAME_SYRUP_PINK,NAME_CRASHEDICE_PINK,NAME_CRASHEDICE_MILK_PINK,NAME_SUGAR_WATER_PINK,NAME_ICECANDY_PINK,	new ResourceLocation("mfm:textures/entity/crashedice_pink.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_pink.png")),
		SYRUP_LIME      (12,    DyeColor.LIME.toString(),       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIME_DYE,1)},	NAME_SYRUP_LIME,NAME_CRASHEDICE_LIME,NAME_CRASHEDICE_MILK_LIME,NAME_SUGAR_WATER_LIME,NAME_ICECANDY_LIME,	new ResourceLocation("mfm:textures/entity/crashedice_lime.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_lime.png")),
		SYRUP_YELLOW    (13,    DyeColor.YELLOW.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.ORANGE_DYE,1)},	NAME_SYRUP_YELLOW,NAME_CRASHEDICE_YELLOW,NAME_CRASHEDICE_MILK_YELLOW,NAME_SUGAR_WATER_YELLOW,NAME_ICECANDY_YELLOW,	new ResourceLocation("mfm:textures/entity/crashedice_yellow.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_yellow.png")),
		SYRUP_LIGHT_BLUE(14,    DyeColor.LIGHT_BLUE.toString(), new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.LIGHT_BLUE_DYE,1)},	NAME_SYRUP_LIGHT_BLUE,NAME_CRASHEDICE_LIGHT_BLUE,NAME_CRASHEDICE_MILK_LIGHT_BLUE,NAME_SUGAR_WATER_LIGHT_BLUE,NAME_ICECANDY_LIGHT_BLUE,	new ResourceLocation("mfm:textures/entity/crashedice_light_blue.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_light_blue.png")),
		SYRUP_MAGENTA   (15,    DyeColor.MAGENTA.toString(),    new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.MAGENTA_DYE,1)},	NAME_SYRUP_MAGENTA,NAME_CRASHEDICE_MAGENTA,NAME_CRASHEDICE_MILK_MAGENTA,NAME_SUGAR_WATER_MAGENTA,NAME_ICECANDY_MAGENTA,	new ResourceLocation("mfm:textures/entity/crashedice_magenta.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_magenta.png")),
		SYRUP_ORANGE    (16,    DyeColor.ORANGE.toString(),     new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.ORANGE_DYE,1)},	NAME_SYRUP_ORANGE,NAME_CRASHEDICE_ORANGE,NAME_CRASHEDICE_MILK_ORANGE,NAME_SUGAR_WATER_ORANGE,NAME_ICECANDY_ORANGE,	new ResourceLocation("mfm:textures/entity/crashedice_orange.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_orange.png")),
		SYRUP_WHITE     (17,    DyeColor.WHITE.toString(),      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.WHITE_DYE,1)},	NAME_SYRUP_WHITE,NAME_CRASHEDICE_WHITE,NAME_CRASHEDICE_MILK_WHITE,NAME_SUGAR_WATER_WHITE,NAME_ICECANDY_WHITE,	new ResourceLocation("mfm:textures/entity/crashedice_white.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_white.png")),
		SYRUP_APPLE     (18,    "apple",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.APPLE,1)},	NAME_SYRUP_APPLE,NAME_CRASHEDICE_APPLE,NAME_CRASHEDICE_MILK_APPLE,NAME_SUGAR_WATER_APPLE,NAME_ICECANDY_APPLE,	new ResourceLocation("mfm:textures/entity/crashedice_apple.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_apple.png")),
		SYRUP_CACTUS    (19,    "cactus",                       new EffectInstance[] {}, new ItemStack[]{new ItemStack(Blocks.CACTUS,1)},	NAME_SYRUP_CACTUS,NAME_CRASHEDICE_CACTUS,NAME_CRASHEDICE_MILK_CACTUS,NAME_SUGAR_WATER_CACTUS,NAME_ICECANDY_CACTUS,	new ResourceLocation("mfm:textures/entity/crashedice_cactus.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_cactus.png")),
		SYRUP_MELON     (20,    "melon",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.MELON_SLICE,1), new ItemStack(Blocks.MELON,1)},	NAME_SYRUP_MELON,NAME_CRASHEDICE_MELON,NAME_CRASHEDICE_MILK_MELON,NAME_SUGAR_WATER_MELON,NAME_ICECANDY_MELON,	new ResourceLocation("mfm:textures/entity/crashedice_mellon.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_mellon.png")),
		SYRUP_PUMPKIN   (21,    "pumpkin",                      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Blocks.PUMPKIN,1)},	NAME_SYRUP_PUMPKIN,NAME_CRASHEDICE_PUMPKIN,NAME_CRASHEDICE_MILK_PUMPKIN,NAME_SUGAR_WATER_PUMPKIN,NAME_ICECANDY_PUMPKIN,	new ResourceLocation("mfm:textures/entity/crashedice_pumpkin.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_pumpkin.png")),
		SYRUP_GREENTEA  (22,    "greentea",                     new EffectInstance[] {}, new ItemStack[]{new ItemStack(ItemCore.item_greendust,1)},	NAME_SYRUP_GREENTEA,NAME_CRASHEDICE_GREENTEA,NAME_CRASHEDICE_MILK_GREENTEA,NAME_SUGAR_WATER_GREENTEA,NAME_ICECANDY_GREENTEA,	new ResourceLocation("mfm:textures/entity/crashedice_greentea.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_greentea.png")),
		SYRUP_INK_SAC   (23,    "inc_sac",                      new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.INK_SAC,1)},	NAME_SYRUP_INK_SAC,NAME_CRASHEDICE_INK_SAC,NAME_CRASHEDICE_MILK_INK_SAC,NAME_SUGAR_WATER_INK_SAC,NAME_ICECANDY_INK_SAC,	new ResourceLocation("mfm:textures/entity/crashedice_ink_sac.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_ink_sac.png")),
		SYRUP_COCOA     (24,    "cocoa",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.COCOA_BEANS,1)},	NAME_SYRUP_COCOA,NAME_CRASHEDICE_COCOA,NAME_CRASHEDICE_MILK_COCOA,NAME_SUGAR_WATER_COCOA,NAME_ICECANDY_COCOA,	new ResourceLocation("mfm:textures/entity/crashedice_cocoa.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_cocoa.png")),
		SYRUP_BERRY     (25,    "berry",                        new EffectInstance[] {}, new ItemStack[]{new ItemStack(Items.SWEET_BERRIES,1)},	NAME_SYRUP_BERRY,NAME_CRASHEDICE_BERRY,NAME_CRASHEDICE_MILK_BERRY,NAME_SUGAR_WATER_BERRY,NAME_ICECANDY_BERRY,	new ResourceLocation("mfm:textures/entity/crashedice_berry.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_berry.png")),
		SYRUP_KELP      (26,    "kelp",                         new EffectInstance[] {new EffectInstance(Effects.WATER_BREATHING, 1200, 1)}, new ItemStack[]{new ItemStack(ItemCore.item_kelpdust,1)},	NAME_SYRUP_KELP,NAME_CRASHEDICE_KELP,NAME_CRASHEDICE_MILK_KELP,NAME_SUGAR_WATER_KELP,NAME_ICECANDY_KELP,	new ResourceLocation("mfm:textures/entity/crashedice_kelp.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_kelp.png")),
		SYRUP_GOLDAPPLE (27,    "goldapple",                    new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 100, 1), new EffectInstance(Effects.ABSORPTION, 2400, 0)},new ItemStack[]{new ItemStack(Items.GOLDEN_APPLE,1)},	NAME_SYRUP_GOLDAPPLE,NAME_CRASHEDICE_GOLDAPPLE,NAME_CRASHEDICE_MILK_GOLDAPPLE,NAME_SUGAR_WATER_GOLDAPPLE,NAME_ICECANDY_GOLDAPPLE,	new ResourceLocation("mfm:textures/entity/crashedice_goldapple.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_goldapple.png")),
		SYRUP_GOLDAPPLEENC (28, "goldappleenc",                 new EffectInstance[] {new EffectInstance(Effects.REGENERATION, 400, 1), new EffectInstance(Effects.RESISTANCE, 6000, 0), new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), new EffectInstance(Effects.ABSORPTION, 2400, 3)},new ItemStack[]{new ItemStack(Items.ENCHANTED_GOLDEN_APPLE,1)},	NAME_SYRUP_GOLDAPPLEENC,NAME_CRASHEDICE_GOLDAPPLEENC,NAME_CRASHEDICE_MILK_GOLDAPPLEENC,NAME_SUGAR_WATER_GOLDAPPLEENC,NAME_ICECANDY_GOLDAPPLEENC,	new ResourceLocation("mfm:textures/entity/crashedice_goldappleenc.png"),	new ResourceLocation("mfm:textures/entity/crashedice_millk_goldappleenc.png"));

		private int index;
		private int damage;
		private String flavor;
		private EffectInstance[] effects;
		private ItemStack[] baseItem;
		private String syrup;
		private String crushice;
		private String milkcrushice;
		private String sugarwater;
		private String icecandy;
		private ResourceLocation tex_crushice;
		private ResourceLocation tex_milkcrushice;

		private EnumFlapeSyrup(int idx,String name, EffectInstance[] effect, ItemStack[] item, String item1, String item2, String item3, String item4, String item5, ResourceLocation tex1, ResourceLocation tex2){
			index = idx;
			damage = idx;
			flavor = name;
			effects = effect;
			baseItem = item;
			syrup = item1;
			crushice = item2;
			milkcrushice=item3;
			sugarwater=item4;
			icecandy=item5;
			tex_crushice=tex1;
			tex_milkcrushice=tex2;
		}

		public static final EnumFlapeSyrup[] values = {SYRUP_NONE,SYRUP_SUGAR,SYRUP_BLACK,SYRUP_RED,SYRUP_GREEN,
				SYRUP_BROWN,SYRUP_BLUE,SYRUP_PURPLE,SYRUP_CYAN,SYRUP_SILVER,SYRUP_GRAY,SYRUP_PINK,SYRUP_LIME,SYRUP_YELLOW,
				SYRUP_LIGHT_BLUE,SYRUP_MAGENTA,SYRUP_ORANGE,SYRUP_WHITE,SYRUP_APPLE,SYRUP_CACTUS,SYRUP_MELON,SYRUP_PUMPKIN,SYRUP_GREENTEA,
				SYRUP_INK_SAC,SYRUP_COCOA,SYRUP_BERRY,SYRUP_KELP,SYRUP_GOLDAPPLE,SYRUP_GOLDAPPLEENC};

		public int getIndex(){return this.index;}
		public int getDamage(){return this.damage;}
		public String getFlavor(){return this.flavor;}
		public ItemStack[] getBaseItem(){return baseItem;}
		public static EnumFlapeSyrup getValue(int index){return values[index];}

		public Item getSyrup(){return ItemCore.itemMap.get(syrup);}
		public Item getCrushIce(){return ItemCore.itemMap.get(crushice);}
		public Item getMilkCrushIce(){return ItemCore.itemMap.get(milkcrushice);}
		public Item getSugerWater(){return ItemCore.itemMap.get(sugarwater);}
		public Item getIceCandy(){return ItemCore.itemMap.get(icecandy);}
		public ResourceLocation getCrushIceTexture(){return tex_crushice;}
		public ResourceLocation getMilkCrushIceTexture(){return tex_milkcrushice;}
		public EffectInstance[] getEffects() {return effects;}
	}

	public static enum EnumFlowerHalb{
		DANDELION(0,0,"dandelion",new Effect[]{Effects.UNLUCK}, ItemCore.item_flowerdust_dandelion, ItemCore.item_flowertea_dandelion),
		POPY(1,1,"popy",new Effect[]{Effects.NAUSEA}, ItemCore.item_flowerdust_popy, ItemCore.item_flowertea_popy),
		ORCHID(2,2,"orchid",new Effect[]{Effects.POISON}, 300, 0, ItemCore.item_flowerdust_orchid, ItemCore.item_flowertea_orchid,false),
		ALLIUM(3,3,"allium",new Effect[]{Effects.POISON},ItemCore.item_flowerdust_allium, ItemCore.item_flowertea_allium),
		AZUREBLUET(4,4,"azurebluet",new Effect[]{Effects.WITHER},ItemCore.item_flowerdust_azurebluet, ItemCore.item_flowertea_azurebluet),
		TULIP(5,5,"tulip",new Effect[]{Effects.SLOWNESS},ItemCore.item_flowerdust_tulip, ItemCore.item_flowertea_tulip),
		OXEYDAISY(6,6,"oxeydaisy",new Effect[]{Effects.HUNGER},ItemCore.item_flowerdust_oxeydaisy, ItemCore.item_flowertea_oxeydaisy),
		SUNFLOWER(7,7,"sunflower",new Effect[]{Effects.BLINDNESS},ItemCore.item_flowerdust_sunflower, ItemCore.item_flowertea_sunflower),
		LILAC(8,8,"lilac",new Effect[]{Effects.MINING_FATIGUE},ItemCore.item_flowerdust_lilac, ItemCore.item_flowertea_lilac),
		ROSE(9,9,"rose",new Effect[]{Effects.WEAKNESS},ItemCore.item_flowerdust_rose, ItemCore.item_flowertea_rose),
		PEONY(10,10,"peony",new Effect[]{null},ItemCore.item_flowerdust_peony, ItemCore.item_flowertea_peony),
		PANACEA(11,11,"panacea",new Effect[]{Effects.BLINDNESS,Effects.NAUSEA,Effects.MINING_FATIGUE,
				Effects.HUNGER,Effects.SLOWNESS,Effects.UNLUCK,Effects.WEAKNESS,Effects.WITHER},ItemCore.item_flowerdust_panacea, ItemCore.item_flowertea_panacea),
		LILY(12,12,"lily",new Effect[]{Effects.BAD_OMEN},ItemCore.item_flowerdust_lily, ItemCore.item_flowertea_lily),
		CORN(13,13,"corn",new Effect[]{Effects.POISON},300, 0,ItemCore.item_flowerdust_corm, ItemCore.item_flowertea_corm,false),
		WITHERROSE(14,15,"witherrose",new Effect[]{Effects.WITHER}, ItemCore.item_flowerdust_witherrose, ItemCore.item_flowertea_witherrose),
		CORAL(15,15,"coral", new Effect[] {Effects.WATER_BREATHING},1200, 0,ItemCore.item_flowerdust_coral, ItemCore.item_flowerdust_coral,false);


		private int index;
		private int damage;
		private String flavor;
		private Effect[] effect;
		private boolean isClean;
		private Item dust;
		private Item tea;
		private int time;
		private int level;

		private EnumFlowerHalb(int idx, int dmg, String flv, Effect[] effect, Item item1, Item item2){
			this.index = idx;
			this.damage = dmg;
			this.flavor = flv;
			this.effect = effect;
			this.isClean = true;
			dust = item1;
			tea = item2;
		}

		private EnumFlowerHalb(int idx, int dmg, String flv, Effect[] effect, int time, int level, Item item1, Item item2, boolean clean){
			this.index = idx;
			this.damage = dmg;
			this.flavor = flv;
			this.effect = effect;
			this.isClean = clean;
			this.time = time;
			this.level = level;
			dust = item1;
			tea = item2;
		}

		public static final EnumFlowerHalb[] values = {DANDELION,POPY,ORCHID,ALLIUM,AZUREBLUET,TULIP,OXEYDAISY,SUNFLOWER,LILAC,ROSE,PEONY,PANACEA,CORN,WITHERROSE};

		public int getIndex(){return this.index;}
		public int getDamage(){return this.damage;}
		public String getFlavor(){return this.flavor;}
		public Effect[] getPotion(){return effect;}
		public boolean isClean(){return isClean;}
		public static EnumFlowerHalb getValue(int index){return values[index];}

		public Item getDust() {return dust;}
		public Item getTea() {return tea;}

		public int getItem() {return time;}
		public int getLevel() {return level;}
	}
}
