package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class TerminalBlock extends ComputerBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Stream.of(
            Block.box(2, 7, 5.75, 3, 8, 6.75),
            Block.box(1, 0, 6, 15, 13, 16),
            Block.box(1, 0, 2, 15, 2, 6),
            Block.box(1.025, 0.875, 2.275, 14.975, 2.825, 7.225),
            Block.box(2, 9, 5.75, 3, 10, 6.75),
            Block.box(13, 9, 5.75, 14, 11, 6.75)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get());

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }
}
