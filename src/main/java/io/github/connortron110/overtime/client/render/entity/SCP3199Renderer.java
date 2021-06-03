package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP3199Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP3199Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP3199Renderer extends MobRenderer<SCP3199Entity, SCP3199Model<SCP3199Entity>> {
    public SCP3199Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP3199Model<>(), 0.5F);
        addLayer(new GlowLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(SCP3199Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp3199.png");
    }
}
