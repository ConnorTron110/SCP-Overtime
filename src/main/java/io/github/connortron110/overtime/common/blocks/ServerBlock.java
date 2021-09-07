package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
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

public class ServerBlock extends BaseHorizontalBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Stream.of(
            Block.box(1, 12, 3, 15, 15, 15),
            Block.box(0, 0, 2, 1, 16, 16),
            Block.box(15, 0, 2, 16, 16, 16),
            Block.box(1, 1, 2, 15, 2, 16),
            Block.box(1, 4, 3, 15, 7, 15),
            Block.box(1, 8, 3, 15, 11, 15)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get());

    public ServerBlock() {
        super(Properties.copy(ModMaterialProperties.WOOD));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }
}
