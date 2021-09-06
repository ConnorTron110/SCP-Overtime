package io.github.connortron110.overtime.common.entities.ai;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.EnumSet;

public class FollowTargetGoal extends Goal {

    private final MobEntity mob;
    private final double speedModifier;
    private LivingEntity target;

    public FollowTargetGoal(MobEntity mob, double speedModifier) {
        this.mob = mob;
        this.speedModifier = speedModifier;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        return mob.getTarget() != null;
    }

    @Override
    public void start() {
        target = mob.getTarget();
    }

    @Override
    public void tick() {
        this.mob.getLookControl().setLookAt(this.target, (float)(this.mob.getMaxHeadYRot() + 20), (float)this.mob.getMaxHeadXRot());
        if (this.mob.distanceToSqr(this.target) < 6.25D) {
            this.mob.getNavigation().stop();
        } else {
            this.mob.getNavigation().moveTo(this.target, this.speedModifier);
        }
    }
}
