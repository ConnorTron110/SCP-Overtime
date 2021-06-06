package io.github.connortron110.overtime.client.render.entity.layers;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.Overtime;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GlowLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {

    private String variant = "";

    public GlowLayer(IEntityRenderer<T, M> iEntityRenderer) {
        super(iEntityRenderer);
    }

    public void setVariant(int variant) {
        this.variant = String.valueOf(variant);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        String replacement = "_glow" + variant + ".png";
        String glowLocation = getTextureLocation(entity).getPath().replace(".png", replacement);
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.eyes(new ResourceLocation(Overtime.MOD_ID, glowLocation)));
        getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
