package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.common.entities.ai.FollowTargetGoal;
import io.github.connortron110.overtime.common.entities.ai.RandomFunctionGoal;
import io.github.connortron110.overtime.common.entities.ai.SCP966MeleeGoal;
import io.github.connortron110.overtime.core.init.ModEffects;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SCP966Entity extends MonsterEntity {

    private RandomFunctionGoal firstGoal;
    private RandomFunctionGoal targetGoal;

    public SCP966Entity(EntityType<? extends SCP966Entity> type, World world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        //Might condense AI down to possibly one file
        this.firstGoal = new RandomFunctionGoal(this, 1, (entity -> {
            PlayerEntity player = entity.level.getNearestPlayer(getX(), getY(), getZ(), 20D, true);
            if (player != null) {
                setTarget(player);
                int duration = MathHelper.clamp(entity.getRandom().nextInt(24000 * 3), 24000, Integer.MAX_VALUE);
                player.addEffect(new EffectInstance(ModEffects.STALKING966.get(), duration, 0, false, false));
                playSound(ModSounds.SCP966_ECHO.get(), 1, 1);
            }
            return null;
        }));

        this.targetGoal = new RandomFunctionGoal(this, 1000, (entity -> {
            if (getTarget() == null) {
                reevaluateGoals();
            } else {


                playSound(ModSounds.SCP966_ECHO.get(), 1, 1);
                doHurtTarget(getTarget());

                int duration = 1;

                if (getTarget().hasEffect(ModEffects.STALKING966.get())) {
                    EffectInstance effectInstance = getTarget().getEffect(ModEffects.STALKING966.get());
                    duration = effectInstance.getDuration() - 40;
                    getTarget().removeEffect(ModEffects.STALKING966.get());
                }
                if (duration < 1) duration = 1;
                getTarget().addEffect(new EffectInstance(ModEffects.STALKING966.get(), duration, 0, false, false));
            }
            return null;
        }));


        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new SCP966MeleeGoal(this));
        this.goalSelector.addGoal(11, new WaterAvoidingRandomWalkingGoal(this, 0.8D, 1.0000001E-5F));
        this.goalSelector.addGoal(12, new LookAtGoal(this, PlayerEntity.class, 10F));

        this.targetSelector.addGoal(1, new FollowTargetGoal(this, 1));
        reevaluateGoals();
    }

    private void reevaluateGoals() {
        this.goalSelector.removeGoal(firstGoal);
        this.goalSelector.removeGoal(targetGoal);
        if (getTarget() == null) {
            this.goalSelector.addGoal(2, firstGoal);
        } else {
            this.goalSelector.addGoal(2, targetGoal);
        }
    }

    @Override
    public void setTarget(@Nullable LivingEntity target) {
        super.setTarget(target);
        reevaluateGoals();
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.SCP966_IDLE.get();
    }

    @Override
    public void baseTick() {
        super.baseTick();
        if (getTarget() != null) {
            if (getTarget() instanceof PlayerEntity) {
                PlayerEntity player = (PlayerEntity) getTarget();
                if (player.isCreative() || player.isSpectator()) {
                    setTarget(null);
                }
            }
        }
    }
}
