package io.github.connortron110.overtime.data.client;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.RegistryObject;

/**
 * Try and keep the texture name the same as the registry name
 */
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Overtime.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Item Block Models
        withExistingParent(ModBlocks.MAGNETIC_BLOCK_ON);
        withExistingParent(ModBlocks.RITUAL_BLOCK);
        withExistingParent(ModBlocks.TILE_FLOOR_A);
        withExistingParent(ModBlocks.TILE_STAIRS_A);
        withExistingParent(ModBlocks.TILE_SLAB_A);
        withExistingParent(ModBlocks.TILE_FLOOR_B);
        withExistingParent(ModBlocks.TILE_STAIRS_B);
        withExistingParent(ModBlocks.TILE_SLAB_B);
        withExistingParent(ModBlocks.GRATE_BLOCK);
        withExistingParent(ModBlocks.GRATE_STAIRS);
        withExistingParent(ModBlocks.GRATE_SLAB);
        withExistingParent(ModBlocks.GRAVEL_BLOCK);
        withExistingParent(ModBlocks.GRAVEL_STAIRS);
        withExistingParent(ModBlocks.GRAVEL_SLAB);
        withExistingParent(ModBlocks.GRANITE_FLOOR);
        withExistingParent(ModBlocks.GRANITE_STAIRS);
        withExistingParent(ModBlocks.GRANITE_SLAB);
        wallInventory(getPath(ModBlocks.GRANITE_WALL), modLoc("block/" + getPath(ModBlocks.GRANITE_FLOOR)));

        withExistingParent(ModBlocks.DARK_FLOOR);
        withExistingParent(ModBlocks.DARK_STAIRS);
        withExistingParent(ModBlocks.DARK_SLAB);
        wallInventory(getPath(ModBlocks.DARK_WALL), modLoc("block/" + getPath(ModBlocks.DARK_FLOOR)));
        fenceInventory(getPath(ModBlocks.DARK_FENCE), modLoc("block/"+ getPath(ModBlocks.DARK_FLOOR)));
        fenceGate(getPath(ModBlocks.DARK_FENCE_GATE), modLoc("block/"+ getPath(ModBlocks.DARK_FLOOR)));

        withExistingParent(ModBlocks.POCKET_DIM_TILE_FLOOR);
        withExistingParent(ModBlocks.POCKET_DIM_TILE_STAIRS);
        withExistingParent(ModBlocks.POCKET_DIM_TILE_SLAB);

        withExistingParent(ModBlocks.METAL_FLOOR_1);
        withExistingParent(ModBlocks.METAL_STAIRS_1);
        withExistingParent(ModBlocks.METAL_SLAB_1);
        wallInventory(getPath(ModBlocks.METAL_WALL_1), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_1)));
        fenceInventory(getPath(ModBlocks.METAL_FENCE_1), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_1)));
        fenceGate(getPath(ModBlocks.METAL_FENCE_GATE_1), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_1)));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_1);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_1);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_1);

        withExistingParent(ModBlocks.METAL_FLOOR_2);
        withExistingParent(ModBlocks.METAL_STAIRS_2);
        withExistingParent(ModBlocks.METAL_SLAB_2);
        wallInventory(getPath(ModBlocks.METAL_WALL_2), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_2)));
        fenceInventory(getPath(ModBlocks.METAL_FENCE_2), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_2)));
        fenceGate(getPath(ModBlocks.METAL_FENCE_GATE_2), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_2)));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_2);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_2);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_2);

        withExistingParent(ModBlocks.METAL_FLOOR_3);
        withExistingParent(ModBlocks.METAL_STAIRS_3);
        withExistingParent(ModBlocks.METAL_SLAB_3);
        wallInventory(getPath(ModBlocks.METAL_WALL_3), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_3)));
        fenceInventory(getPath(ModBlocks.METAL_FENCE_3), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_3)));
        fenceGate(getPath(ModBlocks.METAL_FENCE_GATE_3), modLoc("block/" + getPath(ModBlocks.METAL_FLOOR_3)));

        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_3);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_STAIRS_3);
        withExistingParent(ModBlocks.POCKET_DIM_BLOCK_SLAB_3);

        withExistingParent(ModBlocks.DIRTY_METAL_FLOOR);
        withExistingParent(ModBlocks.DIRTY_METAL_STAIRS);
        withExistingParent(ModBlocks.DIRTY_METAL_SLAB);
        wallInventory(getPath(ModBlocks.DIRTY_METAL_WALL), modLoc("block/" + getPath(ModBlocks.DIRTY_METAL_FLOOR)));
        fenceInventory(getPath(ModBlocks.DIRTY_METAL_FENCE), modLoc("block/" + getPath(ModBlocks.DIRTY_METAL_FLOOR)));
        fenceGate(getPath(ModBlocks.DIRTY_METAL_FENCE_GATE), modLoc("block/" + getPath(ModBlocks.DIRTY_METAL_FLOOR)));

        withExistingParent(ModBlocks.POCKET_DIM_WALL_TOP);
        withExistingParent(ModBlocks.POCKET_DIM_WALL_MID);
        withExistingParent(ModBlocks.POCKET_DIM_WALL_BOTTOM);

        withExistingParent(ModBlocks.LIGHT_WALL_TOP);
        withExistingParent(ModBlocks.MED_WALL_TOP);
        withExistingParent(ModBlocks.HEAVY_WALL_TOP_1);
        withExistingParent(ModBlocks.HEAVY_WALL_TOP_2);
        withExistingParent(ModBlocks.BRICK_WALL_TOP);
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_TOP);
        withExistingParent(ModBlocks.STAINED_WALL_TOP);
        withExistingParent(ModBlocks.CONCRETE_WALL_TOP);
        withExistingParent(ModBlocks.BLUE_WALL_TOP);

        withExistingParent(ModBlocks.LIGHT_WALL_MID);
        withExistingParent(ModBlocks.MED_WALL_MID);
        withExistingParent(ModBlocks.HEAVY_WALL_MID_1);
        withExistingParent(ModBlocks.HEAVY_WALL_MID_2);
        withExistingParent(ModBlocks.BRICK_WALL_MID);
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_MID);
        withExistingParent(ModBlocks.STAINED_WALL_MID);
        withExistingParent(ModBlocks.CONCRETE_WALL_MID);
        withExistingParent(ModBlocks.BLUE_WALL_MID);

        withExistingParent(ModBlocks.LIGHT_WALL_BOTTOM);
        withExistingParent(ModBlocks.MED_WALL_BOTTOM);
        withExistingParent(ModBlocks.HEAVY_WALL_BOTTOM_1);
        withExistingParent(ModBlocks.HEAVY_WALL_BOTTOM_2);
        withExistingParent(ModBlocks.BRICK_WALL_BOTTOM);
        withExistingParent(ModBlocks.STAINED_BRICK_WALL_BOTTOM);
        withExistingParent(ModBlocks.STAINED_WALL_BOTTOM);
        withExistingParent(ModBlocks.CONCRETE_WALL_BOTTOM);
        withExistingParent(ModBlocks.BLUE_WALL_BOTTOM);

        withExistingParent(ModBlocks.OFFICE_WALL_TOP);
        withExistingParent(ModBlocks.OFFICE_WALL_MID);
        withExistingParent(ModBlocks.OFFICE_WALL_BOTTOM);
        withExistingParent(ModBlocks.OFFICE_CEILING);
        withExistingParent(ModBlocks.WHITE_WALL);
        withExistingParent(ModBlocks.HEAVY_BLOCK);

        withExistingParent(ModBlocks.GRIT_1);
        withExistingParent(ModBlocks.GRIT_STAIRS_1);
        withExistingParent(ModBlocks.GRIT_SLAB_1);
        withExistingParent(ModBlocks.GRIT_2);
        withExistingParent(ModBlocks.GRIT_STAIRS_2);
        withExistingParent(ModBlocks.GRIT_SLAB_2);

        withExistingParent(ModBlocks.SCP1499_BLOCK_1);
        withExistingParent(ModBlocks.SCP1499_STAIRS_1);
        withExistingParent(ModBlocks.SCP1499_SLAB_1);
        withExistingParent(ModBlocks.SCP1499_BLOCK_2);
        withExistingParent(ModBlocks.SCP1499_STAIRS_2);
        withExistingParent(ModBlocks.SCP1499_SLAB_2);

        withExistingParent(ModBlocks.CLOTH_BLOCK);
        withExistingParent(ModBlocks.CONTAINMENT_GLASS);
        paneSideAlt(getPath(ModBlocks.CONTAINMENT_GLASS_PANE), modLoc("block/" + getPath(ModBlocks.CONTAINMENT_GLASS)), modLoc("block/" + getPath(ModBlocks.CONTAINMENT_GLASS)));

        trapdoorBottom(getPath(ModBlocks.VENT_ENTRANCE), modLoc("block/" + getPath(ModBlocks.VENT_ENTRANCE)));

        withExistingParent(ModBlocks.MESH_FLOOR);
        withExistingParent(ModBlocks.MESH_STAIR);
        withExistingParent(ModBlocks.MESH_SLAB);

        withExistingParent(ModBlocks.CAUTION_LINE_VERTICAL);
        withExistingParent(ModBlocks.CAUTION_LINE_DIAGONAL);

        withExistingParent(ModBlocks.VENDING_DRINK_BLUE);
        withExistingParent(ModBlocks.VENDING_DRINK_PINK);
        withExistingParent(ModBlocks.VENDING_DRINK_PURPLE);

        withExistingParent(ModBlocks.SCP2845_GRASS);
        withExistingParent(ModBlocks.SCP2845_LOG);
        withExistingParent(ModBlocks.SCP2845_LEAVES);

        withExistingParent(ModBlocks.FLUTE);
        withExistingParent(ModBlocks.OLIVE_OIL);
        withExistingParent(ModBlocks.GRAIN_POUCH);
        withExistingParent(ModBlocks.GIFT);
        withExistingParent(ModBlocks.FOOLISHNESS);
        withExistingParent(ModBlocks.DRAWER);
        withExistingParent(ModBlocks.CEILING_CAMERA);
        withExistingParent(ModBlocks.BLOOD_PUDDLE);
        withExistingParent(ModBlocks.SERVER);
        withExistingParent(getPath(ModBlocks.COMPUTER), modLoc("block/computer_off"));
        withExistingParent(getPath(ModBlocks.TERMINAL), modLoc("block/terminal_off"));
        withExistingParent(getPath(ModBlocks.SCP1025), modLoc("block/scp1025"));
        withExistingParent(getPath(ModBlocks.SCP1762), modLoc("block/scp1762_closed"));


        //Item Generated Models
        simpleItem(ModBlocks.LIGHT_DOOR);
        simpleItem(ModBlocks.HEAVY_DOOR);
        simpleItem(ModBlocks.SCP2845_PLANT, "block/" + getPath(ModBlocks.SCP2845_PLANT));
        simpleItem(ModBlocks.SCP066_BLOCK, "item/scp066");
        simpleItem(ModItems.SCP427);
        simpleItem(ModItems.SCP500_PILL);

        simpleItem(ModItems.ICON_SAFE);
        simpleItem(ModItems.ICON_EUCLID);
        simpleItem(ModItems.ICON_KETER);
        simpleItem(ModItems.CUPCAKE);
        simpleItem(ModItems.MOB_DESPAWNER, "item/pipe");

        simpleItem(ModItems.MONEY);

        getBuilder(getPath(ModItems.CANNED_COFFEE)).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/" + getPath(ModItems.CANNED_COFFEE));
        getBuilder(getPath(ModItems.CAKEA_COLA)).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/" + getPath(ModItems.CAKEA_COLA));
        getBuilder(getPath(ModItems.SANGRITA_DILE)).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/" + getPath(ModItems.SANGRITA_DILE));
        getBuilder(getPath(ModItems.SKY_FISH)).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/" + getPath(ModItems.SKY_FISH));
        getBuilder(getPath(ModItems.PUMPKIN_PUNCH)).parent(getExistingFile(modLoc("item/drink"))).texture("drink", "item/" + getPath(ModItems.PUMPKIN_PUNCH));

        simpleItem(ModItems.HAZMAT_HELMET, "item/hazmat_suit_helmet");
        simpleItem(ModItems.HAZMAT_CHEST, "item/hazmat_suit_chest");
        simpleItem(ModItems.HAZMAT_LEGGINGS, "item/hazmat_suit_leggings");
        simpleItem(ModItems.HAZMAT_BOOTS, "item/hazmat_suit_boots");
        simpleItem(ModItems.HAZMAT_LEGGINGS_YELLOW, "item/hazmat_suit_yellow_leggings");
        simpleItem(ModItems.HAZMAT_CHEST_YELLOW, "item/hazmat_suit_yellow_chest");
        simpleItem(ModItems.HAZMAT_HELMET_YELLOW, "item/hazmat_suit_yellow_helmet");
        simpleItem(ModItems.JUMPSUIT_CHEST, "item/jumpsuit_chest");
        simpleItem(ModItems.JUMPSUIT_LEGGINGS, "item/jumpsuit_leggings");
        simpleItem(ModItems.JUMPSUIT_BOOTS, "item/jumpsuit_boots");
        simpleItem(ModItems.JUMPSUIT_LEGGINGS_ORANGE, "item/jumpsuit_orange_leggings");
        simpleItem(ModItems.JUMPSUIT_CHEST_ORANGE, "item/jumpsuit_orange_chest");
        simpleItem(ModItems.GASMASK, "item/gasmask");
        simpleItem(ModItems.LABCOAT_CHEST, "item/labcoat_chest");
        simpleItem(ModItems.LABCOAT_LEGGINGS, "item/labcoat_leggings");
        simpleItem(ModItems.LABCOAT_BOOTS, "item/labcoat_boots");
        simpleItem(ModItems.LABCOAT_LEGGINGS_RED, "item/labcoat_red_leggings");
        simpleItem(ModItems.LABCOAT_CHEST_RED, "item/labcoat_red_chest");


        simpleItem(ModItems.SCP035_TENDRIL_SPAWNER);
        spawnEggItem(ModItems.SCP066_SPAWN_EGG);
        spawnEggItem(ModItems.SCP131_SPAWN_EGG);
        spawnEggItem(ModItems.SCP303_SPAWN_EGG);
        spawnEggItem(ModItems.SCP427_SPAWN_EGG);
        spawnEggItem(ModItems.SCP745_SPAWN_EGG);
        spawnEggItem(ModItems.SCP835_JP_SPAWN_EGG);
        spawnEggItem(ModItems.SCP966_SPAWN_EGG);
        spawnEggItem(ModItems.SCP1529_SPAWN_EGG);
        spawnEggItem(ModItems.SCP2761_SPAWN_EGG);
        spawnEggItem(ModItems.SCP3199_SPAWN_EGG);
        spawnEggItem(ModItems.SCP3456_SPAWN_EGG);
        spawnEggItem(ModItems.SCP5167_SPAWN_EGG);
    }

    private String getPath(RegistryObject<?> reg) {
        return reg.get().getRegistryName().getPath();
    }

    private void simpleItem(RegistryObject<?> reg) {
        simpleItem(reg, "item/" + getPath(reg));
    }
    private void simpleItem(RegistryObject<?> reg, String textureLoc) {
        getBuilder(getPath(reg)).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", textureLoc);
    }

    private void spawnEggItem(RegistryObject<? extends Item> reg) {
        getBuilder(getPath(reg)).parent(getExistingFile(mcLoc("item/template_spawn_egg")));
    }

    private void withExistingParent(RegistryObject<?> reg) {
        withExistingParent(getPath(reg), modLoc("block/" + getPath(reg)));
    }
}
