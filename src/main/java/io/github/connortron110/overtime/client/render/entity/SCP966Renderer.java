package io.github.connortron110.overtime.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP966Model;
import io.github.connortron110.overtime.common.entities.scp.SCP966Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP966Renderer extends MobRenderer<SCP966Entity, SCP966Model<SCP966Entity>> {
    public SCP966Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP966Model<>(), 0F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP966Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp966.png");
    }

    @Override
    public void render(SCP966Entity entity, float p_225623_2_, float p_225623_3_, MatrixStack stackIn, IRenderTypeBuffer iRenderTypeBuffer, int p_225623_6_) {
        if (Minecraft.getInstance().player != null) {
            if (Minecraft.getInstance().player.isCreative() || Minecraft.getInstance().player.isSpectator()) { //TODO Also check for NVGs
                super.render(entity, p_225623_2_, p_225623_3_, stackIn, iRenderTypeBuffer, p_225623_6_);
            }
        }
    }
}
