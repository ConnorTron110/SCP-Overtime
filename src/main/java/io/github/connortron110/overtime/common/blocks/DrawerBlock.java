package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class DrawerBlock extends BaseHorizontalBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Stream.of(
            Block.box(0, 0, 0, 16, 4, 16),
            Block.box(-0.5, 15, -0.5, 16.5, 16, 16.5),
            Block.box(0, 4, 0, 16, 15, 16),
            Block.box(6, 12, -1, 10, 13, -0.5),
            Block.box(6, 7, -1, 10, 8, -0.5),
            Block.box(2, 10, -0.5, 14, 14, 0),
            Block.box(2, 5, -0.5, 14, 9, 0)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get());

    public DrawerBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD).noCollission());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }
}
