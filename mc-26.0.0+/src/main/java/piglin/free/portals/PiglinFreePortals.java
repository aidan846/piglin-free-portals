package piglin.free.portals;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PiglinFreePortals implements ModInitializer {
	public static final String MOD_ID = "piglin-free-portals";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello!");
	}
}