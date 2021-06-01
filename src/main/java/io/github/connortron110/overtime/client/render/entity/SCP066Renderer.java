package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP066Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP066_2Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP066Renderer extends MobRenderer<SCP066_2Entity, SCP066Model<SCP066_2Entity>> {
    public SCP066Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP066Model<>(), 0.5F);
        addLayer(new GlowLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(SCP066_2Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp066_2.png");
    }
}
