package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class JumpSuitModel extends BipedModel<PlayerEntity> {
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightFeet;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftFeet;
	private final ModelRenderer Body2;
	private final ModelRenderer RightArm2;
	private final ModelRenderer LeftArm2;

	public JumpSuitModel() {
		super(0,0,0,0);
		texWidth = 256;
		texHeight = 256;

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setPos(0,0,0);
		RightLeg2.texOffs(240, 244).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.325F, false);

		RightFeet = new ModelRenderer(this);
		RightFeet.setPos(0,0,0);
		RightFeet.texOffs(212, 248).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.275F, false);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setPos(0,0,0);
		LeftLeg2.texOffs(236, 218).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.325F, false);

		LeftFeet = new ModelRenderer(this);
		LeftFeet.setPos(0,0,0);
		LeftFeet.texOffs(240, 230).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.275F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(212, 218).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.425F, false);

		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(0,0,0);
		RightArm2.texOffs(228, 234).addBox(-3.0F, -2.1F, -2.0F, 4.0F, 10.0F, 4.0F, 0.275F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(0,0,0);
		LeftArm2.texOffs(212, 234).addBox(-1.0F, -2.1F, -2.0F, 4.0F, 10.0F, 4.0F, 0.275F, false);

		body.addChild(Body2);
		rightArm.addChild(RightArm2);
		leftArm.addChild(LeftArm2);
		rightLeg.addChild(RightLeg2);
		rightLeg.addChild(RightFeet);
		leftLeg.addChild(LeftLeg2);
		leftLeg.addChild(LeftFeet);
	}

	public BipedModel<PlayerEntity> applyData(BipedModel<?> parent, EquipmentSlotType equipmentSlotType) {
		this.young = parent.young;
		this.crouching = parent.crouching;
		this.riding = parent.riding;
		this.rightArmPose = parent.rightArmPose;
		this.leftArmPose = parent.leftArmPose;


		Body2.visible = false;
		RightArm2.visible = false;
		LeftArm2.visible = false;
		RightLeg2.visible = false;
		LeftLeg2.visible = false;
		RightFeet.visible = false;
		LeftFeet.visible = false;
		switch (equipmentSlotType) {
			case CHEST:
				Body2.visible = true;
				RightArm2.visible = true;
				LeftArm2.visible = true;
				break;
			case LEGS:
				RightLeg2.visible = true;
				LeftLeg2.visible = true;
				break;
			case FEET:
				RightFeet.visible = true;
				LeftFeet.visible = true;
		}

		return this;
	}
}