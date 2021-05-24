package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;

public class HazmatSuitModel extends BipedModel<PlayerEntity> {
    private final ModelRenderer RightLeg2;
    private final ModelRenderer RightFeet;
    private final ModelRenderer LeftLeg2;
    private final ModelRenderer LeftFeet;
    private final ModelRenderer Body2;
    private final ModelRenderer RightArm2;
    private final ModelRenderer LeftArm2;
    private final ModelRenderer Head;

    public HazmatSuitModel() {
        super(0,0,0,0);
        texWidth = 256;
        texHeight = 256;

        RightLeg2 = new ModelRenderer(this);
        RightLeg2.setPos(0.0F, 0.0F, 0.0F);
        RightLeg2.texOffs(220, 235).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        RightFeet = new ModelRenderer(this);
        RightFeet.setPos(0.0F, 0.0F, 0.0F);
        RightFeet.texOffs(236, 221).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.4F, false);

        LeftLeg2 = new ModelRenderer(this);
        LeftLeg2.setPos(0.0F, 0.0F, 0.0F);
        LeftLeg2.texOffs(204, 235).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.3F, false);

        LeftFeet = new ModelRenderer(this);
        LeftFeet.setPos(0.0F, 0.0F, 0.0F);
        LeftFeet.texOffs(216, 207).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.4F, false);

        Body2 = new ModelRenderer(this);
        Body2.setPos(0.0F, 0.0F, 0.0F);
        Body2.texOffs(216, 191).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);
        Body2.texOffs(184, 223).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.4F, false);
        Body2.texOffs(212, 219).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.6F, false);
        Body2.texOffs(244, 204).addBox(-6.0F, 10.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
        Body2.texOffs(196, 249).addBox(4.0F, 10.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
        Body2.texOffs(236, 230).addBox(-1.5F, 0.0F, 2.75F, 3.0F, 9.0F, 3.0F, 0.4F, false);
        Body2.texOffs(184, 195).addBox(-0.5F, 9.0F, 3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Body2.texOffs(184, 191).addBox(-0.5F, 10.0F, 3.25F, 1.0F, 2.0F, 2.0F, 0.1F, false);
        Body2.texOffs(240, 191).addBox(-4.0F, 12.8F, -2.0F, 4.0F, 3.0F, 4.0F, 0.4F, false);

        RightArm2 = new ModelRenderer(this);
        RightArm2.setPos(0.0F, 0.0F, 0.0F);
        RightArm2.texOffs(232, 207).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.425F, false);
        RightArm2.texOffs(240, 198).addBox(-3.0F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, false);

        LeftArm2 = new ModelRenderer(this);
        LeftArm2.setPos(0.0F, 0.0F, 0.0F);
        LeftArm2.texOffs(184, 239).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.325F, false);
        LeftArm2.texOffs(232, 249).addBox(-1.0F, 8.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.2F, false);
        LeftArm2.texOffs(236, 242).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.4F, false);

        Head = new ModelRenderer(this);
        Head.setPos(0.0F, 0.0F, 0.0F);
        Head.texOffs(184, 207).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.7F, false);
        Head.texOffs(184, 191).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.55F, false);

        head.addChild(Head);
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


        Head.visible = false;
        Body2.visible = false;
        RightArm2.visible = false;
        LeftArm2.visible = false;
        RightLeg2.visible = false;
        LeftLeg2.visible = false;
        RightFeet.visible = false;
        LeftFeet.visible = false;
        switch (equipmentSlotType) {
            case HEAD:
                Head.visible = true;
                break;
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
