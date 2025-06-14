package tech.vixhentx.mcmod.ctnhmagnet.registry.registrate;

import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import org.jetbrains.annotations.NotNull;

public class MagnetRegistrate extends GTRegistrate {

    protected MagnetRegistrate(String modId) {
        super(modId);
    }
    public static @NotNull MagnetRegistrate create(@NotNull String modId) {
        return new MagnetRegistrate(modId);
    }
}
