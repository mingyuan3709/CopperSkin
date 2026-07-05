package ink.mingyuan.copperskin.fabric;

import ink.mingyuan.copperskin.CopperSkin;
import net.fabricmc.api.ClientModInitializer;

public class CopperSkinFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CopperSkin.initClient();
    }
}
