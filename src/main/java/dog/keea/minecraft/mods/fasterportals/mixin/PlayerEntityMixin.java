package dog.keea.minecraft.mods.fasterportals.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dog.keea.minecraft.mods.fasterportals.PortalGameRule;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends Entity {
    public PlayerEntityMixin(EntityType<?> type, World world) {
        super(type, world);
    }

    @Inject(method = "getMaxNetherPortalTime", at = @At("RETURN"), cancellable = true)
    public void onGetMaxNetherPortalTime(CallbackInfoReturnable<Integer> cir) {
        int max_ticks = this.world.getGameRules().getInt(PortalGameRule.NETHER_PORTAL_TICKS);
        if (cir.getReturnValue() > max_ticks) {
            cir.setReturnValue(max_ticks);
        }
    }
}
