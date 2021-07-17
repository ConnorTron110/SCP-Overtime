package io.github.connortron110.overtime.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP745Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP745Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.OutlineLayerBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class SCP745Renderer extends MobRenderer<SCP745Entity, SCP745Model<SCP745Entity>> {

    private final GlowLayer glowLayer;

    public SCP745Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP745Model<>(), 1F);
        glowLayer = new GlowLayer<>(this);
        addLayer(glowLayer);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP745Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp745.png");
    }

    @Override
    public void render(SCP745Entity entity, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer iRenderTypeBuffer, int p_225623_6_) {

        byte variant = entity.getVariant();
        glowLayer.setVariant(variant);
        TextFormatting color = TextFormatting.WHITE;
        if (variant == 1) color = TextFormatting.AQUA;
        else if (variant == 2) color = TextFormatting.RED;
        else if (variant == 3) color = TextFormatting.YELLOW;

        if (Minecraft.getInstance().shouldEntityAppearGlowing(entity)) {
            OutlineLayerBuffer outline = Minecraft.getInstance().renderBuffers().outlineBufferSource();

            int i2 = color.getColor();
            int k2 = i2 >> 16 & 255;
            int l2 = i2 >> 8 & 255;
            int i3 = i2 & 255;
            outline.setColor(k2, l2, i3, 255);
            iRenderTypeBuffer = outline;
        }

        super.render(entity, p_225623_2_, p_225623_3_, p_225623_4_, iRenderTypeBuffer, p_225623_6_);
    }
}
