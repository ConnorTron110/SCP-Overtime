package io.github.connortron110.overtime.mixin;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Inject(at = @At(value = "HEAD"), method = "stopSleepInBed(ZZ)V", cancellable = true)
    public void stopSleepInBed(boolean p_225652_1_, boolean p_225652_2_, CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity)((Object) this);
        if (player.hasEffect(ModEffects.UNCONSCIOUS.get()) && (!player.isCreative() || !player.isSpectator())) {
            if (!player.level.isClientSide) Overtime.LOGGER.debug("stopSleepInBed Cancelled");
            ci.cancel();
        }
    }
}
