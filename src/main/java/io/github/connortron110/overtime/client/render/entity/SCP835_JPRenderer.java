package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP835_JPModel;
import io.github.connortron110.overtime.common.entities.scp.SCP835_JPEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP835_JPRenderer extends MobRenderer<SCP835_JPEntity, SCP835_JPModel<SCP835_JPEntity>> {
    public SCP835_JPRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP835_JPModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP835_JPEntity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp835jp.png");
    }
}
