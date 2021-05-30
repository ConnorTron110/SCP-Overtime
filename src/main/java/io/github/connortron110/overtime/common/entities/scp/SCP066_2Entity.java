package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import javax.annotation.Nullable;
import java.util.List;

public class SCP066_2Entity extends MonsterEntity {

    private static final DamageSource WHIPPED = new DamageSource("066whipped").bypassArmor();
    private static final DamageSource DEAF = new DamageSource("066deaf").bypassArmor();

    public SCP066_2Entity(EntityType<? extends MonsterEntity> entity, World world) {
        super(entity, world);
        xpReward = 2;
        setPersistenceRequired();
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        goalSelector.addGoal(1, new MeleeAttackGoal(this, .8D, false));
        goalSelector.addGoal(2, new RandomWalkingGoal(this, .8D));
        goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        goalSelector.addGoal(4, new LookRandomlyGoal(this));

        targetSelector.addGoal(1, new HurtByTargetGoal(this));
        targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.SCP066_IDLE.get();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        playSound(ModSounds.SCP066_ROLLING.get(), 0.15F, 1);
    }

    private boolean spinTask = false;

    @Override
    public void baseTick() {
        super.baseTick();

        if (!level.isClientSide){

            BlockPos pos1 = new BlockPos(position().x - 2.5D, position().y - 2.5D, position().z - 2.5D);
            BlockPos pos2 = new BlockPos(position().x + 2.5D, position().y + 2.5D, position().z + 2.5D);
            List<LivingEntity> players = level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(pos1, pos2), EntityPredicates.NO_CREATIVE_OR_SPECTATOR);

            //Spin Attack
            if (getPersistentData().getBoolean("066spin")) {
                if (level.getServer() != null) {
                    //FIXME No better way to spin it other than this
                    level.getServer().getCommands().performCommand(createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @e[type=overtime:scp066,limit=1,distance=..1] run tp @e[type=overtime:scp066,limit=1,distance=..1] ~ ~ ~ ~35 ~");
                    level.playSound(null, blockPosition(), SoundEvents.WOOL_BREAK, SoundCategory.HOSTILE, 1, 1);
                    level.getServer().getCommands().performCommand(createCommandSourceStack().withSuppressedOutput().withPermission(4), "/particle minecraft:cloud ~ ~0.1 ~ 0.05 0.01 0.05 .1 5 normal");
                    players.forEach((player) -> player.hurt(WHIPPED, 1F));
                }
                if (!spinTask) {
                    spinTask = true;
                    WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                        int ticks = 0;

                        @Override
                        public boolean hasWork() {
                            return ticks <= 20;
                        }

                        @Override
                        public boolean doWork() {
                            if (ticks == 20) {
                                getPersistentData().putBoolean("066spin", false);
                                spinTask = false;
                            }
                            ticks++;
                            return false;
                        }
                    });
                }
            }

            if (players.isEmpty()) {
                return;
            }

            if (!getPersistentData().getBoolean("066spin") && Math.random() < 0.005D) getPersistentData().putBoolean("066spin", true);

            //Blind Event
            if (Math.random() < 0.005D) {
                players.forEach((player) -> player.addEffect(new EffectInstance(Effects.BLINDNESS, 100, 1)));
            }

            //Loud Music Thing Event
            if (Math.random() < 0.005D) {
                if (level.getServer() != null) {
                    players.forEach((player) -> {
                        player.hurt(DEAF, 10F);
                        player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 2));
                        player.addEffect(new EffectInstance(Effects.CONFUSION, 200, 1));
                    });
                    level.getServer().getCommands().performCommand(createCommandSourceStack().withSuppressedOutput().withPermission(4), "/particle minecraft:poof ~ ~0.5 ~ 0.05 0.05 0.05 .2 15 normal");
                    level.playSound(null, blockPosition(), ModSounds.SCP066_BEETHOVEN.get(), SoundCategory.HOSTILE, 30, 1);

                    //TODO Add Crack Block
                    //entity.level.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute at @p positioned ~ ~ ~ run setblock ~ ~ ~ ascpm:scp_106crack");
                }
            }
        }
    }
}
