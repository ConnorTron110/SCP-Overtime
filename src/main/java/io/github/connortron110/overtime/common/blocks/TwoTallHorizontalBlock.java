package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Used for 2 Tall Horizontal Facing blocks
 */
public abstract class TwoTallHorizontalBlock extends HorizontalBlock {

    /**
     * If Tile Entity is required for whatever reason, bound it to the Bottom Half of the block
     */
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    public TwoTallHorizontalBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override //Prevents the Drop if player is in creative
    public void playerWillDestroy(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!level.isClientSide && player.isCreative()) {
            DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
            if (doubleblockhalf == DoubleBlockHalf.UPPER) {
                BlockPos blockpos = pos.below();
                BlockState blockstate = level.getBlockState(blockpos);
                if (blockstate.getBlock() == state.getBlock() && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER) {
                    level.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 35);
                    level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
                }
            }
        }
        super.playerWillDestroy(level, pos, state, player);
    }

    @Override //Used to place the other block when added to world
    public void setPlacedBy(World level, BlockPos pos, BlockState state, @Nullable LivingEntity livingEntity, ItemStack stack) {
        level.setBlockAndUpdate(pos.above(), state.setValue(HALF, DoubleBlockHalf.UPPER));
    }

    @Nullable
    @Override //Checks mostly if the block can be placed
    public BlockState getStateForPlacement(BlockItemUseContext useContext) {
        BlockPos blockpos = useContext.getClickedPos();
        if (blockpos.getY() < 255 && useContext.getLevel().getBlockState(blockpos.above()).canBeReplaced(useContext)) {
            return this.defaultBlockState().setValue(FACING, useContext.getHorizontalDirection()).setValue(HALF, DoubleBlockHalf.LOWER);
        } else {
            return null;
        }
    }

    @Override //Used to remove when opposite block is not there
    public BlockState updateShape(BlockState state, Direction fromDirection, BlockState fromState, IWorld level, BlockPos pos, BlockPos fromPos) {
        BlockPos otherPartPos = state.getValue(HALF) == DoubleBlockHalf.LOWER ? pos.above() : pos.below();
        if (!(level.getBlockState(otherPartPos).getBlock() instanceof TwoTallHorizontalBlock)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            return state;
        }
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return PushReaction.DESTROY;
    }

    @Override
    public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) pos = pos.below();
        return super.getPickBlock(state, target, world, pos, player);
    }

    @Override
    public BlockRenderType getRenderShape(BlockState state) {
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? BlockRenderType.MODEL : BlockRenderType.INVISIBLE;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING).add(HALF);
    }
}
