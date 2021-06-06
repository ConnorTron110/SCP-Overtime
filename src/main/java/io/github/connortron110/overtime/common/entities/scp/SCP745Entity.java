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
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class SCP745Entity extends MonsterEntity {

    private static final DataParameter<Integer> COLOUR = EntityDataManager.defineId(SCP745Entity.class, DataSerializers.INT);

    public SCP745Entity(EntityType<? extends SCP745Entity> type, World world) {
        super(type, world);
        this.xpReward = 2;
    }

    @Override
    protected void registerGoals() {
        //this.goalSelector.addGoal(1, (Goal)new LookAtGoal((MobEntity)this, SCP173Entity.class, 6.0F));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(3, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(4, new FollowMobGoal(this, 1.0D, 10.0F, 5.0F));
        this.goalSelector.addGoal(5, new RandomWalkingGoal(this, 0.8D));

        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, true));
    }

    public int getVariant() {
        return MathHelper.clamp(this.entityData.get(COLOUR), 0, 3);
    }
    public void setVariant(int variant) {
        this.entityData.set(COLOUR, variant);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(COLOUR, 0);
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.setVariant(nbt.getInt("Variant"));
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound(ModSounds.GENERIC_STEP.get(), 0.15F, 1.0F);
    }

    @Override
    public SoundEvent getAmbientSound() {
        return ModSounds.SCP745_IDLE.get();
    }

    @Override
    public SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.SCP745_HURT.get();
    }

    @Override
    public SoundEvent getDeathSound() {
        return ModSounds.SCP745_DEATH.get();
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        BlockPos pos1 = new BlockPos(getX() - 4, getY() - 4, getZ() - 4);
        BlockPos pos2 = new BlockPos(getX() + 4, getY() + 4, getZ() + 4);
        List<LivingEntity> players = level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(pos1, pos2), EntityPredicates.LIVING_ENTITY_STILL_ALIVE);
        if (!players.isEmpty() && Math.random() < 0.005D) {
            addEffect(new EffectInstance(Effects.GLOWING, 60, 0, false, false));
            addEffect(new EffectInstance(Effects.GLOWING, 60, 1, false, false));
        }

        if (Math.random() < 0.007D && Math.random() < 0.07D && Math.random() < 0.7D) {
            setVariant(getRandom().nextInt(4));
        }
    }
}
