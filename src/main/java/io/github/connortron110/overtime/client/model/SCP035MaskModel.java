package io.github.connortron110.overtime.client.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.player.PlayerEntity;

public class SCP035MaskModel {
    public static class BaseMask extends BipedModel<PlayerEntity> {
        private final ModelRenderer Head;
        private final ModelRenderer Mask;
        private final ModelRenderer Under_r1;
        private final ModelRenderer bone;
        private final ModelRenderer bone2;

        public BaseMask() {
            super(0,0,0,0);
            texWidth = 1028;
            texHeight = 1028;

            Head = new ModelRenderer(this);
            head.addChild(Head);
            Head.setPos(0.0F, 0.0F, 0.0F);
            Head.texOffs(0, 19).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.35F, false);
            Head.texOffs(3, 11).addBox(-2.0F, -5.0F, -4.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
            Head.texOffs(9, 7).addBox(1.0F, -5.0F, -4.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);

            Mask = new ModelRenderer(this);
            Mask.setPos(0.0F, 0.5F, 0.0F);
            Head.addChild(Mask);
            Mask.texOffs(0, 11).addBox(3.0F, -7.5F, -5.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 6).addBox(-1.0F, -6.5F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(4, 16).addBox(-3.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 15).addBox(2.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 3).addBox(-3.0F, -7.5F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(9, 10).addBox(-4.0F, -7.5F, -5.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 5).addBox(-3.0F, -4.5F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 4).addBox(-1.0F, -5.5F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 9).addBox(-2.0F, -0.5F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 10).addBox(-5.0F, -4.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            Mask.texOffs(4, 11).addBox(4.0F, -4.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 45).addBox(-4.0F, -7.5F, -5.05F, 8.0F, 8.0F, 0.0F, 0.0F, false);

            Under_r1 = new ModelRenderer(this);
            Under_r1.setPos(0.0F, -7.5F, -5.0F);
            Mask.addChild(Under_r1);
            setRotationAngle(Under_r1, -0.1309F, 0.0F, 0.0F);
            Under_r1.texOffs(0, 0).addBox(-4.5F, -2.0F, 0.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);

            bone = new ModelRenderer(this);
            bone.setPos(0.0F, 0.0F, 0.0F);
            Mask.addChild(bone);
            bone.texOffs(4, 14).addBox(1.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(13, 13).addBox(-2.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(0, 7).addBox(-2.0F, -3.5F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(16, 16).addBox(2.0F, -1.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(17, 10).addBox(-3.0F, -1.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            bone2 = new ModelRenderer(this);
            bone2.setPos(0.0F, 0.0F, -2.0F);
            Mask.addChild(bone2);
            bone2.texOffs(9, 8).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            bone2.texOffs(16, 14).addBox(2.0F, -3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone2.texOffs(16, 12).addBox(-3.0F, -3.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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

            Head.visible = true;
            return this;
        }
    }


    //FIXME Body not rendering on player
    public static class Angry extends BipedModel<PlayerEntity> {
        private final ModelRenderer Head;
        private final ModelRenderer Mask;
        private final ModelRenderer Under_r1;
        private final ModelRenderer bone;
        private final ModelRenderer bone2;
        private final ModelRenderer Body;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;

        public Angry() {
            super(0,0,0,0);
            texWidth = 1028;
            texHeight = 1028;

            Head = new ModelRenderer(this);
            Head.setPos(0.0F, 0.0F, 0.0F);
            Head.texOffs(0, 19).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.35F, false);
            Head.texOffs(3, 11).addBox(-2.0F, -5.0F, -4.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
            Head.texOffs(9, 7).addBox(1.0F, -5.0F, -4.75F, 1.0F, 1.0F, 0.0F, 0.0F, false);
            head.addChild(Head);

            Mask = new ModelRenderer(this);
            Mask.setPos(0.0F, 0.5F, 0.0F);
            Head.addChild(Mask);
            Mask.texOffs(0, 11).addBox(3.0F, -7.5F, -5.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 6).addBox(-1.0F, -6.5F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(4, 16).addBox(-3.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 15).addBox(2.0F, -6.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 3).addBox(-3.0F, -7.5F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(9, 10).addBox(-4.0F, -7.5F, -5.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 5).addBox(-3.0F, -4.5F, -5.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 4).addBox(-1.0F, -5.5F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 9).addBox(-2.0F, -0.5F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            Mask.texOffs(13, 10).addBox(-5.0F, -4.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            Mask.texOffs(4, 11).addBox(4.0F, -4.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
            Mask.texOffs(0, 45).addBox(-4.0F, -7.5F, -5.05F, 8.0F, 8.0F, 0.0F, 0.0F, false);

            Under_r1 = new ModelRenderer(this);
            Under_r1.setPos(0.0F, -7.5F, -5.0F);
            Mask.addChild(Under_r1);
            setRotationAngle(Under_r1, -0.1309F, 0.0F, 0.0F);
            Under_r1.texOffs(0, 0).addBox(-4.5F, -2.0F, 0.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);

            bone = new ModelRenderer(this);
            bone.setPos(0.0F, 0.0F, 0.0F);
            Mask.addChild(bone);
            bone.texOffs(4, 14).addBox(1.0F, -6.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(13, 13).addBox(-2.0F, -6.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(0, 7).addBox(-2.0F, -3.5F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(16, 16).addBox(2.0F, -0.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone.texOffs(17, 10).addBox(-3.0F, -0.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            bone2 = new ModelRenderer(this);
            bone2.setPos(0.0F, 0.0F, -2.0F);
            Mask.addChild(bone2);
            bone2.texOffs(9, 8).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            bone2.texOffs(16, 14).addBox(2.0F, -3.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
            bone2.texOffs(16, 12).addBox(-3.0F, -3.5F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

            Body = new ModelRenderer(this);
            Body.setPos(0.0F, 0.0F, 0.0F);
            Body.texOffs(26, 0).addBox(-4.0F, -0.75F, -2.0F, 8.0F, 5.0F, 4.0F, 0.35F, false);
            body.addChild(Body);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setPos(3.0F, 1.25F, -2.25F);
            Body.addChild(cube_r1);
            setRotationAngle(cube_r1, 0.2182F, 3.1416F, 0.3491F);
            cube_r1.texOffs(26, 0).addBox(0.0F, -15.0F, -9.0F, 0.0F, 18.0F, 24.0F, 0.0F, true);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setPos(-3.0F, 1.25F, -2.25F);
            Body.addChild(cube_r2);
            setRotationAngle(cube_r2, 0.2182F, 3.1416F, -0.3491F);
            cube_r2.texOffs(26, 18).addBox(0.0F, -15.0F, -9.0F, 0.0F, 18.0F, 24.0F, 0.0F, true);
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

            Head.visible = true;
            Body.visible = true;
            return this;
        }
    }
}
