package io.github.connortron110.overtime.data.client;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Overtime.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MAGNETIC_BLOCK_ON.get());
        simpleBlock(ModBlocks.RITUAL_BLOCK.get());
        simpleBlock(ModBlocks.TILE_FLOOR_A.get());
        stairsBlock(ModBlocks.TILE_STAIRS_A.get(), modLoc("block/"+ ModBlocks.TILE_FLOOR_A.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.TILE_SLAB_A.get(), modLoc("block/"+ ModBlocks.TILE_FLOOR_A.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.TILE_FLOOR_A.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.TILE_FLOOR_B.get());
        stairsBlock(ModBlocks.TILE_STAIRS_B.get(), modLoc("block/"+ ModBlocks.TILE_FLOOR_B.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.TILE_SLAB_B.get(), modLoc("block/"+ ModBlocks.TILE_FLOOR_B.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.TILE_FLOOR_B.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.GRATE_BLOCK.get());
        stairsBlock(ModBlocks.GRATE_STAIRS.get(), modLoc("block/"+ ModBlocks.GRATE_BLOCK.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.GRATE_SLAB.get(), modLoc("block/"+ ModBlocks.GRATE_BLOCK.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.GRATE_BLOCK.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.GRAVEL_BLOCK.get());
        stairsBlock(ModBlocks.GRAVEL_STAIRS.get(), modLoc("block/"+ ModBlocks.GRAVEL_BLOCK.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.GRAVEL_SLAB.get(), modLoc("block/"+ ModBlocks.GRAVEL_BLOCK.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.GRAVEL_BLOCK.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.GRANITE_FLOOR.get());
        stairsBlock(ModBlocks.GRANITE_STAIRS.get(), modLoc("block/"+ ModBlocks.GRANITE_FLOOR.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.GRANITE_SLAB.get(), modLoc("block/"+ ModBlocks.GRANITE_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.GRANITE_FLOOR.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.GRANITE_WALL.get(), modLoc("block/"+ ModBlocks.GRANITE_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.DARK_FLOOR.get());
        stairsBlock(ModBlocks.DARK_STAIRS.get(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.DARK_SLAB.get(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.DARK_WALL.get(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceBlock(ModBlocks.DARK_FENCE.get(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceGateBlock(ModBlocks.DARK_FENCE_GATE.get(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.POCKET_DIM_TILE_FLOOR.get());
        stairsBlock(ModBlocks.POCKET_DIM_TILE_STAIRS.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.POCKET_DIM_TILE_SLAB.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.POCKET_DIM_TILE_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.METAL_FLOOR_1.get());
        stairsBlock(ModBlocks.METAL_STAIRS_1.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.METAL_SLAB_1.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.METAL_WALL_1.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceBlock(ModBlocks.METAL_FENCE_1.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceGateBlock(ModBlocks.METAL_FENCE_GATE_1.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.POCKET_DIM_BLOCK_1.get());
        stairsBlock(ModBlocks.POCKET_DIM_BLOCK_STAIRS_1.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.POCKET_DIM_BLOCK_SLAB_1.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_1.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.METAL_FLOOR_2.get());
        stairsBlock(ModBlocks.METAL_STAIRS_2.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.METAL_SLAB_2.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.METAL_WALL_2.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceBlock(ModBlocks.METAL_FENCE_2.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceGateBlock(ModBlocks.METAL_FENCE_GATE_2.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.POCKET_DIM_BLOCK_2.get());
        stairsBlock(ModBlocks.POCKET_DIM_BLOCK_STAIRS_2.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.POCKET_DIM_BLOCK_SLAB_2.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_2.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.METAL_FLOOR_3.get());
        stairsBlock(ModBlocks.METAL_STAIRS_3.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.METAL_SLAB_3.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.METAL_WALL_3.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceBlock(ModBlocks.METAL_FENCE_3.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceGateBlock(ModBlocks.METAL_FENCE_GATE_3.get(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.POCKET_DIM_BLOCK_3.get());
        stairsBlock(ModBlocks.POCKET_DIM_BLOCK_STAIRS_3.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.POCKET_DIM_BLOCK_SLAB_3.get(), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.POCKET_DIM_BLOCK_3.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.DIRTY_METAL_FLOOR.get());
        stairsBlock(ModBlocks.DIRTY_METAL_STAIRS.get(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.DIRTY_METAL_SLAB.get(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        wallBlock(ModBlocks.DIRTY_METAL_WALL.get(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceBlock(ModBlocks.DIRTY_METAL_FENCE.get(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceGateBlock(ModBlocks.DIRTY_METAL_FENCE_GATE.get(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.POCKET_DIM_WALL_TOP.get());
        simpleBlock(ModBlocks.POCKET_DIM_WALL_MID.get());
        simpleBlock(ModBlocks.POCKET_DIM_WALL_BOTTOM.get());

        simpleBlock(ModBlocks.LIGHT_WALL_TOP.get());
        simpleBlock(ModBlocks.MED_WALL_TOP.get());
        simpleBlock(ModBlocks.HEAVY_WALL_TOP_1.get());
        simpleBlock(ModBlocks.HEAVY_WALL_TOP_2.get());
        simpleBlock(ModBlocks.BRICK_WALL_TOP.get());
        simpleBlock(ModBlocks.STAINED_BRICK_WALL_TOP.get());
        simpleBlock(ModBlocks.STAINED_WALL_TOP.get());
        simpleBlock(ModBlocks.CONCRETE_WALL_TOP.get());
        simpleBlock(ModBlocks.BLUE_WALL_TOP.get());

        simpleBlock(ModBlocks.LIGHT_WALL_MID.get());
        simpleBlock(ModBlocks.MED_WALL_MID.get());
        simpleBlock(ModBlocks.HEAVY_WALL_MID_1.get());
        simpleBlock(ModBlocks.HEAVY_WALL_MID_2.get());
        simpleBlock(ModBlocks.BRICK_WALL_MID.get());
        simpleBlock(ModBlocks.STAINED_BRICK_WALL_MID.get());
        simpleBlock(ModBlocks.STAINED_WALL_MID.get());
        simpleBlock(ModBlocks.CONCRETE_WALL_MID.get());
        simpleBlock(ModBlocks.BLUE_WALL_MID.get());

        simpleBlock(ModBlocks.LIGHT_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.MED_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.HEAVY_WALL_BOTTOM_1.get());
        simpleBlock(ModBlocks.HEAVY_WALL_BOTTOM_2.get());
        simpleBlock(ModBlocks.BRICK_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.STAINED_BRICK_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.STAINED_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.CONCRETE_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.BLUE_WALL_BOTTOM.get());

        simpleBlock(ModBlocks.OFFICE_WALL_TOP.get());
        simpleBlock(ModBlocks.OFFICE_WALL_MID.get());
        simpleBlock(ModBlocks.OFFICE_WALL_BOTTOM.get());
        simpleBlock(ModBlocks.OFFICE_CEILING.get());
        //TODO Change
        simpleBlock(ModBlocks.WHITE_WALL.get(), models().cubeAll(ModBlocks.WHITE_WALL.get().getRegistryName().getPath(), modLoc("block/office_wall_mid")));
        simpleBlock(ModBlocks.HEAVY_BLOCK.get());

        simpleBlock(ModBlocks.GRIT_1.get());
        stairsBlock(ModBlocks.GRIT_STAIRS_1.get(), modLoc("block/"+ ModBlocks.GRIT_1.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.GRIT_SLAB_1.get(), modLoc("block/"+ ModBlocks.GRIT_1.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.GRIT_1.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.GRIT_2.get());
        stairsBlock(ModBlocks.GRIT_STAIRS_2.get(), modLoc("block/"+ ModBlocks.GRIT_2.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.GRIT_SLAB_2.get(), modLoc("block/"+ ModBlocks.GRIT_2.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.GRIT_2.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.SCP1499_BLOCK_1.get());
        stairsBlock(ModBlocks.SCP1499_STAIRS_1.get(), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_1.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.SCP1499_SLAB_1.get(), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_1.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_1.get().getRegistryName().getPath()));
        simpleBlock(ModBlocks.SCP1499_BLOCK_2.get());
        stairsBlock(ModBlocks.SCP1499_STAIRS_2.get(), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_2.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.SCP1499_SLAB_2.get(), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_2.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.SCP1499_BLOCK_2.get().getRegistryName().getPath()));

        simpleBlock(ModBlocks.CLOTH_BLOCK.get());
        simpleBlock(ModBlocks.CONTAINMENT_GLASS.get());
        paneBlock(ModBlocks.CONTAINMENT_GLASS_PANE.get(), modLoc("block/"+ ModBlocks.CONTAINMENT_GLASS.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.CONTAINMENT_GLASS.get().getRegistryName().getPath()));

        trapdoorBlock(ModBlocks.VENT_ENTRANCE.get(), modLoc("block/"+ ModBlocks.VENT_ENTRANCE.get().getRegistryName().getPath()), true);

        simpleBlock(ModBlocks.MESH_FLOOR.get());
        stairsBlock(ModBlocks.MESH_STAIR.get(), modLoc("block/"+ ModBlocks.MESH_FLOOR.get().getRegistryName().getPath()));
        slabBlock(ModBlocks.MESH_SLAB.get(), modLoc("block/"+ ModBlocks.MESH_FLOOR.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.MESH_FLOOR.get().getRegistryName().getPath()));

        axisBlock(ModBlocks.CAUTION_LINE_VERTICAL.get(), modLoc("block/caution_line_vertical"), modLoc("block/caution_line_vertical_top"));
        simpleBlock(ModBlocks.CAUTION_LINE_DIAGONAL.get());

        doorBlock(ModBlocks.LIGHT_DOOR.get(), modLoc("block/light_door_bottom"), modLoc("block/light_door_top"));
        doorBlock(ModBlocks.HEAVY_DOOR.get(), modLoc("block/heavy_door_bottom"), modLoc("block/heavy_door_top"));

        simpleBlock(ModBlocks.SCP2845_GRASS.get(), models().cubeBottomTop(ModBlocks.SCP2845_GRASS.get().getRegistryName().getPath(), modLoc("block/scp2845_side"), modLoc("block/scp2845_bottom"), modLoc("block/scp2845_top")));
        logBlock(ModBlocks.SCP2845_LOG.get());
        simpleBlock(ModBlocks.SCP2845_LEAVES.get());
        simpleBlock(ModBlocks.SCP2845_PLANT.get(), models().cross(ModBlocks.SCP2845_PLANT.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.SCP2845_PLANT.get().getRegistryName().getPath())));

        horizontalBlock(ModBlocks.FLUTE.get(), models().getExistingFile(modLoc("block/flute")));
        horizontalBlock(ModBlocks.OLIVE_OIL.get(), models().getExistingFile(modLoc("block/olive_oil")));
        simpleBlock(ModBlocks.GRAIN_POUCH.get(), models().getExistingFile(modLoc("block/grain_pouch")));
        simpleBlock(ModBlocks.GIFT.get(), models().getExistingFile(modLoc("block/gift")));
        horizontalBlock(ModBlocks.FOOLISHNESS.get(), models().getExistingFile(modLoc("block/foolishness")));
        horizontalBlock(ModBlocks.DRAWER.get(), models().getExistingFile(modLoc("block/drawer_082")));
        horizontalBlock(ModBlocks.CEILING_CAMERA.get(), models().getExistingFile(modLoc("block/ceiling_camera")));
        simpleBlock(ModBlocks.BLOOD_PUDDLE.get(), models().getExistingFile(modLoc("block/blood_puddle")));
        horizontalBlock(ModBlocks.SERVER.get(), models().getExistingFile(modLoc("block/server")));

        simpleBlock(ModBlocks.SCP066_BLOCK.get(), models().getExistingFile(modLoc("block/scp066_block")));
        horizontalBlock(ModBlocks.SCP1025.get(), models().getExistingFile(modLoc("block/scp1025")));
    }
}
