package net.cjsah.lobster.mathematics.init;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.cjsah.lobster.mathematics.block.EqualsBlock;
import net.cjsah.lobster.mathematics.block.NumberBlock;
import net.cjsah.lobster.mathematics.block.OperationBlock;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;

import static net.cjsah.lobster.mathematics.Mathematics.REGISTRATE;

public class ModBlocks {

    static {
        REGISTRATE.defaultCreativeTab(ModItemGroups.MATHEMATICS_TAB.getKey());
    }

    public static final BlockEntry<NumberBlock> ZERO = REGISTRATE
        .block("zero", p -> new NumberBlock(p, 0))
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
        .block("one", p -> new NumberBlock(p, 1))
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
        .block("two", p -> new NumberBlock(p, 2))
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
        .block("three", p -> new NumberBlock(p, 3))
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
        .block("four", p -> new NumberBlock(p, 4))
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
        .block("five", p -> new NumberBlock(p, 5))
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
        .block("six", p -> new NumberBlock(p, 6))
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
        .block("seven", p -> new NumberBlock(p, 7))
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
        .block("eight", p -> new NumberBlock(p, 8))
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
        .block("nine", p -> new NumberBlock(p, 9))
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
        .block("adder", p->new OperationBlock(p,"adder"))
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

    public static final BlockEntry<EqualsBlock> EQUALS = REGISTRATE
        .block("equals", EqualsBlock::new)
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
