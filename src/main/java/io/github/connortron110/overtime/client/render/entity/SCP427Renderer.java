package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.SCP427_1Model;
import io.github.connortron110.overtime.common.entities.scp.SCP427_1Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP427Renderer extends MobRenderer<SCP427_1Entity, SCP427_1Model<SCP427_1Entity>> {
    public SCP427Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP427_1Model<>(), 1.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP427_1Entity entity) {
        return new ResourceLocation(Reference.MOD_ID, "textures/entity/scp427_1.png");
    }
}
