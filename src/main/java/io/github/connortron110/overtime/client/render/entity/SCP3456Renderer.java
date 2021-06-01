package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP3456Model;
import io.github.connortron110.overtime.common.entities.scp.SCP3456Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP3456Renderer extends MobRenderer<SCP3456Entity, SCP3456Model<SCP3456Entity>> {
    public SCP3456Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP3456Model<>(), 0.45F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP3456Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp3456.png");
    }
}
