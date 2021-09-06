package io.github.connortron110.overtime.common.potions.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class UnconsciousEffect extends Effect {
    public UnconsciousEffect() {
        super(EffectType.NEUTRAL, 0x0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (!player.isCreative() && !player.isSpectator()) {
                player.startSleeping(player.blockPosition());
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
