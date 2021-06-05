package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SCP2761Entity extends MonsterEntity {

    private static final DataParameter<Boolean> SLEEPING = EntityDataManager.defineId(SCP2761Entity.class, DataSerializers.BOOLEAN);

    private MeleeAttackGoal meleeAttackGoal;
    private RandomWalkingGoal walkingGoal;
    private LookRandomlyGoal lookGoal;

    private NearestAttackableTargetGoal<PlayerEntity> targetGoal;
    private HurtByTargetGoal hurtByTargetGoal;

    public SCP2761Entity(EntityType<? extends SCP2761Entity> type, World world) {
        super(type, world);
    }

    @Override
    protected boolean shouldDropExperience() {
        return false;
    }

    @Override
    protected void registerGoals() {
        meleeAttackGoal = new MeleeAttackGoal(this, 1.2D, true);
        walkingGoal = new RandomWalkingGoal(this, 0);
        lookGoal = new LookRandomlyGoal(this);

        targetGoal = new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false);
        hurtByTargetGoal = new HurtByTargetGoal(this);
        reassessGoals();
        //this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal<>((MobEntity)this, MechaSCP2761Entity.class, false, false));
    }

    public boolean isSleeping() {
        return this.entityData.get(SLEEPING);
    }
    private void setSleeping(boolean sleeping) {
        this.entityData.set(SLEEPING, sleeping);
        reassessGoals();
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SLEEPING, false);
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putBoolean("Sleeping", this.isSleeping());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.setSleeping(nbt.getBoolean("Sleeping"));
    }

    private void reassessGoals() {
        goalSelector.removeGoal(meleeAttackGoal);
        goalSelector.removeGoal(walkingGoal);
        goalSelector.removeGoal(lookGoal);
        targetSelector.removeGoal(targetGoal);
        targetSelector.removeGoal(hurtByTargetGoal);
        if (!isSleeping()) {
            goalSelector.addGoal(1, meleeAttackGoal);
            goalSelector.addGoal(2, walkingGoal);
            goalSelector.addGoal(3, lookGoal);
            targetSelector.addGoal(1, targetGoal);
            targetSelector.addGoal(2, hurtByTargetGoal);
        }
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound(ModSounds.HEAVY_STEP.get(), 0.15F, 1.0F);
    }

    @Override
    public SoundEvent getAmbientSound() {
        //TODO Sleeping Noise?
        return ModSounds.SCP2761_IDLE.get();
    }

    @Override
    public SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.SCP2761_HURT.get();
    }

    @Override
    public SoundEvent getDeathSound() {
        return ModSounds.SCP2761_DEATH.get();
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (!level.isClientSide) setSleeping(false);
        if (source == DamageSource.CACTUS) return false;
        if (source == DamageSource.ANVIL) return false;
        if (source == DamageSource.DRAGON_BREATH) return false;
        if (Math.random() < 0.7D && Math.random() < 0.7D) {
            if (source.getEntity() != null) {
                if (source.getEntity() instanceof LivingEntity) {
                    ((LivingEntity) source.getEntity()).addEffect(new EffectInstance(Effects.POISON, 200, 0, true, true));
                    ((LivingEntity) source.getEntity()).addEffect(new EffectInstance(Effects.WITHER, 200, 0, true, true));
                }
            }
        }
        return super.hurt(source, amount);
    }

    private int ticksSinceAwake = 0;

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        if (level.isDay() && isSleeping()) {
            setSleeping(false);
            return;
        }

        if (!level.isDay() && getTarget() == null) {
            if (isSleeping()) {
                ticksSinceAwake = 0;
                return;
            }
            if (ticksSinceAwake > 400) setSleeping(true);
            else ticksSinceAwake++;
        }
    }
}
