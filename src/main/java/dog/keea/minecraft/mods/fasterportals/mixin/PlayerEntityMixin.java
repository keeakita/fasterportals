package dog.keea.minecraft.mods.fasterportals.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.player.PlayerEntity;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Inject(method = "getMaxNetherPortalTime", at = @At("RETURN"), cancellable = true)
    public void onGetMaxNetherPortalTime(CallbackInfoReturnable<Integer> cir) {
        if (cir.getReturnValue() > 20) {
            cir.setReturnValue(20);
        }
    }
}
