package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.common.entities.projectile.AcidSpitEntity;
import io.github.connortron110.overtime.core.init.EntityInit;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class SCP3199Entity extends MonsterEntity {

    public SCP3199Entity(EntityType<? extends MonsterEntity> type, World world) {
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
    protected boolean shouldDropExperience() {
        return false;
    }

    @Override
    public SoundEvent getAmbientSound() {
        return ModSounds.SCP3199_IDLE.get();
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound(ModSounds.GENERIC_STEP.get(), 0.15F, 1.0F);
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ModSounds.SCP3199_SCREAM.get();
    }

    @Override
    public SoundEvent getDeathSound() {
        return ModSounds.SCP3199_DEATH.get();
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);

        SCP3199EggEntity eggEntity = new SCP3199EggEntity(EntityInit.SCP3199_EGG.get(), level);
        eggEntity.moveTo(position());
        level.addFreshEntity(eggEntity);
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        if (Math.random() < 0.007D && Math.random() < 0.07D && Math.random() < 0.7D) {
            if (getTarget() != null) {
                AcidSpitEntity spit = new AcidSpitEntity(level, this);
                //This this part from the Llama code
                double d0 = getTarget().getX() - this.getX();
                double d1 = getTarget().getY(0.3333333333333333D) - spit.getY();
                double d2 = getTarget().getZ() - this.getZ();
                float f = MathHelper.sqrt(d0 * d0 + d2 * d2) * 0.2F;
                spit.shoot(d0, d1 + (double)f, d2, 1.5F, 10.0F);
                if (!this.isSilent()) {
                    this.level.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.LLAMA_SPIT, this.getSoundSource(), 1.0F, 1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
                }

                level.addFreshEntity(spit);
            }
        }


        if (Math.random() < 0.05D && Math.random() < 0.05D && Math.random() < 0.01D) {
            playSound(ModSounds.SCP3199_SCREAM.get(), 1, 1);
            SCP3199EggEntity eggEntity = new SCP3199EggEntity(EntityInit.SCP3199_EGG.get(), level);
            eggEntity.moveTo(position());
            level.addFreshEntity(eggEntity);
        }
    }
}
