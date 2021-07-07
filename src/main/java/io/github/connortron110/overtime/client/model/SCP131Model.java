package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP131Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SCP131Model<T extends SCP131Entity> extends EntityModel<T> {
    private final ModelRenderer NormalHeadRotation;
    private final ModelRenderer Sides_r1;
    private final ModelRenderer Body;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Top;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Top2;
    private final ModelRenderer Eye;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Antenna;
    private final ModelRenderer cube_r4;
    private final ModelRenderer bone2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer Wheel;
    private final ModelRenderer cube_r6;

    public SCP131Model() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.NormalHeadRotation = new ModelRenderer(this);
        this.NormalHeadRotation.setPos(0.0F, 22.0F, 0.0F);
        this.Sides_r1 = new ModelRenderer(this);
        this.Sides_r1.setPos(-1.0F, 0.0F, 0.0F);
        this.NormalHeadRotation.addChild(this.Sides_r1);
        setRotationAngle(this.Sides_r1, 3.1416F, 0.0F, 0.0F);
        this.Sides_r1.texOffs(31, 19).addBox(-3.0F, -1.0F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
        this.Sides_r1.texOffs(31, 8).addBox(3.0F, -1.0F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);
        this.Body = new ModelRenderer(this);
        this.Body.setPos(0.5F, -2.0F, -1.0F);
        this.NormalHeadRotation.addChild(this.Body);
        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Body.addChild(this.cube_r1);
        setRotationAngle(this.cube_r1, 3.1416F, 0.0F, 0.0F);
        this.cube_r1.texOffs(0, 12).addBox(-4.0F, 1.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(4, 12).addBox(-4.0F, 3.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(4, 14).addBox(2.0F, 1.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(0, 14).addBox(2.0F, 3.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(4, 4).addBox(-5.0F, 1.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(0, 4).addBox(3.0F, 1.0F, 2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        this.cube_r1.texOffs(0, 0).addBox(-5.0F, 4.0F, -5.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        this.cube_r1.texOffs(0, 24).addBox(-5.0F, 1.0F, -5.5F, 9.0F, 3.0F, 8.0F, 0.0F, false);
        this.cube_r1.texOffs(0, 12).addBox(-5.0F, -2.0F, -5.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        this.Top = new ModelRenderer(this);
        this.Top.setPos(0.0F, 0.0F, 0.0F);
        this.Body.addChild(this.Top);
        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setPos(0.0F, 0.0F, 0.1F);
        this.Top.addChild(this.cube_r2);
        setRotationAngle(this.cube_r2, 3.1416F, 0.0F, 0.0F);
        this.cube_r2.texOffs(0, 37).addBox(-4.0F, 3.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r2.texOffs(1, 40).addBox(-3.0F, 4.0F, 3.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        this.cube_r2.texOffs(0, 35).addBox(2.0F, 3.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        this.Top2 = new ModelRenderer(this);
        this.Top2.setPos(-1.0F, -5.0F, 0.0F);
        this.Body.addChild(this.Top2);
        setRotationAngle(this.Top2, 0.0F, 0.0F, -3.1416F);
        this.Eye = new ModelRenderer(this);
        this.Eye.setPos(0.0F, -4.5F, -4.0F);
        this.NormalHeadRotation.addChild(this.Eye);
        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setPos(0.0F, 0.0F, 0.0F);
        this.Eye.addChild(this.cube_r3);
        setRotationAngle(this.cube_r3, 3.1416F, 0.0F, 0.0F);
        this.cube_r3.texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);
        this.Antenna = new ModelRenderer(this);
        this.Antenna.setPos(0.0F, -9.0F, -3.5F);
        this.NormalHeadRotation.addChild(this.Antenna);
        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setPos(0.0F, 0.0F, 0.0F);
        this.Antenna.addChild(this.cube_r4);
        setRotationAngle(this.cube_r4, -2.618F, 0.0F, 0.0F);
        this.cube_r4.texOffs(27, 0).addBox(-1.5F, -3.0F, -5.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
        this.bone2 = new ModelRenderer(this);
        this.bone2.setPos(0.0F, -2.5F, 4.25F);
        this.Antenna.addChild(this.bone2);
        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setPos(0.0F, 0.0F, 0.0F);
        this.bone2.addChild(this.cube_r5);
        setRotationAngle(this.cube_r5, -2.9234F, 0.0F, 0.0F);
        this.cube_r5.texOffs(13, 35).addBox(-1.0F, -2.0401F, -5.0694F, 2.0F, 2.0F, 5.0F, 0.0F, false);
        this.Wheel = new ModelRenderer(this);
        this.Wheel.setPos(0.0F, 21.0F, 0.0F);
        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setPos(0.0F, 0.0F, 0.0F);
        this.Wheel.addChild(this.cube_r6);
        setRotationAngle(this.cube_r6, 3.1416F, 0.0F, 0.0F);
        this.cube_r6.texOffs(28, 29).addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.NormalHeadRotation.render(matrixStack, buffer, packedLight, packedOverlay);
        this.Wheel.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setupAnim(T entity, float f, float f1, float f2, float f3, float f4) {
        this.NormalHeadRotation.xRot = f4 / 57.295776F;
    }
}
