package mod.mfm.network;

import mod.mfm.core.ModCommon;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class MessageHandler {
	private static final String PROTOCOL_VERSION = Integer.toString(1);
	private static final SimpleChannel HANDLER = NetworkRegistry.ChannelBuilder
			.named(new ResourceLocation(ModCommon.MOD_ID, ModCommon.MOD_CHANEL))
			.clientAcceptedVersions(PROTOCOL_VERSION::equals)
			.serverAcceptedVersions(PROTOCOL_VERSION::equals)
			.networkProtocolVersion(() -> PROTOCOL_VERSION)
			.simpleChannel();

	public static void register()
	{
		int disc = 0;

		HANDLER.registerMessage(disc++, MessageBurnSound.class, MessageBurnSound::encode, MessageBurnSound::decode, MessageBurnSound.Handler::handle);
		HANDLER.registerMessage(disc++, MessageToServe.class, MessageToServe::encode, MessageToServe::decode, MessageToServe.Handler::handle);
		HANDLER.registerMessage(disc++, MessageSelectMenu.class, MessageSelectMenu::encode, MessageSelectMenu::decode, MessageSelectMenu.Handler::handle);
		HANDLER.registerMessage(disc++, MessageIceCrasherUpdate.class, MessageIceCrasherUpdate::encode, MessageIceCrasherUpdate::decode, MessageIceCrasherUpdate.Handler::handle);
		HANDLER.registerMessage(disc++, MessageMillStoneUpdate.class, MessageMillStoneUpdate::encode, MessageMillStoneUpdate::decode, MessageMillStoneUpdate.Handler::handle);
		HANDLER.registerMessage(disc++, MessageFreezer.class, MessageFreezer::encode, MessageFreezer::decode, MessageFreezer.Handler::handle);
		HANDLER.registerMessage(disc++, MessageUpdateObonInventory.class, MessageUpdateObonInventory::encode, MessageUpdateObonInventory::decode, MessageUpdateObonInventory.Handler::handle);

	}

	public static void SendBurnSound(int x, int y, int z, ServerPlayerEntity pl){
		HANDLER.sendTo(new MessageBurnSound(x,y,z),pl.connection.getNetworkManager(), NetworkDirection.PLAY_TO_CLIENT);
	}


	public static void Send_MessageToServer(){
		HANDLER.sendToServer(new MessageToServe());
	}

	public static void Send_MessageSelectMenu(float scroll, int selectslot) {
		HANDLER.sendToServer(new MessageSelectMenu(scroll,selectslot));
	}

	public static boolean Send_MessageFreezer(int[] timerCnt, int timerFule, int timerIce, int tankCnt, boolean isInfinit,
			BlockPos pos) {
		try {
			HANDLER.sendToServer(new MessageFreezer(timerCnt, timerFule, timerIce, tankCnt, isInfinit, pos));
		}catch(Throwable e){

			return false;
		}
		return true;
	}

	public static boolean Send_MessageIceCrasherUpdate(int crushTime, boolean isRun, BlockPos pos) {
		try {
			HANDLER.sendToServer(new MessageIceCrasherUpdate(crushTime, isRun, pos));
		}catch(Throwable e){

			return false;
		}
		return true;
	}

	public static boolean Send_MessageMillStoneUpdate(int millTime, boolean isRun, BlockPos pos) {
		try {
			HANDLER.sendToServer(new MessageMillStoneUpdate(millTime, isRun, pos));
		}catch(Throwable e){
			return false;
		}
		return true;
	}

	public static boolean Send_MessageUpdateObonInventory(int id, ItemStack itemStack) {
		try
		{
			HANDLER.sendToServer(new MessageUpdateObonInventory(id, itemStack));
		}catch(Throwable e) {
			return false;
		}
		return true;
	}

}
