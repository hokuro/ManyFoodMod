package mod.mfm.network;

import java.util.function.Supplier;

import mod.mfm.entity.EntityObon;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

public class MessageUpdateObonInventory {
	private int entityid;
	private ItemStack stack;
	public MessageUpdateObonInventory(int id, ItemStack update){
		entityid = id;
		stack = update;
	}

	public static void encode(MessageUpdateObonInventory pkt, PacketBuffer buf)
	{
		buf.writeInt(pkt.entityid);
		buf.writeItemStack(pkt.stack);
	}

	public static MessageUpdateObonInventory decode(PacketBuffer buf)
	{
		int id = buf.readInt();
		ItemStack stack = buf.readItemStack();
		return new MessageUpdateObonInventory(id,stack);
	}

	public static class Handler
	{
		public static void handle(final MessageUpdateObonInventory pkt, Supplier<NetworkEvent.Context> ctx)
		{
			ctx.get().enqueueWork(() -> {
				//Entity ent = ctx.get().getSender().world.getEntityByID(pkt.entityid);
				Entity ent = Minecraft.getInstance().world.getEntityByID(pkt.entityid);
				if (ent instanceof EntityObon) {
					((EntityObon)ent).setInventory(pkt.stack);
				}
			});
			ctx.get().setPacketHandled(true);
		}
	}
}
