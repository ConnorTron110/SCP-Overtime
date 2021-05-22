package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP035TendrilEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SCP035TendrilModel<T extends SCP035TendrilEntity> extends EntityModel<T> {
    private final ModelRenderer Tendril;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bb_main;

    public SCP035TendrilModel() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.Tendril = new ModelRenderer(this);
        this.Tendril.setPos(0.0F, 22.0F, 0.0F);
        setRotationAngle(this.Tendril, -0.7854F, 0.0F, 0.0F);
        this.Tendril.texOffs(0, 14).addBox(-2.5F, -13.0F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);
        this.bone2 = new ModelRenderer(this);
        this.bone2.setPos(0.0F, -13.0F, 0.0F);
        this.Tendril.addChild(this.bone2);
        setRotationAngle(this.bone2, 0.7854F, 0.0F, 0.0F);
        this.bone2.texOffs(20, 23).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
        this.bone3 = new ModelRenderer(this);
        this.bone3.setPos(0.0F, -15.0F, 0.0F);
        this.bone2.addChild(this.bone3);
        setRotationAngle(this.bone3, 0.7854F, 0.0F, 0.0F);
        this.bone3.texOffs(0, 32).addBox(-1.5F, -15.0F, -1.5F, 3.0F, 15.0F, 3.0F, 0.0F, false);
        this.bone4 = new ModelRenderer(this);
        this.bone4.setPos(0.0F, -15.0F, 0.0F);
        this.bone3.addChild(this.bone4);
        setRotationAngle(this.bone4, 0.3927F, 0.0F, 0.0F);
        this.bone4.texOffs(12, 32).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
        this.bone5 = new ModelRenderer(this);
        this.bone5.setPos(0.0F, -15.0F, 0.0F);
        this.bone4.addChild(this.bone5);
        setRotationAngle(this.bone5, 1.1781F, 0.0F, 0.0F);
        this.bone5.texOffs(0, 0).addBox(-0.5F, -15.0F, -0.5F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        this.bb_main = new ModelRenderer(this);
        this.bb_main.setPos(0.0F, 24.0F, 0.0F);
        this.bb_main.texOffs(20, 14).addBox(-3.5F, -2.0F, -3.5F, 7.0F, 2.0F, 7.0F, 0.0F, false);
        this.bb_main.texOffs(0, 0).addBox(-7.0F, -0.1F, -7.0F, 14.0F, 0.0F, 14.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Tendril.render(matrixStack, buffer, packedLight, packedOverlay);
        this.bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setupAnim(T e, float f, float f1, float f2, float f3, float f4) {}
}