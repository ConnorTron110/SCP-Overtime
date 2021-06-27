package io.github.connortron110.overtime.common.entities.scp;

import io.github.connortron110.overtime.core.init.ModSounds;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import java.util.List;

public class SCP5167Entity extends MonsterEntity {

    private static final DataParameter<Boolean> SUS = EntityDataManager.defineId(SCP5167Entity.class, DataSerializers.BOOLEAN);
    private static final DamageSource DEAF = new DamageSource("5167deaf").bypassArmor();

    //Crewmate Tasks
    private ReturnToVillageGoal villageGoal;
    private TemptGoal temptGoal; //Could be changed for something more efficient

    //Imposter Tasks
    private LeapAtTargetGoal leapAtTargetGoal;
    private MeleeAttackGoal meleeAttackGoal;
    private HurtByTargetGoal hurtByTargetGoal;
    private NearestAttackableTargetGoal<PlayerEntity> nearestAttackableTargetGoal;


    public SCP5167Entity(EntityType<? extends MonsterEntity> entityType, World world) {
        super(entityType, world);
        setCustomName(new StringTextComponent("Phthonus"));
    }

    @Override
    protected void registerGoals() {
        villageGoal = new ReturnToVillageGoal(this, 0.6D, false);
        temptGoal = new TemptGoal(this, 1D, Ingredient.of((new ItemStack(Blocks.AIR, 1)).getItem()), false);

        leapAtTargetGoal = new LeapAtTargetGoal(this, 0.5F);
        meleeAttackGoal = new MeleeAttackGoal(this, 1.2D, true);
        hurtByTargetGoal = new HurtByTargetGoal(this).setAlertOthers();
        nearestAttackableTargetGoal = new NearestAttackableTargetGoal<>(this, PlayerEntity.class, false, false);

        this.goalSelector.addGoal(2, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(3, new FollowMobGoal(this, 1D, 10F, 5F));
        this.goalSelector.addGoal(5, new RandomWalkingGoal(this, 1D));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(7, new SwimGoal(this));
        addExtraGoals();
    }

    public boolean isImposter() {
        return this.entityData.get(SUS);
    }
    private void setImposter(boolean sus) {
        this.entityData.set(SUS, sus);
        if (sus) setCustomName(new StringTextComponent("Phthonus").withStyle(TextFormatting.DARK_RED));
        else setCustomName(new StringTextComponent("Phthonus"));
        hasCalledChange = sus;
        addExtraGoals();
    }

    private void addExtraGoals() {
        this.goalSelector.removeGoal(villageGoal);
        this.goalSelector.removeGoal(temptGoal);

        this.goalSelector.removeGoal(leapAtTargetGoal);
        this.goalSelector.removeGoal(meleeAttackGoal);
        this.targetSelector.removeGoal(hurtByTargetGoal);
        this.targetSelector.removeGoal(nearestAttackableTargetGoal);
        if (isImposter()) {
            this.goalSelector.addGoal(1, leapAtTargetGoal);
            this.goalSelector.addGoal(4, meleeAttackGoal);
            this.targetSelector.addGoal(1, hurtByTargetGoal);
            this.targetSelector.addGoal(2, nearestAttackableTargetGoal);
        } else {
            this.goalSelector.addGoal(1, villageGoal);
            this.goalSelector.addGoal(4, temptGoal);
        }
    }

    @Override
    public boolean shouldShowName() {
        return true;
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(SUS, false);
    }

    @Override
    public void addAdditionalSaveData(CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        nbt.putBoolean("Sus", this.isImposter());
    }

    @Override
    public void readAdditionalSaveData(CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        this.setImposter(nbt.getBoolean("Sus"));
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        playSound(ModSounds.SCP5167_WALK.get(), 0.15F, 1F);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.SCP5167_DEATH.get();
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean isInvulnerableTo(DamageSource source) {
        return source == DamageSource.FALL;
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        setImposter(false);
        playSound(ModSounds.SCP5167_DEATH.get(), 1F, 1F);
    }

    private boolean hasCalledChange = false;

    @Override
    public void baseTick() {
        super.baseTick();

        if (level.isClientSide) return;
        if (isImposter()) {
            if (CommonCode.getPlayersAround(blockPosition(), level, 20D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR).isEmpty()) {
                setImposter(false);
                return;
            }


            List<LivingEntity> players = CommonCode.getPlayersAround(blockPosition(), level, 3D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR);
            if (!players.isEmpty()) {
                //Meeting Deafen
                if (Math.random() < 0.005D) {
                    level.getServer().getCommands().performCommand(createCommandSourceStack().withSuppressedOutput().withPermission(4), "/particle minecraft:poof ~ ~0.5 ~ 0.05 0.05 0.05 .2 15 normal");
                    playSound(ModSounds.SCP5167_MEETING.get(), 1, 1);
                    players.parallelStream().forEach(entity -> {
                        entity.hurt(DEAF, 10);
                        entity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 60, 2, false, false));
                        entity.addEffect(new EffectInstance(Effects.CONFUSION, 60, 2, false, false));
                    });
                }

                //Power Sabotage
                if (Math.random() < 0.005D) {
                    players.parallelStream().forEach(entity -> {
                        //Its meant to hurt the player here, but that doesnt make any sense
                        //entity.hurt(DEAF, 10);
                        entity.addEffect(new EffectInstance(Effects.BLINDNESS, 120, 1, false, false));
                    });
                }
            }
            return;
        }


        List<LivingEntity> players = CommonCode.getPlayersAround(blockPosition(), level, 2.5D, EntityPredicates.NO_CREATIVE_OR_SPECTATOR);
        if (!players.isEmpty()) {
            players.parallelStream().forEach(entity -> {
                entity.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 120, 0, false, false));
                entity.addEffect(new EffectInstance(Effects.CONFUSION, 120, 0, false, false));
            });

            if (!isImposter() && !hasCalledChange) {
                hasCalledChange = true;
                WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                    int ticks = 0;

                    @Override
                    public boolean hasWork() {
                        return ticks <= 500 && isAlive();
                    }

                    @Override
                    public boolean doWork() {
                        if (ticks == 500) setImposter(true);
                        ticks++;
                        return false;
                    }
                });
            }
        }
    }
}
