package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SCP835_JPEntity extends MonsterEntity {

    public SCP835_JPEntity(EntityType<? extends SCP835_JPEntity> type, World world) {
        super(type, world);
    }

    @Override
    protected boolean shouldDropExperience() {
        return false;
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound(ModSounds.GENERIC_STEP.get(), 0.15F, 1F);
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL) return false;
        return super.hurt(source, amount);
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        level.setBlock(blockPosition(), ModBlocks.BLOOD_PUDDLE.get().defaultBlockState(), 3);
    }
}
