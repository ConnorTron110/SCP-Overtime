package io.github.connortron110.overtime.core.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class CommonCode {

    /**
     * Provide the North Shape first in order for array to work correctly
     * Currently only works with Horizontal Blocks
     */
    public static VoxelShape[] makeHorizontalShapes(VoxelShape northShape) {
        return new VoxelShape[]{rotateShape(Direction.SOUTH, northShape), rotateShape(Direction.WEST, northShape), northShape, rotateShape(Direction.EAST, northShape)};
    }

    private static VoxelShape rotateShape(Direction to, VoxelShape shape) {
        VoxelShape[] buffer = new VoxelShape[]{ shape, VoxelShapes.empty() };
        int times = (to.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;
        for (int i = 0; i < times; i++) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> buffer[1] =
                    VoxelShapes.or(buffer[1], VoxelShapes.box(1-maxZ, minY, minX, 1-minZ, maxY, maxX)));
            buffer[0] = buffer[1];
            buffer[1] = VoxelShapes.empty();
        }

        return buffer[0];
    }

    public static <T extends Entity> List<T> getPlayersAround(BlockPos pos, World level, double radius, Predicate<? super T> predicates) {
        return level.getEntitiesOfClass((Class<? extends T>) PlayerEntity.class, new AxisAlignedBB(pos).inflate(radius), predicates);
    }

    public static <T extends Entity> List<T> getViewingPlayers(T viewed, int trackingRange, double threshold, Predicate<? super T> predicates) {
        List<T> players = viewed.level.getEntitiesOfClass((Class<? extends T>) PlayerEntity.class, new AxisAlignedBB(viewed.blockPosition()).inflate(trackingRange), predicates);
        List<T> toRemove = new ArrayList<>();
        if (!players.isEmpty()) {
            players.forEach(player -> {
                Vector3d playerEyePos = viewed.getEyePosition(1).subtract(player.getEyePosition(1)).normalize();
                Vector3d playerLookPos = player.getViewVector(1).normalize();
                double dotProduct = playerLookPos.dot(playerEyePos);
                if (!(dotProduct > threshold)) {
                    toRemove.add(player);
                }
            });
            players.removeAll(toRemove);
        }
        return players;
    }

    public static boolean isBeingViewed(LivingEntity viewed, int trackingRange, double threshold) {
        List<LivingEntity> players = viewed.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(viewed.blockPosition()).inflate(trackingRange), EntityPredicates.ENTITY_STILL_ALIVE);
        AtomicBoolean isViewed = new AtomicBoolean(false);
        if (!players.isEmpty()) {
            players.forEach(player -> {
                Vector3d playerEyePos = viewed.getEyePosition(1F).subtract(player.getEyePosition(1F)).normalize();
                Vector3d playerLookPos = player.getViewVector(1F).normalize();
                double dotProduct = playerLookPos.dot(playerEyePos);
                if (dotProduct > threshold) {
                    if (viewed.canSee(player)) {
                        isViewed.set(true);
                    }
                }
            });
        }
        return isViewed.get();
    }

    //Not most optimal method but can be useful for a lot of things
    public static List<BlockPos> getAllPositionsInAABB(AxisAlignedBB bb) {
        List<BlockPos> list = new ArrayList<>();
        for (int x = 0; x != (bb.getXsize() + 1); x++) {
            for (int y = 0; y != (bb.getYsize() + 1); y++) {
                for (int z = 0; z != (bb.getZsize() + 1); z++) {
                    list.add(new BlockPos(x + bb.minX, y + bb.minY, z + bb.minZ));
                }
            }
        }
        return list;
    }
}
