package io.github.connortron110.overtime.common.items;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SCP500ContainerItem extends Item {
    public SCP500ContainerItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClientSide) return ActionResult.fail(player.getItemInHand(hand));
        ItemStack stack = player.getItemInHand(hand);

        Overtime.LOGGER.debug(stack.getDamageValue());
        if (stack.getDamageValue() != getMaxDamage(stack)) {
            player.getCooldowns().addCooldown(this, 110);
            stack.hurt(1, world.random, null);
            player.addItem(ItemInit.SCP500_PILL.get().getDefaultInstance());
        }

        return ActionResult.sidedSuccess(stack, false);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 10;
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return true;
    }
}
