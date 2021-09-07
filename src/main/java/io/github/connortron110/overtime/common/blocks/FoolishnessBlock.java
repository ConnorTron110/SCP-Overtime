package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class FoolishnessBlock extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = Block.box(4, 0, 4, 12, 1, 12);

    public FoolishnessBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
