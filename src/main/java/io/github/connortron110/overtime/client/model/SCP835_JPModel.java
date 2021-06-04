package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP835_JPEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP835_JPModel<T extends SCP835_JPEntity> extends EntityModel<T> {
    private final ModelRenderer Head;
    private final ModelRenderer Body;
    private final ModelRenderer Body_r1;
    private final ModelRenderer RightArm;
    private final ModelRenderer Knife;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;

    public SCP835_JPModel() {
        this.texWidth = 128;
        this.texHeight = 128;
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.0F, 0.0F, 0.0F);
        this.Head.texOffs(0, 24).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        this.Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
        this.Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 16.0F, 8.0F, 0.2F, false);
        this.Head.texOffs(28, 56).addBox(0.0F, -8.0F, 4.0F, 0.0F, 11.0F, 6.0F, 0.0F, false);
        this.Body = new ModelRenderer(this);
        this.Body.setPos(0.0F, 0.0F, 0.0F);
        this.Body.texOffs(32, 24).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        this.Body_r1 = new ModelRenderer(this);
        this.Body_r1.setPos(0.0F, 2.6F, -0.9F);
        this.Body.addChild(this.Body_r1);
        setRotationAngle(this.Body_r1, -0.3927F, 0.0F, 0.0F);
        this.Body_r1.texOffs(34, 40).addBox(-4.0F, -2.0F, -2.0F, 8.0F, 5.0F, 3.0F, -0.025F, false);
        this.RightArm = new ModelRenderer(this);
        this.RightArm.setPos(-5.0F, 2.5F, 0.0F);
        this.RightArm.texOffs(14, 56).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
        this.Knife = new ModelRenderer(this);
        this.Knife.setPos(5.0F, 21.5F, 0.0F);
        this.RightArm.addChild(this.Knife);
        this.Knife.texOffs(16, 40).addBox(-5.5F, -14.0F, -12.0F, 0.0F, 3.0F, 9.0F, 0.0F, false);
        this.Knife.texOffs(16, 73).addBox(-6.0F, -14.0F, -3.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        this.LeftArm = new ModelRenderer(this);
        this.LeftArm.setPos(5.0F, 2.5F, 0.0F);
        this.LeftArm.texOffs(0, 56).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
        this.RightLeg = new ModelRenderer(this);
        this.RightLeg.setPos(-1.9F, 12.0F, 0.0F);
        this.RightLeg.texOffs(0, 40).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.RightLeg.texOffs(0, 73).addBox(-2.1F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.05F, false);
        this.LeftLeg = new ModelRenderer(this);
        this.LeftLeg.setPos(1.9F, 12.0F, 0.0F);
        this.LeftLeg.texOffs(56, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        this.LeftLeg.texOffs(40, 56).addBox(-1.9F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.05F, false);
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
        this.LeftLeg.xRot = MathHelper.cos(f * 1.0F) * -1.0F * f1;
        this.Head.yRot = f3 / 57.295776F;
        this.Head.xRot = f4 / 57.295776F;
        this.LeftArm.xRot = MathHelper.cos(f * 0.6662F) * f1;
        this.RightLeg.xRot = MathHelper.cos(f * 1.0F) * 1.0F * f1;
    }
}
