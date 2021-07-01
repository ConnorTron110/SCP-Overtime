package io.github.connortron110.overtime.core.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

public class CommonCode {
    public static <T extends Entity> List<T> getPlayersAround(BlockPos pos, World level, double radius, Predicate<? super T> predicates) {
        return level.getEntitiesOfClass((Class<? extends T>) PlayerEntity.class, new AxisAlignedBB(pos).inflate(radius), predicates);
    }

    public static <T extends Entity> List<T> getViewingPlayers(T viewed, int trackingRange, double threshold, Predicate<? super T> predicates) {
        List<T> players = viewed.level.getEntitiesOfClass((Class<? extends T>) PlayerEntity.class, new AxisAlignedBB(viewed.blockPosition()).inflate(trackingRange), predicates);
        if (!players.isEmpty()) {
            players.parallelStream().forEach(player -> {
                Vector3d playerEyePos = viewed.getEyePosition(1).subtract(player.getEyePosition(1)).normalize();
                Vector3d playerLookPos = player.getViewVector(1).normalize();
                double dotProduct = playerLookPos.dot(playerEyePos);
                if (!(dotProduct > threshold)) {
                    players.remove(player);
                }
            });
        }
        return players;
    }

    public static boolean isBeingViewed(LivingEntity viewed, int trackingRange, double threshold) {
        List<LivingEntity> players = viewed.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(viewed.blockPosition()).inflate(trackingRange), EntityPredicates.ENTITY_STILL_ALIVE);
        AtomicBoolean isViewed = new AtomicBoolean(false);
        if (!players.isEmpty()) {
            players.parallelStream().forEach(player -> {
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
}
