package io.github.connortron110.overtime.common.items;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP427NecklaceModel;
import io.github.connortron110.overtime.common.entities.scp.SCP427_1Entity;
import io.github.connortron110.overtime.core.init.EntityInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import javax.annotation.Nullable;

public class SCP427Item extends ArmorItem {

    private static final DamageSource FLESHBEAST = new DamageSource("427fleshbeast").bypassArmor();

    public SCP427Item(Properties properties) {
        super(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, properties);
    }

    private void queueStageChange(ItemStack stack, PlayerEntity player, double changeTo) {
        WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
            int ticks = 0;

            @Override
            public boolean hasWork() {
                if (player.inventory.armor.get(2).getItem() != ItemInit.SCP427.get()) {
                    CompoundNBT nbt = stack.getOrCreateTag();
                    nbt.putDouble("stage", 0);
                    stack.setTag(nbt);
                    return false;
                }

                return ticks <= 600;
            }

            @Override
            public boolean doWork() {
                if (ticks == 600) {
                    CompoundNBT nbt = stack.getOrCreateTag();
                    nbt.putDouble("stage", changeTo);
                    stack.setTag(nbt);
                }

                ticks++;
                return false;
            }
        });
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (world.isClientSide) return;
        if (player.isCreative()) return;

        CompoundNBT nbt = stack.getOrCreateTag();
        double stage = nbt.getDouble("stage");

        //Potion Side
        if (!player.hasEffect(Effects.ABSORPTION) && !player.hasEffect(Effects.REGENERATION)) {
            if (stage < 1) {
                player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 3, false, false));
                //Health Boost doesn't actually work and player cant seem to have that many hearts
                player.addEffect(new EffectInstance(Effects.ABSORPTION, 10, 3, false, false));
            } else if (stage > 1 && stage < 2) {
                player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 3, false, false));
                player.addEffect(new EffectInstance(Effects.ABSORPTION, 10, 3, false, false));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 70, 0, false, false));
            } else if (stage > 2 && stage < 3) {
                player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 1, false, false));
                player.addEffect(new EffectInstance(Effects.ABSORPTION, 10, 2, false, false));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 70, 1, false, false));
                player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 0, false, false));
                //Moved Blindness over to next stage as its too soon
            } else if (stage > 3 && stage < 4) {
                player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 1, false, false));
                player.addEffect(new EffectInstance(Effects.ABSORPTION, 10, 1, false, false));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 70, 1, false, false));
                player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 0, false, false));
                //Moved Blindness over to next stage as its too soon
            } else {
                player.addEffect(new EffectInstance(Effects.REGENERATION, 10, 0, false, false));
                player.addEffect(new EffectInstance(Effects.ABSORPTION, 10, 0, false, false));
                player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 70, 2, false, false));
                player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 10, 1, false, false));
                player.addEffect(new EffectInstance(Effects.BLINDNESS, 110, 1, false, false));
            }
        }


        //Logic Side
        if (stage == 5) {
            SCP427_1Entity customEntity = new SCP427_1Entity(EntityInit.SCP427.get(), world);
            customEntity.moveTo(player.getX(), player.getY(), player.getZ(), random.nextFloat() * 360.0F, 0.0F);
            customEntity.finalizeSpawn((IServerWorld) world, world.getCurrentDifficultyAt(customEntity.blockPosition()), SpawnReason.MOB_SUMMONED, null, null);
            world.addFreshEntity(customEntity);

            nbt.putDouble("stage", 0);
            stack.setTag(nbt);
            player.hurt(FLESHBEAST, Float.MAX_VALUE);
        }
        else if (stage%1 == 0.0D) {
            nbt.putDouble("stage", stage+.5D);
            stack.setTag(nbt);
            queueStageChange(stack, player, stage+1);
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
        if (entity instanceof PlayerEntity) {
            if (((PlayerEntity) entity).inventory.armor.get(2).getItem() != ItemInit.SCP427.get()) {
                CompoundNBT nbt = stack.getOrCreateTag();
                nbt.putDouble("stage", 0);
                stack.setTag(nbt);
            }
        }
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) new SCP427NecklaceModel().applyData(_default);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(Reference.MOD_ID, "textures/models/scp427.png").toString();
    }
}
