package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP303Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP303Model<T extends SCP303Entity> extends EntityModel<T> {
    private final ModelRenderer Torso;
    private final ModelRenderer Belly;
    private final ModelRenderer Chest;
    private final ModelRenderer cube_r1;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer Head;
    private final ModelRenderer LowerJaw;
    private final ModelRenderer UpperJaw;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer RightLeg;

    public SCP303Model() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.Torso = new ModelRenderer(this);
        this.Torso.setPos(1.5F, 0.0F, 0.5F);
        this.Belly = new ModelRenderer(this);
        this.Belly.setPos(-2.0F, 12.0F, 0.0F);
        this.Torso.addChild(this.Belly);
        this.Belly.texOffs(21, 25).addBox(-3.0F, -6.0F, -1.5F, 7.0F, 6.0F, 3.0F, 0.0F, false);
        this.Chest = new ModelRenderer(this);
        this.Chest.setPos(0.5F, -6.0F, 0.0F);
        this.Belly.addChild(this.Chest);
        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Chest.addChild(this.cube_r1);
        setRotationAngle(this.cube_r1, 0.3927F, 0.0F, 0.0F);
        this.cube_r1.texOffs(0, 12).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
        this.RightArm = new ModelRenderer(this);
        this.RightArm.setPos(-5.5F, -3.5F, -2.0F);
        this.Chest.addChild(this.RightArm);
        this.RightArm.texOffs(12, 31).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);
        this.LeftArm = new ModelRenderer(this);
        this.LeftArm.setPos(5.5F, -3.5F, -2.0F);
        this.Chest.addChild(this.LeftArm);
        this.LeftArm.texOffs(0, 28).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.0F, -5.5F, -2.5F);
        this.Chest.addChild(this.Head);
        this.Head.texOffs(0, 0).addBox(-4.0F, -8.0F, 0.2F, 8.0F, 8.0F, 4.0F, 0.1F, false);
        this.LowerJaw = new ModelRenderer(this);
        this.LowerJaw.setPos(0.0F, -2.05F, 0.0F);
        this.Head.addChild(this.LowerJaw);
        this.LowerJaw.texOffs(24, 0).addBox(-4.0F, -0.55F, -4.0F, 8.0F, 2.0F, 4.0F, 0.35F, false);
        this.LowerJaw.texOffs(20, 18).addBox(-4.0F, 0.05F, -4.0F, 8.0F, 3.0F, 4.0F, 0.1F, false);
        this.UpperJaw = new ModelRenderer(this);
        this.UpperJaw.setPos(0.0F, -5.0F, 0.0F);
        this.Head.addChild(this.UpperJaw);
        this.UpperJaw.texOffs(20, 8).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 3.0F, 4.0F, 0.1F, false);
        this.UpperJaw.texOffs(0, 22).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 4.0F, 0.3F, false);
        this.LeftLeg = new ModelRenderer(this);
        this.LeftLeg.setPos(2.5F, 0.0F, 0.0F);
        this.Belly.addChild(this.LeftLeg);
        this.LeftLeg.texOffs(24, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);
        this.RightLeg = new ModelRenderer(this);
        this.RightLeg.setPos(-1.5F, 0.0F, 0.0F);
        this.Belly.addChild(this.RightLeg);
        this.RightLeg.texOffs(36, 34).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Torso.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setupAnim(T entity, float f, float f1, float f2, float f3, float f4) {
        this.RightArm.xRot = MathHelper.cos(f * 0.6662F + 3.1415927F) * f1;
        this.LeftLeg.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.Head.yRot = f3 / 57.295776F;
        this.Head.xRot = f4 / 57.295776F;
        this.LeftArm.xRot = MathHelper.cos(f * 0.6662F) * f1;
        this.RightLeg.xRot = MathHelper.cos(f) * 1.0F * f1;
    }
}
