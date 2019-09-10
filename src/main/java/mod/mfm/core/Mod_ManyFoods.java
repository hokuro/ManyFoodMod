package mod.mfm.core;

import java.util.ArrayList;
import java.util.List;

import mod.mfm.block.BlockCore;
import mod.mfm.config.ConfigValue;
import mod.mfm.entity.EntityCrashedIce;
import mod.mfm.entity.EntityIceCream;
import mod.mfm.event.EventHandler;
import mod.mfm.group.ItemGroupColdFood;
import mod.mfm.group.ItemGroupPieCakes;
import mod.mfm.gui.GuiCookingWorkBench;
import mod.mfm.gui.GuiFreezer;
import mod.mfm.gui.GuiIceCrasher;
import mod.mfm.gui.GuiMillStone;
import mod.mfm.inventory.ContainerCookingWorkBench;
import mod.mfm.inventory.ContainerFreezer;
import mod.mfm.inventory.ContainerIceCrasher;
import mod.mfm.inventory.ContainerMillStone;
import mod.mfm.item.ItemCore;
import mod.mfm.network.MessageHandler;
import mod.mfm.render.RenderCrashedIce;
import mod.mfm.render.RenderFreezer;
import mod.mfm.render.RenderIceCrasher;
import mod.mfm.render.RenderIceCream;
import mod.mfm.render.RenderMillStone;
import mod.mfm.sounds.SoundManager;
import mod.mfm.tileentity.TileEntityFreezer;
import mod.mfm.tileentity.TileEntityIceCrasher;
import mod.mfm.tileentity.TileEntityMillStone;
import mod.mfm.tileentity.TileEntitySaltPan;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;

@Mod(ModCommon.MOD_ID)
public class Mod_ManyFoods {
	// タブ
	//public static final CreativeTabMeetBlock tabMeet = new CreativeTabMeetBlock("MeetBlock");
	// マテリアル
	public static Material materialMeet;

	// グループ
	public static final ItemGroup tabColdFood = new ItemGroupColdFood("ColdFood");
	public static final ItemGroup tabPieCakes = new ItemGroupPieCakes("PieCakes");


	public static List<Enchantment> encList = new ArrayList<Enchantment>();

    public Mod_ManyFoods() {

    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    	FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(ContainerType.class, this::onContainerRegistry);
        // コンフィグ読み込み
    	ModLoadingContext.get().
        registerConfig(
        		net.minecraftforge.fml.config.ModConfig.Type.COMMON,
        		ConfigValue.spec);

    	// イベント登録
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new EventHandler());

        materialMeet= new Material(MaterialColor.WOOD, false, true, true, true, true, false, false, PushReaction.DESTROY);
    	ItemCore.init();
    	BlockCore.init();

        MessageHandler.register();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	registRender();
    	guiHandler();
    }

	@OnlyIn(Dist.CLIENT)
	public void registRender(){
		RenderingRegistry.registerEntityRenderingHandler(EntityIceCream.class, RenderIceCream::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityCrashedIce.class, RenderCrashedIce::new);

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFreezer.class, new RenderFreezer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMillStone.class, new RenderMillStone());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIceCrasher.class, new RenderIceCrasher());
	}

	@ObjectHolder(ModCommon.MOD_ID + ":" + ModCommon.MOD_GUI_ID_FREEZER)
	public static ContainerType<ContainerFreezer> CONTAINER_FREEZER;
	@ObjectHolder(ModCommon.MOD_ID + ":" + ModCommon.MOD_GUI_ID_ICECRASHER)
	public static ContainerType<ContainerIceCrasher> CONTAINER_ICECRASHER;
	@ObjectHolder(ModCommon.MOD_ID + ":" + ModCommon.MOD_GUI_ID_MILLSTONE)
	public static ContainerType<ContainerMillStone> CONTAINER_MILLSTONE;
	@ObjectHolder(ModCommon.MOD_ID + ":" + ModCommon.MOD_GUI_ID_CWORKBENCH)
	public static ContainerType<ContainerCookingWorkBench> CONTAINER_COOKINGWORKBENCH;

	@OnlyIn(Dist.CLIENT)
	public void guiHandler(){
		ScreenManager.registerFactory(CONTAINER_FREEZER, GuiFreezer::new);
		ScreenManager.registerFactory(CONTAINER_ICECRASHER, GuiIceCrasher::new);
		ScreenManager.registerFactory(CONTAINER_MILLSTONE, GuiMillStone::new);
		ScreenManager.registerFactory(CONTAINER_COOKINGWORKBENCH, GuiCookingWorkBench::new);
	}

	public void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> event) {
		event.getRegistry().register(IForgeContainerType.create((wid, playerInv, extraData)->{
			BlockPos pos = new BlockPos(extraData.readInt(), extraData.readInt(), extraData.readInt());
			TileEntity ent = playerInv.player.world.getTileEntity(pos);
			if (ent instanceof TileEntityFreezer) {
				return new ContainerFreezer(playerInv, (TileEntityFreezer)ent, wid);
			}
			return null;
		}).setRegistryName(ModCommon.MOD_GUI_ID_FREEZER));

		event.getRegistry().register(IForgeContainerType.create((wid, playerInv, extraData)->{
			BlockPos pos = new BlockPos(extraData.readInt(), extraData.readInt(), extraData.readInt());
			TileEntity ent = playerInv.player.world.getTileEntity(pos);
			if (ent instanceof TileEntityIceCrasher) {
				return new ContainerIceCrasher(playerInv, (TileEntityIceCrasher)ent, wid);
			}
			return null;
		}).setRegistryName(ModCommon.MOD_GUI_ID_ICECRASHER));

		event.getRegistry().register(IForgeContainerType.create((wid, playerInv, extraData)->{
			BlockPos pos = new BlockPos(extraData.readInt(), extraData.readInt(), extraData.readInt());
			TileEntity ent = playerInv.player.world.getTileEntity(pos);
			if (ent instanceof TileEntityMillStone) {
				return new ContainerMillStone(playerInv, (TileEntityMillStone)ent, wid);
			}
			return null;
		}).setRegistryName(ModCommon.MOD_GUI_ID_MILLSTONE));

		event.getRegistry().register(IForgeContainerType.create((wid, playerInv, extraData)->{
			return new ContainerCookingWorkBench(wid, playerInv);
		}).setRegistryName(ModCommon.MOD_GUI_ID_CWORKBENCH));
	}

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        	BlockCore.registerBlock(blockRegistryEvent);
        }

        @SubscribeEvent
        public static void onItemRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            BlockCore.registerBlockItem(itemRegistryEvent);
            ItemCore.register(itemRegistryEvent);
        }

        public static EntityType<EntityIceCream> ICECREAM;
        public static EntityType<EntityCrashedIce> CRASHEDICE;
        @SubscribeEvent
        public static void onEntityRegistry(final RegistryEvent.Register<EntityType<?>> etRegistryEvent){
        	ICECREAM = EntityType.Builder.<EntityIceCream>create(EntityClassification.MISC).
        			setTrackingRange(80).setUpdateInterval(5).setShouldReceiveVelocityUpdates(true).size(0.81F, 0.2F)
        			.setCustomClientFactory(EntityIceCream::new).build(ModCommon.MOD_ID + ":" + EntityIceCream.NAME);
        	ICECREAM.setRegistryName(new ResourceLocation(ModCommon.MOD_ID,EntityIceCream.NAME));

        	CRASHEDICE = EntityType.Builder.<EntityCrashedIce>create( EntityClassification.MISC)
        			.setTrackingRange(80).setUpdateInterval(5).setShouldReceiveVelocityUpdates(true).size(0.81F, 0.2F)
        			.setCustomClientFactory(EntityCrashedIce::new).build(ModCommon.MOD_ID + ":" + EntityCrashedIce.NAME);
        	CRASHEDICE.setRegistryName(new ResourceLocation(ModCommon.MOD_ID,EntityCrashedIce.NAME));
        	etRegistryEvent.getRegistry().registerAll(ICECREAM, CRASHEDICE);
        }

    	public static TileEntityType<?> SALTPAN;
    	public static TileEntityType<?> ICECRASHER;
    	public static TileEntityType<?> FREEZER;
    	public static TileEntityType<?> MILLSTONE;
        @SubscribeEvent
        public static void onTERegistyr(final RegistryEvent.Register<TileEntityType<?>> teRegistryEvent){
        	SALTPAN = TileEntityType.Builder.create(TileEntitySaltPan::new, BlockCore.block_saltpan).build(null);
        	SALTPAN.setRegistryName(ModCommon.MOD_ID, TileEntitySaltPan.REGISTER_NAME);
        	teRegistryEvent.getRegistry().register(SALTPAN);

        	ICECRASHER = TileEntityType.Builder.create(TileEntityIceCrasher::new,BlockCore.block_icecrasher).build(null);
        	ICECRASHER.setRegistryName(ModCommon.MOD_ID, TileEntityIceCrasher.REGISTER_NAME);
        	teRegistryEvent.getRegistry().register(ICECRASHER);

        	FREEZER = TileEntityType.Builder.create(TileEntityFreezer::new, BlockCore.block_freezer).build(null);
        	FREEZER.setRegistryName(ModCommon.MOD_ID, TileEntityFreezer.REGISTER_NAME);
        	teRegistryEvent.getRegistry().register(FREEZER);

        	MILLSTONE = TileEntityType.Builder.create(TileEntityMillStone::new, BlockCore.block_millstone).build(null);
        	MILLSTONE.setRegistryName(ModCommon.MOD_ID, TileEntityMillStone.REGISTER_NAME);
        	teRegistryEvent.getRegistry().register(MILLSTONE);

        }

        @SubscribeEvent
        public static void onSoundRegistyr(final RegistryEvent.Register<SoundEvent> teRegistryEvent){
        	teRegistryEvent.getRegistry().register(SoundManager.sound_makeflape);
        	teRegistryEvent.getRegistry().register(SoundManager.sound_mill);
        }
    }

}
