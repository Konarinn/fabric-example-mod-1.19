package net.konari.rpgcompanions;

import net.fabricmc.api.ModInitializer;
import net.konari.rpgcompanions.item.ModItems;
import net.konari.rpgcompanions.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rpgcompanions implements ModInitializer {
	public static final String MOD_ID = "rpgcompanions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModRegistries.registerModStuffs();

	}
}
