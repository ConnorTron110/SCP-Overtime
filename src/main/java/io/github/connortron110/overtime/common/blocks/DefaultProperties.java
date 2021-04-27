package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public abstract class DefaultProperties {
    public static final AbstractBlock STONE_PROPERTY = new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
            .strength(1.5F,6F)
            .sound(SoundType.STONE));
    public static final AbstractBlock METAL_PROPERTY = new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL)
            .strength(5F,6F)
            .sound(SoundType.METAL));
}
