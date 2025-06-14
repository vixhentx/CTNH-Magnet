package tech.vixhentx.mcmod.ctnhmagnet.common.model;

import tech.vixhentx.mcmod.ctnhmagnet.common.model.MagnetStages.*;

public class MagnetUtils {
    public static int fastLog2(int x){
        return Integer.SIZE-1 - Integer.numberOfLeadingZeros(Math.max(x, 0));
    }
    public static int getMagVTier(int OEt){
        return Math.min(fastLog2(OEt-1) - 2, MagnetStages.Magnetometers.MAX.ordinal());
    }
}
