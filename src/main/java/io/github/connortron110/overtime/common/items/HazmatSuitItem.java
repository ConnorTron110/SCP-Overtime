package io.github.connortron110.overtime.common.items;

import com.mojang.blaze3d.systems.RenderSystem;
import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.HazmatSuitModel;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.WorldWorkerManager;

import javax.annotation.Nullable;

public class HazmatSuitItem extends ArmorItem {

    private final String color;
    private boolean shouldBreath = false;

    public HazmatSuitItem(IArmorMaterial material, EquipmentSlotType equipmentSlotType, Properties properties, @Nullable String type) {
        super(material, equipmentSlotType, properties);
        color = type != null ? "_"+type : "";
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        //Possible faster breathing if running to make more dynamic?
        if (world.isClientSide) {
            if (!shouldBreath) {
                shouldBreath = true;
                player.playSound(ModSounds.MASK_BREATHING.get(), 0.5F, 1);
                WorldWorkerManager.addWorker(new WorldWorkerManager.IWorker() {
                    int ticks = 0;

                    @Override
                    public boolean hasWork() {
                        return ticks <= 100;
                    }

                    @Override
                    public boolean doWork() {
                        if (ticks == 100) shouldBreath = false;
                        ticks++;
                        return false;
                    }
                });
            }
        }
    }

    @Override
    public void renderHelmetOverlay(ItemStack stack, PlayerEntity player, int width, int height, float partialTicks) {
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.defaultBlendFunc();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.disableAlphaTest();
        Minecraft.getInstance().getTextureManager().bind(new ResourceLocation(Reference.MOD_ID, "textures/misc/hazmatblur.png"));
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuilder();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.vertex(0.0D, height, -90.0D).uv(0.0F, 1.0F).endVertex();
        bufferbuilder.vertex(width, height, -90.0D).uv(1.0F, 1.0F).endVertex();
        bufferbuilder.vertex(width, 0.0D, -90.0D).uv(1.0F, 0.0F).endVertex();
        bufferbuilder.vertex(0.0D, 0.0D, -90.0D).uv(0.0F, 0.0F).endVertex();
        tessellator.end();
        RenderSystem.depthMask(true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableAlphaTest();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) new HazmatSuitModel().applyData(_default, armorSlot);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(Reference.MOD_ID, "textures/models/hazmat_suit"+color+".png").toString();
    }
}
