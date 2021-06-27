package io.github.connortron110.overtime.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP2761Model;
import io.github.connortron110.overtime.client.model.SCP2761SleepingModel;
import io.github.connortron110.overtime.common.entities.scp.SCP2761Entity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SCP2761Renderer extends MobRenderer<SCP2761Entity, SCP2761Model<SCP2761Entity>> {

    private final SCP2761Model<SCP2761Entity> AWAKE = new SCP2761Model<>();
    private final SCP2761Model<SCP2761Entity> ASLEEP = new SCP2761SleepingModel<>();

    public SCP2761Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP2761Model<>(), 3F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP2761Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp2761.png");
    }

    @Override
    public void render(SCP2761Entity entity, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        model = entity.isSleeping() ? ASLEEP : AWAKE;
        super.render(entity, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
    }
}
