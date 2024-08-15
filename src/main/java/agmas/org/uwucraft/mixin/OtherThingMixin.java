package agmas.org.uwucraft.mixin;


import agmas.org.uwucraft.UwUtils;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.text.PlainTextContent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(PlainTextContent.class)
public interface OtherThingMixin {


    @Inject(method = "of", at = @At("HEAD"), cancellable = true)
    private static void injected(String string, CallbackInfoReturnable<PlainTextContent> cir) {
        cir.setReturnValue((PlainTextContent)(string.isEmpty() ? new PlainTextContent() {
            public String toString() {
                return "empty";
            }

            public String string() {
                return "";
            }
        } : new PlainTextContent.Literal(UwUtils.uwuify(string))));
        cir.cancel();
    }


}
