package net.cjsah.lobster.mathematics.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.cjsah.lobster.mathematics.block.NumberBlock;
import net.cjsah.lobster.mathematics.block.OperationBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import static net.cjsah.lobster.mathematics.Mathematics.REGISTRATE;

public class ModBlocks {
    public static final BlockEntry<NumberBlock> ZERO = REGISTRATE
        .block("zero", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> ONE = REGISTRATE
        .block("one", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> TWO = REGISTRATE
        .block("two", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> THREE = REGISTRATE
        .block("three", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> FOUR = REGISTRATE
        .block("four", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> FIVE = REGISTRATE
        .block("five", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> SIX = REGISTRATE
        .block("six", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> SEVEN = REGISTRATE
        .block("seven", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> EIGHT = REGISTRATE
        .block("eight", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<NumberBlock> NINE = REGISTRATE
        .block("nine", NumberBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<OperationBlock> ADDER = REGISTRATE
        .block("adder", OperationBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();

    public static final BlockEntry<OperationBlock> EQUALS = REGISTRATE
        .block("equals", OperationBlock::new)
        .properties(properties -> properties
            .noOcclusion()
            .strength(1.5F, 6.0F)
        )
        .initialProperties(() -> Blocks.STONE)
        .blockstate((ctx, provider) -> {
        })
        .simpleItem()
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .register();
    public static void register() {
    }
}
