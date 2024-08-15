package agmas.org.uwucraft.mixin;


import agmas.org.uwucraft.UwUtils;
import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.text.MutableText;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.Language;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(TranslationStorage.class)
public abstract class LanguageMixin {

    @Shadow @Final private Map<String, String> translations;

    @Inject(method = "get(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", at = @At("HEAD"), cancellable = true)
    private void injected(String key, String fallback, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue(UwUtils.uwuify(translations.getOrDefault(key, fallback)));
        cir.cancel();
    }


}
