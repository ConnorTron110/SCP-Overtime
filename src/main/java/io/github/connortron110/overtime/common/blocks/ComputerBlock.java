package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.core.init.BlockInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
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

public class ComputerBlock extends HorizontalBlock {
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public ComputerBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.STONE));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(POWERED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        VoxelShape NORTH = Stream.of(
                Block.box(1, 2, 11, 15, 12, 12),
                Block.box(4, 0, 1, 15, 0.5, 6),
                Block.box(1, 0, 2, 3, 1, 5),
                Block.box(5, 0, 9, 11, 0.5, 14),
                Block.box(7, 0.5, 12, 9, 8.5, 13)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape SOUTH = Stream.of(
                Block.box(1, 2, 4, 15, 12, 5),
                Block.box(1, 0, 10, 12, 0.5, 15),
                Block.box(13, 0, 11, 15, 1, 14),
                Block.box(5, 0, 2, 11, 0.5, 7),
                Block.box(7, 0.5, 3, 9, 8.5, 4)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape EAST = Stream.of(
                Block.box(4, 2, 1, 5, 12, 15),
                Block.box(10, 0, 4, 15, 0.5, 15),
                Block.box(11, 0, 1, 14, 1, 3),
                Block.box(2, 0, 5, 7, 0.5, 11),
                Block.box(3, 0.5, 7, 4, 8.5, 9)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        VoxelShape WEST = Stream.of(
                Block.box(11, 2, 1, 12, 12, 15),
                Block.box(1, 0, 1, 6, 0.5, 12),
                Block.box(2, 0, 13, 5, 1, 15),
                Block.box(9, 0, 5, 14, 0.5, 11),
                Block.box(12, 0.5, 7, 13, 8.5, 9)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        if (this.getRegistryName().equals(BlockInit.TERMINAL.get().getRegistryName())) {
            NORTH = Stream.of(
                    Block.box(2, 7, 5.75, 3, 8, 6.75),
                    Block.box(1, 0, 6, 15, 13, 16),
                    Block.box(1, 0, 2, 15, 2, 6),
                    Block.box(1.025, 0.875, 2.275, 14.975, 2.825, 7.225),
                    Block.box(2, 9, 5.75, 3, 10, 6.75),
                    Block.box(13, 9, 5.75, 14, 11, 6.75)
            ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

            SOUTH = Stream.of(
                    Block.box(2, 7, 9.25, 3, 8, 10.25),
                    Block.box(1, 0, 0, 15, 13, 10),
                    Block.box(1, 0, 10, 15, 2, 14),
                    Block.box(1.0250000000000004, 2.024487737472694, 10.233218509558993, 14.975, 3.9744877374726943, 15.183218509558994),
                    Block.box(2, 9, 9.25, 3, 10, 10.25),
                    Block.box(13, 9, 9.25, 14, 11, 10.25)
            ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

            EAST = Stream.of(
                    Block.box(9.326989961042607, 7, 2.0063433722907265, 10.326989961042607, 8, 3.0063433722907265),
                    Block.box(0.07698996104260658, 0, 1.0063433722907265, 10.076989961042607, 13, 15.006343372290726),
                    Block.box(10.076989961042607, 0, 1.0063433722907265, 14.076989961042607, 2, 15.006343372290726),
                    Block.box(10.310208470601602, 2.024487737472694, 1.0313433722907268, 15.2602084706016, 3.9744877374726943, 14.981343372290727),
                    Block.box(9.326989961042607, 9, 2.0063433722907265, 10.326989961042607, 10, 3.0063433722907265),
                    Block.box(9.326989961042607, 9, 13.006343372290726, 10.326989961042607, 11, 14.006343372290726)
            ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

            WEST = Stream.of(
                    Block.box(5.6730100389573925, 7, 2.0063433722907265, 6.6730100389573925, 8, 3.0063433722907265),
                    Block.box(5.9230100389573925, 0, 1.0063433722907265, 15.923010038957393, 13, 15.006343372290726),
                    Block.box(1.9230100389573925, 0, 1.0063433722907265, 5.9230100389573925, 2, 15.006343372290726),
                    Block.box(0.7397915293983983, 2.024487737472694, 1.0313433722907268, 5.689791529398399, 3.9744877374726943, 14.981343372290727),
                    Block.box(5.6730100389573925, 9, 2.0063433722907265, 6.6730100389573925, 10, 3.0063433722907265),
                    Block.box(5.6730100389573925, 9, 13.006343372290726, 6.6730100389573925, 11, 14.006343372290726)
            ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
        }

        switch (state.getValue(FACING)) {
            case NORTH: return NORTH;
            case SOUTH: return SOUTH;
            case EAST: return EAST;
            default: return WEST;
        }
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return state.getValue(POWERED) ? 2 : 0;
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult hit) {
        state = state.cycle(POWERED);
        world.setBlock(pos, state, 10);
        world.playSound(null, pos, SoundEvents.ARROW_HIT_PLAYER, SoundCategory.BLOCKS, 0.5F, state.getValue(POWERED) ? 1 : 0.08F);
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
