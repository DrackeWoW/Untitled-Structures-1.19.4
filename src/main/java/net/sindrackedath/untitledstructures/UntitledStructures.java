package net.sindrackedath.untitledstructures;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UntitledStructures implements ModInitializer {
	public  static  final String MOD_ID = "untitledstructures";
	public static final Logger LOGGER = LoggerFactory.getLogger("untitledstructuresmod");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}