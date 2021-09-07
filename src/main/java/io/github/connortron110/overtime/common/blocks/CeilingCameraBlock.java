package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class CeilingCameraBlock extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = VoxelShapes.join(Block.box(4, 14, 4, 12, 16, 12), Block.box(5.5, 10, 5.5, 10.5, 14, 10.5), IBooleanFunction.OR);

    public CeilingCameraBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.METAL));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction fromDirection, BlockState fromState, IWorld world, BlockPos pos, BlockPos fromPos) {
        return !state.canSurvive(world, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, fromDirection, fromState, world, pos, fromPos);
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
        return world.getBlockState(pos.above()).isFaceSturdy(world, pos.above(), Direction.DOWN);
    }
}
