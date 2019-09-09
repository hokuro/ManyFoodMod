package mod.mfm.recipie;

import mod.mfm.block.BlockCore;
import mod.mfm.item.ItemCore;
import mod.mfm.item.ItemCore.EnumFlapeSyrup;
import mod.mfm.item.ItemCore.EnumIceFlavor;
import mod.mfm.util.ModUtil;
import mod.mfm.util.ModUtil.CompaierLevel;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.PotionUtils;
import net.minecraft.potion.Potions;

public class CookingMenu extends OriginalMenu {
	private static final OriginalMenuKind kind = OriginalMenuKind.COOKING;
	private static CookingMenu instance;
	private boolean isTopping = false;
	private ItemStack[] topping;

	protected CookingMenu(){
    	instance = null;
    }

	public CookingMenu(ItemStack result, ItemStack[] ings) {
		super(result, ings);
		isTopping = false;
		topping = new ItemStack[0];
	}

	public CookingMenu(ItemStack result, ItemStack[] ings, ItemStack[] add ) {
		super(result, ings);
		isTopping = true;
		topping = add.clone();
	}

    public static CookingMenu getInstance(){
        if(instance == null){
        	instance = new CookingMenu();
        }
        return instance;
    }


	@Override
	public OriginalMenuKind getKind(){
		return kind;
	}

	@Override
	public boolean checkServe(ItemStack[] ings){

		ItemStack[] ing = new ItemStack[OriginalMenuKind.COOKING.getLength()-1];
		for (int i = 0; i < OriginalMenuKind.COOKING.getLength()-1; i++){
			ing[i] = ings[i];
		}

		boolean check = false;
		check = super.checkServe(ings);

		if (check && this.isTopping){
			check = false;
			for (ItemStack item : topping){
				if (ModUtil.compareItemStacks(ings[OriginalMenuKind.COOKING.getLength()-1], item, CompaierLevel.LEVEL_EQUAL_ITEM)&&
						ings[OriginalMenuKind.COOKING.getLength()-1].getCount() >= item.getCount()){
					check = true;
					break;
				}
			}
		}
		return check;
	}

	@Override
	public boolean checkServe(IInventory inv){
		ItemStack[] ings = new ItemStack[OriginalMenuKind.COOKING.getLength()];
		ItemStack add;
		for (int i = 0; i < OriginalMenuKind.COOKING.getLength(); i++){
			ings[i] = inv.getStackInSlot(i);
		}
		return checkServe(ings);
	}

	public boolean isTopping(){
		return this.isTopping;
	}

	public int getToppingCount(){
		return this.topping.length;
	}

	public ItemStack[] getToppings(){
		return this.topping.clone();
	}

	public ItemStack getTopping(int index){
		if (index < topping.length){
			return topping[index];
		}
		return ItemStack.EMPTY;
	}

	@Override
    public void makeMenu(){
		// パイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_hallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				}));
		// チョコパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_chocohallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_choco,2)
				}));
		// サラダパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_saladahallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.POTATO,2),
						new ItemStack(Items.CARROT,2),
						new ItemStack(Items.BEETROOT,2)
				}));
		// ミートパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_meethallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.BEEF,1),
						new ItemStack(Items.CHICKEN,1),
						new ItemStack(Items.PORKCHOP,1),
						new ItemStack(Items.MUTTON,1),
						new ItemStack(Items.RABBIT,1),
						new ItemStack(ItemCore.meet_wolf,1),
						new ItemStack(ItemCore.meet_cat,1),
						new ItemStack(ItemCore.meet_horse,1),
						new ItemStack(ItemCore.meet_llamas,1),
						new ItemStack(ItemCore.meet_bear,1),
						new ItemStack(ItemCore.meet_fox,1),
						new ItemStack(ItemCore.meet_dolphin,1),
						new ItemStack(ItemCore.raw_turtle,1),
						new ItemStack(ItemCore.raw_flesh,1)
				}));
		// スタゲイジーパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_fishhallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.COD,1),
						new ItemStack(Items.TROPICAL_FISH,1),
						new ItemStack(Items.PUFFERFISH,1),
						new ItemStack(Items.SALMON,1),
						new ItemStack(ItemCore.raw_squid,1)
				}));
		// かぼちゃパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_pumpkinhallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Blocks.PUMPKIN,1),
						new ItemStack(Blocks.CARVED_PUMPKIN,1)
				}));
		// リンゴパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_applehallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.APPLE,4)
				}));
		// イカ墨パイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_blackhallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.INK_SAC,4)
				}));
		// 腐ったパイ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_zombihallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.ROTTEN_FLESH,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_berryhallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.SWEET_BERRIES,2)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_kelphallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_kelpdust,4)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_goldapplehallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.GOLDEN_APPLE,4)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_goldappleenchallpie,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,1),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.ENCHANTED_GOLDEN_APPLE,4)
				}));


		// キャラメルパイ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_caramelpie_hall,1),
				new ItemStack[]{
						new ItemStack(BlockCore.block_pie_hall,1)
				},
				new ItemStack[]{new ItemStack(ItemCore.item_caramel,2)}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecepie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_pie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecechocopie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_chocopie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecesaladapie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_salada_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecemeetpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_meetpie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecefishpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_fishpie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecepumpukinpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_pumpkinpie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecezombipie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_zombipei_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pieceapplepie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_applepie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pieceblackpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_black_pie,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piececaramelpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_caramelpie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pieceberrypie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_berrypie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecekelppie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_kelppie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecegoldapplepie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_goldapplepie_hall,1)
				},
				new ItemStack[]{}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_piecegoldappleencpie,7),
				new ItemStack[]{
						new ItemStack(BlockCore.block_goldappleencpie_hall,1)
				},
				new ItemStack[]{}));

		// チョコケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_choco_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_choco,2)
				}));

		// リンゴケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_apple_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.APPLE,4)
				}));

		// 野菜ケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_salada_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.POTATO,1),
						new ItemStack(Items.CARROT,1),
						new ItemStack(Items.BEETROOT,1)
				}));

		// スイカケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_mellon_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.MELON_SLICE,4),
						new ItemStack(Blocks.MELON,1)
				}));

		// パンプキンケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_pumpkin_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Blocks.PUMPKIN,1),
						new ItemStack(Blocks.CARVED_PUMPKIN,1)
				}));

		// レアチーズケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_reacheese_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(BlockCore.block_cheese,1)
				}));

		// イカ墨ケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_black_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.INK_SAC,4)
				}));

		// 腐ったケーキ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_zombi_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.ROTTEN_FLESH,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_berry_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.SWEET_BERRIES,4)
				}));

		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_goldapple_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.GOLDEN_APPLE,4)
				}));

		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_goldappleenc_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(Items.ENCHANTED_GOLDEN_APPLE,4)
				}));

		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_kelp_cake,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_butter,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.EGG,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_kelpdust,4)
				}));

		// ピザ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_pizza,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(BlockCore.block_cheese,1)
				},
				new ItemStack[]{
						ItemStack.EMPTY
				}));

		// 肉ピザ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_meetpizza,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(BlockCore.block_cheese,1)
				},
				new ItemStack[]{
						new ItemStack(Items.BEEF,1),
						new ItemStack(Items.CHICKEN,1),
						new ItemStack(Items.PORKCHOP,1),
						new ItemStack(Items.MUTTON,1),
						new ItemStack(Items.RABBIT,1),
						new ItemStack(Items.BEEF,1),
						new ItemStack(Items.CHICKEN,1),
						new ItemStack(Items.PORKCHOP,1),
						new ItemStack(Items.MUTTON,1),
						new ItemStack(Items.RABBIT,1),
						new ItemStack(ItemCore.meet_wolf,1),
						new ItemStack(ItemCore.meet_cat,1),
						new ItemStack(ItemCore.meet_horse,1),
						new ItemStack(ItemCore.meet_llamas,1),
						new ItemStack(ItemCore.meet_bear,1),
						new ItemStack(ItemCore.meet_fox,1),
						new ItemStack(ItemCore.meet_dolphin,1),
						new ItemStack(ItemCore.raw_turtle,1),
						new ItemStack(ItemCore.raw_flesh,1)
				}));

		// アンチョビピザ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_raw_fishpizza,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(BlockCore.block_cheese,1)
				},
				new ItemStack[]{
						new ItemStack(Items.COD,1),
						new ItemStack(Items.TROPICAL_FISH,1),
						new ItemStack(Items.PUFFERFISH,1),
						new ItemStack(Items.SALMON,1),
						new ItemStack(ItemCore.raw_squid,1)
				}));

		// チーズ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_cheese,1),
				new ItemStack[]{
						new ItemStack(Items.MILK_BUCKET,1),
						new ItemStack(ItemCore.item_rennet,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_mold,1)
				}));

		// ブルーチーズ
		registerMenu(new CookingMenu(new ItemStack(BlockCore.block_bluecheese,1),
				new ItemStack[]{
						new ItemStack(Items.MILK_BUCKET,1),
						new ItemStack(ItemCore.item_rennet,1)
				},
				new ItemStack[]{
						new ItemStack(ItemCore.item_bluemold,1)
				}));




		// アイスクリームの素
		for(EnumIceFlavor flavor : EnumIceFlavor.values()) {
			if (flavor.getIcemix() != null) {
				registerMenu(new CookingMenu(new ItemStack(flavor.getIcemix(),1),
						new ItemStack[]{
								new ItemStack(Items.EGG,3),
								new ItemStack(Items.MILK_BUCKET,1),
								new ItemStack(Items.SUGAR,2),
								new ItemStack(Items.GLASS_BOTTLE,1)
						},
						flavor.getBaseItem()
						));
			}
		}

		// シロップ
		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getSyrup(),1),
						new ItemStack[]{
								PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
								new ItemStack(Items.SUGAR,2)
						},
						syrup.getBaseItem()
						));
			}
		}

		// シロップかけかき氷
		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getCrushIce() != null || syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getCrushIce(),1),
						new ItemStack[]{
								new ItemStack(ItemCore.item_crashedice_none,1),
								new ItemStack(syrup.getSyrup(),1)
						}
						));
			}
		}

		// 練乳掛けかき氷
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_crashedice_milk_none,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_crashedice_none,1),
						new ItemStack(ItemCore.item_syrupmilk,1)
				}
				));
		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getMilkCrushIce() != null || syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getMilkCrushIce(),1),
						new ItemStack[]{
								new ItemStack(ItemCore.item_crashedice_none,1),
								new ItemStack(syrup.getSyrup(),1),
								new ItemStack(ItemCore.item_syrupmilk,1)
						}
						));
			}
		}

		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getMilkCrushIce() != null || syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getMilkCrushIce(),1),
						new ItemStack[]{
								new ItemStack(syrup.getCrushIce(),1),
								new ItemStack(ItemCore.item_syrupmilk,1)
						}
						));
			}
		}


		// 練乳シロップかき氷(練乳→シロップ)
		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getMilkCrushIce() != null || syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getMilkCrushIce(),1),
						new ItemStack[]{
								new ItemStack(ItemCore.item_crashedice_milk_none,1),
								new ItemStack(syrup.getSyrup(),1)
						}
						));
			}
		}

		// アイスキャンディの素
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_icecandy_none,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						new ItemStack(Items.STICK,1)
				},
				EnumFlapeSyrup.SYRUP_NONE.getBaseItem()
				));

		for(EnumFlapeSyrup syrup : EnumFlapeSyrup.values) {
			if (syrup.getSugerWater() != null || syrup.getSyrup() != null) {
				registerMenu(new CookingMenu(new ItemStack(syrup.getSugerWater(),1),
						new ItemStack[]{
								new ItemStack(Items.SUGAR,2),
								new ItemStack(Items.STICK,1)
						}
						));
			}
		}

		// チョコ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_choco,1),
				new ItemStack[]{
						new ItemStack(Items.COCOA_BEANS,3),
						new ItemStack(Items.SUGAR,1)
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// ホワイトチョコ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_whitechoco,1),
				new ItemStack[]{
						new ItemStack(Items.COCOA_BEANS,3),
						new ItemStack(Items.SUGAR,1)
						},
				new ItemStack[]{
						new ItemStack(Items.MILK_BUCKET,1)
				}));
		// プリン
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pudding,4),
				new ItemStack[]{
						new ItemStack(Items.EGG,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.MILK_BUCKET,1),
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// かぼちゃプリン
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pumpkinpudding,4),
				new ItemStack[]{
						new ItemStack(Items.EGG,3),
						new ItemStack(Items.SUGAR,2),
						new ItemStack(Items.MILK_BUCKET,1),
						},
				new ItemStack[]{
						new ItemStack(Blocks.PUMPKIN,1)
				}));
		// ポテトサラダ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_potatosalada,1),
				new ItemStack[]{
						new ItemStack(Items.POTATO,3),
						new ItemStack(Items.CARROT,1),
						new ItemStack(Items.COOKED_PORKCHOP,1),
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// カボチャサラダ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pumpkinsalada,1),
				new ItemStack[]{
						new ItemStack(Blocks.PUMPKIN,1),
						new ItemStack(Items.CARROT,1),
						new ItemStack(Items.COOKED_PORKCHOP,1),
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// たまごサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_eggsandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(Items.EGG,1),
				}));
		// ポテトサラダサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_potatsaladasandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_potatosalada,1),
				}));
		// ハムサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_hamsandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(Items.COOKED_PORKCHOP,1),
				}));
		// ジンギスカンサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_muttonsandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(Items.COOKED_MUTTON,1),
				}));
		// ステーキサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_stakesandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(Items.COOKED_BEEF,1),
				}));
		// 照り焼きサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_chikensandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(Items.COOKED_CHICKEN,1),
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_rabitsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(Items.COOKED_RABBIT,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_wolfsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_wolf,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_catsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_cat,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_bearsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_bear,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_horsesandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_horse,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_llamassandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_llamas,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_foxsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_fox,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_dolphinsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_dolphin,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_fleshsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_flesh,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_zombiesandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_rotten_flesh,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_turtlesandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_turtle,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_codsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(Items.COOKED_COD,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_salmonsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(Items.COOKED_SALMON,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_clownsandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_clown,1),
		}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_puffersandwich,3),
		new ItemStack[]{
				new ItemStack(Items.BREAD,2),
				new ItemStack(ItemCore.item_butter,1),
				},
		new ItemStack[]{
				new ItemStack(ItemCore.cooked_puffer,1),
		}));


		// チョコサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_chocosandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_choco,1),
				}));
		// カボチャサンド
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pumpkinsaladasandwich,3),
				new ItemStack[]{
						new ItemStack(Items.BREAD,2),
						new ItemStack(ItemCore.item_butter,1),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_pumpkinsalada,1),
				}));
		// バター
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_butter,3),
				new ItemStack[]{
						new ItemStack(Items.MILK_BUCKET,1),
						new ItemStack(ItemCore.item_salt,1),
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// 白カビ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_mold,4),
				new ItemStack[]{
						new ItemStack(Items.ROTTEN_FLESH,1)
						},
				new ItemStack[]{
						new ItemStack(Items.BONE_MEAL,1)
				}));

		// アオカビ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_bluemold,4),
				new ItemStack[]{
						new ItemStack(Items.ROTTEN_FLESH,1)
						},
				new ItemStack[]{
						new ItemStack(Items.LAPIS_LAZULI,1)
				}));

		// うどん
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_udon,4),
				new ItemStack[]{
						new ItemStack(Items.WATER_BUCKET,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(ItemCore.item_salt,1)
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));

		// パスタ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_pasta,4),
				new ItemStack[]{
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(ItemCore.item_salt,1)
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// ラーメン
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_ramen,4),
				new ItemStack[]{
						new ItemStack(Items.WATER_BUCKET,1),
						new ItemStack(ItemCore.item_flour,3),
						new ItemStack(ItemCore.item_salt,1)
						},
				new ItemStack[]{
						new ItemStack(Items.EGG,1)
				}));
		// ミートパスタ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_meetpasta,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_pasta,1),
						new ItemStack(Items.BOWL,1)
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_millbeef,1),
						new ItemStack(ItemCore.item_millpoke,1),
						new ItemStack(ItemCore.item_millmutton,1),
						new ItemStack(ItemCore.item_millchikin,1),
						new ItemStack(ItemCore.item_millwolf,1),
						new ItemStack(ItemCore.item_millcat,1),
						new ItemStack(ItemCore.item_millhorse,1),
						new ItemStack(ItemCore.item_millllamas,1),
						new ItemStack(ItemCore.item_millbear,1),
						new ItemStack(ItemCore.item_millfox,1),
						new ItemStack(ItemCore.item_milldolphin,1),
						new ItemStack(ItemCore.item_millturtle,1),
						new ItemStack(ItemCore.item_millflesh,1)
				}));
		// フィッシュパスタ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_fishpasta,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_pasta,1),
						new ItemStack(Items.BOWL,1)
						},
				new ItemStack[]{
						new ItemStack(Items.COD,1),
						new ItemStack(Items.TROPICAL_FISH,1),
						new ItemStack(Items.PUFFERFISH,1),
						new ItemStack(Items.SALMON,1),
						new ItemStack(ItemCore.raw_squid,1),
						new ItemStack(ItemCore.item_millcod),
						new ItemStack(ItemCore.item_millsalmon),
						new ItemStack(ItemCore.item_millclown),
						new ItemStack(ItemCore.item_millpuffer),
						new ItemStack(ItemCore.item_millsquid)
				}));
		// イカ墨パスタ
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_blackpasta,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_pasta,1),
						new ItemStack(Items.BOWL,1)
						},
				new ItemStack[]{
						new ItemStack(Items.INK_SAC,1)
				}));
		// ざるうどん
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_zaruudon,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_udon,1),
						new ItemStack(Items.BOWL,1)
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// かけうどん
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_kakeudon,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_udon,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						ItemStack.EMPTY
				}));
		// 月見うどん
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_tsukimiuudon,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_udon,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						new ItemStack(Items.EGG,1)
				}));
		// 肉うどん
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_nikuudon,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_udon,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						new ItemStack(Items.BEEF,1),
						new ItemStack(Items.PORKCHOP,1),
						new ItemStack(Items.MUSHROOM_STEW,1),
						new ItemStack(Items.CHEST_MINECART,1),
						new ItemStack(ItemCore.meet_wolf,1),
						new ItemStack(ItemCore.meet_cat,1),
						new ItemStack(ItemCore.meet_horse,1),
						new ItemStack(ItemCore.meet_llamas,1),
						new ItemStack(ItemCore.meet_bear,1),
						new ItemStack(ItemCore.meet_fox,1),
						new ItemStack(ItemCore.meet_dolphin,1),
						new ItemStack(ItemCore.raw_turtle,1),
						new ItemStack(ItemCore.raw_flesh,1),
						new ItemStack(ItemCore.item_millbeef,1),
						new ItemStack(ItemCore.item_millpoke,1),
						new ItemStack(ItemCore.item_millmutton,1),
						new ItemStack(ItemCore.item_millchikin,1),
						new ItemStack(ItemCore.item_millwolf,1),
						new ItemStack(ItemCore.item_millcat,1),
						new ItemStack(ItemCore.item_millhorse,1),
						new ItemStack(ItemCore.item_millllamas,1),
						new ItemStack(ItemCore.item_millbear,1),
						new ItemStack(ItemCore.item_millfox,1),
						new ItemStack(ItemCore.item_milldolphin,1),
						new ItemStack(ItemCore.item_millturtle,1),
						new ItemStack(ItemCore.item_millflesh,1)
				}));
		// チャーシュー麺
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_meetramen,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_ramen,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						new ItemStack(Items.BEEF,1),
						new ItemStack(Items.PORKCHOP,1),
						new ItemStack(Items.MUSHROOM_STEW,1),
						new ItemStack(Items.CHEST_MINECART,1),
						new ItemStack(ItemCore.meet_wolf,1),
						new ItemStack(ItemCore.meet_cat,1),
						new ItemStack(ItemCore.meet_horse,1),
						new ItemStack(ItemCore.meet_llamas,1),
						new ItemStack(ItemCore.meet_bear,1),
						new ItemStack(ItemCore.meet_fox,1),
						new ItemStack(ItemCore.meet_dolphin,1),
						new ItemStack(ItemCore.raw_turtle,1),
						new ItemStack(ItemCore.raw_flesh,1),
						new ItemStack(ItemCore.item_millbeef,1),
						new ItemStack(ItemCore.item_millpoke,1),
						new ItemStack(ItemCore.item_millmutton,1),
						new ItemStack(ItemCore.item_millchikin,1),
						new ItemStack(ItemCore.item_millwolf,1),
						new ItemStack(ItemCore.item_millcat,1),
						new ItemStack(ItemCore.item_millhorse,1),
						new ItemStack(ItemCore.item_millllamas,1),
						new ItemStack(ItemCore.item_millbear,1),
						new ItemStack(ItemCore.item_millfox,1),
						new ItemStack(ItemCore.item_milldolphin,1),
						new ItemStack(ItemCore.item_millturtle,1),
						new ItemStack(ItemCore.item_millflesh,1)
				}));
		// 魚介ラーメン
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_fishramen,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_ramen,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						new ItemStack(Items.COD,1),
						new ItemStack(Items.TROPICAL_FISH,1),
						new ItemStack(Items.PUFFERFISH,1),
						new ItemStack(Items.SALMON,1),
						new ItemStack(ItemCore.raw_squid,1),
						new ItemStack(ItemCore.item_millcod),
						new ItemStack(ItemCore.item_millsalmon),
						new ItemStack(ItemCore.item_millclown),
						new ItemStack(ItemCore.item_millpuffer),
						new ItemStack(ItemCore.item_millsquid)
				}));
		// 月見ラーメン
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_tsukimiramen,1),
				new ItemStack[]{
						new ItemStack(ItemCore.item_ramen,1),
						new ItemStack(Items.BOWL,1),
						new ItemStack(Items.WATER_BUCKET,1)
						},
				new ItemStack[]{
						new ItemStack(Items.EGG,1)
				}));


		// お茶
		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_dandelion,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_dandelion,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_popy,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_popy,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_orchid,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_orchid,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_allium,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_allium,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_azurebluet,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_azurebluet,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_tulip,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_tulip,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_oxeydaisy,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_oxeydaisy,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_sunflower,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_sunflower,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_lilac,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_lilac,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_rose,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_rose,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_peony,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_peony,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_corm,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_corm,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_witherrose,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_witherrose,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_coral,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_coral,1)
				}));

		registerMenu(new CookingMenu(new ItemStack(ItemCore.item_flowertea_panacea,1),
				new ItemStack[]{
						PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION,1), Potions.WATER),
						},
				new ItemStack[]{
						new ItemStack(ItemCore.item_flowerdust_panacea,1)
				}));
    }
}
