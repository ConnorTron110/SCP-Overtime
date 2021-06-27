package io.github.connortron110.overtime.common.items;

import com.google.common.collect.Multimap;
import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP035MaskModel;
import io.github.connortron110.overtime.core.init.ModItems;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import javax.annotation.Nullable;

public class SCP035Item extends ArmorItem {
    public SCP035Item(Properties p_i48534_3_) {
        super(ArmorMaterial.NETHERITE, EquipmentSlotType.HEAD, p_i48534_3_);
    }

    private void setState(ItemStack stack, float state) {
        CompoundNBT nbt = stack.getOrCreateTag();
        nbt.putFloat("state", state);
        stack.setTag(nbt);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return false;
    }

    @Override
    public ItemStack getDefaultInstance() {
        ItemStack stack = new ItemStack(this);
        CompoundNBT nbt = stack.getOrCreateTag();
        nbt.putFloat("state", State.PASSIVE.state);
        nbt.putBoolean("event", false);
        stack.setTag(nbt);
        return stack;
    }

    //Only way to do this, its so fucking annoying, tried setting NBT but apparently that doesn't work >:(
    boolean hackToSetEventToFalse = false;

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (world.isClientSide) return;
        CompoundNBT nbt = stack.getOrCreateTag();

        if (nbt.getFloat("state") == State.PASSIVE.state) {
            if (hackToSetEventToFalse) {
                hackToSetEventToFalse = false;
                nbt.putBoolean("event", false);
            }

            if (!nbt.getBoolean("event")) {
                WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                    int ticks = 0;

                    @Override
                    public boolean hasWork() {
                        if (!player.inventory.armor.contains(stack)) {
                            hackToSetEventToFalse = true;
                            return false;
                        }

                        return ticks <= 100;
                    }

                    @Override
                    public boolean doWork() {
                        if (ticks == 0) world.playSound(null, player.blockPosition(),ModSounds.SCP035_EQUIP.get(), SoundCategory.HOSTILE, 1F, 1F);
                        if (ticks == 100) {
                            setState(stack, State.EQUIPPED.state);
                            stack.enchant(Enchantments.BINDING_CURSE, 1);
                            world.playSound(null, player.blockPosition(),ModSounds.SCP035_TAKEOVER.get(), SoundCategory.HOSTILE, 1F, 1F);
                            //Added these 2 lines to give a more visual effect to it changing state
                            player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 60, 1, false, false));
                            player.addEffect(new EffectInstance(Effects.CONFUSION, 120, 0, false, false));
                        }

                        ticks++;
                        return false;
                    }
                });
                nbt.putBoolean("event", true);
            }
        }
        else if (nbt.getFloat("state") == State.EQUIPPED.state) {
            if (player.getHealth() < 9F) {
                world.playSound(null, player.blockPosition(), ModSounds.SCP035_ANGRY.get(), SoundCategory.HOSTILE, 1F, 1F);
                setState(stack, State.ANGRY.state);
                player.addItem(ModItems.SCP035_TENDRIL_SPAWNER.get().getDefaultInstance());
            }
        } else { //Angry state check technically not needed
            player.addEffect(new EffectInstance(Effects.DAMAGE_BOOST, 60, 1, true, true));
            player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 60, 2, true, true));
            if (!player.inventory.contains(ModItems.SCP035_TENDRIL_SPAWNER.get().getDefaultInstance())) {
                player.addItem(ModItems.SCP035_TENDRIL_SPAWNER.get().getDefaultInstance());
            }
        }

        stack.setTag(nbt);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
        if (world.isClientSide) return;
        if (entity instanceof PlayerEntity) {
            if (slot < 4) {
                if (((PlayerEntity) entity).inventory.armor.get(slot).getItem() != stack.getItem()) {
                    if (stack.getOrCreateTag().getFloat("state") == State.PASSIVE.state) {
                        if (random.nextDouble() < 0.008D) {
                            entity.playSound(ModSounds.SCP035_IDLE.get(), 1F, 1F);
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        stack.setTag(stack.getItem().getDefaultInstance().getTag());
        return false;
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        if (itemStack.getTag().getFloat("state") != State.ANGRY.state) {
            return (A) new SCP035MaskModel.BaseMask().applyData(_default);
        } else {
            return (A) new SCP035MaskModel.Angry().applyData(_default);
        }
    }


    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        String state = "angry";
        if (stack.getTag().getFloat("state") == State.PASSIVE.state) {
            state = "passive";
        } else if (stack.getTag().getFloat("state") == State.EQUIPPED.state) {
            state = "equipped";
        }
        return new ResourceLocation(Overtime.MOD_ID, "textures/models/scp035_" + state + ".png").toString();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        return super.getAttributeModifiers(slot, stack);
    }

    private enum State {
        PASSIVE(0),
        EQUIPPED(1),
        ANGRY(2);

        float state;

        State(float state) {
            this.state = state;
        }
    }
}
