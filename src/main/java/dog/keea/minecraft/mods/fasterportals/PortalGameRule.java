package dog.keea.minecraft.mods.fasterportals;

import net.minecraft.world.GameRules;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;

public class PortalGameRule {

    public static final GameRules.Key<GameRules.IntRule> NETHER_PORTAL_TICKS = GameRuleRegistry
            .register("maxPortalTicks", GameRules.Category.UPDATES, GameRuleFactory.createIntRule(10, 0));

    /**
     * Initializes the game rule. This method MUST be called before the rules are
     * accessed!
     */
    public static void init() {
        // Okay, I know it looks weird that this is an empty function, but the
        // javadoc above isn't lying! If you don't call this function, the class
        // doesn't get loaded properly, and the function registration done in
        // the static member doesn't take place properly.
    }
}