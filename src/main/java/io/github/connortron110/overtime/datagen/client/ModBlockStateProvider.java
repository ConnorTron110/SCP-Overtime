package io.github.connortron110.overtime.datagen.client;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Reference.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.MAGNETIC_BLOCK_ON.get());
        simpleBlock(BlockInit.RITUAL_BLOCK.get());
        simpleBlock(BlockInit.TILE_FLOOR_A.get());
        stairsBlock(BlockInit.TILE_STAIRS_A.get(), modLoc("block/"+BlockInit.TILE_FLOOR_A.get().getRegistryName().getPath()));
        slabBlock(BlockInit.TILE_SLAB_A.get(), modLoc("block/"+BlockInit.TILE_FLOOR_A.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.TILE_FLOOR_A.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.TILE_FLOOR_B.get());
        stairsBlock(BlockInit.TILE_STAIRS_B.get(), modLoc("block/"+BlockInit.TILE_FLOOR_B.get().getRegistryName().getPath()));
        slabBlock(BlockInit.TILE_SLAB_B.get(), modLoc("block/"+BlockInit.TILE_FLOOR_B.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.TILE_FLOOR_B.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.GRATE_BLOCK.get());
        stairsBlock(BlockInit.GRATE_STAIRS.get(), modLoc("block/"+BlockInit.GRATE_BLOCK.get().getRegistryName().getPath()));
        slabBlock(BlockInit.GRATE_SLAB.get(), modLoc("block/"+BlockInit.GRATE_BLOCK.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.GRATE_BLOCK.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.GRAVEL_BLOCK.get());
        stairsBlock(BlockInit.GRAVEL_STAIRS.get(), modLoc("block/"+BlockInit.GRAVEL_BLOCK.get().getRegistryName().getPath()));
        slabBlock(BlockInit.GRAVEL_SLAB.get(), modLoc("block/"+BlockInit.GRAVEL_BLOCK.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.GRAVEL_BLOCK.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.GRANITE_FLOOR.get());
        stairsBlock(BlockInit.GRANITE_STAIRS.get(), modLoc("block/"+BlockInit.GRANITE_FLOOR.get().getRegistryName().getPath()));
        slabBlock(BlockInit.GRANITE_SLAB.get(), modLoc("block/"+BlockInit.GRANITE_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.GRANITE_FLOOR.get().getRegistryName().getPath()));
        wallBlock(BlockInit.GRANITE_WALL.get(), modLoc("block/"+BlockInit.GRANITE_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.DARK_FLOOR.get());
        stairsBlock(BlockInit.DARK_STAIRS.get(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        slabBlock(BlockInit.DARK_SLAB.get(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        wallBlock(BlockInit.DARK_WALL.get(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceBlock(BlockInit.DARK_FENCE.get(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceGateBlock(BlockInit.DARK_FENCE_GATE.get(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.METAL_FLOOR_1.get());
        stairsBlock(BlockInit.METAL_STAIRS_1.get(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        slabBlock(BlockInit.METAL_SLAB_1.get(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        wallBlock(BlockInit.METAL_WALL_1.get(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceBlock(BlockInit.METAL_FENCE_1.get(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceGateBlock(BlockInit.METAL_FENCE_GATE_1.get(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.METAL_FLOOR_2.get());
        stairsBlock(BlockInit.METAL_STAIRS_2.get(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        slabBlock(BlockInit.METAL_SLAB_2.get(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        wallBlock(BlockInit.METAL_WALL_2.get(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceBlock(BlockInit.METAL_FENCE_2.get(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceGateBlock(BlockInit.METAL_FENCE_GATE_2.get(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.METAL_FLOOR_3.get());
        stairsBlock(BlockInit.METAL_STAIRS_3.get(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        slabBlock(BlockInit.METAL_SLAB_3.get(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        wallBlock(BlockInit.METAL_WALL_3.get(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceBlock(BlockInit.METAL_FENCE_3.get(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceGateBlock(BlockInit.METAL_FENCE_GATE_3.get(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.DIRTY_METAL_FLOOR.get());
        stairsBlock(BlockInit.DIRTY_METAL_STAIRS.get(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        slabBlock(BlockInit.DIRTY_METAL_SLAB.get(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        wallBlock(BlockInit.DIRTY_METAL_WALL.get(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceBlock(BlockInit.DIRTY_METAL_FENCE.get(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceGateBlock(BlockInit.DIRTY_METAL_FENCE_GATE.get(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.GRIT_1.get());
        stairsBlock(BlockInit.GRIT_STAIRS_1.get(), modLoc("block/"+BlockInit.GRIT_1.get().getRegistryName().getPath()));
        slabBlock(BlockInit.GRIT_SLAB_1.get(), modLoc("block/"+BlockInit.GRIT_1.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.GRIT_1.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.GRIT_2.get());
        stairsBlock(BlockInit.GRIT_STAIRS_2.get(), modLoc("block/"+BlockInit.GRIT_2.get().getRegistryName().getPath()));
        slabBlock(BlockInit.GRIT_SLAB_2.get(), modLoc("block/"+BlockInit.GRIT_2.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.GRIT_2.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.LIGHT_WALL_TOP.get());
        simpleBlock(BlockInit.MED_WALL_TOP.get());
        simpleBlock(BlockInit.HEAVY_WALL_TOP_1.get());
        simpleBlock(BlockInit.HEAVY_WALL_TOP_2.get());
        simpleBlock(BlockInit.BRICK_WALL_TOP.get());
        simpleBlock(BlockInit.STAINED_BRICK_WALL_TOP.get());
        simpleBlock(BlockInit.STAINED_WALL_TOP.get());
        simpleBlock(BlockInit.CONCRETE_WALL_TOP.get());
        simpleBlock(BlockInit.POCKET_DIM_WALL_TOP.get());

        simpleBlock(BlockInit.LIGHT_WALL_MID.get());
        simpleBlock(BlockInit.MED_WALL_MID.get());
        simpleBlock(BlockInit.HEAVY_WALL_MID_1.get());
        simpleBlock(BlockInit.HEAVY_WALL_MID_2.get());
        simpleBlock(BlockInit.BRICK_WALL_MID.get());
        simpleBlock(BlockInit.STAINED_BRICK_WALL_MID.get());
        simpleBlock(BlockInit.STAINED_WALL_MID.get());
        simpleBlock(BlockInit.CONCRETE_WALL_MID.get());
        simpleBlock(BlockInit.POCKET_DIM_WALL_MID.get());

        simpleBlock(BlockInit.LIGHT_WALL_BOTTOM.get());
        simpleBlock(BlockInit.MED_WALL_BOTTOM.get());
        simpleBlock(BlockInit.HEAVY_WALL_BOTTOM_1.get());
        simpleBlock(BlockInit.HEAVY_WALL_BOTTOM_2.get());
        simpleBlock(BlockInit.BRICK_WALL_BOTTOM.get());
        simpleBlock(BlockInit.STAINED_BRICK_WALL_BOTTOM.get());
        simpleBlock(BlockInit.STAINED_WALL_BOTTOM.get());
        simpleBlock(BlockInit.CONCRETE_WALL_BOTTOM.get());
        simpleBlock(BlockInit.POCKET_DIM_WALL_BOTTOM.get());

        simpleBlock(BlockInit.POCKET_DIM_TILE_FLOOR.get());
        stairsBlock(BlockInit.POCKET_DIM_TILE_STAIRS.get(), modLoc("block/"+BlockInit.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()));
        slabBlock(BlockInit.POCKET_DIM_TILE_SLAB.get(), modLoc("block/"+BlockInit.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.POCKET_DIM_BLOCK_1.get());
        stairsBlock(BlockInit.POCKET_DIM_BLOCK_STAIRS_1.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()));
        slabBlock(BlockInit.POCKET_DIM_BLOCK_SLAB_1.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.POCKET_DIM_BLOCK_2.get());
        stairsBlock(BlockInit.POCKET_DIM_BLOCK_STAIRS_2.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()));
        slabBlock(BlockInit.POCKET_DIM_BLOCK_SLAB_2.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.POCKET_DIM_BLOCK_3.get());
        stairsBlock(BlockInit.POCKET_DIM_BLOCK_STAIRS_3.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()));
        slabBlock(BlockInit.POCKET_DIM_BLOCK_SLAB_3.get(), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.SCP1499_BLOCK_1.get());
        stairsBlock(BlockInit.SCP1499_STAIRS_1.get(), modLoc("block/"+BlockInit.SCP1499_BLOCK_1.get().getRegistryName().getPath()));
        slabBlock(BlockInit.SCP1499_SLAB_1.get(), modLoc("block/"+BlockInit.SCP1499_BLOCK_1.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.SCP1499_BLOCK_1.get().getRegistryName().getPath()));
        simpleBlock(BlockInit.SCP1499_BLOCK_2.get());
        stairsBlock(BlockInit.SCP1499_STAIRS_2.get(), modLoc("block/"+BlockInit.SCP1499_BLOCK_2.get().getRegistryName().getPath()));
        slabBlock(BlockInit.SCP1499_SLAB_2.get(), modLoc("block/"+BlockInit.SCP1499_BLOCK_2.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.SCP1499_BLOCK_1.get().getRegistryName().getPath()));

        simpleBlock(BlockInit.BLUE_WALL_TOP.get());
        simpleBlock(BlockInit.BLUE_WALL_MID.get());
        simpleBlock(BlockInit.BLUE_WALL_BOTTOM.get());
        simpleBlock(BlockInit.OFFICE_WALL_TOP.get());
        simpleBlock(BlockInit.OFFICE_WALL_BOTTOM.get());
        simpleBlock(BlockInit.OFFICE_CEILING.get());
        simpleBlock(BlockInit.WHITE_WALL.get());
        simpleBlock(BlockInit.HEAVY_BLOCK.get());
        simpleBlock(BlockInit.CLOTH_BLOCK.get());

        simpleBlock(BlockInit.CONTAINMENT_GLASS.get());
        paneBlock(BlockInit.CONTAINMENT_GLASS_PANE.get(), modLoc("block/"+BlockInit.CONTAINMENT_GLASS.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.CONTAINMENT_GLASS.get().getRegistryName().getPath()));

        trapdoorBlock(BlockInit.VENT_ENTRANCE.get(), modLoc("block/"+BlockInit.VENT_ENTRANCE.get().getRegistryName().getPath()), true);

        simpleBlock(BlockInit.SCP2845_GRASS.get(), models().cubeBottomTop(BlockInit.SCP2845_GRASS.get().getRegistryName().getPath(), modLoc("block/scp2845_side"), modLoc("block/scp2845_bottom"), modLoc("block/scp2845_top")));
        logBlock(BlockInit.SCP2845_LOG.get());
        simpleBlock(BlockInit.SCP2845_LEAVES.get());
        simpleBlock(BlockInit.SCP2845_PLANT.get(), models().cross(BlockInit.SCP2845_PLANT.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.SCP2845_PLANT.get().getRegistryName().getPath())));

        horizontalBlock(BlockInit.FLUTE.get(), models().getExistingFile(modLoc("block/flute")));
        horizontalBlock(BlockInit.OLIVE_OIL.get(), models().getExistingFile(modLoc("block/olive_oil")));
        simpleBlock(BlockInit.GRAIN_POUCH.get(), models().getExistingFile(modLoc("block/grain_pouch")));
        simpleBlock(BlockInit.GIFT.get(), models().getExistingFile(modLoc("block/gift")));
        horizontalBlock(BlockInit.FOOLISHNESS.get(), models().getExistingFile(modLoc("block/foolishness")));
        horizontalBlock(BlockInit.DRAWER.get(), models().getExistingFile(modLoc("block/drawer_082")));
        horizontalBlock(BlockInit.CEILING_CAMERA.get(), models().getExistingFile(modLoc("block/ceiling_camera")));
        simpleBlock(BlockInit.BLOOD_PUDDLE.get(), models().getExistingFile(modLoc("block/blood_puddle")));
        horizontalBlock(BlockInit.SERVER.get(), models().getExistingFile(modLoc("block/server")));

        simpleBlock(BlockInit.SCP066_BLOCK.get(), models().getExistingFile(modLoc("block/scp066_block")));
    }
}
