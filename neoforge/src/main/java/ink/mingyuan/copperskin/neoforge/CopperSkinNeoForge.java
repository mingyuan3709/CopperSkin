package ink.mingyuan.copperskin.neoforge;

import ink.mingyuan.copperskin.CopperSkin;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(CopperSkin.MODID)
public class CopperSkinNeoForge {

    public CopperSkinNeoForge(ModContainer container, IEventBus bus) {

        bus.addListener(this::setupClient);
    }

    private void setupClient(FMLClientSetupEvent event) {
        CopperSkin.initClient();
    }
}
