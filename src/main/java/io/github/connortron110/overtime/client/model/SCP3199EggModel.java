package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP3199EggEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SCP3199EggModel<T extends SCP3199EggEntity> extends EntityModel<T> {
    private final ModelRenderer bb_main;

    public SCP3199EggModel() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.bb_main = new ModelRenderer((Model)this);
        this.bb_main.setPos(0.0F, 24.0F, 0.0F);
        this.bb_main.texOffs(0, 0).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setupAnim(SCP3199EggEntity e, float f, float f1, float f2, float f3, float f4) {}
}
