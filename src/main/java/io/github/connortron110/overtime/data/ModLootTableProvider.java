package io.github.connortron110.overtime.data;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.connortron110.overtime.core.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((resourceLocation, lootTable) -> LootTableManager.validate(validationtracker, resourceLocation, lootTable));
    }

    public static class ModBlockLootTables extends BlockLootTables {
        @Override
        protected void addTables() {
            dropSelf(ModBlocks.MAGNETIC_BLOCK_ON.get());
            dropSelf(ModBlocks.RITUAL_BLOCK.get());
            dropSelf(ModBlocks.TILE_FLOOR_A.get());
            dropSelf(ModBlocks.TILE_STAIRS_A.get());
            dropSelf(ModBlocks.TILE_SLAB_A.get());
            dropSelf(ModBlocks.TILE_FLOOR_B.get());
            dropSelf(ModBlocks.TILE_STAIRS_B.get());
            dropSelf(ModBlocks.TILE_SLAB_B.get());
            dropSelf(ModBlocks.GRATE_BLOCK.get());
            dropSelf(ModBlocks.GRATE_STAIRS.get());
            dropSelf(ModBlocks.GRATE_SLAB.get());
            dropSelf(ModBlocks.GRAVEL_BLOCK.get());
            dropSelf(ModBlocks.GRAVEL_STAIRS.get());
            dropSelf(ModBlocks.GRAVEL_SLAB.get());
            dropSelf(ModBlocks.GRANITE_FLOOR.get());
            dropSelf(ModBlocks.GRANITE_STAIRS.get());
            dropSelf(ModBlocks.GRANITE_SLAB.get());
            dropSelf(ModBlocks.GRANITE_WALL.get());

            dropSelf(ModBlocks.DARK_FLOOR.get());
            dropSelf(ModBlocks.DARK_STAIRS.get());
            dropSelf(ModBlocks.DARK_SLAB.get());
            dropSelf(ModBlocks.DARK_WALL.get());
            dropSelf(ModBlocks.DARK_FENCE.get());
            dropSelf(ModBlocks.DARK_FENCE_GATE.get());

            dropSelf(ModBlocks.POCKET_DIM_TILE_FLOOR.get());
            dropSelf(ModBlocks.POCKET_DIM_TILE_STAIRS.get());
            dropSelf(ModBlocks.POCKET_DIM_TILE_SLAB.get());

            dropSelf(ModBlocks.METAL_FLOOR_1.get());
            dropSelf(ModBlocks.METAL_STAIRS_1.get());
            dropSelf(ModBlocks.METAL_SLAB_1.get());
            dropSelf(ModBlocks.METAL_WALL_1.get());
            dropSelf(ModBlocks.METAL_FENCE_1.get());
            dropSelf(ModBlocks.METAL_FENCE_GATE_1.get());

            dropSelf(ModBlocks.POCKET_DIM_BLOCK_1.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_STAIRS_1.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_SLAB_1.get());

            dropSelf(ModBlocks.METAL_FLOOR_2.get());
            dropSelf(ModBlocks.METAL_STAIRS_2.get());
            dropSelf(ModBlocks.METAL_SLAB_2.get());
            dropSelf(ModBlocks.METAL_WALL_2.get());
            dropSelf(ModBlocks.METAL_FENCE_2.get());
            dropSelf(ModBlocks.METAL_FENCE_GATE_2.get());

            dropSelf(ModBlocks.POCKET_DIM_BLOCK_2.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_STAIRS_2.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_SLAB_2.get());

            dropSelf(ModBlocks.METAL_FLOOR_3.get());
            dropSelf(ModBlocks.METAL_STAIRS_3.get());
            dropSelf(ModBlocks.METAL_SLAB_3.get());
            dropSelf(ModBlocks.METAL_WALL_3.get());
            dropSelf(ModBlocks.METAL_FENCE_3.get());
            dropSelf(ModBlocks.METAL_FENCE_GATE_3.get());

            dropSelf(ModBlocks.POCKET_DIM_BLOCK_3.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_STAIRS_3.get());
            dropSelf(ModBlocks.POCKET_DIM_BLOCK_SLAB_3.get());

            dropSelf(ModBlocks.DIRTY_METAL_FLOOR.get());
            dropSelf(ModBlocks.DIRTY_METAL_STAIRS.get());
            dropSelf(ModBlocks.DIRTY_METAL_SLAB.get());
            dropSelf(ModBlocks.DIRTY_METAL_WALL.get());
            dropSelf(ModBlocks.DIRTY_METAL_FENCE.get());
            dropSelf(ModBlocks.DIRTY_METAL_FENCE_GATE.get());

            dropSelf(ModBlocks.POCKET_DIM_WALL_TOP.get());
            dropSelf(ModBlocks.POCKET_DIM_WALL_MID.get());
            dropSelf(ModBlocks.POCKET_DIM_WALL_BOTTOM.get());

            dropSelf(ModBlocks.LIGHT_WALL_TOP.get());
            dropSelf(ModBlocks.MED_WALL_TOP.get());
            dropSelf(ModBlocks.HEAVY_WALL_TOP_1.get());
            dropSelf(ModBlocks.HEAVY_WALL_TOP_2.get());
            dropSelf(ModBlocks.BRICK_WALL_TOP.get());
            dropSelf(ModBlocks.STAINED_BRICK_WALL_TOP.get());
            dropSelf(ModBlocks.STAINED_WALL_TOP.get());
            dropSelf(ModBlocks.CONCRETE_WALL_TOP.get());
            dropSelf(ModBlocks.BLUE_WALL_TOP.get());

            dropSelf(ModBlocks.LIGHT_WALL_MID.get());
            dropSelf(ModBlocks.MED_WALL_MID.get());
            dropSelf(ModBlocks.HEAVY_WALL_MID_1.get());
            dropSelf(ModBlocks.HEAVY_WALL_MID_2.get());
            dropSelf(ModBlocks.BRICK_WALL_MID.get());
            dropSelf(ModBlocks.STAINED_BRICK_WALL_MID.get());
            dropSelf(ModBlocks.STAINED_WALL_MID.get());
            dropSelf(ModBlocks.CONCRETE_WALL_MID.get());
            dropSelf(ModBlocks.BLUE_WALL_MID.get());

            dropSelf(ModBlocks.LIGHT_WALL_BOTTOM.get());
            dropSelf(ModBlocks.MED_WALL_BOTTOM.get());
            dropSelf(ModBlocks.HEAVY_WALL_BOTTOM_1.get());
            dropSelf(ModBlocks.HEAVY_WALL_BOTTOM_2.get());
            dropSelf(ModBlocks.BRICK_WALL_BOTTOM.get());
            dropSelf(ModBlocks.STAINED_BRICK_WALL_BOTTOM.get());
            dropSelf(ModBlocks.STAINED_WALL_BOTTOM.get());
            dropSelf(ModBlocks.CONCRETE_WALL_BOTTOM.get());
            dropSelf(ModBlocks.BLUE_WALL_BOTTOM.get());

            dropSelf(ModBlocks.OFFICE_WALL_TOP.get());
            dropSelf(ModBlocks.OFFICE_WALL_MID.get());
            dropSelf(ModBlocks.OFFICE_WALL_BOTTOM.get());
            dropSelf(ModBlocks.OFFICE_CEILING.get());
            dropSelf(ModBlocks.WHITE_WALL.get());
            dropSelf(ModBlocks.HEAVY_BLOCK.get());

            dropSelf(ModBlocks.GRIT_1.get());
            dropSelf(ModBlocks.GRIT_STAIRS_1.get());
            dropSelf(ModBlocks.GRIT_SLAB_1.get());
            dropSelf(ModBlocks.GRIT_2.get());
            dropSelf(ModBlocks.GRIT_STAIRS_2.get());
            dropSelf(ModBlocks.GRIT_SLAB_2.get());

            dropSelf(ModBlocks.SCP1499_BLOCK_1.get());
            dropSelf(ModBlocks.SCP1499_STAIRS_1.get());
            dropSelf(ModBlocks.SCP1499_SLAB_1.get());
            dropSelf(ModBlocks.SCP1499_BLOCK_2.get());
            dropSelf(ModBlocks.SCP1499_STAIRS_2.get());
            dropSelf(ModBlocks.SCP1499_SLAB_2.get());

            dropSelf(ModBlocks.CLOTH_BLOCK.get());
            dropWhenSilkTouch(ModBlocks.CONTAINMENT_GLASS.get());
            dropWhenSilkTouch(ModBlocks.CONTAINMENT_GLASS_PANE.get());

            dropSelf(ModBlocks.VENT_ENTRANCE.get());

            dropSelf(ModBlocks.MESH_FLOOR.get());
            dropSelf(ModBlocks.MESH_STAIR.get());
            dropSelf(ModBlocks.MESH_SLAB.get());

            dropSelf(ModBlocks.CAUTION_LINE_VERTICAL.get());
            dropSelf(ModBlocks.CAUTION_LINE_DIAGONAL.get());

            dropSelf(ModBlocks.LIGHT_DOOR.get());
            dropSelf(ModBlocks.HEAVY_DOOR.get());

            add(ModBlocks.VENDING_DRINK_BLUE.get(), createDoorTable(ModBlocks.VENDING_DRINK_BLUE.get()));
            add(ModBlocks.VENDING_DRINK_PINK.get(), createDoorTable(ModBlocks.VENDING_DRINK_PINK.get()));
            add(ModBlocks.VENDING_DRINK_PURPLE.get(), createDoorTable(ModBlocks.VENDING_DRINK_PURPLE.get()));

            dropWhenSilkTouch(ModBlocks.SCP2845_GRASS.get());
            dropSelf(ModBlocks.SCP2845_LOG.get());
            dropWhenSilkTouch(ModBlocks.SCP2845_LEAVES.get());
            dropSelf(ModBlocks.SCP2845_PLANT.get());

            dropSelf(ModBlocks.FLUTE.get());
            dropSelf(ModBlocks.OLIVE_OIL.get());
            dropSelf(ModBlocks.GRAIN_POUCH.get());
            dropSelf(ModBlocks.GIFT.get());
            dropSelf(ModBlocks.FOOLISHNESS.get());
            dropSelf(ModBlocks.DRAWER.get());
            dropSelf(ModBlocks.CEILING_CAMERA.get());
            dropSelf(ModBlocks.SERVER.get());
            dropSelf(ModBlocks.COMPUTER.get());
            dropSelf(ModBlocks.TERMINAL.get());

            dropSelf(ModBlocks.SCP066_BLOCK.get());
            dropSelf(ModBlocks.SCP1025.get());
            dropSelf(ModBlocks.SCP1762.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
