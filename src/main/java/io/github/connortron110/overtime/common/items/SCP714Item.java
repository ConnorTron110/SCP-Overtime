package io.github.connortron110.overtime.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SCP714Item extends Item {
    public SCP714Item(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, World level, Entity entity, int slot, boolean selected) {
        if (level.isClientSide) return;
        if (selected) {
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new EffectInstance(Effects.WEAKNESS, 20, 1, true, true));
                ((LivingEntity) entity).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 20, 0, true, true));
                ((LivingEntity) entity).removeEffect(Effects.POISON);
                ((LivingEntity) entity).removeEffect(Effects.WITHER);
                ((LivingEntity) entity).removeEffect(Effects.BLINDNESS);
            }
        }
    }
}
