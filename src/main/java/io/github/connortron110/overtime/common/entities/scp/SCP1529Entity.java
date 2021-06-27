package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.EntityPredicates;
import net.minecraft.world.World;

import java.util.List;

public class SCP1529Entity extends MonsterEntity {

    public SCP1529Entity(EntityType<? extends SCP1529Entity> type, World world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, true));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false));
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        List<LivingEntity> players = CommonCode.getViewingPlayers(this, 25, 0.8D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR);
        if (!players.isEmpty()) {
            players.parallelStream().forEach(player -> {
                player.addEffect(new EffectInstance(Effects.WITHER, 600, 0, false, false));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 600, 255, false, false));
                player.addEffect(new EffectInstance(Effects.WEAKNESS, 600, 255, false, false));
            });
        }
    }
}
