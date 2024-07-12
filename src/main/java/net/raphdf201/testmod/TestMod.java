package net.raphdf201.testmod;

import net.fabricmc.api.ModInitializer;
import net.raphdf201.testmod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MODID = "test-mod";  // Mod ID
	public static final byte ModMaxCount = 69;      // Number of items per stack
	public static final byte TPS = 20;              // Ticks per second
	public static final Logger LOGGER = LoggerFactory.getLogger("test-mod");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		LOGGER.info("Mod " + MODID + " initialized");
	}
}
