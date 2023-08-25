package dev.veski.fuckserverpack.mixin;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.c2s.play.ResourcePackStatusC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ResourcePackStatusC2SPacket.class)
public class SendAlwaysAsAccepted {

	/**
	 * @author veski
	 * @reason Remove server resource pack requirement
	 */
	@Overwrite()
	public void write(PacketByteBuf buf) {
		buf.writeEnumConstant(ResourcePackStatusC2SPacket.Status.ACCEPTED);
	}
}