package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP5167Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP5167Model<T extends SCP5167Entity> extends EntityModel<T> {
    private final ModelRenderer All;
    private final ModelRenderer RightFeet;
    private final ModelRenderer Head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer LeftFeet;

    public SCP5167Model() {
        this.texWidth = 64;
        this.texHeight = 64;
        this.All = new ModelRenderer(this);
        this.All.setPos(0.0F, 14.0F, -0.25F);
        this.All.texOffs(28, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 6.0F, 0.0F, false);
        this.All.texOffs(28, 12).addBox(-4.0F, -0.775F, -3.0F, 8.0F, 1.0F, 6.0F, -0.2F, false);
        this.All.texOffs(0, 19).addBox(-3.5F, -5.0F, 3.0F, 7.0F, 10.0F, 2.0F, 0.0F, false);
        this.RightFeet = new ModelRenderer(this);
        this.RightFeet.setPos(-2.0F, 5.0F, 0.0F);
        this.All.addChild(this.RightFeet);
        this.RightFeet.texOffs(34, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        this.Head = new ModelRenderer(this);
        this.Head.setPos(0.0F, 0.0F, 3.0F);
        this.All.addChild(this.Head);
        this.Head.texOffs(0, 0).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 6.0F, 6.0F, 0.0F, false);
        this.Head.texOffs(12, 31).addBox(-3.0F, -4.5F, -6.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
        this.Head.texOffs(13, 38).addBox(-3.5F, -5.0F, -6.25F, 7.0F, 5.0F, 1.0F, -0.05F, false);
        this.Head.texOffs(0, 12).addBox(-4.0F, -0.175F, -6.0F, 8.0F, 1.0F, 6.0F, -0.1F, false);
        this.Head.texOffs(6, 38).addBox(3.25F, -4.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        this.Head.texOffs(0, 38).addBox(-4.25F, -4.0F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        this.Head.texOffs(0, 42).addBox(-1.5F, -0.5F, -4.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        this.cube_r1 = new ModelRenderer(this);
        this.cube_r1.setPos(0.5F, 1.0F, -0.75F);
        this.Head.addChild(this.cube_r1);
        setRotationAngle(this.cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.texOffs(0, 31).addBox(-0.5F, -1.0F, -5.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
        this.LeftFeet = new ModelRenderer(this);
        this.LeftFeet.setPos(2.0F, 5.0F, 0.0F);
        this.All.addChild(this.LeftFeet);
        this.LeftFeet.texOffs(18, 19).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
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
    public void setupAnim(SCP5167Entity entity, float f, float f1, float f2, float f3, float f4) {
        this.LeftFeet.xRot = MathHelper.cos(f) * -1.0F * f1;
        this.RightFeet.xRot = MathHelper.cos(f) * 1.0F * f1;
        if (entity.isImposter()) {
            this.Head.xRot = MathHelper.cos(f) * 1.0F * f1;
        } else {
            this.Head.xRot = 0;
        }
    }
}
