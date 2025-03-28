package net.cjsah.lobster.mathematics;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tterrag.registrate.Registrate;
import net.cjsah.lobster.mathematics.init.ModBlocks;
import net.cjsah.lobster.mathematics.init.ModItemGroups;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Mathematics.MOD_ID)
public class Mathematics {
    public static final String MOD_ID = "mathematics";
    public static final String MOD_NAME = "Mathematics";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    public static final Gson GSON =
        new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);

    public Mathematics(IEventBus modEventBus) {
        ModBlocks.register();
        ModItemGroups.register(modEventBus);

        LOGGER.info("Hi I'm MOE_LOBSTER");
        LOGGER.info("I↓ must↑ be→ the↓ reason↑ why→");
    }

    public static @NotNull ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
