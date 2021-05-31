package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP5167Model;
import io.github.connortron110.overtime.client.render.entity.layers.GlowLayer;
import io.github.connortron110.overtime.common.entities.scp.SCP5167Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP5167Renderer extends MobRenderer<SCP5167Entity, SCP5167Model<SCP5167Entity>> {
    public SCP5167Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP5167Model<>(), 0.45F);
        addLayer(new GlowLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(SCP5167Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp5167.png");
    }
}
