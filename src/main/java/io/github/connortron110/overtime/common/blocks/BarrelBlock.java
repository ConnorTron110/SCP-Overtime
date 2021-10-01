package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.HorizontalOffsetBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class BarrelBlock extends HorizontalOffsetBlock {

    private static final VoxelShape SHAPE = Block.box(2.8, -0.375, 2.8, 13.2, 16.025, 13.2);

    public BarrelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext p_220053_4_) {
        Vector3d vector3d = state.getOffset(iBlockReader, pos);
        return SHAPE.move(vector3d.x, vector3d.y, vector3d.z);
    }
}
