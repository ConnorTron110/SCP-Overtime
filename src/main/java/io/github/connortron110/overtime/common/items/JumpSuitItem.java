package io.github.connortron110.overtime.common.items;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.model.JumpSuitModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class JumpSuitItem extends ArmorItem {

    private final String color;

    public JumpSuitItem(IArmorMaterial material, EquipmentSlotType equipmentSlotType, Properties properties, @Nullable String type) {
        super(material, equipmentSlotType, properties);
        color = type != null ? "_"+type : "";
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) new JumpSuitModel().applyData(_default, armorSlot);
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(Reference.MOD_ID, "textures/models/jumpsuit"+color+".png").toString();
    }
}