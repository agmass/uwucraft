package agmas.org.uwucraft.mixin;


import agmas.org.uwucraft.UwUtils;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class ChatMessageC2SPacketMixin {


    @Shadow @Nullable public abstract ServerInfo getServerInfo();

    @ModifyVariable(method = "sendChatMessage", at = @At("HEAD"), argsOnly = true)
    private String injected(String content) {
        return UwUtils.maximumUwuify(content);
    }

}
