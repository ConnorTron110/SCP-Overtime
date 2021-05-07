package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class FluteBlock extends HorizontalBlock {
    public FluteBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.WOOD));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        VoxelShape NS = Block.box(2.5, 0, 7.5, 13.5, 1, 8.5);
        VoxelShape EW = Block.box(7.5, 0, 2.5, 8.5, 1, 13.5);

        switch (state.getValue(FACING)) {
            case NORTH:
            case SOUTH:
                return NS;
            default: return EW;
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
