package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.projectile.PotionEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

//TODO SCP173 related things
public class SCP131Entity extends CreatureEntity {

    private static final DataParameter<Byte> DATA_VARIANT_ID = EntityDataManager.defineId(SCP131Entity.class, DataSerializers.BYTE);

    public SCP131Entity(EntityType<? extends CreatureEntity> entityType, World level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        //this.goalSelector.addGoal(1, new LookAtGoal(this, SCP173Entity.class, 6.0F));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.0D, Ingredient.of((new ItemStack(Blocks.AIR, 1)).getItem()), false));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8D));
    }

    public byte getVariant() {
        return (byte) MathHelper.clamp(this.entityData.get(DATA_VARIANT_ID), 0, 1);
    }
    public void setVariant(byte variant) {
        this.entityData.set(DATA_VARIANT_ID, variant);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_VARIANT_ID, (byte) 0);
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.setVariant(nbt.getByte("Variant"));
    }

    @Nullable
    @Override
    public ILivingEntityData finalizeSpawn(IServerWorld p_213386_1_, DifficultyInstance p_213386_2_, SpawnReason p_213386_3_, @Nullable ILivingEntityData p_213386_4_, @Nullable CompoundNBT p_213386_5_) {
        this.setVariant((byte) random.nextInt(2));
        return super.finalizeSpawn(p_213386_1_, p_213386_2_, p_213386_3_, p_213386_4_, p_213386_5_);
    }

    @Override
    protected boolean shouldDropExperience() {
        return false;
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getDirectEntity() instanceof PotionEntity ||
                source == DamageSource.FALL ||
                source == DamageSource.CACTUS ||
                source == DamageSource.WITHER ||
                source.getMsgId().equals("witherSkull"))
            return false;
        else return super.hurt(source, amount);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.SCP131_IDLE.get();
    }

    @Override
    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        playSound(ModSounds.SCP131_WALK.get(), 1F, 1F);
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return ModSounds.SCP131_DEATH.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.SCP131_DEATH.get();
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;

        if (Math.random() < 0.05D && Math.random() < 0.05D) {
            addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 100, 2));
        }

        //effect give @e[type=ascpm:scp_173,distance=0..10] slowness 5 255 true
        /*
        if (Math.random() < 0.005D) {
            if (!level.getLoadedEntitiesOfClass(SCP173Entity.class, new AxisAlignedBB(blockPosition()).inflate(8)).isEmpty()) {
                playSound(ModSounds.SCP131_DANGER.get(), 1F, 1F);
            }
        }
         */
    }
}
