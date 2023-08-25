package dev.veski.fuckserverpack;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuckServerPack implements ModInitializer {
	public static final String MOD_ID = "fserverpack";
    public static final Logger LOGGER = LoggerFactory.getLogger("fserverpack");

	@Override
	public void onInitialize() {
		LOGGER.info("F Server Pack Loaded");
	}
}