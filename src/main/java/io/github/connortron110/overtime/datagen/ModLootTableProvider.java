package io.github.connortron110.overtime.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import io.github.connortron110.overtime.core.init.BlockInit;
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
            dropSelf(BlockInit.MAGNETIC_BLOCK_ON.get());
            dropSelf(BlockInit.RITUAL_BLOCK.get());
            dropSelf(BlockInit.TILE_FLOOR_A.get());
            dropSelf(BlockInit.TILE_STAIRS_A.get());
            dropSelf(BlockInit.TILE_SLAB_A.get());
            dropSelf(BlockInit.TILE_FLOOR_B.get());
            dropSelf(BlockInit.TILE_STAIRS_B.get());
            dropSelf(BlockInit.TILE_SLAB_B.get());
            dropSelf(BlockInit.GRATE_BLOCK.get());
            dropSelf(BlockInit.GRATE_STAIRS.get());
            dropSelf(BlockInit.GRATE_SLAB.get());
            dropSelf(BlockInit.GRAVEL_BLOCK.get());
            dropSelf(BlockInit.GRAVEL_STAIRS.get());
            dropSelf(BlockInit.GRAVEL_SLAB.get());
            dropSelf(BlockInit.GRANITE_FLOOR.get());
            dropSelf(BlockInit.GRANITE_STAIRS.get());
            dropSelf(BlockInit.GRANITE_SLAB.get());
            dropSelf(BlockInit.GRANITE_WALL.get());

            dropSelf(BlockInit.DARK_FLOOR.get());
            dropSelf(BlockInit.DARK_STAIRS.get());
            dropSelf(BlockInit.DARK_SLAB.get());
            dropSelf(BlockInit.DARK_WALL.get());
            dropSelf(BlockInit.DARK_FENCE.get());
            dropSelf(BlockInit.DARK_FENCE_GATE.get());

            dropSelf(BlockInit.POCKET_DIM_TILE_FLOOR.get());
            dropSelf(BlockInit.POCKET_DIM_TILE_STAIRS.get());
            dropSelf(BlockInit.POCKET_DIM_TILE_SLAB.get());

            dropSelf(BlockInit.METAL_FLOOR_1.get());
            dropSelf(BlockInit.METAL_STAIRS_1.get());
            dropSelf(BlockInit.METAL_SLAB_1.get());
            dropSelf(BlockInit.METAL_WALL_1.get());
            dropSelf(BlockInit.METAL_FENCE_1.get());
            dropSelf(BlockInit.METAL_FENCE_GATE_1.get());

            dropSelf(BlockInit.POCKET_DIM_BLOCK_1.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_STAIRS_1.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_SLAB_1.get());

            dropSelf(BlockInit.METAL_FLOOR_2.get());
            dropSelf(BlockInit.METAL_STAIRS_2.get());
            dropSelf(BlockInit.METAL_SLAB_2.get());
            dropSelf(BlockInit.METAL_WALL_2.get());
            dropSelf(BlockInit.METAL_FENCE_2.get());
            dropSelf(BlockInit.METAL_FENCE_GATE_2.get());

            dropSelf(BlockInit.POCKET_DIM_BLOCK_2.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_STAIRS_2.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_SLAB_2.get());

            dropSelf(BlockInit.METAL_FLOOR_3.get());
            dropSelf(BlockInit.METAL_STAIRS_3.get());
            dropSelf(BlockInit.METAL_SLAB_3.get());
            dropSelf(BlockInit.METAL_WALL_3.get());
            dropSelf(BlockInit.METAL_FENCE_3.get());
            dropSelf(BlockInit.METAL_FENCE_GATE_3.get());

            dropSelf(BlockInit.POCKET_DIM_BLOCK_3.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_STAIRS_3.get());
            dropSelf(BlockInit.POCKET_DIM_BLOCK_SLAB_3.get());

            dropSelf(BlockInit.DIRTY_METAL_FLOOR.get());
            dropSelf(BlockInit.DIRTY_METAL_STAIRS.get());
            dropSelf(BlockInit.DIRTY_METAL_SLAB.get());
            dropSelf(BlockInit.DIRTY_METAL_WALL.get());
            dropSelf(BlockInit.DIRTY_METAL_FENCE.get());
            dropSelf(BlockInit.DIRTY_METAL_FENCE_GATE.get());

            dropSelf(BlockInit.POCKET_DIM_WALL_TOP.get());
            dropSelf(BlockInit.POCKET_DIM_WALL_MID.get());
            dropSelf(BlockInit.POCKET_DIM_WALL_BOTTOM.get());

            dropSelf(BlockInit.LIGHT_WALL_TOP.get());
            dropSelf(BlockInit.MED_WALL_TOP.get());
            dropSelf(BlockInit.HEAVY_WALL_TOP_1.get());
            dropSelf(BlockInit.HEAVY_WALL_TOP_2.get());
            dropSelf(BlockInit.BRICK_WALL_TOP.get());
            dropSelf(BlockInit.STAINED_BRICK_WALL_TOP.get());
            dropSelf(BlockInit.STAINED_WALL_TOP.get());
            dropSelf(BlockInit.CONCRETE_WALL_TOP.get());
            dropSelf(BlockInit.BLUE_WALL_TOP.get());

            dropSelf(BlockInit.LIGHT_WALL_MID.get());
            dropSelf(BlockInit.MED_WALL_MID.get());
            dropSelf(BlockInit.HEAVY_WALL_MID_1.get());
            dropSelf(BlockInit.HEAVY_WALL_MID_2.get());
            dropSelf(BlockInit.BRICK_WALL_MID.get());
            dropSelf(BlockInit.STAINED_BRICK_WALL_MID.get());
            dropSelf(BlockInit.STAINED_WALL_MID.get());
            dropSelf(BlockInit.CONCRETE_WALL_MID.get());
            dropSelf(BlockInit.BLUE_WALL_MID.get());

            dropSelf(BlockInit.LIGHT_WALL_BOTTOM.get());
            dropSelf(BlockInit.MED_WALL_BOTTOM.get());
            dropSelf(BlockInit.HEAVY_WALL_BOTTOM_1.get());
            dropSelf(BlockInit.HEAVY_WALL_BOTTOM_2.get());
            dropSelf(BlockInit.BRICK_WALL_BOTTOM.get());
            dropSelf(BlockInit.STAINED_BRICK_WALL_BOTTOM.get());
            dropSelf(BlockInit.STAINED_WALL_BOTTOM.get());
            dropSelf(BlockInit.CONCRETE_WALL_BOTTOM.get());
            dropSelf(BlockInit.BLUE_WALL_BOTTOM.get());

            dropSelf(BlockInit.OFFICE_WALL_TOP.get());
            dropSelf(BlockInit.OFFICE_WALL_MID.get());
            dropSelf(BlockInit.OFFICE_WALL_BOTTOM.get());
            dropSelf(BlockInit.OFFICE_CEILING.get());
            dropSelf(BlockInit.WHITE_WALL.get());
            dropSelf(BlockInit.HEAVY_BLOCK.get());

            dropSelf(BlockInit.GRIT_1.get());
            dropSelf(BlockInit.GRIT_STAIRS_1.get());
            dropSelf(BlockInit.GRIT_SLAB_1.get());
            dropSelf(BlockInit.GRIT_2.get());
            dropSelf(BlockInit.GRIT_STAIRS_2.get());
            dropSelf(BlockInit.GRIT_SLAB_2.get());

            dropSelf(BlockInit.SCP1499_BLOCK_1.get());
            dropSelf(BlockInit.SCP1499_STAIRS_1.get());
            dropSelf(BlockInit.SCP1499_SLAB_1.get());
            dropSelf(BlockInit.SCP1499_BLOCK_2.get());
            dropSelf(BlockInit.SCP1499_STAIRS_2.get());
            dropSelf(BlockInit.SCP1499_SLAB_2.get());

            dropSelf(BlockInit.CLOTH_BLOCK.get());
            dropWhenSilkTouch(BlockInit.CONTAINMENT_GLASS.get());
            dropWhenSilkTouch(BlockInit.CONTAINMENT_GLASS_PANE.get());

            dropSelf(BlockInit.VENT_ENTRANCE.get());

            dropSelf(BlockInit.MESH_FLOOR.get());
            dropSelf(BlockInit.MESH_STAIR.get());
            dropSelf(BlockInit.MESH_SLAB.get());

            dropSelf(BlockInit.CAUTION_LINE_VERTICAL.get());
            dropSelf(BlockInit.CAUTION_LINE_DIAGONAL.get());

            dropSelf(BlockInit.LIGHT_DOOR.get());
            dropSelf(BlockInit.HEAVY_DOOR.get());

            dropWhenSilkTouch(BlockInit.SCP2845_GRASS.get());
            dropSelf(BlockInit.SCP2845_LOG.get());
            dropWhenSilkTouch(BlockInit.SCP2845_LEAVES.get());
            dropSelf(BlockInit.SCP2845_PLANT.get());

            dropSelf(BlockInit.FLUTE.get());
            dropSelf(BlockInit.OLIVE_OIL.get());
            dropSelf(BlockInit.GRAIN_POUCH.get());
            dropSelf(BlockInit.GIFT.get());
            dropSelf(BlockInit.FOOLISHNESS.get());
            dropSelf(BlockInit.DRAWER.get());
            dropSelf(BlockInit.CEILING_CAMERA.get());
            dropSelf(BlockInit.SERVER.get());
            dropSelf(BlockInit.COMPUTER.get());
            dropSelf(BlockInit.TERMINAL.get());

            dropSelf(BlockInit.SCP066_BLOCK.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }
    }
}
