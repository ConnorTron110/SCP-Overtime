package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.AbstractBlock;
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

public class DrawerBlock extends HorizontalBlock {
    public DrawerBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD).noCollission());
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        VoxelShape NORTH = Stream.of(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(-0.5, 15, -0.5, 16.5, 16, 16.5),
                Block.box(0, 4, 0, 16, 15, 16),
                Block.box(6, 12, -1, 10, 13, -0.5),
                Block.box(6, 7, -1, 10, 8, -0.5),
                Block.box(2, 10, -0.5, 14, 14, 0),
                Block.box(2, 5, -0.5, 14, 9, 0)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape SOUTH = Stream.of(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(-0.5, 15, -0.5, 16.5, 16, 16.5),
                Block.box(0, 4, 0, 16, 15, 16),
                Block.box(6, 12, 16.5, 10, 13, 17),
                Block.box(6, 7, 16.5, 10, 8, 17),
                Block.box(2, 10, 16, 14, 14, 16.5),
                Block.box(2, 5, 16, 14, 9, 16.5)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape EAST = Stream.of(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(-0.5, 15, -0.5, 16.5, 16, 16.5),
                Block.box(0, 4, 0, 16, 15, 16),
                Block.box(16.5, 12, 6, 17, 13, 10),
                Block.box(16.5, 7, 6, 17, 8, 10),
                Block.box(16, 10, 2, 16.5, 14, 14),
                Block.box(16, 5, 2, 16.5, 9, 14)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape WEST = Stream.of(
                Block.box(0, 0, 0, 16, 4, 16),
                Block.box(-0.5, 15, -0.5, 16.5, 16, 16.5),
                Block.box(0, 4, 0, 16, 15, 16),
                Block.box(-1, 12, 6, -0.5, 13, 10),
                Block.box(-1, 7, 6, -0.5, 8, 10),
                Block.box(-0.5, 10, 2, 0, 14, 14),
                Block.box(-0.5, 5, 2, 0, 9, 14)
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
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING);
    }
}
