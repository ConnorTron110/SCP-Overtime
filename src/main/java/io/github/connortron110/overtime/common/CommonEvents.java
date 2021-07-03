package io.github.connortron110.overtime.common;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.common.entities.scp.SCP303Entity;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(modid = Overtime.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {
    @SubscribeEvent
    public static void scp303DoorEvent(PlayerInteractEvent.RightClickBlock event) {
        PlayerEntity player = event.getPlayer();
        World level = event.getWorld();
        BlockPos blockPos = event.getPos();
        BlockState state = level.getBlockState(blockPos);

        if (player.isCreative()) return;
        List<SCP303Entity> SCP030Instances = level.getLoadedEntitiesOfClass(SCP303Entity.class, new AxisAlignedBB(blockPos).inflate(500));
        if (!SCP030Instances.isEmpty()) {
            List<BlockPos> posList = CommonCode.getAllPositionsInAABB(new AxisAlignedBB(blockPos).inflate(1));
            posList = posList.stream().filter(pos -> level.getBlockState(pos).getBlock().getTags().contains(BlockTags.WOODEN_DOORS.getName())).collect(Collectors.toList());
            if (!posList.isEmpty()) { //There is at least a door nearby
                if (!level.getLoadedEntitiesOfClass(SCP303Entity.class, new AxisAlignedBB(blockPos).inflate(2)).isEmpty()) {
                    event.setCanceled(true); //Hes Already There!
                }
                if (Math.random() < 0.03D || event.isCanceled()) {
                    if (state.isSignalSource()) { //The player activated something that can power a door
                        if (state.hasProperty(BlockStateProperties.POWERED)) {
                            if (!state.getValue(BlockStateProperties.POWERED)) { //Only Called when switching from off -> on
                                event.setCanceled(true);
                            }
                        }
                    } else if (state.getBlock().getTags().contains(BlockTags.WOODEN_DOORS.getName())) {
                        if (!state.getValue(BlockStateProperties.OPEN)) { //Only Called when close -> open
                            BlockPos halfPos = (state.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER) ? blockPos.below() : blockPos.above();
                            level.setBlock(halfPos, level.getBlockState(halfPos).getBlockState().setValue(BlockStateProperties.OPEN, false), Constants.BlockFlags.BLOCK_UPDATE);
                            event.setCanceled(true);
                        }
                    }
                }

                if (event.isCanceled() && !level.isClientSide) {
                    BlockPos doorPos = posList.get(0);

                    Direction direction = level.getBlockState(doorPos).getValue(HorizontalBlock.FACING);
                    BlockPos scpTPLocation = doorPos.relative(direction, 1);
                    SCP030Instances.get(0).teleportTo(scpTPLocation.getX() + 0.5D, scpTPLocation.getY(), scpTPLocation.getZ() + 0.5D);

                    player.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 255));
                    player.addEffect(new EffectInstance(Effects.CONFUSION, 100));
                    player.addEffect(new EffectInstance(Effects.BLINDNESS, 100));
                    player.playSound(SoundEvents.AMBIENT_CAVE, 1F, 1F);
                }
            }
        }
    }
}
