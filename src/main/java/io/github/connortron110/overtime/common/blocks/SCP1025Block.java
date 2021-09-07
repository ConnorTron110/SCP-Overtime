package io.github.connortron110.overtime.common.blocks;

import io.github.connortron110.overtime.common.blocks.base.BaseHorizontalBlock;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SCP1025Block extends BaseHorizontalBlock {

    private static final VoxelShape[] SHAPES = CommonCode.makeHorizontalShapes(Block.box(5, 0, 4, 11, 2, 12));

    public SCP1025Block() {
        super(AbstractBlock.Properties.copy(ModMaterialProperties.FABRIC));
    }

    static ArrayList<Effect> EFFECTS = new ArrayList<>(ForgeRegistries.POTIONS.getValues().stream().filter(effect -> effect.getCategory().equals(EffectType.HARMFUL)).collect(Collectors.toList()));

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        if (world.isClientSide) return ActionResultType.SUCCESS;
        if (player.isCreative()) return ActionResultType.FAIL;

        world.playSound(null, pos, SoundEvents.BOOK_PAGE_TURN, SoundCategory.AMBIENT, 1, 1);

        for (Effect effect : EFFECTS) {
            if (Math.random() < (1F / EFFECTS.size())) {
                player.addEffect(new EffectInstance(effect, Integer.MAX_VALUE, 0, false, false));
                if (effect != Effects.HARM) {
                    player.sendMessage(new TranslationTextComponent("scp1025.effect", effect.getDisplayName()), Util.NIL_UUID);
                } else {
                    player.sendMessage(new TranslationTextComponent("scp1025.heartattack"), Util.NIL_UUID);
                }
                return ActionResultType.SUCCESS;
            }
        }

        player.sendMessage(new TranslationTextComponent("scp1025.noeffect"), Util.NIL_UUID);
        return ActionResultType.SUCCESS;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader iBlockReader, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.getValue(FACING).get2DDataValue()];
    }
}
