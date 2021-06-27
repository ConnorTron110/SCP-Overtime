package io.github.connortron110.overtime.client.render.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.model.SCP650Model;
import io.github.connortron110.overtime.common.entities.scp.SCP650Entity;
import io.github.connortron110.overtime.core.util.CommonCode;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;

public class SCP650Renderer extends MobRenderer<SCP650Entity, EntityModel<SCP650Entity>> {

    private static final ArrayList<EntityModel<SCP650Entity>> MODELS = new ArrayList<>();
    static {
        MODELS.add(new SCP650Model.A<>());
        MODELS.add(new SCP650Model.B<>());
        MODELS.add(new SCP650Model.C<>());
        MODELS.add(new SCP650Model.D<>());
        MODELS.add(new SCP650Model.E<>());
        MODELS.add(new SCP650Model.F<>());
        MODELS.add(new SCP650Model.G<>());
    }

    public SCP650Renderer(EntityRendererManager rendererManager) {
        super(rendererManager, new SCP650Model.A<>(), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(SCP650Entity entity) {
        return new ResourceLocation(Overtime.MOD_ID, "textures/entity/scp650.png");
    }

    @Override
    public void render(SCP650Entity entity, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        if (entity.getRandom().nextDouble() > 0.85D) {
            if (!CommonCode.isBeingViewed(entity, 25, -0.05D)) {
                model = MODELS.get(entity.getRandom().nextInt(MODELS.size()));
            }
        }

        super.render(entity, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
    }
}
