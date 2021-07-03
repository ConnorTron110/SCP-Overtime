package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP303Model;
import io.github.connortron110.overtime.common.entities.scp.SCP303Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP303Renderer extends MobRenderer<SCP303Entity, SCP303Model<SCP303Entity>> {
    public SCP303Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP303Model<>(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP303Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp303.png");
    }
}
