package io.github.connortron110.overtime.data;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModBlocks;
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
                .add(ModBlocks.DARK_FENCE.get())
                .add(ModBlocks.METAL_FENCE_1.get())
                .add(ModBlocks.METAL_FENCE_2.get())
                .add(ModBlocks.METAL_FENCE_3.get())
                .add(ModBlocks.DIRTY_METAL_FENCE.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DARK_FENCE.get())
                .add(ModBlocks.METAL_FENCE_1.get())
                .add(ModBlocks.METAL_FENCE_2.get())
                .add(ModBlocks.METAL_FENCE_3.get())
                .add(ModBlocks.DIRTY_METAL_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.DARK_FENCE_GATE.get())
                .add(ModBlocks.METAL_FENCE_GATE_1.get())
                .add(ModBlocks.METAL_FENCE_GATE_2.get())
                .add(ModBlocks.METAL_FENCE_GATE_3.get())
                .add(ModBlocks.DIRTY_METAL_FENCE_GATE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.GRANITE_WALL.get())
                .add(ModBlocks.DARK_WALL.get())
                .add(ModBlocks.METAL_WALL_1.get())
                .add(ModBlocks.METAL_WALL_2.get())
                .add(ModBlocks.METAL_WALL_3.get())
                .add(ModBlocks.DIRTY_METAL_WALL.get());

        tag(BlockTags.LOGS)
                .add(ModBlocks.SCP2845_LOG.get());

        tag(BlockTags.LEAVES)
                .add(ModBlocks.SCP2845_LEAVES.get());


        tag(Tags.Blocks.DIRT)
                .add(ModBlocks.SCP2845_GRASS.get());
    }
}
