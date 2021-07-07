package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP131Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP131Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP131Renderer extends MobRenderer<SCP131Entity, SCP131Model<SCP131Entity>> {

    public SCP131Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP131Model<>(), 0.5F);
        GlowLayer<SCP131Entity, SCP131Model<SCP131Entity>> glowLayer = new GlowLayer<>(this);
        glowLayer.setSubstring(2);
        addLayer(glowLayer);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP131Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp131_"+entity.getVariant()+".png");
    }
}
