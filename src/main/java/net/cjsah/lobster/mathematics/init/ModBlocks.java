package net.cjsah.lobster.mathematics.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.cjsah.lobster.mathematics.block.NumberBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import static net.cjsah.lobster.mathematics.Mathematics.REGISTRATE;

public class ModBlocks {
    @SuppressWarnings("Convert2MethodRef")
    public static final BlockEntry<NumberBlock> ONE = REGISTRATE
        .block("one", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
        )
        .initialProperties(()-> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static void register() {
    }
}
