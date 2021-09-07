package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class OliveOilBlock extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = VoxelShapes.join(Block.box(7, 8, 7, 9, 12, 9), Block.box(6, 0, 6, 10, 8, 10), IBooleanFunction.OR);

    public OliveOilBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.GLASS));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
