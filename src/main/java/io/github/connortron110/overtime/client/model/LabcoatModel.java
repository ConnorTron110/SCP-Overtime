package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class LabcoatModel extends BipedModel<PlayerEntity> {
	private final ModelRenderer RightLeg2;
	private final ModelRenderer RightFeet;
	private final ModelRenderer LeftLeg2;
	private final ModelRenderer LeftFeet;
	private final ModelRenderer Body2;
	private final ModelRenderer RightArm2;
	private final ModelRenderer LeftArm2;

	public LabcoatModel() {
		super(0,0,0,0);
		texWidth = 128;
		texHeight = 128;

		RightLeg2 = new ModelRenderer(this);
		RightLeg2.setPos(0,0,0);
		RightLeg2.texOffs(96, 62).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.325F, false);
		RightLeg2.texOffs(112, 60).addBox(-2.0F, -0.2F, -2.0F, 4.0F, 3.0F, 4.0F, 0.475F, false);

		RightFeet = new ModelRenderer(this);
		RightFeet.setPos(0,0,0);
		RightFeet.texOffs(80, 83).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.275F, false);

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setPos(0,0,0);
		LeftLeg2.texOffs(108, 72).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.325F, false);
		LeftLeg2.texOffs(80, 76).addBox(-2.0F, -0.15F, -2.0F, 4.0F, 3.0F, 4.0F, 0.45F, false);

		LeftFeet = new ModelRenderer(this);
		LeftFeet.setPos(0,0,0);
		LeftFeet.texOffs(92, 79).addBox(-2.0F, 10.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.275F, false);

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(80, 46).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.425F, false);

		RightArm2 = new ModelRenderer(this);
		RightArm2.setPos(0,0,0);
		RightArm2.texOffs(104, 46).addBox(-3.0F, -2.1F, -2.0F, 4.0F, 10.0F, 4.0F, 0.275F, false);

		LeftArm2 = new ModelRenderer(this);
		LeftArm2.setPos(0,0,0);
		LeftArm2.texOffs(80, 62).addBox(-1.0F, -2.1F, -2.0F, 4.0F, 10.0F, 4.0F, 0.275F, false);

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