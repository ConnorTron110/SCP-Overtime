package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class ComputerBlock extends BaseHorizontalBlock {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Stream.of(
            Block.box(1, 2, 11, 15, 12, 12),
            Block.box(4, 0, 1, 15, 0.5, 6),
            Block.box(1, 0, 2, 3, 1, 5),
            Block.box(5, 0, 9, 11, 0.5, 14),
            Block.box(7, 0.5, 12, 9, 8.5, 13)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get());

    public ComputerBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.STONE));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(POWERED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return state.getValue(POWERED) ? 2 : 0;
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult hit) {
        state = state.cycle(POWERED);
        world.setBlock(pos, state, 10);
        world.playSound(null, pos, SoundEvents.ARROW_HIT_PLAYER, SoundCategory.BLOCKS, 0.5F, state.getValue(POWERED) ? 1F : 0.08F);
        return ActionResultType.sidedSuccess(world.isClientSide);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite()).setValue(POWERED, false);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING).add(POWERED);
    }
}
