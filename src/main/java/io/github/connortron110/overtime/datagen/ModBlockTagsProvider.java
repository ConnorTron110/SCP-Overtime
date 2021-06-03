package io.github.connortron110.overtime.datagen;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.BlockInit;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Overtime.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags() {
        tag(BlockTags.FENCES)
                .add(BlockInit.DARK_FENCE.get())
                .add(BlockInit.METAL_FENCE_1.get())
                .add(BlockInit.METAL_FENCE_2.get())
                .add(BlockInit.METAL_FENCE_3.get())
                .add(BlockInit.DIRTY_METAL_FENCE.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(BlockInit.DARK_FENCE.get())
                .add(BlockInit.METAL_FENCE_1.get())
                .add(BlockInit.METAL_FENCE_2.get())
                .add(BlockInit.METAL_FENCE_3.get())
                .add(BlockInit.DIRTY_METAL_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(BlockInit.DARK_FENCE_GATE.get())
                .add(BlockInit.METAL_FENCE_GATE_1.get())
                .add(BlockInit.METAL_FENCE_GATE_2.get())
                .add(BlockInit.METAL_FENCE_GATE_3.get())
                .add(BlockInit.DIRTY_METAL_FENCE_GATE.get());

        tag(BlockTags.WALLS)
                .add(BlockInit.GRANITE_WALL.get())
                .add(BlockInit.DARK_WALL.get())
                .add(BlockInit.METAL_WALL_1.get())
                .add(BlockInit.METAL_WALL_2.get())
                .add(BlockInit.METAL_WALL_3.get())
                .add(BlockInit.DIRTY_METAL_WALL.get());

        tag(BlockTags.LOGS)
                .add(BlockInit.SCP2845_LOG.get());

        tag(BlockTags.LEAVES)
                .add(BlockInit.SCP2845_LEAVES.get());


        tag(Tags.Blocks.DIRT)
                .add(BlockInit.SCP2845_GRASS.get());
    }
}
