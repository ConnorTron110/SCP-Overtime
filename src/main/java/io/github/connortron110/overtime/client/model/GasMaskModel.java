package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;

public class GasMaskModel extends BipedModel<PlayerEntity> {
	private final ModelRenderer Head;
	private final ModelRenderer BreatherMid_r1;
	private final ModelRenderer BreatherMid_r2;

	public GasMaskModel() {
		super(0,0,0,0);
		texWidth = 1028;
		texHeight = 1028;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(248, 123).addBox(-4.0F, -5.25F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(248, 119).addBox(3.0F, -5.25F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Head.texOffs(224, 143).addBox(1.0F, -3.25F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(234, 141).addBox(-4.0F, -3.25F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(224, 119).addBox(-1.0F, -4.25F, -5.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		Head.texOffs(245, 140).addBox(-1.5F, -3.15F, -6.15F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(224, 135).addBox(-4.0F, -8.25F, -5.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
		Head.texOffs(224, 119).addBox(-4.0F, -8.2F, -4.0F, 8.0F, 8.0F, 8.0F, 0.125F, false);

		BreatherMid_r1 = new ModelRenderer(this);
		BreatherMid_r1.setPos(4.0F, -1.65F, -4.9429F);
		Head.addChild(BreatherMid_r1);
		setRotationAngle(BreatherMid_r1, 0.0F, -0.7854F, 0.0F);
		BreatherMid_r1.texOffs(242, 135).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		BreatherMid_r2 = new ModelRenderer(this);
		BreatherMid_r2.setPos(-4.0F, -1.65F, -4.9429F);
		Head.addChild(BreatherMid_r2);
		setRotationAngle(BreatherMid_r2, 0.0F, 0.7854F, 0.0F);
		BreatherMid_r2.texOffs(224, 139).addBox(-2.0F, -1.5F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		hat.addChild(Head);
	}


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
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