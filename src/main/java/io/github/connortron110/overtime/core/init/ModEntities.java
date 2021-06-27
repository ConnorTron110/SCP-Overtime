package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.common.entities.projectile.AcidSpitEntity;
import io.github.connortron110.overtime.common.entities.scp.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unchecked")
@Mod.EventBusSubscriber(modid = Overtime.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Overtime.MOD_ID);

    public static final RegistryObject<EntityType<AcidSpitEntity>> ACID_SPIT = register("acid_spit", AcidSpitEntity::new, EntityClassification.MISC, .25F, .25F);

    public static final RegistryObject<EntityType<SCP035TendrilEntity>> SCP035_TENDRIL = register("scp035_tendril", SCP035TendrilEntity::new, EntityClassification.MONSTER, 1F, 3F);
    public static final RegistryObject<EntityType<SCP066_2Entity>> SCP066 = register("scp066", SCP066_2Entity::new, EntityClassification.MONSTER, .6F, .6F);
    public static final RegistryObject<EntityType<SCP066CatEntity>> SCP066_CAT = register("scp066_cat", SCP066CatEntity::new, EntityClassification.CREATURE, 1F, 1F);
    public static final RegistryObject<EntityType<SCP427_1Entity>> SCP427 = register("scp427", SCP427_1Entity::new, EntityClassification.MONSTER, 1.5F, 2.5F);
    public static final RegistryObject<EntityType<SCP650Entity>> SCP650 = register("scp650", SCP650Entity::new, EntityClassification.CREATURE, 0.5F, 1.75F);
    public static final RegistryObject<EntityType<SCP745Entity>> SCP745 = register("scp745", SCP745Entity::new, EntityClassification.MONSTER, 1.5F, 1.8F);
    public static final RegistryObject<EntityType<SCP835_JPEntity>> SCP835_JP = register("scp835_jp", SCP835_JPEntity::new, EntityClassification.MONSTER, .7F, 2F);
    public static final RegistryObject<EntityType<SCP1762Entity>> SCP1762 = register("scp1762", SCP1762Entity::new, EntityClassification.CREATURE, .5F, .5F);
    public static final RegistryObject<EntityType<SCP1529Entity>> SCP1529 = register("scp1529", SCP1529Entity::new, EntityClassification.MONSTER, .7F, 2F);
    public static final RegistryObject<EntityType<SCP2761Entity>> SCP2761 = register("scp2761", SCP2761Entity::new, EntityClassification.MONSTER, 2F, 5.5F);
    public static final RegistryObject<EntityType<SCP3199Entity>> SCP3199 = register("scp3199", SCP3199Entity::new, EntityClassification.CREATURE, 1F, 2.5F);
    public static final RegistryObject<EntityType<SCP3199EggEntity>> SCP3199_EGG = register("scp3199_egg", SCP3199EggEntity::new, EntityClassification.CREATURE, .5F, .5F);
    public static final RegistryObject<EntityType<SCP3456Entity>> SCP3456 = register("scp3456", SCP3456Entity::new, EntityClassification.MONSTER, 2.5F, 5F);
    public static final RegistryObject<EntityType<SCP5167Entity>> SCP5167 = register("scp5167", SCP5167Entity::new, EntityClassification.MONSTER, .6F, 1F);

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(SCP035_TENDRIL.get(), createBaseAttributes(20, 0, 4,2).add(Attributes.KNOCKBACK_RESISTANCE, 1000).build());
        event.put(SCP066.get(), createBaseAttributes(66, .2, 1,2).build());
        event.put(SCP066_CAT.get(), createBaseAttributes(66, .2, 0,0).build());
        event.put(SCP427.get(), createBaseAttributes(800, .4, 6,10).build());
        event.put(SCP650.get(), createBaseAttributes(60, .5, 0, 0).build());
        event.put(SCP745.get(), createBaseAttributes(45, .5, 5, 1).add(Attributes.KNOCKBACK_RESISTANCE, .1).build());
        event.put(SCP835_JP.get(), createBaseAttributes(80, .4, 8, 1).build());
        event.put(SCP1529.get(), createBaseAttributes(300, .2, 1, 1).add(Attributes.KNOCKBACK_RESISTANCE, 1000).build());
        event.put(SCP1762.get(), createBaseAttributes(2, .3, 3,2).add(Attributes.FLYING_SPEED, .3).build());
        event.put(SCP2761.get(), createBaseAttributes(850, .4, 8, 10).add(Attributes.KNOCKBACK_RESISTANCE, 1000).build());
        event.put(SCP3199.get(), createBaseAttributes(450, .4, 5, 1).build());
        event.put(SCP3199_EGG.get(), createBaseAttributes(1000, 0, 0, 0).build());
        event.put(SCP3456.get(), createBaseAttributes(750, .3, 9, 2).build());
        event.put(SCP5167.get(), createBaseAttributes(50, .4, 3, 1).build());
    }

    private static AttributeModifierMap.MutableAttribute createBaseAttributes(double health, double moveSpeed, double attackDamage, double attackKnockback) {
        return MobEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, health)
                .add(Attributes.FOLLOW_RANGE, 32)
                .add(Attributes.MOVEMENT_SPEED, moveSpeed)
                .add(Attributes.ATTACK_DAMAGE, attackDamage)
                .add(Attributes.ATTACK_KNOCKBACK, attackKnockback);
    }

    @SuppressWarnings("rawtypes")
    private static RegistryObject register(String name, EntityType.IFactory factory, EntityClassification classification, float width, float height) {
        return ENTITY_TYPES.register(name, () -> EntityType.Builder.of(factory, classification)
                .sized(width, height)
                .build(new ResourceLocation(Overtime.MOD_ID, name).toString()));
    }
}
