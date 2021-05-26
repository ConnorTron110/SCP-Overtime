package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;

public class SCP427NecklaceModel extends BipedModel<PlayerEntity> {
	private final ModelRenderer Body2;

	public SCP427NecklaceModel() {
		super(0,0,0,0);
		texWidth = 128;
		texHeight = 128;

		Body2 = new ModelRenderer(this);
		Body2.setPos(0.0F, 0.0F, 0.0F);
		Body2.texOffs(112, 57).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.3F, false);
		Body2.texOffs(112, 57).addBox(-0.5F, 6.75F, -2.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Body2.texOffs(112, 66).addBox(-1.5F, 4.0F, -3.0F, 3.0F, 3.0F, 2.0F, -0.2F, false);
		Body2.texOffs(124, 71).addBox(-0.5F, 5.0F, -2.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body.addChild(Body2);
	}

	public BipedModel<PlayerEntity> applyData(BipedModel<?> parent) {
		this.young = parent.young;
		this.crouching = parent.crouching;
		this.riding = parent.riding;
		this.rightArmPose = parent.rightArmPose;
		this.leftArmPose = parent.leftArmPose;
		return this;
	}
}