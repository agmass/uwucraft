package agmas.org.uwucraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.message.v1.ServerMessageDecoratorEvent;
import net.minecraft.text.Text;

import java.util.concurrent.CompletableFuture;

public class Uwucraft implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerMessageDecoratorEvent.EVENT.register((s,m)->{
            return Text.of(UwUtils.maximumUwuify(   m.getString()));
        });
    }
}
