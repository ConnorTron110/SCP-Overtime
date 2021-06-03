package io.github.connortron110.overtime.client.render.entity;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP1762Model;
import io.github.connortron110.overtime.common.entities.scp.SCP1762Entity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP1762Renderer extends MobRenderer<SCP1762Entity, SCP1762Model<SCP1762Entity>> {
    public SCP1762Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP1762Model<>(), 0.25F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP1762Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp1762_"+entity.getVariant()+".png");
    }
}
