package io.github.connortron110.overtime.datagen.client;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.core.init.BlockInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Item Block Models
        withExistingParent(BlockInit.MAGNETIC_BLOCK_ON.get());
        withExistingParent(BlockInit.RITUAL_BLOCK.get());
        withExistingParent(BlockInit.TILE_FLOOR_A.get());
        withExistingParent(BlockInit.TILE_STAIRS_A.get());
        withExistingParent(BlockInit.TILE_SLAB_A.get());
        withExistingParent(BlockInit.TILE_FLOOR_B.get());
        withExistingParent(BlockInit.TILE_STAIRS_B.get());
        withExistingParent(BlockInit.TILE_SLAB_B.get());
        withExistingParent(BlockInit.GRATE_BLOCK.get());
        withExistingParent(BlockInit.GRATE_STAIRS.get());
        withExistingParent(BlockInit.GRATE_SLAB.get());
        withExistingParent(BlockInit.GRAVEL_BLOCK.get());
        withExistingParent(BlockInit.GRAVEL_STAIRS.get());
        withExistingParent(BlockInit.GRAVEL_SLAB.get());
        withExistingParent(BlockInit.GRANITE_FLOOR.get());
        withExistingParent(BlockInit.GRANITE_STAIRS.get());
        withExistingParent(BlockInit.GRANITE_SLAB.get());
        wallInventory(BlockInit.GRANITE_WALL.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.GRANITE_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.DARK_FLOOR.get());
        withExistingParent(BlockInit.DARK_STAIRS.get());
        withExistingParent(BlockInit.DARK_SLAB.get());
        wallInventory(BlockInit.DARK_WALL.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceInventory(BlockInit.DARK_FENCE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceGate(BlockInit.DARK_FENCE_GATE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DARK_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.METAL_FLOOR_1.get());
        withExistingParent(BlockInit.METAL_STAIRS_1.get());
        withExistingParent(BlockInit.METAL_SLAB_1.get());
        wallInventory(BlockInit.METAL_WALL_1.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceInventory(BlockInit.METAL_FENCE_1.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceGate(BlockInit.METAL_FENCE_GATE_1.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_1.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.METAL_FLOOR_2.get());
        withExistingParent(BlockInit.METAL_STAIRS_2.get());
        withExistingParent(BlockInit.METAL_SLAB_2.get());
        wallInventory(BlockInit.METAL_WALL_2.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceInventory(BlockInit.METAL_FENCE_2.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceGate(BlockInit.METAL_FENCE_GATE_2.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_2.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.METAL_FLOOR_3.get());
        withExistingParent(BlockInit.METAL_STAIRS_3.get());
        withExistingParent(BlockInit.METAL_SLAB_3.get());
        wallInventory(BlockInit.METAL_WALL_3.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceInventory(BlockInit.METAL_FENCE_3.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceGate(BlockInit.METAL_FENCE_GATE_3.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.METAL_FLOOR_3.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.DIRTY_METAL_FLOOR.get());
        withExistingParent(BlockInit.DIRTY_METAL_STAIRS.get());
        withExistingParent(BlockInit.DIRTY_METAL_SLAB.get());
        wallInventory(BlockInit.DIRTY_METAL_WALL.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceInventory(BlockInit.DIRTY_METAL_FENCE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceGate(BlockInit.DIRTY_METAL_FENCE_GATE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.GRIT_1.get());
        withExistingParent(BlockInit.GRIT_STAIRS_1.get());
        withExistingParent(BlockInit.GRIT_SLAB_1.get());
        withExistingParent(BlockInit.GRIT_2.get());
        withExistingParent(BlockInit.GRIT_STAIRS_2.get());
        withExistingParent(BlockInit.GRIT_SLAB_2.get());

        withExistingParent(BlockInit.LIGHT_WALL_TOP.get());
        withExistingParent(BlockInit.MED_WALL_TOP.get());
        withExistingParent(BlockInit.HEAVY_WALL_TOP_1.get());
        withExistingParent(BlockInit.HEAVY_WALL_TOP_2.get());
        withExistingParent(BlockInit.BRICK_WALL_TOP.get());
        withExistingParent(BlockInit.STAINED_BRICK_WALL_TOP.get());
        withExistingParent(BlockInit.STAINED_WALL_TOP.get());
        withExistingParent(BlockInit.CONCRETE_WALL_TOP.get());
        withExistingParent(BlockInit.POCKET_DIM_WALL_TOP.get());

        withExistingParent(BlockInit.LIGHT_WALL_MID.get());
        withExistingParent(BlockInit.MED_WALL_MID.get());
        withExistingParent(BlockInit.HEAVY_WALL_MID_1.get());
        withExistingParent(BlockInit.HEAVY_WALL_MID_2.get());
        withExistingParent(BlockInit.BRICK_WALL_MID.get());
        withExistingParent(BlockInit.STAINED_BRICK_WALL_MID.get());
        withExistingParent(BlockInit.STAINED_WALL_MID.get());
        withExistingParent(BlockInit.CONCRETE_WALL_MID.get());
        withExistingParent(BlockInit.POCKET_DIM_WALL_MID.get());

        withExistingParent(BlockInit.LIGHT_WALL_BOTTOM.get());
        withExistingParent(BlockInit.MED_WALL_BOTTOM.get());
        withExistingParent(BlockInit.HEAVY_WALL_BOTTOM_1.get());
        withExistingParent(BlockInit.HEAVY_WALL_BOTTOM_2.get());
        withExistingParent(BlockInit.BRICK_WALL_BOTTOM.get());
        withExistingParent(BlockInit.STAINED_BRICK_WALL_BOTTOM.get());
        withExistingParent(BlockInit.STAINED_WALL_BOTTOM.get());
        withExistingParent(BlockInit.CONCRETE_WALL_BOTTOM.get());
        withExistingParent(BlockInit.POCKET_DIM_WALL_BOTTOM.get());

        withExistingParent(BlockInit.POCKET_DIM_TILE_FLOOR.get());
        withExistingParent(BlockInit.POCKET_DIM_TILE_STAIRS.get());
        withExistingParent(BlockInit.POCKET_DIM_TILE_SLAB.get());

        withExistingParent(BlockInit.POCKET_DIM_BLOCK_1.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_STAIRS_1.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_SLAB_1.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_2.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_STAIRS_2.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_SLAB_2.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_3.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_STAIRS_3.get());
        withExistingParent(BlockInit.POCKET_DIM_BLOCK_SLAB_3.get());

        withExistingParent(BlockInit.SCP1499_BLOCK_1.get());
        withExistingParent(BlockInit.SCP1499_STAIRS_1.get());
        withExistingParent(BlockInit.SCP1499_SLAB_1.get());
        withExistingParent(BlockInit.SCP1499_BLOCK_2.get());
        withExistingParent(BlockInit.SCP1499_STAIRS_2.get());
        withExistingParent(BlockInit.SCP1499_SLAB_2.get());

        withExistingParent(BlockInit.BLUE_WALL_TOP.get());
        withExistingParent(BlockInit.BLUE_WALL_MID.get());
        withExistingParent(BlockInit.BLUE_WALL_BOTTOM.get());
        withExistingParent(BlockInit.OFFICE_WALL_TOP.get());
        withExistingParent(BlockInit.OFFICE_WALL_BOTTOM.get());
        withExistingParent(BlockInit.OFFICE_CEILING.get());
        withExistingParent(BlockInit.WHITE_WALL.get());
        withExistingParent(BlockInit.HEAVY_BLOCK.get());
        withExistingParent(BlockInit.CLOTH_BLOCK.get());

        withExistingParent(BlockInit.CONTAINMENT_GLASS.get());
        paneSideAlt(BlockInit.CONTAINMENT_GLASS_PANE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.CONTAINMENT_GLASS.get().getRegistryName().getPath()), modLoc("block/"+BlockInit.CONTAINMENT_GLASS.get().getRegistryName().getPath()));

        trapdoorBottom(BlockInit.VENT_ENTRANCE.get().getRegistryName().getPath(), modLoc("block/"+BlockInit.VENT_ENTRANCE.get().getRegistryName().getPath()));

        withExistingParent(BlockInit.SCP2845_GRASS.get());
        withExistingParent(BlockInit.SCP2845_LOG.get());
        withExistingParent(BlockInit.SCP2845_LEAVES.get());

        withExistingParent(BlockInit.FLUTE.get());
        withExistingParent(BlockInit.OLIVE_OIL.get());
        withExistingParent(BlockInit.GRAIN_POUCH.get());
        withExistingParent(BlockInit.GIFT.get());
        withExistingParent(BlockInit.FOOLISHNESS.get());
        withExistingParent(BlockInit.DRAWER.get());
        withExistingParent(BlockInit.CEILING_CAMERA.get());
        withExistingParent(BlockInit.BLOOD_PUDDLE.get());
        withExistingParent(BlockInit.SERVER.get());
        withExistingParent(BlockInit.COMPUTER.get().getRegistryName().getPath(), modLoc("block/computer_off"));
        withExistingParent(BlockInit.TERMINAL.get().getRegistryName().getPath(), modLoc("block/terminal_off"));


        //Item Generated Models
        final ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        getBuilder(BlockInit.SCP2845_PLANT.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "block/"+BlockInit.SCP2845_PLANT.get().getRegistryName().getPath());

        getBuilder(ItemInit.ICON_SAFE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ItemInit.ICON_SAFE.get().getRegistryName().getPath());
        getBuilder(ItemInit.ICON_EUCLID.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ItemInit.ICON_EUCLID.get().getRegistryName().getPath());
        getBuilder(ItemInit.ICON_KETER.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ItemInit.ICON_KETER.get().getRegistryName().getPath());
        getBuilder(ItemInit.CUPCAKE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ItemInit.CUPCAKE.get().getRegistryName().getPath());
        getBuilder(ItemInit.MOB_DESPAWNER.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/pipe");

    }

    private void withExistingParent(Block block) {
        withExistingParent(block.getRegistryName().getPath(), modLoc("block/"+block.getRegistryName().getPath()));
    }
}
