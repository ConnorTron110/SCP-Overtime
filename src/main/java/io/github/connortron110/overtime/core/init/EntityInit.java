package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.common.entities.scp.SCP035TendrilEntity;
import io.github.connortron110.overtime.common.entities.scp.SCP066CatEntity;
import io.github.connortron110.overtime.common.entities.scp.SCP066_2Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MOD_ID);

    public static final RegistryObject<EntityType<SCP035TendrilEntity>> SCP035_TENDRIL = ENTITY_TYPES.register("scp035_tendril",
            () -> EntityType.Builder.of(SCP035TendrilEntity::new, EntityClassification.MONSTER)
                    .sized(1, 3)
                    .build(new ResourceLocation(Reference.MOD_ID, "scp035_tendril").toString()));
    public static final RegistryObject<EntityType<SCP066_2Entity>> ERICS_TOY = ENTITY_TYPES.register("scp066",
            () -> EntityType.Builder.of(SCP066_2Entity::new, EntityClassification.MONSTER)
                    .sized(.6F, .6F)
                    .build(new ResourceLocation(Reference.MOD_ID, "scp066").toString()));

    public static final RegistryObject<EntityType<SCP066CatEntity>> SCP066_CAT = ENTITY_TYPES.register("scp066_cat",
            () -> EntityType.Builder.of(SCP066CatEntity::new, EntityClassification.CREATURE)
                    .sized(1,1)
                    .build(new ResourceLocation(Reference.MOD_ID, "scp066_cat").toString()));
}
