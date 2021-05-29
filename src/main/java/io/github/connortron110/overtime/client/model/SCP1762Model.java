package io.github.connortron110.overtime.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import io.github.connortron110.overtime.common.entities.scp.SCP1762Entity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class SCP1762Model<T extends SCP1762Entity> extends EntityModel<T> {
    private final ModelRenderer All;
    private final ModelRenderer RightWing;
    private final ModelRenderer LeftWing;

    public SCP1762Model() {
        this.texWidth = 32;
        this.texHeight = 32;
        this.All = new ModelRenderer(this);
        this.All.setPos(0.0F, 22.0F, 0.0F);
        this.All.texOffs(0, 6).addBox(0.0F, -3.0F, -3.0F, 0.0F, 5.0F, 6.0F, 0.0F, false);
        this.RightWing = new ModelRenderer(this);
        this.RightWing.setPos(0.0F, 0.0F, 0.0F);
        this.All.addChild(this.RightWing);
        this.RightWing.texOffs(0, 0).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 6.0F, 0.0F, false);
        this.LeftWing = new ModelRenderer(this);
        this.LeftWing.setPos(0.0F, 0.0F, 0.0F);
        this.All.addChild(this.LeftWing);
        this.LeftWing.texOffs(0, 6).addBox(0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 6.0F, 0.0F, false);
    }

    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.All.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setupAnim(SCP1762Entity e, float f, float f1, float f2, float f3, float f4) {
        this.All.xRot = MathHelper.cos(f * 0.6662F + 3.1415927F) * f1;
        this.LeftWing.zRot = MathHelper.cos(f * 0.6662F) * f1;
        this.RightWing.zRot = MathHelper.cos(f * 0.6662F + 3.1415927F) * f1;
    }
}
