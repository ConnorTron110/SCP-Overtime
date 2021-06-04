package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP1529Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP1529Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP1529Renderer extends MobRenderer<SCP1529Entity, SCP1529Model<SCP1529Entity>> {
    public SCP1529Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP1529Model<>(), 0.5F);
        addLayer(new GlowLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(SCP1529Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp1529.png");
    }
}
