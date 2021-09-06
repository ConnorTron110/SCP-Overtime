package io.github.connortron110.overtime.common.potions.effects;

import io.github.connortron110.overtime.core.init.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.world.GameRules;

import java.awt.*;

public class SCP966StalkingEffect extends Effect {
    public SCP966StalkingEffect() {
        super(EffectType.NEUTRAL, new Color(0xFFCE80).getRGB());
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.level.isClientSide) return;

        if (entity.getEffect(this) != null) {

            int duration = entity.getEffect(this).getDuration();

            if (duration == 1) {
                //If Daylight cycle is enabled, get time till sunrise, else effect last 2 minutes
                int sleepDuration = entity.level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).get() ? (int) (entity.level.getDayTime() % 24000) : 2400;
                entity.addEffect(new EffectInstance(ModEffects.UNCONSCIOUS.get(), sleepDuration, 0, false, false));
            }
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
