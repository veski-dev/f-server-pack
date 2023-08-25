package dev.veski.fuckserverpack.mixin;

import net.minecraft.network.packet.s2c.play.ResourcePackSendS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ResourcePackSendS2CPacket.class)
public class ShowAsNotRequiredMixin {

    /**
     * @author veski
     * @reason Show server resource pack as not required
     */
    @Overwrite()
    public boolean isRequired() {
        return false;
    }
}
