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

public class GrainPouchBlock extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(4, 9, 4, 5, 10, 12),
            Block.box(4, 0, 4, 12, 8, 12),
            Block.box(5, 8, 5, 11, 9, 11),
            Block.box(5, 9, 4, 11, 10, 5),
            Block.box(5, 9, 11, 11, 10, 12),
            Block.box(11, 9, 4, 12, 10, 12)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

    public GrainPouchBlock() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.SAND));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
