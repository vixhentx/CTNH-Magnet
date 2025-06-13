package tech.vixhentx.mcmod.ctnhmagnet;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import tech.vixhentx.mcmod.ctnhmagnet.common.CommonProxy;
import tech.vixhentx.mcmod.ctnhmagnet.client.ClientProxy;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CTNHMagnet.MODID)
public class CTNHMagnet {
    public static final String MODID = "ctnhmagnet";
    public static final String NAME = "CTNH Magnet";
    @SuppressWarnings("removal")
    public static ResourceLocation ID (String location){
        return new ResourceLocation(MODID,location);
    }
    @SuppressWarnings("removal")
    public CTNHMagnet() {
        DistExecutor.unsafeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    }

}
