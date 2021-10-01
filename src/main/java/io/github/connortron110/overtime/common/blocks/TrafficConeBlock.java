package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.ToggleCenterOffsetBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class TrafficConeBlock extends ToggleCenterOffsetBlock {

    public static final VoxelShape SHAPE = Stream.of(
            Block.box(3, 0, 3, 13, 1, 13),
            Block.box(5, 1, 5, 11, 9, 11),
            Block.box(6, 9, 6, 10, 16, 10)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public TrafficConeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext p_220053_4_) {
        Vector3d vector3d = state.getOffset(iBlockReader, pos);
        return SHAPE.move(vector3d.x, vector3d.y, vector3d.z);
    }
}
