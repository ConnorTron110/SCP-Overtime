package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.common.blocks.SCP1762Block;
import io.github.connortron110.overtime.core.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class SCP1762Entity extends CreatureEntity {

    private static final DataParameter<Integer> DATA_VARIANT_ID = EntityDataManager.defineId(SCP1762Entity.class, DataSerializers.INT);
    private static final DataParameter<BlockPos> SPAWN_POS = EntityDataManager.defineId(SCP1762Entity.class, DataSerializers.BLOCK_POS);

    public SCP1762Entity(EntityType<? extends CreatureEntity> entityType, World world) {
        super(entityType, world);
        moveControl = new FlyingMovementController(this, 10, true);
        this.setPathfindingMalus(PathNodeType.DANGER_FIRE, -1F);
        this.setPathfindingMalus(PathNodeType.DAMAGE_FIRE, -1F);
    }

    @Override
    protected PathNavigator createNavigation(World world) {
        FlyingPathNavigator flyingpathnavigator = new FlyingPathNavigator(this, world);
        flyingpathnavigator.setCanOpenDoors(false);
        flyingpathnavigator.setCanFloat(true);
        flyingpathnavigator.setCanPassDoors(true);
        return flyingpathnavigator;
    }

    @Override
    protected boolean shouldDropExperience() {
        return false;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 0.8D, 20) {
            protected Vector3d getPosition() {
                Random random = getRandom();
                double dir_x = getX() + ((random.nextFloat() * 2F - 1F) * 16F);
                double dir_y = getY() + ((random.nextFloat() * 2F - 1F) * 16F);
                double dir_z = getZ() + ((random.nextFloat() * 2F - 1F) * 16F);
                return new Vector3d(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(2, new TemptGoal(this, 1D, Ingredient.of((new ItemStack(Blocks.AIR, 1)).getItem()), false));
    }

    @Nullable
    @Override
    public ILivingEntityData finalizeSpawn(IServerWorld world, DifficultyInstance difficultyInstance, SpawnReason spawnReason, @Nullable ILivingEntityData iLivingEntityData, @Nullable CompoundNBT compoundNBT) {
        this.setVariant(random.nextInt(8));
        if (spawnReason == SpawnReason.TRIGGERED) {
            this.setSpawnPointPos(blockPosition().asLong());
        }
        return super.finalizeSpawn(world, difficultyInstance, spawnReason, iLivingEntityData, compoundNBT);
    }

    private BlockPos getSpawnPointPos() {
        return this.entityData.get(SPAWN_POS);
    }
    private void setSpawnPointPos(long spawnPos) {
        this.entityData.set(SPAWN_POS, BlockPos.of(spawnPos));
    }

    public int getVariant() {
        return MathHelper.clamp(this.entityData.get(DATA_VARIANT_ID), 0, 7);
    }
    public void setVariant(int variant) {
        this.entityData.set(DATA_VARIANT_ID, variant);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_VARIANT_ID, 0);
        this.entityData.define(SPAWN_POS, blockPosition());
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putInt("Variant", this.getVariant());
        nbt.putLong("SpawnPos", getSpawnPointPos().asLong());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.setVariant(nbt.getInt("Variant"));
        this.setSpawnPointPos(nbt.getLong("SpawnPos"));
    }

    @Override
    public void baseTick() {
        super.baseTick();
        if (level.isClientSide) return;
        if (!getSpawnPointPos().equals(new BlockPos(0,0,0))){
            if (level.getBlockState(getSpawnPointPos()).getBlock() == ModBlocks.SCP1762.get()) {
                if (!level.getBlockState(getSpawnPointPos()).getValue(SCP1762Block.ACTIVE)) {
                    kill();
                }
            } else {
                kill();
            }
        }
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return null;
    }

    @Override
    public SoundEvent getDeathSound() {
        return null;
    }

    @Override
    public boolean causeFallDamage(float l, float d) {
        return false;
    }

    @Override
    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}

    @Override
    public void aiStep() {
        super.aiStep();
    }
}
