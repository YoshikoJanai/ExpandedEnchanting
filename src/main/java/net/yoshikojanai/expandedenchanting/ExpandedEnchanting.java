package net.yoshikojanai.expandedenchanting;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExpandedEnchanting implements ModInitializer {

	public static Logger logger = null;
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger = LogManager.getLogger("expandedenchanting");
		logger.info("Enchanting....expanded! (Expanded Enchanting loaded.... hopefully");
	}
}
