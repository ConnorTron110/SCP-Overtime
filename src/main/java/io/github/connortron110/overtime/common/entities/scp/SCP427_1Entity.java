package io.github.connortron110.overtime.common.entities.scp;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class SCP427_1Entity extends MonsterEntity {
    public SCP427_1Entity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void registerGoals() {
        goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, true));
        goalSelector.addGoal(2, new HurtByTargetGoal(this));
        goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8D));
        goalSelector.addGoal(4, new LookRandomlyGoal(this));

        targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false));
    }
}
