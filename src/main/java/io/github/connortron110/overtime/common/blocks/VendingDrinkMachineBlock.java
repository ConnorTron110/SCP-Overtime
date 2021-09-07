package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.TwoTallHorizontalBlock;
import io.github.connortron110.overtime.core.init.ModItems;
import io.github.connortron110.overtime.core.init.ModSounds;
import io.github.connortron110.overtime.core.util.CommonCode;
import io.github.connortron110.overtime.core.util.soundmanager.SoundData;
import io.github.connortron110.overtime.core.util.soundmanager.SoundManager;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;
import net.minecraftforge.common.util.Lazy;

import java.util.stream.Stream;

public class VendingDrinkMachineBlock extends TwoTallHorizontalBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Stream.of(
            Block.box(12.5, 15, 13, 15.5, 16, 13.5),
            Block.box(12, 0, 0, 16, 16, 13),
            Block.box(12.5, 13, 13, 15.5, 14, 13.5),
            Block.box(12.5, 11, 13, 15.5, 12, 13.5),
            Block.box(12.5, 9, 13, 15.5, 10, 13.5),
            Block.box(10, 6, 0, 12, 11, 14),
            Block.box(0, 0, 0, 12, 6, 14),
            Block.box(0, 11, 0, 12, 16, 14),
            Block.box(2, 6, 0, 10, 11, 13),
            Block.box(0, 6, 0, 2, 11, 14),
            Block.box(0, 16, 0, 12, 32, 14),
            Block.box(12, 16, 0, 16, 32, 13),
            Block.box(12.5, 17, 13, 15.5, 18, 13.5),
            Block.box(12.5, 21, 13, 15.5, 26, 13.5),
            Block.box(12.5, 19, 13, 15.5, 20, 13.5)
    ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get());

    private static final Lazy[] DISPENSABLE_ITEMS = new Lazy[]{Lazy.of(ModItems.CANNED_COFFEE), Lazy.of(ModItems.CAKEA_COLA), Lazy.of(ModItems.SANGRITA_DILE), Lazy.of(ModItems.SKY_FISH), Lazy.of(ModItems.PUMPKIN_PUNCH)};

    public VendingDrinkMachineBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        VoxelShape shape = SHAPES[state.getValue(FACING).get2DDataValue()];
        return (state.getValue(HALF) == DoubleBlockHalf.UPPER) ? shape.move(0D, -1D, 0D) : shape;
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() == ModItems.MONEY.get()) {
            if (stack.getCount() >= 2) {
                if (!player.abilities.instabuild) {
                    stack.shrink(2);
                }
                level.playSound(null, pos, ModSounds.VENDING_COIN.get(), SoundCategory.BLOCKS, 0.2F, 1F);

                WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                    int ticks = 0;

                    @Override
                    public boolean hasWork() {
                        return ticks <= 60 && level.getBlockState(pos).getBlock() == state.getBlock();
                    }

                    @Override
                    public boolean doWork() {
                        if (ticks == 60) {
                            level.playSound(null, pos, ModSounds.VENDING_DROP_ITEM.get(), SoundCategory.BLOCKS, 0.3F, 1F);
                            ItemEntity itemEntity = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), new ItemStack((IItemProvider) DISPENSABLE_ITEMS[level.random.nextInt(DISPENSABLE_ITEMS.length)].get()));
                            Vector3d itemPos = Vector3d.atCenterOf(pos).subtract(0D, 0.35D, 0D);
                            if (state.getValue(HALF) == DoubleBlockHalf.UPPER) itemPos = itemPos.subtract(0D, 1D, 0D);
                            itemPos = itemPos.add(Vector3d.atLowerCornerOf(state.getValue(FACING).getOpposite().getNormal()).scale(0.5D));
                            itemEntity.setPos(itemPos.x, itemPos.y, itemPos.z);
                            itemEntity.setDeltaMovement(Vector3d.atLowerCornerOf(state.getValue(FACING).getOpposite().getNormal()).scale(0.05D));
                            itemEntity.setPickUpDelay(10);
                            level.addFreshEntity(itemEntity);
                        }
                        ticks++;
                        return false;
                    }
                });
            }
        }

        return ActionResultType.SUCCESS;
    }

    @Override
    public void onPlace(BlockState p_220082_1_, World level, BlockPos pos, BlockState p_220082_4_, boolean p_220082_5_) {
        if (!level.isClientSide) {
            SoundManager.playSoundAtPos(pos, new SoundData(ModSounds.VENDING_AMBIENCE.get(), SoundCategory.BLOCKS, 0.05F, 1F, true, 0, pos));
        }
    }

    @Override
    public void onRemove(BlockState p_196243_1_, World level, BlockPos pos, BlockState p_196243_4_, boolean p_196243_5_) {
        if (!level.isClientSide) {
            SoundManager.stopSoundAtPos(pos, new SoundData(ModSounds.VENDING_AMBIENCE.get(), SoundCategory.BLOCKS, 0.05F, 1F, true, 0, pos));
        }
    }
}
