package io.github.connortron110.overtime.common.entities.scp;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
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
        BlockPos pos1 = new BlockPos(getX() - 25, getY() - 25, getZ() - 25);
        BlockPos pos2 = new BlockPos(getX() + 25, getY() + 25, getZ() + 25);
        List<LivingEntity> players = level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(pos1, pos2), EntityPredicates.NO_CREATIVE_OR_SPECTATOR);
        if (!players.isEmpty()) {
            players.parallelStream().forEach(player -> {
                //TODO Separate this into its own method as it can be utilized by a lot of SCPs
                Vector3d playerEyePos = getEyePosition(1).subtract(player.getEyePosition(1)).normalize();
                Vector3d playerLookPos = player.getViewVector(1).normalize();
                double dotProduct = playerLookPos.dot(playerEyePos);
                if (dotProduct > 0.8D) {
                    if (canSee(player)) {
                        player.addEffect(new EffectInstance(Effects.WITHER, 600, 0, false, false));
                        player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 600, 255, false, false));
                        player.addEffect(new EffectInstance(Effects.WEAKNESS, 600, 255, false, false));

                    }
                }
            });
        }
    }
}
