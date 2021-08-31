package io.github.connortron110.overtime.data;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModEntities;
import io.github.connortron110.overtime.core.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.RegistryObject;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(DataGenerator gen) {
        super(gen, Overtime.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        /*Custom Messages*/ {
            add("scp1025.effect", "You read an article about %1$s");
            add("scp1025.heartattack", "You read about Heart Attacks");
            add("scp1025.noeffect", "Its just a blank page...");
        }

        /*Death Messages*/ {
            add("death.attack.whipped", "%1$s got Whipped to death by SCP-066");
            add("death.attack.066deaf", "%1$s got Deafened by SCP-066");
            add("death.attack.427fleshbeast", "%1$s got Transmutated by SCP-427");
            add("death.attack.5167deaf", "%1$s got Deafened by SCP-5167");
        }

        /*Entities*/ {
            entityWithEgg(ModEntities.SCP035_TENDRIL, ModItems.SCP035_TENDRIL_SPAWNER, "SCP-035 Tendril");
            entityWithEgg(ModEntities.SCP066, ModItems.SCP066_SPAWN_EGG, "SCP-066-2 - \"Eric's Toy\"");
            entity(ModEntities.SCP066_CAT, "SCP-066 Cat");
            entityWithEgg(ModEntities.SCP131, ModItems.SCP131_SPAWN_EGG, "SCP-131 - The \"Eye Pods\"");
            entityWithEgg(ModEntities.SCP303, ModItems.SCP303_SPAWN_EGG, "SCP-303 - The Doorman");
            entityWithEgg(ModEntities.SCP427, ModItems.SCP427_SPAWN_EGG, "SCP-427 - Lovecraftian Locket Flesh");
            entityWithEgg(ModEntities.SCP745, ModItems.SCP745_SPAWN_EGG, "SCP-745 - The Headlights");
            entityWithEgg(ModEntities.SCP835_JP, ModItems.SCP835_JP_SPAWN_EGG, "SCP-835-JP - Keteru Yamiko");
            entityWithEgg(ModEntities.SCP1529, ModItems.SCP1529_SPAWN_EGG, "SCP-1529 - King of the Mountain");
            entity(ModEntities.SCP1762, "SCP-1762 - Origami Dragon");
            entityWithEgg(ModEntities.SCP2761, ModItems.SCP2761_SPAWN_EGG, "SCP-2761 - Bananazilla");
            entityWithEgg(ModEntities.SCP3199, ModItems.SCP3199_SPAWN_EGG, "SCP-3199 - Humans, Refuted");
            entity(ModEntities.SCP3199_EGG, "SCP-3199 - Humans, Refuted Egg");
            entityWithEgg(ModEntities.SCP3456, ModItems.SCP3456_SPAWN_EGG, "SCP-3456 - The Orcadian Horseman");
            entityWithEgg(ModEntities.SCP5167, ModItems.SCP5167_SPAWN_EGG, "SCP-5167 - When The Imposter Is Sus");
        }

        /*Items*/ {
            /*SCP Items*/ {
                item(ModItems.SCP035, "SCP-035");
                item(ModItems.SCP207, "SCP-207");
                item(ModItems.SCP427, "SCP-427");
                item(ModItems.SCP500_CONTAINER, "SCP-500 Container");
                item(ModItems.SCP500_PILL, "SCP-500 Pill");
                item(ModItems.SCP714, "SCP-714");
            }

            item(ModItems.CUPCAKE, "Cupcake");
            item(ModItems.MOB_DESPAWNER, "Mob Despawner");

            item(ModItems.MONEY, "Money");
            item(ModItems.CANNED_COFFEE, "Canned Coffee");
            item(ModItems.CAKEA_COLA, "Cake'a Cola");
            item(ModItems.SANGRITA_DILE, "Sangrita Dile");
            item(ModItems.SKY_FISH, "Sky Fish");
            item(ModItems.PUMPKIN_PUNCH, "Pumpkin Punch");

            item(ModItems.HAZMAT_HELMET, "Hazmat Helmet");
            item(ModItems.HAZMAT_CHEST, "Hazmat Chest");
            item(ModItems.HAZMAT_LEGGINGS, "Hazmat Leggings");
            item(ModItems.HAZMAT_BOOTS, "Hazmat Boots");
            item(ModItems.HAZMAT_LEGGINGS_YELLOW, "Yellow Hazmat Leggings");
            item(ModItems.HAZMAT_CHEST_YELLOW, "Yellow Hazmat Chest");
            item(ModItems.HAZMAT_HELMET_YELLOW, "Yellow Hazmat Helmet");

            item(ModItems.JUMPSUIT_CHEST, "Jumpsuit Chest");
            item(ModItems.JUMPSUIT_LEGGINGS, "Jumpsuit Leggings");
            item(ModItems.JUMPSUIT_BOOTS, "Jumpsuit Boots");
            item(ModItems.JUMPSUIT_LEGGINGS_ORANGE, "Orange Jumpsuit Leggings");
            item(ModItems.JUMPSUIT_CHEST_ORANGE, "Orange Jumpsuit Chest");

            item(ModItems.GASMASK, "Gas Mask");

            item(ModItems.LABCOAT_CHEST, "Labcoat Chest");
            item(ModItems.LABCOAT_LEGGINGS, "Labcoat Leggings");
            item(ModItems.LABCOAT_BOOTS, "Labcoat Boots");
            item(ModItems.LABCOAT_LEGGINGS_RED, "Red Labcoat Leggings");
            item(ModItems.LABCOAT_CHEST_RED, "Red Labcoat Chest");

            item(ModItems.ICON_SAFE, "Icon Safe");
            item(ModItems.ICON_EUCLID, "Icon Euclid");
            item(ModItems.ICON_KETER, "Icon Keter");
        }

        /*Blocks*/ {
            /*SCP Blocks*/ {
                block(ModBlocks.SCP066_BLOCK, "SCP-066 - \"Eric's Toy\"");
                block(ModBlocks.SCP1025, "SCP-1025 - Encyclopedia of Diseases");
                block(ModBlocks.SCP1762, "SCP-1762 - Where The Dragons Went");
            }
            /*Building Blocks*/ {
                block(ModBlocks.MAGNETIC_BLOCK_ON, "Magnetic Block On");
                block(ModBlocks.RITUAL_BLOCK, "Ritual Block");
                block(ModBlocks.TILE_FLOOR_A, "Tile Floor A");
                block(ModBlocks.TILE_STAIRS_A, "Tile Stairs A");
                block(ModBlocks.TILE_SLAB_A, "Tile Slab A");
                block(ModBlocks.TILE_FLOOR_B, "Tile Floor B");
                block(ModBlocks.TILE_STAIRS_B, "Tile Stairs B");
                block(ModBlocks.TILE_SLAB_B, "Tile Slab B");
                block(ModBlocks.GRATE_BLOCK, "Grated Floor");
                block(ModBlocks.GRATE_STAIRS, "Grated Stairs");
                block(ModBlocks.GRATE_SLAB, "Grated Slab");
                block(ModBlocks.GRAVEL_BLOCK, "Gravel Floor");
                block(ModBlocks.GRAVEL_STAIRS, "Gravel Stairs");
                block(ModBlocks.GRAVEL_SLAB, "Gravel Slab");
                block(ModBlocks.GRANITE_FLOOR, "Granite Floor");
                block(ModBlocks.GRANITE_STAIRS, "Granite Stairs");
                block(ModBlocks.GRANITE_SLAB, "Granite Slab");
                block(ModBlocks.GRANITE_WALL, "Granite Wall");

                block(ModBlocks.DARK_FLOOR, "Dark Floor");
                block(ModBlocks.DARK_STAIRS, "Dark Stairs");
                block(ModBlocks.DARK_SLAB, "Dark Slab");
                block(ModBlocks.DARK_WALL, "Dark Wall");
                block(ModBlocks.DARK_FENCE, "Dark Fence");
                block(ModBlocks.DARK_FENCE_GATE, "Dark Fence Gate");

                block(ModBlocks.POCKET_DIM_TILE_FLOOR, "Pocket Dimension Tile Floor");
                block(ModBlocks.POCKET_DIM_TILE_STAIRS, "Pocket Dimension Tile Stairs");
                block(ModBlocks.POCKET_DIM_TILE_SLAB, "Pocket Dimension Tile Slab");

                block(ModBlocks.METAL_FLOOR_1, "Metal Floor 1");
                block(ModBlocks.METAL_STAIRS_1, "Metal Stairs 1");
                block(ModBlocks.METAL_SLAB_1, "Metal Slab 1");
                block(ModBlocks.METAL_WALL_1, "Metal Wall 1");
                block(ModBlocks.METAL_FENCE_1, "Metal Fence 1");
                block(ModBlocks.METAL_FENCE_GATE_1, "Metal Fence Gate 1");

                block(ModBlocks.POCKET_DIM_BLOCK_1, "Pocket Dimension Floor 1");
                block(ModBlocks.POCKET_DIM_BLOCK_STAIRS_1, "Pocket Dimension Stairs 1");
                block(ModBlocks.POCKET_DIM_BLOCK_SLAB_1, "Pocket Dimension Slab 1");

                block(ModBlocks.METAL_FLOOR_2, "Metal Floor 2");
                block(ModBlocks.METAL_STAIRS_2, "Metal Stairs 2");
                block(ModBlocks.METAL_SLAB_2, "Metal Slab 2");
                block(ModBlocks.METAL_WALL_2, "Metal Wall 2");
                block(ModBlocks.METAL_FENCE_2, "Metal Fence 2");
                block(ModBlocks.METAL_FENCE_GATE_2, "Metal Fence Gate 2");

                block(ModBlocks.POCKET_DIM_BLOCK_2, "Pocket Dimension Floor 2");
                block(ModBlocks.POCKET_DIM_BLOCK_STAIRS_2, "Pocket Dimension Stairs 2");
                block(ModBlocks.POCKET_DIM_BLOCK_SLAB_2, "Pocket Dimension Slab 2");

                block(ModBlocks.METAL_FLOOR_3, "Metal Floor 3");
                block(ModBlocks.METAL_STAIRS_3, "Metal Stairs 3");
                block(ModBlocks.METAL_SLAB_3, "Metal Slab 3");
                block(ModBlocks.METAL_WALL_3, "Metal Wall 3");
                block(ModBlocks.METAL_FENCE_3, "Metal Fence 3");
                block(ModBlocks.METAL_FENCE_GATE_3, "Metal Fence Gate 3");

                block(ModBlocks.POCKET_DIM_BLOCK_3, "Pocket Dimension Floor 3");
                block(ModBlocks.POCKET_DIM_BLOCK_STAIRS_3, "Pocket Dimension Stairs 3");
                block(ModBlocks.POCKET_DIM_BLOCK_SLAB_3, "Pocket Dimension Slab 3");

                block(ModBlocks.DIRTY_METAL_FLOOR, "Dirty Metal Floor");
                block(ModBlocks.DIRTY_METAL_STAIRS, "Dirty Metal Stairs");
                block(ModBlocks.DIRTY_METAL_SLAB, "Dirty Metal Slab");
                block(ModBlocks.DIRTY_METAL_WALL, "Dirty Metal Wall");
                block(ModBlocks.DIRTY_METAL_FENCE, "Dirty Metal Fence");
                block(ModBlocks.DIRTY_METAL_FENCE_GATE, "Dirty Metal Fence Gate");

                block(ModBlocks.POCKET_DIM_WALL_TOP, "Pocket Dimension Wall Top");
                block(ModBlocks.POCKET_DIM_WALL_MID, "Pocket Dimension Wall Mid");
                block(ModBlocks.POCKET_DIM_WALL_BOTTOM, "Pocket Dimension Wall Bottom");

                block(ModBlocks.LIGHT_WALL_TOP, "Light Wall Top");
                block(ModBlocks.MED_WALL_TOP, "Med Wall Top");
                block(ModBlocks.HEAVY_WALL_TOP_1, "Heavy Wall Top 1");
                block(ModBlocks.HEAVY_WALL_TOP_2, "Heavy Wall Top 2");
                block(ModBlocks.BRICK_WALL_TOP, "Brick Wall Top");
                block(ModBlocks.STAINED_BRICK_WALL_TOP, "Stained Brick Wall Top");
                block(ModBlocks.STAINED_WALL_TOP, "Stained Wall Top");
                block(ModBlocks.CONCRETE_WALL_TOP, "Concrete Wall Top");
                block(ModBlocks.BLUE_WALL_TOP, "Blue Wall Top");

                block(ModBlocks.LIGHT_WALL_MID, "Light Wall Mid");
                block(ModBlocks.MED_WALL_MID, "Med Wall Mid");
                block(ModBlocks.HEAVY_WALL_MID_1, "Heavy Wall Mid 1");
                block(ModBlocks.HEAVY_WALL_MID_2, "Heavy Wall Mid 2");
                block(ModBlocks.BRICK_WALL_MID, "Brick Wall Mid");
                block(ModBlocks.STAINED_BRICK_WALL_MID, "Stained Brick Wall Mid");
                block(ModBlocks.STAINED_WALL_MID, "Stained Wall Mid");
                block(ModBlocks.CONCRETE_WALL_MID, "Concrete Wall Mid");
                block(ModBlocks.BLUE_WALL_MID, "Blue Wall Mid");

                block(ModBlocks.LIGHT_WALL_BOTTOM, "Light Wall Bottom");
                block(ModBlocks.MED_WALL_BOTTOM, "Med Wall Bottom");
                block(ModBlocks.HEAVY_WALL_BOTTOM_1, "Heavy Wall Bottom 1");
                block(ModBlocks.HEAVY_WALL_BOTTOM_2, "Heavy Wall Bottom 2");
                block(ModBlocks.BRICK_WALL_BOTTOM, "Brick Wall Bottom");
                block(ModBlocks.STAINED_BRICK_WALL_BOTTOM, "Stained Brick Wall Bottom");
                block(ModBlocks.STAINED_WALL_BOTTOM, "Stained Wall Bottom");
                block(ModBlocks.CONCRETE_WALL_BOTTOM, "Concrete Wall Bottom");
                block(ModBlocks.BLUE_WALL_BOTTOM, "Blue Wall Bottom");

                block(ModBlocks.OFFICE_WALL_TOP, "Office Wall Top");
                block(ModBlocks.OFFICE_WALL_MID, "Office Wall Mid");
                block(ModBlocks.OFFICE_WALL_BOTTOM, "Office Wall Bottom");
                block(ModBlocks.OFFICE_CEILING, "Office Ceiling");
                block(ModBlocks.WHITE_WALL, "White Wall");
                block(ModBlocks.HEAVY_BLOCK, "Heavy Block");

                block(ModBlocks.GRIT_1, "Grit Block 1");
                block(ModBlocks.GRIT_STAIRS_1, "Grit Stairs 1");
                block(ModBlocks.GRIT_SLAB_1, "Grit Slab 1");
                block(ModBlocks.GRIT_2, "Grit Block 2");
                block(ModBlocks.GRIT_STAIRS_2, "Grit Stairs 2");
                block(ModBlocks.GRIT_SLAB_2, "Grit Slab 2");

                block(ModBlocks.SCP1499_BLOCK_1, "SCP-1499 Block 1");
                block(ModBlocks.SCP1499_STAIRS_1, "SCP-1499 Stairs 1");
                block(ModBlocks.SCP1499_SLAB_1, "SCP-1499 Slab 1");
                block(ModBlocks.SCP1499_BLOCK_2, "SCP-1499 Block 2");
                block(ModBlocks.SCP1499_STAIRS_2, "SCP-1499 Stairs 2");
                block(ModBlocks.SCP1499_SLAB_2, "SCP-1499 Slab 2");

                block(ModBlocks.CLOTH_BLOCK, "Cloth Block");
                block(ModBlocks.CONTAINMENT_GLASS, "Containment Glass");
                block(ModBlocks.CONTAINMENT_GLASS_PANE, "Containment Glass Pane");
                block(ModBlocks.VENT_ENTRANCE, "Vent Entrance");

                block(ModBlocks.MESH_FLOOR, "Mesh Floor");
                block(ModBlocks.MESH_STAIR, "Mesh Stairs");
                block(ModBlocks.MESH_SLAB, "Mesh Slab");

                block(ModBlocks.CAUTION_LINE_VERTICAL, "Caution Line Vertical");
                block(ModBlocks.CAUTION_LINE_DIAGONAL, "Caution Line Diagonal");
                block(ModBlocks.LIGHT_DOOR, "Light Door");
                block(ModBlocks.HEAVY_DOOR, "Heavy Door");

                block(ModBlocks.VENDING_DRINK_BLUE, "Vending Machine Drink [Blue]");
                block(ModBlocks.VENDING_DRINK_PINK, "Vending Machine Drink [Pink]");
                block(ModBlocks.VENDING_DRINK_PURPLE, "Vending Machine Drink [Purple]");

                block(ModBlocks.SCP2845_GRASS, "SCP-2845 Grass");
                block(ModBlocks.SCP2845_LOG, "SCP-2845 Log");
                block(ModBlocks.SCP2845_LEAVES, "SCP-2845 Leaves");
                block(ModBlocks.SCP2845_PLANT, "SCP-2845 Plant");
            }
            /*Misc Blocks*/ {
                block(ModBlocks.FLUTE, "Flute");
                block(ModBlocks.OLIVE_OIL, "Olive Oil");
                block(ModBlocks.GRAIN_POUCH, "Grain Pouch");
                block(ModBlocks.GIFT, "Gift");
                block(ModBlocks.FOOLISHNESS, "Foolishness");
                block(ModBlocks.DRAWER, "Drawer");
                block(ModBlocks.CEILING_CAMERA, "Ceiling Camera");
                block(ModBlocks.BLOOD_PUDDLE, "Blood Puddle");
                block(ModBlocks.SERVER, "Server");
                block(ModBlocks.COMPUTER, "Computer");
                block(ModBlocks.TERMINAL, "Terminal");
            }
        }

        /*Item Groups*/ {
            add("itemGroup.overtimeitems", "Overtime Items");
            add("itemGroup.overtimeblocks", "Overtime Building Blocks");
            add("itemGroup.overtimemobs", "Overtime Mobs");
            add("itemGroup.overtimemisc", "Overtime Misc");
        }
    }

    @SuppressWarnings("unchecked")
    private void entityWithEgg(RegistryObject<? extends EntityType<?>> entity, RegistryObject<? extends SpawnEggItem> egg, String name) {
        add(entity.get(), name);
        add(egg.get(), name + " Spawn Egg");
    }

    private <T extends EntityType<?>> void entity(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }

    private <T extends Item> void item(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }

    private <T extends Block> void block(RegistryObject<T> entry, String name) {
        add(entry.get(), name);
    }
}
