package net.raphdf201.testmod;

import net.fabricmc.api.ModInitializer;
import net.raphdf201.testmod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MODID = "test-mod";
	public static final byte ModMaxCount = 69;
	public static final Logger LOGGER = LoggerFactory.getLogger("test-mod");

	@Override
	public void onInitialize() {
		ModItems.initialize();
		LOGGER.info("Mod " + MODID + " initialized");
	}
}
