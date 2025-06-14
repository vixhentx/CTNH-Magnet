package tech.vixhentx.mcmod.ctnhmagnet.registry;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static tech.vixhentx.mcmod.ctnhmagnet.registry.MagnetRegistration.REGISTRATE;

public class MagnetBlocks {
    public static void init(){
    }
    public static final BlockEntry<Block> MAGNET_BLOCK = REGISTRATE.block("magnet_block",Block::new)
            .lang("Magnet Block")
            .simpleItem()
            .initialProperties(()->Blocks.IRON_BLOCK)
            .register();

}
