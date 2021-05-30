package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.common.entities.scp.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unchecked")
public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);

    public static final RegistryObject<EntityType<SCP035TendrilEntity>> SCP035_TENDRIL = register("scp035_tendril", SCP035TendrilEntity::new, EntityClassification.MONSTER, 1F, 3F);
    public static final RegistryObject<EntityType<SCP066_2Entity>> ERICS_TOY = register("scp066", SCP066_2Entity::new, EntityClassification.MONSTER, .6F, .6F);
    public static final RegistryObject<EntityType<SCP066CatEntity>> SCP066_CAT = register("scp066_cat", SCP066CatEntity::new, EntityClassification.CREATURE, 1F, 1F);
    public static final RegistryObject<EntityType<SCP427_1Entity>> SCP427 = register("scp427", SCP427_1Entity::new, EntityClassification.MONSTER, 1.5F, 2.5F);
    public static final RegistryObject<EntityType<SCP1762Entity>> SCP1762 = register("scp1762", SCP1762Entity::new, EntityClassification.CREATURE, .5F, .5F);

    @SuppressWarnings("rawtypes")
    private static RegistryObject register(String name, EntityType.IFactory factory, EntityClassification classification, float width, float height) {
        return ENTITY_TYPES.register(name, () -> EntityType.Builder.of(factory, classification)
                .sized(width, height)
                .build(new ResourceLocation(Reference.MOD_ID, name).toString()));
    }
}
