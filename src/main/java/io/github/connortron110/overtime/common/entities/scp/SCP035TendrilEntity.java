package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.common.entities.ai.SCP035TendrilAttackGoal;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class SCP035TendrilEntity extends MonsterEntity {
    public SCP035TendrilEntity(EntityType<? extends MonsterEntity> entity, World world) {
        super(entity, world);
    }

    public static AttributeModifierMap.MutableAttribute createMobAttributes() {
        return MonsterEntity.createLivingAttributes()
                .add(Attributes.FOLLOW_RANGE, 16D)
                .add(Attributes.MOVEMENT_SPEED, 0)
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.ARMOR, 0D)
                .add(Attributes.ATTACK_DAMAGE, 4D)
                .add(Attributes.ATTACK_KNOCKBACK, 2D)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1000D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));

        //this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(5, new SCP035TendrilAttackGoal<>(this, PlayerEntity.class));
    }

    @Override
    public SoundEvent getAmbientSound() {
        return ModSounds.SCP035_TENDRIL_IDLE.get();
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();
        level.playSound(null, blockPosition(), ModSounds.SCP035_TENDRIL_SPAWN.get(), SoundCategory.HOSTILE, 1, 1);
    }

    @Override
    public void baseTick() {
        super.baseTick();
        makeStuckInBlock(null, new Vector3d(0,0.5,0));
    }
}
