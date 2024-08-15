package agmas.org.uwucraft.mixin;


import agmas.org.uwucraft.UwUtils;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.PlayerListS2CPacket;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(PlayerListEntry.class)
public class TablistEntryMixin {


    @Shadow @Nullable private Text displayName;

    @Inject(method = "setDisplayName", at = @At("HEAD"))
    private void injected(Text displayName, CallbackInfo ci) {
        if (displayName != null)
            if (displayName.getLiteralString() != null)
                this.displayName = Text.of(UwUtils.maximumUwuify(displayName.getLiteralString()));
    }
}
