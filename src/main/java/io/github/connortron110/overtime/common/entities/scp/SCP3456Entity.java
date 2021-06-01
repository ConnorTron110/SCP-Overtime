package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SCP3456Entity extends MonsterEntity {

    public SCP3456Entity(EntityType<? extends MonsterEntity> type, World world) {
        super(type, world);
        xpReward = 20;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false));
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound(ModSounds.HEAVY_STEP.get(), 0.15F, 1.0F);
    }

    @Override
    public SoundEvent getAmbientSound() {
        return ModSounds.SCP3456_IDLE.get();
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ModSounds.SCP3456_HURT.get();
    }

    @Override
    public SoundEvent getDeathSound() {
        return ModSounds.SCP3456_DEATH.get();
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getDirectEntity() instanceof ArrowEntity)
            return false;
        if (source == DamageSource.FALL)
            return false;
        return super.hurt(source, amount);
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);

        if (Math.random() < 0.7D && Math.random() < 0.7D) {
            addEffect(new EffectInstance(Effects.INVISIBILITY, 120, 0, false, false));
            addEffect(new EffectInstance(Effects.WEAKNESS, 120, 255, false, false));
        }
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (isInWater()) {
            addEffect(new EffectInstance(Effects.INVISIBILITY, 120, 0, false, false));
            addEffect(new EffectInstance(Effects.WEAKNESS, 120, 255, false, false));
        }
    }
}
