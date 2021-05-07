package io.github.connortron110.overtime.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class GiftBlock extends Block {
    public GiftBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.FABRIC));
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return Stream.of(
                Block.box(4, 6, 8, 12, 9, 8),
                Block.box(4, 0, 4, 12, 6, 12),
                Block.box(4, 6, 8, 12, 9, 8)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    }
}
