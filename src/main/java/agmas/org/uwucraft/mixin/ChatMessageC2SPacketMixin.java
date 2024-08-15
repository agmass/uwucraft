package agmas.org.uwucraft.mixin;


import agmas.org.uwucraft.UwUtils;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ClientPlayNetworkHandler.class)
public class ChatMessageC2SPacketMixin {


    @ModifyVariable(method = "sendChatMessage", at = @At("HEAD"), argsOnly = true)
    private String injected(String content) {
        return UwUtils.maximumUwuify(content);
    }

}
