package io.github.connortron110.overtime.common.entities.ai;

import io.github.connortron110.overtime.core.init.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.player.PlayerEntity;

//Mostly Used the default logic from MeleeAttackGoal
public class SCP966MeleeGoal extends Goal {

    private final MobEntity mob;
    private byte ticksUntilNextAttack;

    public SCP966MeleeGoal(MobEntity mob) {
        this.mob = mob;
    }

    @Override
    public boolean canContinueToUse() {
        LivingEntity target = mob.getTarget();
        if (target == null) return false;
        else if (target.isSpectator()) return false;
        else if (target instanceof PlayerEntity && ((PlayerEntity) target).isCreative()) return false;
        return mob.getTarget().isAlive();
    }

    @Override
    public void start() {
        mob.setAggressive(true);
        ticksUntilNextAttack = 0;
    }

    @Override
    public void stop() {
        mob.setAggressive(false);
    }

    @Override
    public boolean canUse() {
        if (mob.getTarget() == null) return false;
        else return mob.getTarget().hasEffect(ModEffects.UNCONSCIOUS.get());
    }

    @Override
    public void tick() {
        LivingEntity livingentity = this.mob.getTarget();
        double distance = this.mob.distanceToSqr(livingentity.getX(), livingentity.getY(), livingentity.getZ());
        ticksUntilNextAttack = (byte) Math.max(ticksUntilNextAttack - 1, 0);
        checkAndPerformAttack(livingentity, distance);
    }

    private void checkAndPerformAttack(LivingEntity entity, double distance) {
        if (distance <= 7 && this.ticksUntilNextAttack <= 0) {
            if (entity.hasEffect(ModEffects.UNCONSCIOUS.get())) {
                this.resetAttackCooldown();
                this.mob.doHurtTarget(entity);
            }
        }
    }

    private double getAttackReachSqr(LivingEntity p_179512_1_) {
        return this.mob.getBbWidth() * 2.0F * this.mob.getBbWidth() * 2.0F + p_179512_1_.getBbWidth();
    }

    private void resetAttackCooldown() {
        ticksUntilNextAttack = 20;
    }
}
