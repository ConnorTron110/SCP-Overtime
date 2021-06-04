package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP1529Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP1529Model<T extends SCP1529Entity> extends EntityModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;

    public SCP1529Model() {
        this.texWidth = 128;
        this.texHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.0F, 0.0F, 0.0F);
        this.Head.texOffs(24, 24).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        this.Head.texOffs(24, 8).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.1F, false);
        this.Head.texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.2F, false);
        this.Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.3F, false);
        this.Body = new ModelRenderer(this);
        this.Body.setPos(0.0F, 0.0F, 0.0F);
        this.Body.texOffs(48, 40).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        this.Body.texOffs(48, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.175F, false);
        this.Body.texOffs(24, 40).addBox(-4.0F, -3.0F, 2.0F, 8.0F, 14.0F, 4.0F, -0.025F, false);
        this.Body.texOffs(0, 32).addBox(-4.0F, -3.0F, 2.0F, 8.0F, 14.0F, 4.0F, 0.15F, false);
        this.RightArm = new ModelRenderer(this);
        this.RightArm.setPos(-5.0F, 2.0F, 0.0F);
        this.RightArm.texOffs(72, 44).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.RightArm.texOffs(0, 50).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.175F, false);
        this.LeftArm = new ModelRenderer(this);
        this.LeftArm.setPos(5.0F, 2.0F, 0.0F);
        this.LeftArm.texOffs(72, 0).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.LeftArm.texOffs(56, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.175F, false);
        this.RightLeg = new ModelRenderer(this);
        this.RightLeg.setPos(-1.9F, 12.0F, 0.0F);
        this.RightLeg.texOffs(32, 68).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.RightLeg.texOffs(0, 66).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.05F, false);
        this.LeftLeg = new ModelRenderer(this);
        this.LeftLeg.setPos(1.9F, 12.0F, 0.0F);
        this.LeftLeg.texOffs(68, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.LeftLeg.texOffs(60, 56).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.05F, false);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(matrixStack, buffer, packedLight, packedOverlay);
        this.Body.render(matrixStack, buffer, packedLight, packedOverlay);
        this.RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        this.LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        this.RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        this.LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T e, float f, float f1, float f2, float f3, float f4) {
        this.RightArm.xRot = MathHelper.cos(f * 0.6662F + 3.1415927F) * f1;
        this.LeftLeg.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.Head.yRot = f3 / 57.295776F;
        this.Head.xRot = f4 / 57.295776F;
        this.LeftArm.xRot = MathHelper.cos(f * 0.6662F) * f1;
        this.RightLeg.xRot = MathHelper.cos(f) * 1.0F * f1;
    }
}
