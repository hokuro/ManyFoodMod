package mod.mfm.network;

import java.util.function.Supplier;

import mod.mfm.inventory.ContainerCookingWorkBench;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

public class MessageToServe{
	public MessageToServe(){}

	public static void encode(MessageToServe pkt, PacketBuffer buf)
	{
	}

	public static MessageToServe decode(PacketBuffer buf)
	{
		return new MessageToServe();
	}

	public static class Handler
	{
		public static void handle(final MessageToServe pkt, Supplier<NetworkEvent.Context> ctx)
		{
			ctx.get().enqueueWork(() -> {
				PlayerEntity plyaer = ctx.get().getSender();
				if (plyaer.openContainer instanceof ContainerCookingWorkBench){
					((ContainerCookingWorkBench)plyaer.openContainer).toServe();
				}
			});
			ctx.get().setPacketHandled(true);
		}
	}
}
