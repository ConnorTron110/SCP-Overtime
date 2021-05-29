package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.common.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static final RegistryObject<Block> MAGNETIC_BLOCK_ON = register("magnetic_block_on", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<Block> RITUAL_BLOCK = register("ritual_block", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.FABRIC)));
    public static final RegistryObject<Block> TILE_FLOOR_A = register("tile_floora", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<StairsBlock> TILE_STAIRS_A = register("tile_stairsa", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> TILE_FLOOR_A.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<SlabBlock> TILE_SLAB_A = register("tile_slaba", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> TILE_FLOOR_B = register("tile_floorb", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<StairsBlock> TILE_STAIRS_B = register("tile_stairsb", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> TILE_FLOOR_B.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<SlabBlock> TILE_SLAB_B = register("tile_slabb", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> GRATE_BLOCK = register("grated_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<StairsBlock> GRATE_STAIRS = register("grated_stairs", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> GRATE_BLOCK.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<SlabBlock> GRATE_SLAB = register("grated_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<Block> GRAVEL_BLOCK = register("gravel_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.SAND)));
    public static final RegistryObject<StairsBlock> GRAVEL_STAIRS = register("gravel_stairs", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> GRAVEL_BLOCK.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.SAND)));
    public static final RegistryObject<SlabBlock> GRAVEL_SLAB = register("gravel_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.SAND)));
    public static final RegistryObject<Block> GRANITE_FLOOR = register("granite_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<StairsBlock> GRANITE_STAIRS = register("granite_stair", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> GRANITE_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<SlabBlock> GRANITE_SLAB = register("granite_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<WallBlock> GRANITE_WALL = register("granite_wall", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));

    //Organized List Nice fence Pocked dim thing here
    public static final RegistryObject<Block> DARK_FLOOR = register("dark_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<StairsBlock> DARK_STAIRS = register("dark_stair", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> DARK_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<SlabBlock> DARK_SLAB = register("dark_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<WallBlock> DARK_WALL = register("dark_wall", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<FenceBlock> DARK_FENCE = register("dark_fence", Overtime.TAB_BLOCKS, () -> new FenceBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<FenceGateBlock> DARK_FENCE_GATE = register("dark_fence_gate", Overtime.TAB_BLOCKS, () -> new FenceGateBlock(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));

    public static final RegistryObject<Block> POCKET_DIM_TILE_FLOOR = register("pocket_dim_tile_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<StairsBlock> POCKET_DIM_TILE_STAIRS = register("pocket_dim_tile_stairs", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> POCKET_DIM_TILE_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<SlabBlock> POCKET_DIM_TILE_SLAB = register("pocket_dim_tile_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));

    public static final RegistryObject<Block> METAL_FLOOR_1 = register("metal_floor_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<StairsBlock> METAL_STAIRS_1 = register("metal_stair_1", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> METAL_FLOOR_1.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<SlabBlock> METAL_SLAB_1 = register("metal_slab_1", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<WallBlock> METAL_WALL_1 = register("metal_wall_1", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceBlock> METAL_FENCE_1 = register("metal_fence_1", Overtime.TAB_BLOCKS, () -> new FenceBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceGateBlock> METAL_FENCE_GATE_1 = register("metal_fence_gate_1", Overtime.TAB_BLOCKS, () -> new FenceGateBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));

    public static final RegistryObject<Block> POCKET_DIM_BLOCK_1 = register("pocket_dim_block_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<StairsBlock> POCKET_DIM_BLOCK_STAIRS_1 = register("pocket_dim_block_stair_1", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> POCKET_DIM_TILE_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<SlabBlock> POCKET_DIM_BLOCK_SLAB_1 = register("pocket_dim_block_slab_1", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));

    public static final RegistryObject<Block> METAL_FLOOR_2 = register("metal_floor_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<StairsBlock> METAL_STAIRS_2 = register("metal_stair_2", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> METAL_FLOOR_2.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<SlabBlock> METAL_SLAB_2 = register("metal_slab_2", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<WallBlock> METAL_WALL_2 = register("metal_wall_2", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceBlock> METAL_FENCE_2 = register("metal_fence_2", Overtime.TAB_BLOCKS, () -> new FenceBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceGateBlock> METAL_FENCE_GATE_2 = register("metal_fence_gate_2", Overtime.TAB_BLOCKS, () -> new FenceGateBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));

    public static final RegistryObject<Block> POCKET_DIM_BLOCK_2 = register("pocket_dim_block_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<StairsBlock> POCKET_DIM_BLOCK_STAIRS_2 = register("pocket_dim_block_stair_2", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> POCKET_DIM_TILE_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<SlabBlock> POCKET_DIM_BLOCK_SLAB_2 = register("pocket_dim_block_slab_2", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));

    public static final RegistryObject<Block> METAL_FLOOR_3 = register("metal_floor_3", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<StairsBlock> METAL_STAIRS_3 = register("metal_stair_3", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> METAL_FLOOR_3.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<SlabBlock> METAL_SLAB_3 = register("metal_slab_3", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<WallBlock> METAL_WALL_3 = register("metal_wall_3", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceBlock> METAL_FENCE_3 = register("metal_fence_3", Overtime.TAB_BLOCKS, () -> new FenceBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceGateBlock> METAL_FENCE_GATE_3 = register("metal_fence_gate_3", Overtime.TAB_BLOCKS, () -> new FenceGateBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));

    public static final RegistryObject<Block> POCKET_DIM_BLOCK_3 = register("pocket_dim_block_3", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<StairsBlock> POCKET_DIM_BLOCK_STAIRS_3 = register("pocket_dim_block_stair_3", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> POCKET_DIM_TILE_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<SlabBlock> POCKET_DIM_BLOCK_SLAB_3 = register("pocket_dim_block_slab_3", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).sound(SoundType.SLIME_BLOCK)));

    public static final RegistryObject<Block> DIRTY_METAL_FLOOR = register("dirty_metal_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<StairsBlock> DIRTY_METAL_STAIRS = register("dirty_metal_stair", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> DIRTY_METAL_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<SlabBlock> DIRTY_METAL_SLAB = register("dirty_metal_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<WallBlock> DIRTY_METAL_WALL = register("dirty_metal_wall", Overtime.TAB_BLOCKS, () -> new WallBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceBlock> DIRTY_METAL_FENCE = register("dirty_metal_fence", Overtime.TAB_BLOCKS, () -> new FenceBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));
    public static final RegistryObject<FenceGateBlock> DIRTY_METAL_FENCE_GATE = register("dirty_metal_fence_gate", Overtime.TAB_BLOCKS, () -> new FenceGateBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL)));

    public static final RegistryObject<Block> POCKET_DIM_WALL_TOP = register("pocket_dim_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> POCKET_DIM_WALL_MID = register("pocket_dim_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> POCKET_DIM_WALL_BOTTOM = register("pocket_dim_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    //End of Organised line

    //Nice ordered Top-Mid-Bottom Section
    public static final RegistryObject<Block> LIGHT_WALL_TOP = register("light_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> MED_WALL_TOP = register("med_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_TOP_1 = register("heavy_wall_top_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_TOP_2 = register("heavy_wall_top_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BRICK_WALL_TOP = register("brick_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_BRICK_WALL_TOP = register("stained_brick_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_WALL_TOP = register("stained_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> CONCRETE_WALL_TOP = register("concrete_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BLUE_WALL_TOP = register("blue_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));

    public static final RegistryObject<Block> LIGHT_WALL_MID = register("light_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> MED_WALL_MID = register("med_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_MID_1 = register("heavy_wall_mid_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_MID_2 = register("heavy_wall_mid_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BRICK_WALL_MID = register("brick_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_BRICK_WALL_MID = register("stained_brick_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_WALL_MID = register("stained_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> CONCRETE_WALL_MID = register("concrete_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BLUE_WALL_MID = register("blue_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));

    public static final RegistryObject<Block> LIGHT_WALL_BOTTOM = register("light_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> MED_WALL_BOTTOM = register("med_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_BOTTOM_1 = register("heavy_wall_bottom_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_WALL_BOTTOM_2 = register("heavy_wall_bottom_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BRICK_WALL_BOTTOM = register("brick_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_BRICK_WALL_BOTTOM = register("stained_brick_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> STAINED_WALL_BOTTOM = register("stained_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> CONCRETE_WALL_BOTTOM = register("concrete_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> BLUE_WALL_BOTTOM = register("blue_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    //End of sorted Line

    public static final RegistryObject<Block> OFFICE_WALL_TOP = register("office_wall_top", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> OFFICE_WALL_MID = register("office_wall_mid", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> OFFICE_WALL_BOTTOM = register("office_wall_bottom", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> OFFICE_CEILING = register("office_ceiling", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    //TODO Needs own texture
    public static final RegistryObject<Block> WHITE_WALL = register("white_wall", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));
    public static final RegistryObject<Block> HEAVY_BLOCK = register("heavy_block", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.STONE)));

    public static final RegistryObject<Block> GRIT_1 = register("grit_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<StairsBlock> GRIT_STAIRS_1 = register("grit_stair_1", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> GRIT_1.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<SlabBlock> GRIT_SLAB_1 = register("grit_slab_1", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> GRIT_2 = register("grit_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<StairsBlock> GRIT_STAIRS_2 = register("grit_stair_2", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> GRIT_2.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<SlabBlock> GRIT_SLAB_2 = register("grit_slab_2", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));

    public static final RegistryObject<Block> SCP1499_BLOCK_1 = register("scp1499_block_1", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<StairsBlock> SCP1499_STAIRS_1 = register("scp1499_stair_1", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> SCP1499_BLOCK_1.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<SlabBlock> SCP1499_SLAB_1 = register("scp1499_slab_1", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> SCP1499_BLOCK_2 = register("scp1499_block_2", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<StairsBlock> SCP1499_STAIRS_2 = register("scp1499_stair_2", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> SCP1499_BLOCK_2.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<SlabBlock> SCP1499_SLAB_2 = register("scp1499_slab_2", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS).sound(SoundType.WET_GRASS)));

    public static final RegistryObject<Block> CLOTH_BLOCK = register("cloth_block", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.FABRIC)));
    public static final RegistryObject<GlassBlock> CONTAINMENT_GLASS = register("containment_glass", Overtime.TAB_BLOCKS, () -> new GlassBlock(AbstractBlock.Properties.copy(ModMaterialProperties.TRANSPARENT_FULL_BLOCK)));
    public static final RegistryObject<PaneBlock> CONTAINMENT_GLASS_PANE = register("containment_glass_pane", Overtime.TAB_BLOCKS, () -> new PaneBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GLASS)));

    public static final RegistryObject<TrapDoorBlock> VENT_ENTRANCE = register("vent_entrance", Overtime.TAB_BLOCKS, () -> new TrapDoorBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noCollission()));

    public static final RegistryObject<Block> MESH_FLOOR = register("mesh_floor", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noOcclusion()));
    public static final RegistryObject<StairsBlock> MESH_STAIR = register("mesh_stair", Overtime.TAB_BLOCKS, () -> new StairsBlock(() -> MESH_FLOOR.get().defaultBlockState(), AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noOcclusion()));
    public static final RegistryObject<SlabBlock> MESH_SLAB = register("mesh_slab", Overtime.TAB_BLOCKS, () -> new SlabBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noOcclusion()));

    public static final RegistryObject<Block> CAUTION_LINE_VERTICAL = register("caution_line_vertical", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noOcclusion()));
    public static final RegistryObject<Block> CAUTION_LINE_DIAGONAL = register("caution_line_diagonal", Overtime.TAB_BLOCKS, () -> new Block(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).noOcclusion()));

    public static final RegistryObject<DoorBlock> LIGHT_DOOR = register("light_door", Overtime.TAB_BLOCKS, () -> new DoorBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).requiresCorrectToolForDrops().strength(3.0F).sound(SoundType.METAL).noOcclusion()));
    public static final RegistryObject<DoorBlock> HEAVY_DOOR = register("heavy_door", Overtime.TAB_BLOCKS, () -> new DoorBlock(AbstractBlock.Properties.copy(ModMaterialProperties.METAL).requiresCorrectToolForDrops().strength(5.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<GrassBlock> SCP2845_GRASS = register("scp2845_block", Overtime.TAB_BLOCKS, () -> new GrassBlock(AbstractBlock.Properties.copy(ModMaterialProperties.GRASS)));
    public static final RegistryObject<RotatedPillarBlock> SCP2845_LOG = register("scp2845_log", Overtime.TAB_BLOCKS, () -> new RotatedPillarBlock(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD).sound(SoundType.BASALT)));
    public static final RegistryObject<LeavesBlock> SCP2845_LEAVES = register("scp2845_leaves", Overtime.TAB_BLOCKS, () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(ModMaterialProperties::never).isSuffocating(ModMaterialProperties::never).isViewBlocking(ModMaterialProperties::never)));
    public static final RegistryObject<TallGrassBlock> SCP2845_PLANT = register("scp2845_plant", Overtime.TAB_BLOCKS, () -> new TallGrassBlock(AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS)));



    public static final RegistryObject<FluteBlock> FLUTE = register("flute", Overtime.TAB_MISC, FluteBlock::new);
    public static final RegistryObject<OliveOilBlock> OLIVE_OIL = register("olive_oil", Overtime.TAB_MISC, OliveOilBlock::new);
    public static final RegistryObject<GrainPouchBlock> GRAIN_POUCH = register("grain_pouch", Overtime.TAB_MISC, GrainPouchBlock::new);
    public static final RegistryObject<GiftBlock> GIFT = register("gift", Overtime.TAB_MISC, GiftBlock::new);
    public static final RegistryObject<FoolishnessBlock> FOOLISHNESS = register("foolishness", Overtime.TAB_MISC, FoolishnessBlock::new);
    public static final RegistryObject<DrawerBlock> DRAWER = register("drawer_082", Overtime.TAB_MISC, DrawerBlock::new);
    public static final RegistryObject<CeilingCameraBlock> CEILING_CAMERA = register("ceiling_camera", Overtime.TAB_MISC, CeilingCameraBlock::new);
    public static final RegistryObject<BloodPuddleBlock> BLOOD_PUDDLE = register("blood_puddle", Overtime.TAB_MISC, BloodPuddleBlock::new);
    public static final RegistryObject<ServerBlock> SERVER = register("server", Overtime.TAB_MISC, ServerBlock::new);
    public static final RegistryObject<ComputerBlock> COMPUTER = register("computer", Overtime.TAB_MISC, ComputerBlock::new);
    public static final RegistryObject<ComputerBlock> TERMINAL = register("terminal", Overtime.TAB_MISC, ComputerBlock::new);

    public static final RegistryObject<SCP066Block> SCP066_BLOCK = register("scp066_block", Overtime.TAB_MISC, SCP066Block::new);


    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, ItemGroup tab, Supplier<T> block) {
        RegistryObject<T> reg = registerNoItem(name, block);
        ItemInit.ITEMS.register(name, () -> new BlockItem(reg.get(), new Item.Properties().tab(tab)));
        return reg;
    }
}
