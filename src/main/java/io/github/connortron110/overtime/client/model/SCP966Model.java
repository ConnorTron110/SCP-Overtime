package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP966Entity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class SCP966Model<T extends SCP966Entity> extends EntityModel<T> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Body;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer LeftArm;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer RightArm;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer Head;
	private final ModelRenderer RightIdk;
	private final ModelRenderer bone10;
	private final ModelRenderer bone13;
	private final ModelRenderer LeftIdk;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;

	public SCP966Model() {
		super(RenderType::entityTranslucent);
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-1.5F, 13.6768F, 0.8839F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		RightLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.texOffs(10, 21).addBox(-1.5F, -0.8787F, -1.0F, 2.0F, 6.0F, 3.0F, 0.1F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-0.5F, 2.3232F, -1.8839F);
		RightLeg.addChild(bone);
		bone.texOffs(28, 0).addBox(-1.0F, 1.15F, 1.8F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 1.15F, 3.8F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.texOffs(0, 10).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(1.5F, 13.6768F, 0.8839F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		LeftLeg.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
		cube_r3.texOffs(0, 20).addBox(-0.5F, -0.8787F, -1.0F, 2.0F, 6.0F, 3.0F, 0.1F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.5F, 2.3232F, -1.8839F);
		LeftLeg.addChild(bone4);
		bone4.texOffs(20, 24).addBox(-1.0F, 1.15F, 1.8F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 1.15F, 3.8F);
		bone4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.texOffs(0, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 14.0F, 1.5F);
		Body.texOffs(17, 7).addBox(-2.0F, -5.0F, -1.5F, 4.0F, 5.0F, 3.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(0.0F, -5.0F, 0.0F);
		Body.addChild(bone6);
		setRotationAngle(bone6, 0.3927F, 0.0F, 0.0F);
		bone6.texOffs(17, 17).addBox(-2.0F, -3.626F, -1.8142F, 4.0F, 4.0F, 3.0F, 0.2F, false);
		bone6.texOffs(20, 0).addBox(-0.5F, -3.626F, 1.3358F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -2.376F, 3.8858F);
		bone6.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.texOffs(25, 31).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 3.0F, 3.0F, -0.025F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(2.25F, 6.3673F, 0.3261F);
		

		bone7 = new ModelRenderer(this);
		bone7.setPos(0.0F, 0.0F, 0.0F);
		LeftArm.addChild(bone7);
		setRotationAngle(bone7, -0.1372F, -0.7119F, -0.0272F);
		bone7.texOffs(8, 30).addBox(0.0F, -0.75F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone7.texOffs(20, 12).addBox(2.0F, -2.75F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		bone7.texOffs(33, 31).addBox(-3.2868F, 4.3562F, -0.925F, 2.0F, 4.0F, 2.0F, 0.025F, false);

		bone8 = new ModelRenderer(this);
		bone8.setPos(1.0F, 4.25F, 0.0F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 1.1781F);
		bone8.texOffs(29, 13).addBox(-1.6173F, -0.9239F, -1.0F, 2.0F, 5.0F, 2.0F, -0.075F, false);
		bone8.texOffs(35, 12).addBox(-0.6173F, -2.9239F, -0.5F, 1.0F, 2.0F, 1.0F, -0.075F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-2.25F, 6.3673F, 0.3261F);
		

		bone11 = new ModelRenderer(this);
		bone11.setPos(0.0F, 0.0F, 0.0F);
		RightArm.addChild(bone11);
		setRotationAngle(bone11, -0.1372F, 0.7119F, 0.0272F);
		bone11.texOffs(0, 29).addBox(-2.0F, -0.75F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		bone11.texOffs(7, 17).addBox(-2.0F, -2.75F, -1.5F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		bone11.texOffs(16, 33).addBox(1.2868F, 4.3562F, -0.925F, 2.0F, 4.0F, 2.0F, 0.025F, false);

		bone12 = new ModelRenderer(this);
		bone12.setPos(-1.0F, 4.25F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -1.1781F);
		bone12.texOffs(28, 24).addBox(-0.3827F, -0.9239F, -1.0F, 2.0F, 5.0F, 2.0F, -0.075F, false);
		bone12.texOffs(16, 30).addBox(-0.3827F, -2.9239F, -0.5F, 1.0F, 2.0F, 1.0F, -0.075F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 5.374F, -0.5642F);
		Head.texOffs(0, 10).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		Head.texOffs(0, 0).addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.1F, false);

		RightIdk = new ModelRenderer(this);
		RightIdk.setPos(1.5F, -3.25F, -2.5F);
		Head.addChild(RightIdk);
		setRotationAngle(RightIdk, -0.1745F, 0.0F, 0.3927F);
		RightIdk.texOffs(34, 22).addBox(-1.0F, -3.0F, -0.5F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setPos(0.0F, -3.0F, -0.5F);
		RightIdk.addChild(bone10);
		setRotationAngle(bone10, -0.3927F, 0.0F, 0.0F);
		bone10.texOffs(31, 20).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setPos(0.0F, -2.0F, 0.0F);
		bone10.addChild(bone13);
		setRotationAngle(bone13, 0.7854F, 0.0F, 0.0F);
		bone13.texOffs(15, 0).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);

		LeftIdk = new ModelRenderer(this);
		LeftIdk.setPos(-1.5F, -3.25F, -2.5F);
		Head.addChild(LeftIdk);
		setRotationAngle(LeftIdk, -0.1745F, 0.0F, -0.3927F);
		LeftIdk.texOffs(0, 36).addBox(-2.0F, -3.0F, -0.5F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, -3.0F, -0.5F);
		LeftIdk.addChild(bone2);
		setRotationAngle(bone2, -0.3927F, 0.0F, 0.0F);
		bone2.texOffs(34, 0).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 0.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, -2.0F, 0.0F);
		bone2.addChild(bone5);
		setRotationAngle(bone5, 0.7854F, 0.0F, 0.0F);
		bone5.texOffs(31, 9).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(T e, float f, float f1, float f2, float f3, float f4) {

	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 0.5F);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}