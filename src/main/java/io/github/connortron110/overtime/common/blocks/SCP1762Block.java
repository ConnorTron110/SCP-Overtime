package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.entities.scp.SCP1762Entity;
import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModEntities;
import io.github.connortron110.overtime.core.init.ModSounds;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.WorldWorkerManager;

import javax.annotation.Nullable;
import java.util.Random;

public class SCP1762Block extends HorizontalBlock {

    public static final BooleanProperty OPEN = BooleanProperty.create("open");
    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Block.box(3, 0, 4.5, 13, 8.05, 11.5));

    public SCP1762Block() {
        super(Properties.copy(ModMaterialProperties.WOOD));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(OPEN, false).setValue(ACTIVE, false));
    }

    @Override
    public void onPlace(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moving) {
        if (state.getValue(ACTIVE)) {
            world.playSound(null, pos, ModSounds.SCP1762_OST.get(), SoundCategory.NEUTRAL, 1F, 1F);

            WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                int ticks = 0;

                @Override
                public boolean hasWork() {
                    if (world.getBlockState(pos).getBlock() != ModBlocks.SCP1762.get()) {
                        return false;
                    }
                    return ticks <= 2440 && state.getValue(OPEN);
                }

                @Override
                public boolean doWork() {
                    if (ticks == 2440) {
                        world.setBlock(pos, state.cycle(ACTIVE).setValue(OPEN, false), 3);
                    }
                    ticks++;
                    return false;
                }
            });

            world.getBlockTicks().scheduleTick(pos, this, 5);
        }
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(ACTIVE) && !state.getValue(OPEN);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        if (Math.random() < 0.5D && Math.random() < 0.05D && Math.random() < 0.5D) {
            world.setBlock(pos, state.setValue(OPEN, true).setValue(ACTIVE, true), 3);
        }
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        if (!state.getValue(ACTIVE)) return;
        world.getBlockTicks().scheduleTick(pos, this, 5);

        if (Math.random() < 0.05D) {
            SCP1762Entity dragon = new SCP1762Entity(ModEntities.SCP1762.get(), world);
            dragon.moveTo(pos, rand.nextFloat() * 360F, 0F);
            dragon.finalizeSpawn(world, world.getCurrentDifficultyAt(dragon.blockPosition()), SpawnReason.TRIGGERED, null, null);
            world.addFreshEntity(dragon);
        }
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        world.setBlock(pos, state.cycle(OPEN).setValue(ACTIVE, false), 3);
        if (world.getServer() != null)
            world.getServer().getCommands().performCommand((new CommandSource(ICommandSource.NULL, new Vector3d(pos.getX(), pos.getY(), pos.getZ()), Vector2f.ZERO, (ServerWorld)world, 4, "",
                    new StringTextComponent(""), world.getServer(), null)).withSuppressedOutput(), "/stopsound @a * overtime:scp1762_ost");
        return ActionResultType.SUCCESS;
    }

    @Override
    public boolean removedByPlayer(BlockState state, World world, BlockPos pos, PlayerEntity player, boolean willHarvest, FluidState fluid) {
        //No other way to do this
        if (world.getServer() != null)
            world.getServer().getCommands().performCommand((new CommandSource(ICommandSource.NULL, new Vector3d(pos.getX(), pos.getY(), pos.getZ()), Vector2f.ZERO, (ServerWorld) world, 4, "",
                    new StringTextComponent(""), world.getServer(), null)).withSuppressedOutput(), "/stopsound @a * overtime:scp1762_ost");

        return super.removedByPlayer(state, world, pos, player, willHarvest, fluid);
    }

    @Override
    public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
        if (state.getValue(ACTIVE)) {
            for (int i = 0; i < 15; i++) {
                double x = pos.getX() + 0.5D;
                double y = pos.getY() + 0.5D;
                double z = pos.getZ() + 0.5D;
                double d4 = rand.nextDouble() * 0.6D - 0.3D;
                world.addParticle(ParticleTypes.LARGE_SMOKE, x + d4, y, z + d4, 0D, 0D, 0D);
            }
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING, OPEN, ACTIVE);
    }
}
