package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP745Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP745Model<T extends SCP745Entity> extends EntityModel<T> {
    private final ModelRenderer Torso;
    private final ModelRenderer Middle_Torso_r1;
    private final ModelRenderer Upper_Torso;
    private final ModelRenderer Upper_Torso_r1;
    private final ModelRenderer Right_Arm;
    private final ModelRenderer Right_Upper_Arm_r1;
    private final ModelRenderer Right_Lower_Arm;
    private final ModelRenderer Right_Arm_Feather_r1;
    private final ModelRenderer Right_Lower_Arm_r1;
    private final ModelRenderer Right_hand;
    private final ModelRenderer Right_Hand_r1;
    private final ModelRenderer Left_Arm;
    private final ModelRenderer Left_Upper_Arm_r1;
    private final ModelRenderer Left_Lower_Arm;
    private final ModelRenderer Left_Arm_Feather_r1;
    private final ModelRenderer Left_Lower_Arm_r1;
    private final ModelRenderer Left_hand;
    private final ModelRenderer Left_Hand_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Membrane;
    private final ModelRenderer Lower_Torso;
    private final ModelRenderer Lower_Torso_r1;
    private final ModelRenderer Left_Leg;
    private final ModelRenderer Left_Hip_r1;
    private final ModelRenderer Left_Upper_Leg;
    private final ModelRenderer Left_Upper_Leg_r1;
    private final ModelRenderer Left_Lower_Leg;
    private final ModelRenderer Left_Lower_Leg_r1;
    private final ModelRenderer Left_Foot;
    private final ModelRenderer Right_Leg;
    private final ModelRenderer Right_Hip_r1;
    private final ModelRenderer Right_Upper_Leg;
    private final ModelRenderer Right_Upper_Leg_r1;
    private final ModelRenderer Right_Lower_Leg;
    private final ModelRenderer Right_Lower_Leg_r1;
    private final ModelRenderer Right_Foot;
    private final ModelRenderer Tail;
    private final ModelRenderer Tail1_r1;
    private final ModelRenderer Tail2;
    private final ModelRenderer Tail2_r1;
    private final ModelRenderer Tail3;
    private final ModelRenderer Left_Tailfeather;
    private final ModelRenderer Left_Tailfeather_r1;
    private final ModelRenderer Right_tailfeather;
    private final ModelRenderer Right_Tailfeather_r1;

    public SCP745Model() {
        this.texHeight = 128;
        this.texWidth = 128;
        this.Torso = new ModelRenderer(this);
        this.Torso.setPos(0.0F, 6.6855F, 4.6865F);
        this.Middle_Torso_r1 = new ModelRenderer(this);
        this.Middle_Torso_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Torso.addChild(this.Middle_Torso_r1);
        setRotationAngle(this.Middle_Torso_r1, -0.3054F, 0.0F, 0.0F);
        this.Middle_Torso_r1.texOffs(44, 61).addBox(-3.0F, -3.0F, -4.5F, 6.0F, 6.0F, 9.0F, 0.0F, false);
        this.Upper_Torso = new ModelRenderer(this);
        this.Upper_Torso.setPos(0.0F, -1.3755F, -3.6965F);
        this.Torso.addChild(this.Upper_Torso);
        this.Upper_Torso_r1 = new ModelRenderer(this);
        this.Upper_Torso_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Upper_Torso.addChild(this.Upper_Torso_r1);
        setRotationAngle(this.Upper_Torso_r1, -0.1309F, 0.0F, 0.0F);
        this.Upper_Torso_r1.texOffs(0, 16).addBox(-3.5F, -2.97F, -8.74F, 7.0F, 7.0F, 9.0F, 0.0F, false);
        this.Right_Arm = new ModelRenderer(this);
        this.Right_Arm.setPos(-4.0F, 0.19F, -2.49F);
        this.Upper_Torso.addChild(this.Right_Arm);
        this.Right_Upper_Arm_r1 = new ModelRenderer(this);
        this.Right_Upper_Arm_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_Arm.addChild(this.Right_Upper_Arm_r1);
        setRotationAngle(this.Right_Upper_Arm_r1, 0.5672F, 0.0F, 0.0F);
        this.Right_Upper_Arm_r1.texOffs(26, 78).addBox(-0.5F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        this.Right_Lower_Arm = new ModelRenderer(this);
        this.Right_Lower_Arm.setPos(0.5F, 6.39F, 2.96F);
        this.Right_Arm.addChild(this.Right_Lower_Arm);
        this.Right_Arm_Feather_r1 = new ModelRenderer(this);
        this.Right_Arm_Feather_r1.setPos(-0.75F, -0.5F, -3.51F);
        this.Right_Lower_Arm.addChild(this.Right_Arm_Feather_r1);
        setRotationAngle(this.Right_Arm_Feather_r1, 0.3054F, -0.1745F, 0.5672F);
        this.Right_Arm_Feather_r1.texOffs(0, 30).addBox(0.0F, 0.0F, -3.5F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        this.Right_Lower_Arm_r1 = new ModelRenderer(this);
        this.Right_Lower_Arm_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_Lower_Arm.addChild(this.Right_Lower_Arm_r1);
        setRotationAngle(this.Right_Lower_Arm_r1, 0.3054F, 0.0F, 0.0F);
        this.Right_Lower_Arm_r1.texOffs(58, 32).addBox(-1.0F, -2.0F, -7.01F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        this.Right_hand = new ModelRenderer(this);
        this.Right_hand.setPos(0.0F, 0.12F, -7.09F);
        this.Right_Lower_Arm.addChild(this.Right_hand);
        this.Right_Hand_r1 = new ModelRenderer(this);
        this.Right_Hand_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_hand.addChild(this.Right_Hand_r1);
        setRotationAngle(this.Right_Hand_r1, -0.1745F, 0.0F, 0.0F);
        this.Right_Hand_r1.texOffs(23, 0).addBox(-1.5F, 0.01F, -0.4F, 3.0F, 4.0F, 1.0F, 0.0F, false);
        this.Left_Arm = new ModelRenderer(this);
        this.Left_Arm.setPos(4.0F, 0.19F, -2.49F);
        this.Upper_Torso.addChild(this.Left_Arm);
        this.Left_Upper_Arm_r1 = new ModelRenderer(this);
        this.Left_Upper_Arm_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Arm.addChild(this.Left_Upper_Arm_r1);
        setRotationAngle(this.Left_Upper_Arm_r1, 0.5672F, 0.0F, 0.0F);
        this.Left_Upper_Arm_r1.texOffs(36, 32).addBox(-1.5F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        this.Left_Lower_Arm = new ModelRenderer(this);
        this.Left_Lower_Arm.setPos(-0.5F, 6.39F, 2.96F);
        this.Left_Arm.addChild(this.Left_Lower_Arm);
        this.Left_Arm_Feather_r1 = new ModelRenderer(this);
        this.Left_Arm_Feather_r1.setPos(0.75F, -0.5F, -3.51F);
        this.Left_Lower_Arm.addChild(this.Left_Arm_Feather_r1);
        setRotationAngle(this.Left_Arm_Feather_r1, 0.3054F, 0.1745F, -0.5672F);
        this.Left_Arm_Feather_r1.texOffs(0, 26).addBox(0.0F, 0.0F, -3.5F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        this.Left_Lower_Arm_r1 = new ModelRenderer(this);
        this.Left_Lower_Arm_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Lower_Arm.addChild(this.Left_Lower_Arm_r1);
        setRotationAngle(this.Left_Lower_Arm_r1, 0.3054F, 0.0F, 0.0F);
        this.Left_Lower_Arm_r1.texOffs(0, 56).addBox(-1.0F, -2.0F, -7.01F, 2.0F, 2.0F, 7.0F, 0.0F, false);
        this.Left_hand = new ModelRenderer(this);
        this.Left_hand.setPos(0.0F, 0.12F, -7.09F);
        this.Left_Lower_Arm.addChild(this.Left_hand);
        this.Left_Hand_r1 = new ModelRenderer(this);
        this.Left_Hand_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_hand.addChild(this.Left_Hand_r1);
        setRotationAngle(this.Left_Hand_r1, -0.1745F, 0.0F, 0.0F);
        this.Left_Hand_r1.texOffs(0, 0).addBox(-1.5F, 0.01F, -0.4F, 3.0F, 4.0F, 1.0F, 0.0F, false);
        this.Neck = new ModelRenderer(this);
        this.Neck.setPos(0.0F, -1.7F, -8.33F);
        this.Upper_Torso.addChild(this.Neck);
        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Neck.addChild(this.Neck_r1);
        setRotationAngle(this.Neck_r1, -0.6109F, 0.0F, 0.0F);
        this.Neck_r1.texOffs(0, 78).addBox(-2.0F, -1.6669F, -8.0638F, 4.0F, 4.0F, 9.0F, 0.0F, false);
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.0F, -4.61F, -5.66F);
        this.Neck.addChild(this.Head);
        this.Head.texOffs(36, 76).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 6.0F, 8.0F, 0.0F, false);
        this.Membrane = new ModelRenderer(this);
        this.Membrane.setPos(0.0F, -1.5F, -5.5F);
        this.Head.addChild(this.Membrane);
        this.Membrane.texOffs(0, 32).addBox(-6.0F, -5.5F, -5.5F, 12.0F, 12.0F, 12.0F, 0.0F, false);
        this.Membrane.texOffs(23, 12).addBox(-2.0F, 6.5F, -5.5F, 0.0F, 7.0F, 4.0F, 0.0F, false);
        this.Membrane.texOffs(0, 12).addBox(2.0F, 6.5F, -5.5F, 0.0F, 7.0F, 4.0F, 0.0F, false);
        this.Lower_Torso = new ModelRenderer(this);
        this.Lower_Torso.setPos(0.0F, 0.1684F, 3.9451F);
        this.Torso.addChild(this.Lower_Torso);
        this.Lower_Torso_r1 = new ModelRenderer(this);
        this.Lower_Torso_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Lower_Torso.addChild(this.Lower_Torso_r1);
        setRotationAngle(this.Lower_Torso_r1, -0.3927F, 0.0F, 0.0F);
        this.Lower_Torso_r1.texOffs(0, 0).addBox(-3.5F, -2.0873F, -0.2701F, 7.0F, 7.0F, 9.0F, 0.0F, false);
        this.Left_Leg = new ModelRenderer(this);
        this.Left_Leg.setPos(3.0F, 2.8961F, 0.8685F);
        this.Lower_Torso.addChild(this.Left_Leg);
        this.Left_Hip_r1 = new ModelRenderer(this);
        this.Left_Hip_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Leg.addChild(this.Left_Hip_r1);
        setRotationAngle(this.Left_Hip_r1, -0.5236F, 0.0F, 0.0F);
        this.Left_Hip_r1.texOffs(82, 32).addBox(-2.0F, -3.03F, -3.45F, 4.0F, 9.0F, 7.0F, 0.0F, false);
        this.Left_Upper_Leg = new ModelRenderer(this);
        this.Left_Upper_Leg.setPos(0.0F, 3.25F, -6.0F);
        this.Left_Leg.addChild(this.Left_Upper_Leg);
        this.Left_Upper_Leg_r1 = new ModelRenderer(this);
        this.Left_Upper_Leg_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Upper_Leg.addChild(this.Left_Upper_Leg_r1);
        setRotationAngle(this.Left_Upper_Leg_r1, 1.3963F, 0.0F, 0.0F);
        this.Left_Upper_Leg_r1.texOffs(37, 90).addBox(-2.0F, 0.07F, -3.02F, 4.0F, 9.0F, 3.0F, -0.01F, false);
        this.Left_Lower_Leg = new ModelRenderer(this);
        this.Left_Lower_Leg.setPos(0.0F, 1.75F, 9.0F);
        this.Left_Upper_Leg.addChild(this.Left_Lower_Leg);
        this.Left_Lower_Leg_r1 = new ModelRenderer(this);
        this.Left_Lower_Leg_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Lower_Leg.addChild(this.Left_Lower_Leg_r1);
        setRotationAngle(this.Left_Lower_Leg_r1, -0.48F, 0.0F, 0.0F);
        this.Left_Lower_Leg_r1.texOffs(23, 88).addBox(-2.0F, -0.08F, -0.18F, 4.0F, 9.0F, 3.0F, 0.0F, false);
        this.Left_Foot = new ModelRenderer(this);
        this.Left_Foot.setPos(-0.5F, 7.25F, -0.75F);
        this.Left_Lower_Leg.addChild(this.Left_Foot);
        this.Left_Foot.texOffs(64, 66).addBox(-2.0F, 0.0F, -8.25F, 5.0F, 2.0F, 10.0F, 0.0F, false);
        this.Right_Leg = new ModelRenderer(this);
        this.Right_Leg.setPos(-3.0F, 2.8961F, 0.8685F);
        this.Lower_Torso.addChild(this.Right_Leg);
        this.Right_Hip_r1 = new ModelRenderer(this);
        this.Right_Hip_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_Leg.addChild(this.Right_Hip_r1);
        setRotationAngle(this.Right_Hip_r1, -0.5236F, 0.0F, 0.0F);
        this.Right_Hip_r1.texOffs(64, 78).addBox(-2.0F, -3.03F, -3.45F, 4.0F, 9.0F, 7.0F, 0.0F, false);
        this.Right_Upper_Leg = new ModelRenderer(this);
        this.Right_Upper_Leg.setPos(0.0F, 3.25F, -6.0F);
        this.Right_Leg.addChild(this.Right_Upper_Leg);
        this.Right_Upper_Leg_r1 = new ModelRenderer(this);
        this.Right_Upper_Leg_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_Upper_Leg.addChild(this.Right_Upper_Leg_r1);
        setRotationAngle(this.Right_Upper_Leg_r1, 1.3963F, 0.0F, 0.0F);
        this.Right_Upper_Leg_r1.texOffs(86, 78).addBox(-2.0F, 0.07F, -3.02F, 4.0F, 9.0F, 3.0F, -0.01F, false);
        this.Right_Lower_Leg = new ModelRenderer(this);
        this.Right_Lower_Leg.setPos(0.0F, 1.75F, 9.0F);
        this.Right_Upper_Leg.addChild(this.Right_Lower_Leg);
        this.Right_Lower_Leg_r1 = new ModelRenderer(this);
        this.Right_Lower_Leg_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_Lower_Leg.addChild(this.Right_Lower_Leg_r1);
        setRotationAngle(this.Right_Lower_Leg_r1, -0.48F, 0.0F, 0.0F);
        this.Right_Lower_Leg_r1.texOffs(26, 61).addBox(-2.0F, -0.08F, -0.18F, 4.0F, 9.0F, 3.0F, 0.0F, false);
        this.Right_Foot = new ModelRenderer(this);
        this.Right_Foot.setPos(0.5F, 7.25F, -0.75F);
        this.Right_Lower_Leg.addChild(this.Right_Foot);
        this.Right_Foot.texOffs(66, 53).addBox(-3.0F, 0.0F, -8.25F, 5.0F, 2.0F, 10.0F, 0.0F, false);
        this.Tail = new ModelRenderer(this);
        this.Tail.setPos(0.0F, 4.25F, 6.25F);
        this.Lower_Torso.addChild(this.Tail);
        this.Tail1_r1 = new ModelRenderer(this);
        this.Tail1_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Tail.addChild(this.Tail1_r1);
        setRotationAngle(this.Tail1_r1, -0.1309F, 0.0F, 0.0F);
        this.Tail1_r1.texOffs(30, 38).addBox(-2.5F, -2.5956F, 0.3299F, 5.0F, 5.0F, 18.0F, 0.0F, false);
        this.Tail2 = new ModelRenderer(this);
        this.Tail2.setPos(0.0F, 2.2F, 18.0F);
        this.Tail.addChild(this.Tail2);
        this.Tail2_r1 = new ModelRenderer(this);
        this.Tail2_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Tail2.addChild(this.Tail2_r1);
        setRotationAngle(this.Tail2_r1, -0.0436F, 0.0F, 0.0F);
        this.Tail2_r1.texOffs(0, 56).addBox(-2.0F, -2.0305F, -0.6414F, 4.0F, 4.0F, 18.0F, 0.0F, false);
        this.Tail3 = new ModelRenderer(this);
        this.Tail3.setPos(0.0F, 0.3342F, 17.352F);
        this.Tail2.addChild(this.Tail3);
        this.Tail3.texOffs(58, 32).addBox(-1.5F, -1.25F, -0.25F, 3.0F, 3.0F, 18.0F, 0.0F, false);
        this.Left_Tailfeather = new ModelRenderer(this);
        this.Left_Tailfeather.setPos(1.3604F, -0.1781F, 6.7465F);
        this.Tail3.addChild(this.Left_Tailfeather);
        this.Left_Tailfeather_r1 = new ModelRenderer(this);
        this.Left_Tailfeather_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Left_Tailfeather.addChild(this.Left_Tailfeather_r1);
        setRotationAngle(this.Left_Tailfeather_r1, 0.0F, 0.0F, 0.6981F);
        this.Left_Tailfeather_r1.texOffs(30, 0).addBox(-0.042F, -0.06F, -6.0F, 15.0F, 0.0F, 32.0F, 0.0F, false);
        this.Right_tailfeather = new ModelRenderer(this);
        this.Right_tailfeather.setPos(-1.3604F, -0.1781F, 6.7465F);
        this.Tail3.addChild(this.Right_tailfeather);
        this.Right_Tailfeather_r1 = new ModelRenderer(this);
        this.Right_Tailfeather_r1.setPos(0.0F, 0.0F, 0.0F);
        this.Right_tailfeather.addChild(this.Right_Tailfeather_r1);
        setRotationAngle(this.Right_Tailfeather_r1, 0.0F, 0.0F, -0.6981F);
        this.Right_Tailfeather_r1.texOffs(0, 0).addBox(-14.958F, -0.06F, -6.0F, 15.0F, 0.0F, 32.0F, 0.0F, false);
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Torso.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void setupAnim(T entity, float f, float f1, float f2, float f3, float f4) {
        this.Right_Leg.xRot = MathHelper.cos(f) * 1.0F * f1;
        this.Tail.yRot = MathHelper.cos(f * 0.6662F) * f1;
        this.Left_Leg.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.Head.yRot = f3 / 57.295776F;
        this.Head.xRot = f4 / 57.295776F;
    }
}