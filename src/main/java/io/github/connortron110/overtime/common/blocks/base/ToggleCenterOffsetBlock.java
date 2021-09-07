package io.github.connortron110.overtime.common.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;

public abstract class ToggleCenterOffsetBlock extends Block {

    public static final BooleanProperty OFFSET = BooleanProperty.create("offset");

    public ToggleCenterOffsetBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(OFFSET, false));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext itemUseContext) {
        return this.defaultBlockState().setValue(OFFSET, itemUseContext.getPlayer() != null && !itemUseContext.getPlayer().isCrouching());
    }

    /**
     * Check {@link io.github.connortron110.overtime.mixin.AbstractBlockMixin#getOffset(IBlockReader, BlockPos, CallbackInfoReturnable)} For offset decision
     */
    @Override
    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(OFFSET);
    }
}
