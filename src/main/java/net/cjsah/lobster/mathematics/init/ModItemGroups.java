package net.cjsah.lobster.mathematics.init;

import net.cjsah.lobster.mathematics.Mathematics;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.cjsah.lobster.mathematics.Mathematics.REGISTRATE;

public class ModItemGroups {
    private static final DeferredRegister<CreativeModeTab> DF =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mathematics.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MATHEMATICS_TAB =
        DF.register("block", () -> CreativeModeTab.builder()
            .icon(ModBlocks.ADDER::asStack)
            .displayItems((ctx, entries) -> {
            })
            .title(REGISTRATE.addLang(
                "itemGroup", Mathematics.of("block"), "Mathematics:Blocks"))
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .build());

    public static void register(IEventBus modEventBus) {
        DF.register(modEventBus);
    }
}
