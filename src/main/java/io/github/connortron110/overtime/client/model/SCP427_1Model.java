package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP427_1Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP427_1Model<T extends SCP427_1Entity> extends EntityModel<T> {
    private final ModelRenderer Torso;
    private final ModelRenderer Tail_Thing_r1;
    private final ModelRenderer Upper_Torso_r1;
    private final ModelRenderer Neck;
    private final ModelRenderer Neck_r1;
    private final ModelRenderer Head;
    private final ModelRenderer Head_r1;
    private final ModelRenderer Right_Extra_Arm;
    private final ModelRenderer Right_Extra_Arm_r1;
    private final ModelRenderer Right_Arm;
    private final ModelRenderer Right_Upper_Arm_r1;
    private final ModelRenderer Right_Lower_Arm;
    private final ModelRenderer Right_Lower_Arm_r1;
    private final ModelRenderer Right_Hand;
    private final ModelRenderer Right_hand_r1;
    private final ModelRenderer Left_Extra_Arm;
    private final ModelRenderer Left_Extra_Arm_r1;
    private final ModelRenderer Left_Arm;
    private final ModelRenderer Left_Upper_Arm_r1;
    private final ModelRenderer Left_Lower_Arm;
    private final ModelRenderer Left_Lower_Arm_r1;
    private final ModelRenderer Left_Hand;
    private final ModelRenderer Left_hand_r1;
    private final ModelRenderer Right_Leg;
    private final ModelRenderer Right_Upper_Leg_r1;
    private final ModelRenderer Right_Lower_Leg;
    private final ModelRenderer Right_Lower_Leg_r1;
    private final ModelRenderer Right_Foot;
    private final ModelRenderer Left_Leg;
    private final ModelRenderer Left_Upper_Leg_r1;
    private final ModelRenderer Left_Lower_Leg;
    private final ModelRenderer Left_lower_Leg_r1;
    private final ModelRenderer Left_Foot;

    public SCP427_1Model() {
        this.texWidth = 128;
        this.texHeight = 128;

        this.Torso = new ModelRenderer(this);
        this.Torso.setPos(0.0F, -4.75F, 1.125F);
        this.Tail_Thing_r1 = new ModelRenderer(this);
        this.Tail_Thing_r1.setPos(0.0F, -4.5F, 4.875F);
        this.Torso.addChild(this.Tail_Thing_r1);
        setRotationAngle(this.Tail_Thing_r1, 0.1745F, 0.0F, 0.0F);
        this.Tail_Thing_r1.texOffs(0, 0).addBox(-1.0F, 16.97F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        this.Tail_Thing_r1.texOffs(0, 24).addBox(-6.0F, -0.03F, -6.0F, 12.0F, 17.0F, 6.0F, 0.0F, false);
        this.Upper_Torso_r1 = new ModelRenderer(this);
        this.Upper_Torso_r1.setPos(0.0F, -3.25F, -2.125F);
        this.Torso.addChild(this.Upper_Torso_r1);
        setRotationAngle(this.Upper_Torso_r1, 1.1781F, 0.0F, 0.0F);
        this.Upper_Torso_r1.texOffs(0, 0).addBox(-8.0F, -8.0F, -6.0F, 16.0F, 14.0F, 10.0F, 0.0F, false);
        this.Neck = new ModelRenderer(this);
        this.Neck.setPos(0.0F, -2.5F, -7.375F);
        this.Torso.addChild(this.Neck);
        this.Neck_r1 = new ModelRenderer(this);
        this.Neck_r1.setPos(0.0F, 1.75F, -3.25F);
        this.Neck.addChild(this.Neck_r1);
        setRotationAngle(this.Neck_r1, 0.7418F, 0.0F, 0.0F);
        this.Neck_r1.texOffs(52, 0).addBox(-2.5F, -1.5F, -7.5F, 5.0F, 5.0F, 11.0F, 0.0F, false);
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.5F, 6.5F, -6.75F);
        this.Neck.addChild(this.Head);
        this.Head_r1 = new ModelRenderer(this);
        this.Head_r1.setPos(0.0F, 0.75F, -3.5F);
        this.Head.addChild(this.Head_r1);
        setRotationAngle(this.Head_r1, 0.3491F, 0.0F, 0.0F);
        this.Head_r1.texOffs(50, 42).addBox(-3.5F, -2.5F, -6.5F, 6.0F, 6.0F, 10.0F, 0.0F, false);
        this.Right_Extra_Arm = new ModelRenderer(this);
        this.Right_Extra_Arm.setPos(-6.0F, 2.75F, 3.875F);
        this.Torso.addChild(this.Right_Extra_Arm);
        this.Right_Extra_Arm_r1 = new ModelRenderer(this);
        this.Right_Extra_Arm_r1.setPos(-2.0F, 11.0F, 6.0F);
        this.Right_Extra_Arm.addChild(this.Right_Extra_Arm_r1);
        setRotationAngle(this.Right_Extra_Arm_r1, 0.5672F, 0.48F, 0.48F);
        this.Right_Extra_Arm_r1.texOffs(46, 47).addBox(0.0F, -13.0F, -10.0F, 0.0F, 14.0F, 11.0F, 0.0F, false);
        this.Right_Arm = new ModelRenderer(this);
        this.Right_Arm.setPos(-8.0F, -1.75F, -4.375F);
        this.Torso.addChild(this.Right_Arm);
        setRotationAngle(this.Right_Arm, 0.0F, 0.4363F, 0.0F);
        this.Right_Upper_Arm_r1 = new ModelRenderer(this);
        this.Right_Upper_Arm_r1.setPos(-1.0F, 6.0F, -3.75F);
        this.Right_Arm.addChild(this.Right_Upper_Arm_r1);
        setRotationAngle(this.Right_Upper_Arm_r1, -0.3054F, 0.0F, 0.0F);
        this.Right_Upper_Arm_r1.texOffs(0, 47).addBox(-3.0F, -9.5F, -1.0F, 6.0F, 22.0F, 6.0F, 0.0F, false);
        this.Right_Lower_Arm = new ModelRenderer(this);
        this.Right_Lower_Arm.setPos(-1.0F, 19.25F, -3.0F);
        this.Right_Arm.addChild(this.Right_Lower_Arm);
        this.Right_Lower_Arm_r1 = new ModelRenderer(this);
        this.Right_Lower_Arm_r1.setPos(0.5F, -0.75F, -10.5F);
        this.Right_Lower_Arm.addChild(this.Right_Lower_Arm_r1);
        setRotationAngle(this.Right_Lower_Arm_r1, -1.1781F, 0.0F, 0.0F);
        this.Right_Lower_Arm_r1.texOffs(24, 66).addBox(-3.0F, -9.5F, -1.0F, 5.0F, 18.0F, 6.0F, 0.0F, false);
        this.Right_Hand = new ModelRenderer(this);
        this.Right_Hand.setPos(1.0F, 2.25F, -15.75F);
        this.Right_Lower_Arm.addChild(this.Right_Hand);
        this.Right_hand_r1 = new ModelRenderer(this);
        this.Right_hand_r1.setPos(0.0F, -2.75F, -1.25F);
        this.Right_Hand.addChild(this.Right_hand_r1);
        setRotationAngle(this.Right_hand_r1, -0.1309F, 0.0F, 0.0F);
        this.Right_hand_r1.texOffs(78, 53).addBox(-4.0F, 2.5F, -2.0F, 6.0F, 9.0F, 5.0F, 0.0F, false);
        this.Left_Extra_Arm = new ModelRenderer(this);
        this.Left_Extra_Arm.setPos(6.0F, 2.75F, 3.875F);
        this.Torso.addChild(this.Left_Extra_Arm);
        this.Left_Extra_Arm_r1 = new ModelRenderer(this);
        this.Left_Extra_Arm_r1.setPos(2.0F, 11.0F, 6.0F);
        this.Left_Extra_Arm.addChild(this.Left_Extra_Arm_r1);
        setRotationAngle(this.Left_Extra_Arm_r1, 0.5672F, -0.48F, -0.48F);
        this.Left_Extra_Arm_r1.texOffs(24, 41).addBox(0.0F, -13.0F, -10.0F, 0.0F, 14.0F, 11.0F, 0.0F, false);
        this.Left_Arm = new ModelRenderer(this);
        this.Left_Arm.setPos(8.0F, -1.75F, -4.375F);
        this.Torso.addChild(this.Left_Arm);
        setRotationAngle(this.Left_Arm, 0.0F, -0.4363F, 0.0F);
        this.Left_Upper_Arm_r1 = new ModelRenderer(this);
        this.Left_Upper_Arm_r1.setPos(1.0F, 6.0F, -3.75F);
        this.Left_Arm.addChild(this.Left_Upper_Arm_r1);
        setRotationAngle(this.Left_Upper_Arm_r1, -0.3054F, 0.0F, 0.0F);
        this.Left_Upper_Arm_r1.texOffs(36, 24).addBox(-3.0F, -9.5F, -1.0F, 6.0F, 22.0F, 6.0F, 0.0F, false);
        this.Left_Lower_Arm = new ModelRenderer(this);
        this.Left_Lower_Arm.setPos(1.0F, 19.25F, -3.0F);
        this.Left_Arm.addChild(this.Left_Lower_Arm);
        this.Left_Lower_Arm_r1 = new ModelRenderer(this);
        this.Left_Lower_Arm_r1.setPos(-0.5F, -0.75F, -10.5F);
        this.Left_Lower_Arm.addChild(this.Left_Lower_Arm_r1);
        setRotationAngle(this.Left_Lower_Arm_r1, -1.1781F, 0.0F, 0.0F);
        this.Left_Lower_Arm_r1.texOffs(60, 16).addBox(-2.0F, -9.5F, -1.0F, 5.0F, 18.0F, 6.0F, 0.0F, false);
        this.Left_Hand = new ModelRenderer(this);
        this.Left_Hand.setPos(-1.0F, 2.25F, -15.75F);
        this.Left_Lower_Arm.addChild(this.Left_Hand);
        this.Left_hand_r1 = new ModelRenderer(this);
        this.Left_hand_r1.setPos(0.0F, -2.75F, -1.25F);
        this.Left_Hand.addChild(this.Left_hand_r1);
        setRotationAngle(this.Left_hand_r1, -0.1309F, 0.0F, 0.0F);
        this.Left_hand_r1.texOffs(77, 35).addBox(-2.0F, 2.5F, -2.0F, 6.0F, 9.0F, 5.0F, 0.0F, false);
        this.Right_Leg = new ModelRenderer(this);
        this.Right_Leg.setPos(-4.0F, 11.25F, 4.625F);
        this.Torso.addChild(this.Right_Leg);
        this.Right_Upper_Leg_r1 = new ModelRenderer(this);
        this.Right_Upper_Leg_r1.setPos(2.5F, 8.0F, 0.0F);
        this.Right_Leg.addChild(this.Right_Upper_Leg_r1);
        setRotationAngle(this.Right_Upper_Leg_r1, -0.4363F, 0.0F, 0.0F);
        this.Right_Upper_Leg_r1.texOffs(0, 75).addBox(-5.0F, -8.0F, -6.0F, 5.0F, 14.0F, 6.0F, 0.0F, false);
        this.Right_Lower_Leg = new ModelRenderer(this);
        this.Right_Lower_Leg.setPos(0.0F, 11.0F, -8.0F);
        this.Right_Leg.addChild(this.Right_Lower_Leg);
        this.Right_Lower_Leg_r1 = new ModelRenderer(this);
        this.Right_Lower_Leg_r1.setPos(2.0F, 1.25F, 8.0F);
        this.Right_Lower_Leg.addChild(this.Right_Lower_Leg_r1);
        setRotationAngle(this.Right_Lower_Leg_r1, 1.3963F, 0.0F, 0.0F);
        this.Right_Lower_Leg_r1.texOffs(82, 12).addBox(-4.0F, -8.0F, -4.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
        this.Right_Foot = new ModelRenderer(this);
        this.Right_Foot.setPos(0.0F, 5.5F, 12.25F);
        this.Right_Lower_Leg.addChild(this.Right_Foot);
        this.Right_Foot.texOffs(42, 5).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
        this.Left_Leg = new ModelRenderer(this);
        this.Left_Leg.setPos(4.0F, 11.25F, 4.625F);
        this.Torso.addChild(this.Left_Leg);
        this.Left_Upper_Leg_r1 = new ModelRenderer(this);
        this.Left_Upper_Leg_r1.setPos(-2.5F, 8.0F, 0.0F);
        this.Left_Leg.addChild(this.Left_Upper_Leg_r1);
        setRotationAngle(this.Left_Upper_Leg_r1, -0.4363F, 0.0F, 0.0F);
        this.Left_Upper_Leg_r1.texOffs(62, 66).addBox(0.0F, -8.0F, -6.0F, 5.0F, 14.0F, 6.0F, 0.0F, false);
        this.Left_Lower_Leg = new ModelRenderer(this);
        this.Left_Lower_Leg.setPos(0.0F, 11.0F, -8.0F);
        this.Left_Leg.addChild(this.Left_Lower_Leg);
        this.Left_lower_Leg_r1 = new ModelRenderer(this);
        this.Left_lower_Leg_r1.setPos(-2.0F, 1.25F, 8.0F);
        this.Left_Lower_Leg.addChild(this.Left_lower_Leg_r1);
        setRotationAngle(this.Left_lower_Leg_r1, 1.3963F, 0.0F, 0.0F);
        this.Left_lower_Leg_r1.texOffs(46, 72).addBox(0.0F, -8.0F, -4.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);
        this.Left_Foot = new ModelRenderer(this);
        this.Left_Foot.setPos(0.0F, 5.5F, 12.25F);
        this.Left_Lower_Leg.addChild(this.Left_Foot);
        this.Left_Foot.texOffs(42, 0).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Torso.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void setupAnim(SCP427_1Entity e, float f, float f1, float f2, float f3, float f4) {
        this.Right_Leg.xRot = MathHelper.cos(f) * 1.0F * f1;
        this.Right_Arm.xRot = MathHelper.cos(f * 0.6662F + 3.1415927F) * f1;
        this.Left_Leg.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.Head.yRot = f3 / 57.295776F;
        this.Head.xRot = f4 / 57.295776F;
        this.Left_Arm.xRot = MathHelper.cos(f * 0.6662F) * f1;
    }
}