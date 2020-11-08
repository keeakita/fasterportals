package dog.keea.minecraft.mods.fasterportals;

import net.fabricmc.api.ModInitializer;

public class FasterPortals implements ModInitializer {
    @Override
    public void onInitialize() {
        PortalGameRule.init();
    }
}
