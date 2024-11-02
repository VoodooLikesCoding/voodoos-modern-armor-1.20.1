package net.iamvoodoo.voodoosmodernarmor;

import net.fabricmc.api.ModInitializer;

import net.iamvoodoo.voodoosmodernarmor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VoodoosModernArmor implements ModInitializer {
	public static final String MOD_ID = "voodoos-modern-armor";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}