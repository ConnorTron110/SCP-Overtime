package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP3199EggModel;
import io.github.connortron110.overtime.common.entities.scp.SCP3199EggEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP3199EggRenderer extends MobRenderer<SCP3199EggEntity, SCP3199EggModel<SCP3199EggEntity>> {
    public SCP3199EggRenderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP3199EggModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP3199EggEntity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp3199_egg.png");
    }
}
