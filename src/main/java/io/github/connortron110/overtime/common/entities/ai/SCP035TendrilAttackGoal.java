package io.github.connortron110.overtime.common.entities.ai;

import io.github.connortron110.overtime.core.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.player.PlayerEntity;

public class SCP035TendrilAttackGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
    public SCP035TendrilAttackGoal(MobEntity attacker, Class<T> entityTypes) {
        super(attacker, entityTypes, 10, false, false, (entity -> {
            if (entity instanceof PlayerEntity) {
                return ((PlayerEntity) entity).inventory.armor.get(3).getItem() != ModItems.SCP035.get();
            }
            return true;
        }));
    }

    @Override
    public boolean canContinueToUse() {
        if (mob.getTarget() instanceof PlayerEntity) {
            if (((PlayerEntity) mob.getTarget()).inventory.armor.get(3).getItem() == ModItems.SCP035.get())
                return false;
        }
        return super.canContinueToUse();
    }
}
