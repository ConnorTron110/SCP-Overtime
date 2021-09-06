package io.github.connortron110.overtime.data.client;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Overtime.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Item Block Models
        withExistingParent(ModBlocks.MAGNETIC_BLOCK_ON.get());
        withExistingParent(ModBlocks.RITUAL_BLOCK.get());
        withExistingParent(ModBlocks.TILE_FLOOR_A.get());
        withExistingParent(ModBlocks.TILE_STAIRS_A.get());
        withExistingParent(ModBlocks.TILE_SLAB_A.get());
        withExistingParent(ModBlocks.TILE_FLOOR_B.get());
        withExistingParent(ModBlocks.TILE_STAIRS_B.get());
        withExistingParent(ModBlocks.TILE_SLAB_B.get());
        withExistingParent(ModBlocks.GRATE_BLOCK.get());
        withExistingParent(ModBlocks.GRATE_STAIRS.get());
        withExistingParent(ModBlocks.GRATE_SLAB.get());
        withExistingParent(ModBlocks.GRAVEL_BLOCK.get());
        withExistingParent(ModBlocks.GRAVEL_STAIRS.get());
        withExistingParent(ModBlocks.GRAVEL_SLAB.get());
        withExistingParent(ModBlocks.GRANITE_FLOOR.get());
        withExistingParent(ModBlocks.GRANITE_STAIRS.get());
        withExistingParent(ModBlocks.GRANITE_SLAB.get());
        wallInventory(ModBlocks.GRANITE_WALL.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.GRANITE_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.DARK_FLOOR.get());
        withExistingParent(ModBlocks.DARK_STAIRS.get());
        withExistingParent(ModBlocks.DARK_SLAB.get());
        wallInventory(ModBlocks.DARK_WALL.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceInventory(ModBlocks.DARK_FENCE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));
        fenceGate(ModBlocks.DARK_FENCE_GATE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DARK_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.POCKET_DIM_TILE_FLOOR.get());
        withExistingParent(ModBlocks.POCKET_DIM_TILE_STAIRS.get());
        withExistingParent(ModBlocks.POCKET_DIM_TILE_SLAB.get());

        withExistingParent(ModBlocks.METAL_FLOOR_1.get());
        withExistingParent(ModBlocks.METAL_STAIRS_1.get());
        withExistingParent(ModBlocks.METAL_SLAB_1.get());
        wallInventory(ModBlocks.METAL_WALL_1.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceInventory(ModBlocks.METAL_FENCE_1.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));
        fenceGate(ModBlocks.METAL_FENCE_GATE_1.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_1.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_1.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_1.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_1.get());

        withExistingParent(ModBlocks.METAL_FLOOR_2.get());
        withExistingParent(ModBlocks.METAL_STAIRS_2.get());
        withExistingParent(ModBlocks.METAL_SLAB_2.get());
        wallInventory(ModBlocks.METAL_WALL_2.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceInventory(ModBlocks.METAL_FENCE_2.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));
        fenceGate(ModBlocks.METAL_FENCE_GATE_2.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_2.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_2.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_2.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_2.get());

        withExistingParent(ModBlocks.METAL_FLOOR_3.get());
        withExistingParent(ModBlocks.METAL_STAIRS_3.get());
        withExistingParent(ModBlocks.METAL_SLAB_3.get());
        wallInventory(ModBlocks.METAL_WALL_3.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceInventory(ModBlocks.METAL_FENCE_3.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));
        fenceGate(ModBlocks.METAL_FENCE_GATE_3.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.METAL_FLOOR_3.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_3.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_3.get());
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_3.get());

        withExistingParent(ModBlocks.DIRTY_METAL_FLOOR.get());
        withExistingParent(ModBlocks.DIRTY_METAL_STAIRS.get());
        withExistingParent(ModBlocks.DIRTY_METAL_SLAB.get());
        wallInventory(ModBlocks.DIRTY_METAL_WALL.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceInventory(ModBlocks.DIRTY_METAL_FENCE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));
        fenceGate(ModBlocks.DIRTY_METAL_FENCE_GATE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.DIRTY_METAL_FLOOR.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.POCKET_DIM_WALL_TOP.get());
        withExistingParent(ModBlocks.POCKET_DIM_WALL_MID.get());
        withExistingParent(ModBlocks.POCKET_DIM_WALL_BOTTOM.get());

        withExistingParent(ModBlocks.LIGHT_WALL_TOP.get());
        withExistingParent(ModBlocks.MED_WALL_TOP.get());
        withExistingParent(ModBlocks.HEAVY_WALL_TOP_1.get());
        withExistingParent(ModBlocks.HEAVY_WALL_TOP_2.get());
        withExistingParent(ModBlocks.BRICK_WALL_TOP.get());
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_TOP.get());
        withExistingParent(ModBlocks.STAINED_WALL_TOP.get());
        withExistingParent(ModBlocks.CONCRETE_WALL_TOP.get());
        withExistingParent(ModBlocks.BLUE_WALL_TOP.get());

        withExistingParent(ModBlocks.LIGHT_WALL_MID.get());
        withExistingParent(ModBlocks.MED_WALL_MID.get());
        withExistingParent(ModBlocks.HEAVY_WALL_MID_1.get());
        withExistingParent(ModBlocks.HEAVY_WALL_MID_2.get());
        withExistingParent(ModBlocks.BRICK_WALL_MID.get());
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_MID.get());
        withExistingParent(ModBlocks.STAINED_WALL_MID.get());
        withExistingParent(ModBlocks.CONCRETE_WALL_MID.get());
        withExistingParent(ModBlocks.BLUE_WALL_MID.get());

        withExistingParent(ModBlocks.LIGHT_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.MED_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.HEAVY_WALL_BOTTOM_1.get());
        withExistingParent(ModBlocks.HEAVY_WALL_BOTTOM_2.get());
        withExistingParent(ModBlocks.BRICK_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.STAINED_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.CONCRETE_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.BLUE_WALL_BOTTOM.get());

        withExistingParent(ModBlocks.OFFICE_WALL_TOP.get());
        withExistingParent(ModBlocks.OFFICE_WALL_MID.get());
        withExistingParent(ModBlocks.OFFICE_WALL_BOTTOM.get());
        withExistingParent(ModBlocks.OFFICE_CEILING.get());
        withExistingParent(ModBlocks.WHITE_WALL.get());
        withExistingParent(ModBlocks.HEAVY_BLOCK.get());

        withExistingParent(ModBlocks.GRIT_1.get());
        withExistingParent(ModBlocks.GRIT_STAIRS_1.get());
        withExistingParent(ModBlocks.GRIT_SLAB_1.get());
        withExistingParent(ModBlocks.GRIT_2.get());
        withExistingParent(ModBlocks.GRIT_STAIRS_2.get());
        withExistingParent(ModBlocks.GRIT_SLAB_2.get());

        withExistingParent(ModBlocks.SCP1499_BLOCK_1.get());
        withExistingParent(ModBlocks.SCP1499_STAIRS_1.get());
        withExistingParent(ModBlocks.SCP1499_SLAB_1.get());
        withExistingParent(ModBlocks.SCP1499_BLOCK_2.get());
        withExistingParent(ModBlocks.SCP1499_STAIRS_2.get());
        withExistingParent(ModBlocks.SCP1499_SLAB_2.get());

        withExistingParent(ModBlocks.CLOTH_BLOCK.get());
        withExistingParent(ModBlocks.CONTAINMENT_GLASS.get());
        paneSideAlt(ModBlocks.CONTAINMENT_GLASS_PANE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.CONTAINMENT_GLASS.get().getRegistryName().getPath()), modLoc("block/"+ ModBlocks.CONTAINMENT_GLASS.get().getRegistryName().getPath()));

        trapdoorBottom(ModBlocks.VENT_ENTRANCE.get().getRegistryName().getPath(), modLoc("block/"+ ModBlocks.VENT_ENTRANCE.get().getRegistryName().getPath()));

        withExistingParent(ModBlocks.MESH_FLOOR.get());
        withExistingParent(ModBlocks.MESH_STAIR.get());
        withExistingParent(ModBlocks.MESH_SLAB.get());

        withExistingParent(ModBlocks.CAUTION_LINE_VERTICAL.get());
        withExistingParent(ModBlocks.CAUTION_LINE_DIAGONAL.get());

        withExistingParent(ModBlocks.VENDING_DRINK_BLUE.get());
        withExistingParent(ModBlocks.VENDING_DRINK_PINK.get());
        withExistingParent(ModBlocks.VENDING_DRINK_PURPLE.get());

        withExistingParent(ModBlocks.SCP2845_GRASS.get());
        withExistingParent(ModBlocks.SCP2845_LOG.get());
        withExistingParent(ModBlocks.SCP2845_LEAVES.get());

        withExistingParent(ModBlocks.FLUTE.get());
        withExistingParent(ModBlocks.OLIVE_OIL.get());
        withExistingParent(ModBlocks.GRAIN_POUCH.get());
        withExistingParent(ModBlocks.GIFT.get());
        withExistingParent(ModBlocks.FOOLISHNESS.get());
        withExistingParent(ModBlocks.DRAWER.get());
        withExistingParent(ModBlocks.CEILING_CAMERA.get());
        withExistingParent(ModBlocks.BLOOD_PUDDLE.get());
        withExistingParent(ModBlocks.SERVER.get());
        withExistingParent(ModBlocks.COMPUTER.get().getRegistryName().getPath(), modLoc("block/computer_off"));
        withExistingParent(ModBlocks.TERMINAL.get().getRegistryName().getPath(), modLoc("block/terminal_off"));
        withExistingParent(ModBlocks.SCP1025.get().getRegistryName().getPath(), modLoc("block/scp1025"));
        withExistingParent(ModBlocks.SCP1762.get().getRegistryName().getPath(), modLoc("block/scp1762_closed"));


        //Item Generated Models
        final ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        getBuilder(ModBlocks.LIGHT_DOOR.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/light_door");
        getBuilder(ModBlocks.HEAVY_DOOR.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/heavy_door");
        getBuilder(ModBlocks.SCP2845_PLANT.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "block/"+ ModBlocks.SCP2845_PLANT.get().getRegistryName().getPath());
        getBuilder(ModBlocks.SCP066_BLOCK.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/scp066");
        getBuilder(ModItems.SCP427.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/scp427");
        getBuilder(ModItems.SCP500_PILL.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/scp500_pill");

        getBuilder(ModItems.ICON_SAFE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.ICON_SAFE.get().getRegistryName().getPath());
        getBuilder(ModItems.ICON_EUCLID.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.ICON_EUCLID.get().getRegistryName().getPath());
        getBuilder(ModItems.ICON_KETER.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.ICON_KETER.get().getRegistryName().getPath());
        getBuilder(ModItems.CUPCAKE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.CUPCAKE.get().getRegistryName().getPath());
        getBuilder(ModItems.MOB_DESPAWNER.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/pipe");

        getBuilder(ModItems.MONEY.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.MONEY.get().getRegistryName().getPath());

        getBuilder(ModItems.CANNED_COFFEE.get().getRegistryName().getPath()).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/"+ ModItems.CANNED_COFFEE.get().getRegistryName().getPath());
        getBuilder(ModItems.CAKEA_COLA.get().getRegistryName().getPath()).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/"+ ModItems.CAKEA_COLA.get().getRegistryName().getPath());
        getBuilder(ModItems.SANGRITA_DILE.get().getRegistryName().getPath()).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/"+ ModItems.SANGRITA_DILE.get().getRegistryName().getPath());
        getBuilder(ModItems.SKY_FISH.get().getRegistryName().getPath()).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/"+ ModItems.SKY_FISH.get().getRegistryName().getPath());
        getBuilder(ModItems.PUMPKIN_PUNCH.get().getRegistryName().getPath()).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/"+ ModItems.PUMPKIN_PUNCH.get().getRegistryName().getPath());

        getBuilder(ModItems.HAZMAT_HELMET.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_helmet");
        getBuilder(ModItems.HAZMAT_CHEST.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_chest");
        getBuilder(ModItems.HAZMAT_LEGGINGS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_leggings");
        getBuilder(ModItems.HAZMAT_BOOTS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_boots");
        getBuilder(ModItems.HAZMAT_LEGGINGS_YELLOW.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_yellow_leggings");
        getBuilder(ModItems.HAZMAT_CHEST_YELLOW.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_yellow_chest");
        getBuilder(ModItems.HAZMAT_HELMET_YELLOW.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/hazmat_suit_yellow_helmet");
        getBuilder(ModItems.JUMPSUIT_CHEST.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/jumpsuit_chest");
        getBuilder(ModItems.JUMPSUIT_LEGGINGS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/jumpsuit_leggings");
        getBuilder(ModItems.JUMPSUIT_BOOTS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/jumpsuit_boots");
        getBuilder(ModItems.JUMPSUIT_LEGGINGS_ORANGE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/jumpsuit_orange_leggings");
        getBuilder(ModItems.JUMPSUIT_CHEST_ORANGE.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/jumpsuit_orange_chest");
        getBuilder(ModItems.GASMASK.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/gasmask");
        getBuilder(ModItems.LABCOAT_CHEST.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/labcoat_chest");
        getBuilder(ModItems.LABCOAT_LEGGINGS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/labcoat_leggings");
        getBuilder(ModItems.LABCOAT_BOOTS.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/labcoat_boots");
        getBuilder(ModItems.LABCOAT_LEGGINGS_RED.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/labcoat_red_leggings");
        getBuilder(ModItems.LABCOAT_CHEST_RED.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/labcoat_red_chest");


        final ModelFile spawnegg = getExistingFile(mcLoc("item/template_spawn_egg"));
        getBuilder(ModItems.SCP035_TENDRIL_SPAWNER.get().getRegistryName().getPath()).parent(itemGenerated).texture("layer0", "item/"+ ModItems.SCP035_TENDRIL_SPAWNER.get().getRegistryName().getPath());
        getBuilder(ModItems.SCP066_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP131_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP303_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP427_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP745_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP835_JP_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP966_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP1529_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP2761_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP3199_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP3456_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
        getBuilder(ModItems.SCP5167_SPAWN_EGG.get().getRegistryName().getPath()).parent(spawnegg);
    }

    private void withExistingParent(Block block) {
        withExistingParent(block.getRegistryName().getPath(), modLoc("block/"+block.getRegistryName().getPath()));
    }
}
