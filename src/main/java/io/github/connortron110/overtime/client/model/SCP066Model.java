package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP066_2Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP066Model<T extends SCP066_2Entity> extends EntityModel<T> {
    private final ModelRenderer bone;
    private final ModelRenderer Tentacles;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer eyes;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer Base;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;

    public SCP066Model() {
        this.texWidth = 128;
        this.texHeight = 128;
        this.bone = new ModelRenderer(this);
        this.bone.setPos(0.0F, 20.0F, 0.0F);
        this.Tentacles = new ModelRenderer(this);
        this.Tentacles.setPos(6.0F, -1.0F, -0.25F);
        this.bone.addChild(this.Tentacles);
        this.Tentacles.texOffs(30, 26).addBox(-5.0F, -10.0F, 1.25F, 6.0F, 6.0F, 0.0F, 0.0F, false);
        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Tentacles.addChild(this.cube_r1);
        setRotationAngle(this.cube_r1, 0.0F, -0.7854F, 0.0F);
        this.cube_r1.texOffs(42, 26).addBox(-3.0F, -3.0F, 0.5F, 6.0F, 6.0F, 0.0F, 0.0F, false);
        this.cube_r2 = new ModelRenderer(this);
        this.cube_r2.setPos(-6.0F, 0.0F, -5.0F);
        this.Tentacles.addChild(this.cube_r2);
        setRotationAngle(this.cube_r2, 0.0F, -0.7854F, 0.0F);
        this.cube_r2.texOffs(0, 37).addBox(-3.0F, -3.0F, 0.5F, 6.0F, 6.0F, 0.0F, 0.0F, false);
        this.cube_r3 = new ModelRenderer(this);
        this.cube_r3.setPos(-9.5F, -1.0F, 6.25F);
        this.Tentacles.addChild(this.cube_r3);
        setRotationAngle(this.cube_r3, 0.0F, -1.9635F, 0.0F);
        this.cube_r3.texOffs(18, 26).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);
        this.cube_r4 = new ModelRenderer(this);
        this.cube_r4.setPos(-11.0F, -3.0F, 0.25F);
        this.Tentacles.addChild(this.cube_r4);
        setRotationAngle(this.cube_r4, 0.0F, -0.3927F, 0.0F);
        this.cube_r4.texOffs(12, 37).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);
        this.eyes = new ModelRenderer(this);
        this.eyes.setPos(0.0F, 0.0F, 4.0F);
        this.bone.addChild(this.eyes);
        this.cube_r5 = new ModelRenderer(this);
        this.cube_r5.setPos(0.0F, 0.0F, 0.0F);
        this.eyes.addChild(this.cube_r5);
        setRotationAngle(this.cube_r5, 0.0F, -0.7854F, -0.3927F);
        this.cube_r5.texOffs(0, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r6 = new ModelRenderer(this);
        this.cube_r6.setPos(4.0F, -1.0F, -4.0F);
        this.eyes.addChild(this.cube_r6);
        setRotationAngle(this.cube_r6, 0.0F, -0.3927F, 0.0F);
        this.cube_r6.texOffs(8, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r7 = new ModelRenderer(this);
        this.cube_r7.setPos(2.0F, 2.0F, -8.0F);
        this.eyes.addChild(this.cube_r7);
        setRotationAngle(this.cube_r7, 0.0F, 0.3927F, 0.0F);
        this.cube_r7.texOffs(24, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r8 = new ModelRenderer(this);
        this.cube_r8.setPos(-1.0F, -2.0F, -8.0F);
        this.eyes.addChild(this.cube_r8);
        setRotationAngle(this.cube_r8, 0.0F, -0.3927F, 0.0F);
        this.cube_r8.texOffs(16, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r9 = new ModelRenderer(this);
        this.cube_r9.setPos(4.25F, 2.75F, -1.5F);
        this.eyes.addChild(this.cube_r9);
        setRotationAngle(this.cube_r9, 0.3927F, 0.7854F, 0.3927F);
        this.cube_r9.texOffs(32, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r10 = new ModelRenderer(this);
        this.cube_r10.setPos(-5.0F, 2.5F, -5.0F);
        this.eyes.addChild(this.cube_r10);
        setRotationAngle(this.cube_r10, 0.0F, 0.7854F, 0.3927F);
        this.cube_r10.texOffs(40, 37).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.cube_r11 = new ModelRenderer(this);
        this.cube_r11.setPos(-1.0F, -5.0F, -4.0F);
        this.eyes.addChild(this.cube_r11);
        setRotationAngle(this.cube_r11, 0.0F, 0.3927F, 0.0F);
        this.cube_r11.texOffs(24, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        this.Base = new ModelRenderer(this);
        this.Base.setPos(0.1125F, 0.7275F, -0.0375F);
        this.bone.addChild(this.Base);
        this.Base.texOffs(0, 12).addBox(-3.05F, -4.84F, -3.65F, 7.0F, 7.0F, 7.0F, 0.0F, false);
        this.Base.texOffs(0, 0).addBox(-5.55F, 0.41F, -4.4F, 10.0F, 3.0F, 9.0F, 0.0F, false);
        this.Base.texOffs(28, 12).addBox(-3.55F, 1.16F, -3.9F, 7.0F, 3.0F, 8.0F, 0.0F, false);
        this.cube_r12 = new ModelRenderer(this);
        this.cube_r12.setPos(-0.3F, 0.86F, 0.1F);
        this.Base.addChild(this.cube_r12);
        setRotationAngle(this.cube_r12, 0.0F, 0.0F, 0.3927F);
        this.cube_r12.texOffs(38, 0).addBox(-4.5F, -1.5F, -4.0F, 9.0F, 3.0F, 8.0F, 0.0F, false);
        this.cube_r13 = new ModelRenderer(this);
        this.cube_r13.setPos(0.45F, -4.09F, -0.15F);
        this.Base.addChild(this.cube_r13);
        setRotationAngle(this.cube_r13, 0.0F, 0.0F, 0.7854F);
        this.cube_r13.texOffs(0, 26).addBox(-1.5F, -2.5F, -3.0F, 3.0F, 5.0F, 6.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setupAnim(T entity, float f, float f1, float f2, float f3, float f4) {
        this.bone.xRot = MathHelper.cos(f) * -1.0F * f1;
    }
}
