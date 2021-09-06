package io.github.connortron110.overtime.common.entities.ai;

import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.Goal;

import java.util.function.Function;

/**
 * Goal that gets called once with the provided function with a provided random chance
 */
public class RandomFunctionGoal extends Goal {

    private final MobEntity mob;
    private final int runChance;
    private final Function<MobEntity, Object> onRun;

    public RandomFunctionGoal(MobEntity mob, int runChance, Function<MobEntity, Object> onRun) {
        this.mob = mob;
        this.runChance = runChance;
        this.onRun = onRun;
    }

    @Override
    public void start() {
        onRun.apply(mob);
    }

    @Override
    public boolean canContinueToUse() {
        return false;
    }

    @Override
    public boolean canUse() {
        return this.mob.getRandom().nextInt(this.runChance) == 0;
    }
}
