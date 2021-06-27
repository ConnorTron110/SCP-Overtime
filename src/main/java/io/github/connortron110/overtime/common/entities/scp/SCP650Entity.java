package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.List;

//TODO Tweak this a bit as its kind broken and doesn't actually stop moving when viewed
public class SCP650Entity extends CreatureEntity {

    public SCP650Entity(EntityType<? extends CreatureEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.CACTUS) return false;
        return super.hurt(source, amount);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public void playerTouch(PlayerEntity sourceentity) {
        super.playerTouch(sourceentity);

        if (level.isClientSide) return;
        if (Math.random() < 0.07D) {
            List<LivingEntity> entities = CommonCode.getPlayersAround(blockPosition(), level, 0.25D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR);
            if (!entities.isEmpty()) {
                entities.forEach(entity -> {
                    entity.playSound(SoundEvents.AMBIENT_CAVE, 1F, 1F);
                    entity.addEffect(new EffectInstance(Effects.CONFUSION, 100));
                });
            }
        }
    }
}
