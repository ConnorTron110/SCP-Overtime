package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.common.blocks.SCP066Block;
import io.github.connortron110.overtime.core.init.BlockInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import java.util.Random;

public class SCP066CatEntity extends CatEntity {

    public SCP066CatEntity(EntityType<? extends CatEntity> entity, World world) {
        super(entity, world);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(11, new WaterAvoidingRandomWalkingGoal(this, 0.8D, 1.0000001E-5F));
        this.goalSelector.addGoal(12, new LookAtGoal(this, PlayerEntity.class, 10.0F));
    }

    @Override
    protected void reassessTameGoals() {}

    @Override
    public void onRemovedFromWorld() {
        super.onRemovedFromWorld();
        if (!level.isClientSide) {
            ItemEntity entityToSpawn = new ItemEntity(level, position().x, position().y, position().z, new ItemStack(BlockInit.SCP066_BLOCK.get().asItem(), 1));
            entityToSpawn.setPickUpDelay(10);
            entityToSpawn.setExtendedLifetime();
            level.addFreshEntity(entityToSpawn);
        }
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();

        WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
            int ticks = 0;

            @Override
            public boolean hasWork() {
                return ticks <= 500 && isAlive();
            }

            @Override
            public boolean doWork() {
                if (ticks == 500) {
                    if (!level.isClientSide)
                        remove();
                }
                ticks++;
                return false;
            }
        });
    }

    @Override
    public ActionResultType mobInteract(PlayerEntity player, Hand hand) {
        level.playSound(null, blockPosition(), SCP066Block.NOTES.get(new Random().nextInt(SCP066Block.NOTES.size())), SoundCategory.BLOCKS, 1F, (float) Math.pow(2.0D, (new Random().nextInt(24) - 12) / 12.0D));
        level.addParticle(ParticleTypes.NOTE, position().x, position().y + .8D, position().z, new Random().nextDouble(), 0.0D, 0.0D);

        if (Math.random() < 0.01D) {
            if (!level.isClientSide)
                remove();
        }
        return ActionResultType.SUCCESS;
    }
}
