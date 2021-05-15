package io.github.connortron110.overtime.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP066Model;
import io.github.connortron110.overtime.common.entities.scp.SCP066_2Entity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

public class SCP066Renderer extends MobRenderer<SCP066_2Entity, SCP066Model<SCP066_2Entity>> {
    public SCP066Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP066Model<>(), 0.45F);

        //TODO Generalize method into one class
        addLayer(new LayerRenderer<SCP066_2Entity, SCP066Model<SCP066_2Entity>>(new IEntityRenderer<SCP066_2Entity, SCP066Model<SCP066_2Entity>>() {
            @Override
            public SCP066Model<SCP066_2Entity> getModel() {
                return model;
            }

            @Override
            public ResourceLocation getTextureLocation(SCP066_2Entity entity) {
                return SCP066Renderer.this.getTextureLocation(entity);
            }
        }) {
            @Override
            public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, SCP066_2Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
                IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.eyes(new ResourceLocation(Reference.MOD_ID, "textures/entity/scp066_2_glow.png")));
                getParentModel().renderToBuffer(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
            }
        });
    }

    @Override
    public ResourceLocation getTextureLocation(SCP066_2Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp066_2.png");
    }
}
