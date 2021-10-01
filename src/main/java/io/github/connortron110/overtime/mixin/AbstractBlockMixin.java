package io.github.connortron110.overtime.mixin;

import io.github.connortron110.overtime.common.blocks.base.ToggleCenterOffsetBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractBlock.AbstractBlockState.class)
public abstract class AbstractBlockMixin {
    @Inject(at = @At(value = "RETURN"), method = "getOffset(Lnet/minecraft/world/IBlockReader;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/vector/Vector3d;", cancellable = true)
    public void getOffset(IBlockReader iBlockReader, BlockPos pos, CallbackInfoReturnable<Vector3d> cir) {
        AbstractBlock.AbstractBlockState abstractBlockState = (AbstractBlock.AbstractBlockState)((Object) this);
        if (abstractBlockState.getBlock() instanceof ToggleCenterOffsetBlock && iBlockReader.getBlockState(pos).getBlock() instanceof ToggleCenterOffsetBlock) {
            if (iBlockReader.getBlockState(pos).getValue(ToggleCenterOffsetBlock.OFFSET)) {
                cir.setReturnValue(Vector3d.ZERO);
            }
        }
    }
}
