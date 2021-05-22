package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP035TendrilModel;
import io.github.connortron110.overtime.common.entities.scp.SCP035TendrilEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP035TendrilRenderer extends MobRenderer<SCP035TendrilEntity, SCP035TendrilModel<SCP035TendrilEntity>> {
    public SCP035TendrilRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP035TendrilModel<>(), 0.45F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP035TendrilEntity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp035_tendril.png");
    }
}
