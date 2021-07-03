package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.OpenDoorGoal;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SCP303Entity extends MonsterEntity {

    private static final DataParameter<BlockPos> SPAWN_POS = EntityDataManager.defineId(SCP303Entity.class, DataSerializers.BLOCK_POS);

    public SCP303Entity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 6F));
        //Causes it to run away when at door
        //this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, PlayerEntity.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(3, new OpenDoorGoal(this, true));
    }

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        if (Math.random() < 0.003D) {
            if (CommonCode.getPlayersAround(blockPosition(), level, 5D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR).isEmpty()) {
                BlockPos spawnPos = this.entityData.get(SPAWN_POS);
                teleportTo(spawnPos.getX(), spawnPos.getY(), spawnPos.getZ());
            }
        }
    }

    @Override
    public void playerTouch(PlayerEntity playerEntity) {
        if (level.isClientSide) return;
        if (Math.random() < 0.05D && Math.random() < 0.0025D) {
            //This too OP?
            playerEntity.inventory.setItem(getRandom().nextInt(playerEntity.inventory.getContainerSize()), ItemStack.EMPTY);
        }
    }

    @Nullable
    @Override
    public ILivingEntityData finalizeSpawn(IServerWorld p_213386_1_, DifficultyInstance p_213386_2_, SpawnReason p_213386_3_, @Nullable ILivingEntityData p_213386_4_, @Nullable CompoundNBT p_213386_5_) {
        this.entityData.set(SPAWN_POS, blockPosition());
        return super.finalizeSpawn(p_213386_1_, p_213386_2_, p_213386_3_, p_213386_4_, p_213386_5_);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SPAWN_POS, blockPosition());
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putLong("SpawnPos", this.entityData.get(SPAWN_POS).asLong());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.entityData.set(SPAWN_POS, BlockPos.of(nbt.getLong("SpawnPos")));
    }

    @Override
    protected boolean shouldDropExperience() {
        return false;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.SCP303_IDLE.get();
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.SCP303_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource p_184601_1_) {
        return ModSounds.SCP303_DEATH.get();
    }

    @Override
    protected void playStepSound(BlockPos p_180429_1_, BlockState p_180429_2_) {
        playSound(ModSounds.GENERIC_STEP.get(), 1F, 1F);
    }
}
