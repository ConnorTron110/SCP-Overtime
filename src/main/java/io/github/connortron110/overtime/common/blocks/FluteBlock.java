package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class FluteBlock extends BaseHorizontalBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Block.box(2.5, 0, 7.5, 13.5, 1, 8.5));

    public FluteBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }
}
