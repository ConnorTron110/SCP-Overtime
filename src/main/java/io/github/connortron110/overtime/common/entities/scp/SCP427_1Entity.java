package io.github.connortron110.overtime.common.entities.scp;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class SCP427_1Entity extends MonsterEntity {
    public SCP427_1Entity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    public static AttributeModifierMap.MutableAttribute createMobAttributes() {
        return MonsterEntity.createLivingAttributes()
                .add(Attributes.FOLLOW_RANGE, 16D)
                .add(Attributes.MOVEMENT_SPEED, .4D)
                .add(Attributes.MAX_HEALTH, 800D)
                .add(Attributes.ARMOR, 0D)
                .add(Attributes.ATTACK_DAMAGE, 6D)
                .add(Attributes.ATTACK_KNOCKBACK, 10D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 50D);
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
