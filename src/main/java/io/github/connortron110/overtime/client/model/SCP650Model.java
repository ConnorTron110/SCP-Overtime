package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP650Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

//TODO Combine all into one class and change rotation based on presets
public class SCP650Model {
    public static class A<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer cube_r1;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer LeftArm;
        private final ModelRenderer cube_r2;
        private final ModelRenderer RightArm;
        private final ModelRenderer cube_r3;
        private final ModelRenderer RightLeg;
        private final ModelRenderer cube_r4;

        public A() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 25.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, 0.0F);
            this.All.addChild(this.LeftLeg);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
            this.LeftLeg.addChild(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.3927F, 0.0F, -0.0873F);
            this.cube_r1.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            setRotationAngle(this.LowerBody, 0.3927F, 0.0F, 0.0F);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, -0.0436F, 0.1745F, 0.0F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            setRotationAngle(this.Head, 0.0F, -0.2618F, 0.0F);
            this.Head.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            this.cube_r2 = new ModelRenderer(this);
            this.cube_r2.setPos(0.0F, 0.0F, 0.0F);
            this.LeftArm.addChild(this.cube_r2);
            setRotationAngle(this.cube_r2, -2.1817F, 0.0F, 0.48F);
            this.cube_r2.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            this.cube_r3 = new ModelRenderer(this);
            this.cube_r3.setPos(0.0F, 0.0F, 0.0F);
            this.RightArm.addChild(this.cube_r3);
            setRotationAngle(this.cube_r3, -2.138F, 0.0F, 0.0F);
            this.cube_r3.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, 0.0F);
            this.All.addChild(this.RightLeg);
            this.cube_r4 = new ModelRenderer(this);
            this.cube_r4.setPos(0.0F, 0.0F, 0.0F);
            this.RightLeg.addChild(this.cube_r4);
            setRotationAngle(this.cube_r4, 0.3927F, 0.2182F, 0.0F);
            this.cube_r4.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class B<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r1;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public B() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 24.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, 0.0F);
            this.All.addChild(this.LeftLeg);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, 0.2182F, 0.0F, 0.0F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.cube_r1);
            setRotationAngle(this.cube_r1, 0.0F, 0.3491F, 0.0F);
            this.cube_r1.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, -2.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, -2.5744F, 0.0F, -0.6981F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, -1.7017F, -0.3491F, 0.3491F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, 0.0F);
            this.All.addChild(this.RightLeg);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class C<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r1;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public C() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 33.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, -5.0F);
            this.All.addChild(this.LeftLeg);
            setRotationAngle(this.LeftLeg, 1.4399F, 0.0F, 0.0F);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            setRotationAngle(this.LowerBody, 0.9599F, 0.0F, 0.0F);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, -0.4363F, 0.0F, 0.0F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            setRotationAngle(this.Neck, -0.1309F, 0.0F, 0.0F);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            setRotationAngle(this.Head, -0.2618F, 0.0F, 0.0F);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.2618F, 0.0F, 0.4363F);
            this.cube_r1.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, -2.7489F, 0.0F, 0.3927F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, -2.7489F, 0.0F, 0.0F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, -3.75F);
            this.All.addChild(this.RightLeg);
            setRotationAngle(this.RightLeg, 1.4399F, 0.2618F, 0.3054F);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class D<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r1;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public D() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 24.5F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, 0.0F);
            this.All.addChild(this.LeftLeg);
            setRotationAngle(this.LeftLeg, -0.0873F, -0.2618F, 0.0F);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, 0.2618F, 0.1745F, -0.1745F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            setRotationAngle(this.Head, 0.2618F, -0.3927F, 0.0F);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.4363F, 0.0F, 0.0F);
            this.cube_r1.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, -0.6109F, 0.0F, -0.3054F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, -0.829F, 0.0436F, 0.0F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, 0.0F);
            this.All.addChild(this.RightLeg);
            setRotationAngle(this.RightLeg, -0.0873F, 0.2182F, 0.0F);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class E<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer cube_r1;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public E() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 24.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, 0.0F);
            this.All.addChild(this.LeftLeg);
            setRotationAngle(this.LeftLeg, -0.0873F, -0.2618F, 0.0F);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            setRotationAngle(this.LowerBody, 0.1309F, 0.0F, 0.0F);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, 0.3491F, 0.1745F, -0.1745F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.cube_r1 = new ModelRenderer(this);
            this.cube_r1.setPos(0.0F, 0.0F, 0.0F);
            this.Head.addChild(this.cube_r1);
            setRotationAngle(this.cube_r1, -0.4363F, 0.0F, 0.0F);
            this.cube_r1.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -3.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, -1.7453F, 0.6981F, -0.1309F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, -2.0071F, -0.5236F, 0.0F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, 0.0F);
            this.All.addChild(this.RightLeg);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class F<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public F() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 34.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, -5.0F);
            this.All.addChild(this.LeftLeg);
            setRotationAngle(this.LeftLeg, 1.5708F, 0.3927F, 0.0F);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            setRotationAngle(this.LowerBody, -0.3927F, 0.0F, 0.0F);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            setRotationAngle(this.UpperBody, -0.3927F, 0.0F, 0.0F);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            setRotationAngle(this.Head, -0.3927F, 0.0F, 0.0F);
            this.Head.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, 0.7854F, 0.0F, -1.1781F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, 0.7854F, 0.0F, 1.1781F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, -5.0F);
            this.All.addChild(this.RightLeg);
            setRotationAngle(this.RightLeg, 1.5708F, -0.3927F, 0.0F);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }

    public static class G<T extends SCP650Entity> extends EntityModel<T> {
        private final ModelRenderer All;
        private final ModelRenderer LeftLeg;
        private final ModelRenderer Hip;
        private final ModelRenderer LowerBody;
        private final ModelRenderer UpperBody;
        private final ModelRenderer Neck;
        private final ModelRenderer Head;
        private final ModelRenderer LeftArm;
        private final ModelRenderer RightArm;
        private final ModelRenderer RightLeg;

        public G() {
            this.texHeight = 64;
            this.texWidth = 64;
            this.All = new ModelRenderer(this);
            this.All.setPos(0.0F, 24.0F, 0.0F);
            this.LeftLeg = new ModelRenderer(this);
            this.LeftLeg.setPos(2.0F, -11.0F, 0.0F);
            this.All.addChild(this.LeftLeg);
            this.LeftLeg.texOffs(0, 21).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.Hip = new ModelRenderer(this);
            this.Hip.setPos(0.0F, -11.0F, 0.0F);
            this.All.addChild(this.Hip);
            this.Hip.texOffs(18, 0).addBox(-3.0F, -2.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
            this.LowerBody = new ModelRenderer(this);
            this.LowerBody.setPos(0.0F, -2.0F, 0.0F);
            this.Hip.addChild(this.LowerBody);
            this.LowerBody.texOffs(24, 5).addBox(-2.5F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
            this.UpperBody = new ModelRenderer(this);
            this.UpperBody.setPos(0.0F, -3.0F, 0.0F);
            this.LowerBody.addChild(this.UpperBody);
            this.UpperBody.texOffs(0, 12).addBox(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F, 0.0F, false);
            this.Neck = new ModelRenderer(this);
            this.Neck.setPos(0.0F, -6.0F, 0.0F);
            this.UpperBody.addChild(this.Neck);
            this.Neck.texOffs(16, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
            this.Head = new ModelRenderer(this);
            this.Head.setPos(0.0F, -1.0F, 0.0F);
            this.Neck.addChild(this.Head);
            this.Head.texOffs(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
            this.LeftArm = new ModelRenderer(this);
            this.LeftArm.setPos(4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.LeftArm);
            setRotationAngle(this.LeftArm, -0.3927F, 0.0F, 0.48F);
            this.LeftArm.texOffs(8, 21).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightArm = new ModelRenderer(this);
            this.RightArm.setPos(-4.0F, -5.0F, 0.0F);
            this.UpperBody.addChild(this.RightArm);
            setRotationAngle(this.RightArm, -0.3927F, 0.0F, -0.5236F);
            this.RightArm.texOffs(18, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            this.RightLeg = new ModelRenderer(this);
            this.RightLeg.setPos(-2.0F, -11.0F, 0.0F);
            this.All.addChild(this.RightLeg);
            this.RightLeg.texOffs(24, 23).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            this.All.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.xRot = x;
            modelRenderer.yRot = y;
            modelRenderer.zRot = z;
        }

        @Override
        public void setupAnim(SCP650Entity e, float f, float f1, float f2, float f3, float f4) {}
    }
}
