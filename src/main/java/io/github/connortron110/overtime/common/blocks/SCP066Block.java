package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.entities.scp.SCP066CatEntity;
import io.github.connortron110.overtime.common.entities.scp.SCP066_2Entity;
import io.github.connortron110.overtime.core.init.EntityInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.ArrayList;

public class SCP066Block extends Block {
    public SCP066Block() {
        super(Properties.copy(ModMaterialProperties.FABRIC));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return Block.box(4.5, 0, 4.5, 11.5, 7, 11.5);
    }

    public static final ArrayList<SoundEvent> NOTES = new ArrayList<>();
    static {
        NOTES.add(SoundEvents.NOTE_BLOCK_CHIME);
        NOTES.add(SoundEvents.NOTE_BLOCK_FLUTE);
        NOTES.add(SoundEvents.NOTE_BLOCK_SNARE);
        NOTES.add(SoundEvents.NOTE_BLOCK_XYLOPHONE);
        NOTES.add(SoundEvents.NOTE_BLOCK_BASEDRUM);
        NOTES.add(SoundEvents.NOTE_BLOCK_BASS);
        NOTES.add(SoundEvents.NOTE_BLOCK_BELL);
        NOTES.add(SoundEvents.NOTE_BLOCK_GUITAR);
        NOTES.add(SoundEvents.NOTE_BLOCK_HARP);
        NOTES.add(SoundEvents.NOTE_BLOCK_HAT);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult hit) {
        if (entity.getMainHandItem().getItem() != Items.SHEARS && entity.getMainHandItem().getItem() == Blocks.AIR.asItem()) {
            world.playSound(null, pos, NOTES.get(RANDOM.nextInt(NOTES.size())), SoundCategory.BLOCKS, 1F, (float) Math.pow(2.0D, (RANDOM.nextInt(24) - 12) / 12.0D));
            world.addParticle(ParticleTypes.NOTE, pos.getX() + .5D, pos.getY() + .8D, pos.getZ() + .5D, RANDOM.nextDouble(), 0.0D, 0.0D);



            if (Math.random() < 0.05D && Math.random() < 0.3D) {
                world.destroyBlock(pos, false);
                if (world instanceof ServerWorld) {
                    SCP066CatEntity customEntity = new SCP066CatEntity(EntityInit.SCP066_CAT.get(), world);
                    customEntity.moveTo(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, world.getRandom().nextFloat() * 360.0F, 0.0F);
                    customEntity.finalizeSpawn((IServerWorld) world, world.getCurrentDifficultyAt(customEntity.blockPosition()), SpawnReason.MOB_SUMMONED, null, null);
                    world.addFreshEntity(customEntity);
                }
                return ActionResultType.SUCCESS;
            }


            //Cupcake Event
            if (Math.random() < 0.05D && Math.random() < 0.3D) {
                ItemEntity entityToSpawn = new ItemEntity(world, pos.getX()+.5, pos.getY()+.5, pos.getZ()+.5, ItemInit.CUPCAKE.get().getDefaultInstance());
                entityToSpawn.setPickUpDelay(10);
                entityToSpawn.setExtendedLifetime();
                world.addFreshEntity(entityToSpawn);


                for (int i = 0; i < 5; i++){
                    double d0 = RANDOM.nextGaussian() * 0.02D;
                    double d1 = RANDOM.nextGaussian() * 0.02D;
                    double d2 = RANDOM.nextGaussian() * 0.02D;
                    double d5 = 0.5D - 0.2;
                    double d6 = (double)pos.getX() + d5 + RANDOM.nextDouble() * 0.2 * 2.0D;
                    double d7 = (double)pos.getY() + RANDOM.nextDouble() * 1.1;
                    double d8 = (double)pos.getZ() + d5 + RANDOM.nextDouble() * 0.2 * 2.0D;
                    world.addParticle(ParticleTypes.HAPPY_VILLAGER, d6, d7, d8, d0, d1, d2);
                }
            }
        }

        if (entity.getMainHandItem().getItem() == Items.SHEARS) {
            world.destroyBlock(pos, false);
            world.playSound(null, pos, SoundEvents.RABBIT_ATTACK, SoundCategory.NEUTRAL, 1F, 1F);

            if (!world.isClientSide) {
                SCP066_2Entity customEntity = new SCP066_2Entity(EntityInit.SCP066.get(), world);
                customEntity.moveTo(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, RANDOM.nextFloat() * 360.0F, 0.0F);
                customEntity.finalizeSpawn((IServerWorld) world, world.getCurrentDifficultyAt(customEntity.blockPosition()), SpawnReason.MOB_SUMMONED, null, null);
                world.addFreshEntity(customEntity);
            }

            for (int i = 0; i < 5; i++){
                double d0 = RANDOM.nextGaussian() * 0.02D;
                double d1 = RANDOM.nextGaussian() * 0.02D;
                double d2 = RANDOM.nextGaussian() * 0.02D;
                double d5 = 0.5D - 0.2;
                double d6 = (double)pos.getX() + d5 + RANDOM.nextDouble() * 0.2 * 2.0D;
                double d7 = (double)pos.getY() + RANDOM.nextDouble() - 0.2;
                double d8 = (double)pos.getZ() + d5 + RANDOM.nextDouble() * 0.2 * 2.0D;
                world.addParticle(ParticleTypes.ANGRY_VILLAGER, d6, d7, d8, d0, d1, d2);
            }
        }

        return ActionResultType.SUCCESS;
    }
}
