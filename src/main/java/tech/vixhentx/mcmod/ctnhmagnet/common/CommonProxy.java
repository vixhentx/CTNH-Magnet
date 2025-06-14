package tech.vixhentx.mcmod.ctnhmagnet.common;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tech.vixhentx.mcmod.ctnhmagnet.registry.*;

public class CommonProxy {
    public CommonProxy(FMLJavaModLoadingContext context) {
        IEventBus eventBus = context.getModEventBus();
        eventBus.register(this);
        init();
    }
    public static void init() {
        MagnetMachines.init();
        MagnetMultiblockMachines.init();
        MagnetBlocks.init();
        MagnetItems.init();

        MagnetRegistration.REGISTRATE.registerRegistrate();
    }
}
