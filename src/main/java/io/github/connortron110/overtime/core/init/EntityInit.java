package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Reference;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);

}
