package io.github.connortron110.overtime.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemSCP714 extends Item {
    public ItemSCP714(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
        if (selected && !entity.level.isClientSide) {
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
