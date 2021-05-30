package io.github.connortron110.overtime.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.world.World;

import java.util.Collection;
import java.util.stream.Collectors;

public class SCP500PillItem extends Item {
    public SCP500PillItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity entity) {
        Collection<EffectInstance> effectInstances = entity.getActiveEffects().stream().filter(effect -> effect.getEffect().getCategory().equals(EffectType.HARMFUL)).collect(Collectors.toList());
        effectInstances.forEach(effectInstance -> entity.removeEffect(effectInstance.getEffect()));
        return super.finishUsingItem(stack, world, entity);
    }
}
