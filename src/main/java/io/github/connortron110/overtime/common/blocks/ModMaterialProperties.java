package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public final class ModMaterialProperties {
    public static final AbstractBlock GRASS = new Block(AbstractBlock.Properties.of(Material.GRASS)
            .strength(0.6F)
            .sound(SoundType.GRASS));
    public static final AbstractBlock WOOD = new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD)
            .strength(2F, 3F)
            .sound(SoundType.WOOD));
    public static final AbstractBlock STONE = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(1.5F,6F)
            .sound(SoundType.STONE));
    public static final AbstractBlock METAL = new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(5F,6F)
            .sound(SoundType.METAL));
    public static final AbstractBlock SAND = new Block(AbstractBlock.Properties.of(Material.SAND, MaterialColor.SAND)
            .strength(0.5F)
            .sound(SoundType.SAND));
    public static final AbstractBlock FABRIC = new Block(AbstractBlock.Properties.of(Material.WOOL)
            .strength(0.6F)
            .sound(SoundType.WOOL));
    public static final AbstractBlock SLIME = new Block(AbstractBlock.Properties.of(Material.CLAY)
            .sound(SoundType.SLIME_BLOCK)
            .friction(0.8F));
    public static final AbstractBlock GLASS = new Block(AbstractBlock.Properties.of(Material.GLASS)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .noOcclusion());
    public static final AbstractBlock TRANSPARENT_FULL_BLOCK = new Block(AbstractBlock.Properties.of(Material.GLASS)
            .strength(0.3F)
            .sound(SoundType.GLASS)
            .noOcclusion()
            .isValidSpawn(ModMaterialProperties::never)
            .isRedstoneConductor(ModMaterialProperties::never)
            .isSuffocating(ModMaterialProperties::never)
            .isViewBlocking(ModMaterialProperties::never));


    //Copied from Blocks as they are not accessible
    public static boolean never(BlockState state, IBlockReader iBlockReader, BlockPos pos) {
        return false;
    }

    public static Boolean never(BlockState state, IBlockReader iBlockReader, BlockPos pos, EntityType<?> entity) {
        return false;
    }
}
