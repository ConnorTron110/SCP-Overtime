package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class ServerBlock extends HorizontalBlock {
    public ServerBlock() {
        super(Properties.copy(ModMaterialProperties.WOOD));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        VoxelShape NORTH = Stream.of(
                Block.box(1, 12, 3, 15, 15, 15),
                Block.box(0, 0, 2, 1, 16, 16),
                Block.box(15, 0, 2, 16, 16, 16),
                Block.box(1, 1, 2, 15, 2, 16),
                Block.box(1, 4, 3, 15, 7, 15),
                Block.box(1, 8, 3, 15, 11, 15)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape SOUTH = Stream.of(
                Block.box(1, 12, 1, 15, 15, 13),
                Block.box(15, 0, 0, 16, 16, 14),
                Block.box(0, 0, 0, 1, 16, 14),
                Block.box(1, 1, 0, 15, 2, 14),
                Block.box(1, 4, 1, 15, 7, 13),
                Block.box(1, 8, 1, 15, 11, 13)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape EAST = Stream.of(
                Block.box(1, 12, 1, 13, 15, 15),
                Block.box(0, 0, 0, 14, 16, 1),
                Block.box(0, 0, 15, 14, 16, 16),
                Block.box(0, 1, 1, 14, 2, 15),
                Block.box(1, 4, 1, 13, 7, 15),
                Block.box(1, 8, 1, 13, 11, 15)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape WEST = Stream.of(
                Block.box(3, 12, 1, 15, 15, 15),
                Block.box(2, 0, 15, 16, 16, 16),
                Block.box(2, 0, 0, 16, 16, 1),
                Block.box(2, 1, 1, 16, 2, 15),
                Block.box(3, 4, 1, 15, 7, 15),
                Block.box(3, 8, 1, 15, 11, 15)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        switch (state.getValue(FACING)) {
            case NORTH: return NORTH;
            case SOUTH: return SOUTH;
            case EAST: return EAST;
            default: return WEST;
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING);
    }
}
