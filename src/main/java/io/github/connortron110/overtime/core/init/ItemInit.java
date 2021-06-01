package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.common.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.*;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> ICON_SAFE = ITEMS.register("icon_safe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_EUCLID = ITEMS.register("icon_euclid", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_KETER = ITEMS.register("icon_keter", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUPCAKE = ITEMS.register("cupcake", () -> new Item(new Item.Properties().tab(Overtime.TAB_ITEMS).stacksTo(16).rarity(Rarity.COMMON).food(new Food.Builder().nutrition(4).saturationMod(0.3F).build())));
    public static final RegistryObject<SwordItem> MOB_DESPAWNER = ITEMS.register("mob_despawner", () -> new SwordItem(ItemTier.NETHERITE, 69420, 42069, new Item.Properties().tab(Overtime.TAB_ITEMS).fireResistant()));
    public static final RegistryObject<ArmorItem> HAZMAT_HELMET = ITEMS.register("hazmat_helmet", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> HAZMAT_CHEST = ITEMS.register("hazmat_chest", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> HAZMAT_LEGGINGS = ITEMS.register("hazmat_leggings", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> HAZMAT_BOOTS = ITEMS.register("hazmat_boots", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.FEET, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> HAZMAT_LEGGINGS_YELLOW = ITEMS.register("hazmat_yellow_leggings", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), "yellow"));
    public static final RegistryObject<ArmorItem> HAZMAT_CHEST_YELLOW = ITEMS.register("hazmat_yellow_chest", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), "yellow"));
    public static final RegistryObject<ArmorItem> HAZMAT_HELMET_YELLOW = ITEMS.register("hazmat_yellow_helmet", () -> new HazmatSuitItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(Overtime.TAB_ITEMS), "yellow"));
    public static final RegistryObject<ArmorItem> JUMPSUIT_CHEST = ITEMS.register("jumpsuit_chest", () -> new JumpSuitItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> JUMPSUIT_LEGGINGS = ITEMS.register("jumpsuit_leggings", () -> new JumpSuitItem(ArmorMaterial.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> JUMPSUIT_BOOTS = ITEMS.register("jumpsuit_boots", () -> new JumpSuitItem(ArmorMaterial.LEATHER, EquipmentSlotType.FEET, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> JUMPSUIT_LEGGINGS_ORANGE = ITEMS.register("jumpsuit_orange_leggings", () -> new JumpSuitItem(ArmorMaterial.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), "orange"));
    public static final RegistryObject<ArmorItem> JUMPSUIT_CHEST_ORANGE = ITEMS.register("jumpsuit_orange_chest", () -> new JumpSuitItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), "orange"));
    public static final RegistryObject<ArmorItem> GASMASK = ITEMS.register("gasmask", () -> new GasMaskItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, new Item.Properties().tab(Overtime.TAB_ITEMS)));
    public static final RegistryObject<ArmorItem> LABCOAT_CHEST = ITEMS.register("labcoat_chest", () -> new LabcoatItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> LABCOAT_LEGGINGS = ITEMS.register("labcoat_leggings", () -> new LabcoatItem(ArmorMaterial.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> LABCOAT_BOOTS = ITEMS.register("labcoat_boots", () -> new LabcoatItem(ArmorMaterial.LEATHER, EquipmentSlotType.FEET, new Item.Properties().tab(Overtime.TAB_ITEMS), null));
    public static final RegistryObject<ArmorItem> LABCOAT_LEGGINGS_RED = ITEMS.register("labcoat_red_leggings", () -> new LabcoatItem(ArmorMaterial.LEATHER, EquipmentSlotType.LEGS, new Item.Properties().tab(Overtime.TAB_ITEMS), "red"));
    public static final RegistryObject<ArmorItem> LABCOAT_CHEST_RED = ITEMS.register("labcoat_red_chest", () -> new LabcoatItem(ArmorMaterial.LEATHER, EquipmentSlotType.CHEST, new Item.Properties().tab(Overtime.TAB_ITEMS), "red"));

    public static final RegistryObject<SCP035Item> SCP035 = ITEMS.register("scp035", () -> new SCP035Item(new Item.Properties().stacksTo(1).tab(Overtime.TAB_MISC)));
    public static final RegistryObject<SCP207Item> SCP207 = ITEMS.register("scp207", () -> new SCP207Item(new Item.Properties().stacksTo(1).tab(Overtime.TAB_MISC)));
    public static final RegistryObject<SCP427Item> SCP427 = ITEMS.register("scp427", () -> new SCP427Item(new Item.Properties().stacksTo(1).tab(Overtime.TAB_MISC)));
    public static final RegistryObject<SCP500ContainerItem> SCP500_CONTAINER = ITEMS.register("scp500_container", () -> new SCP500ContainerItem(new Item.Properties().stacksTo(1).tab(Overtime.TAB_MISC)));
    public static final RegistryObject<SCP500PillItem> SCP500_PILL = ITEMS.register("scp500_pill", () -> new SCP500PillItem(new Item.Properties().tab(Overtime.TAB_MISC).stacksTo(1).food((new Food.Builder()).alwaysEat().fast().build())));
    public static final RegistryObject<SCP714Item> SCP714 = ITEMS.register("scp714", () -> new SCP714Item(new Item.Properties().stacksTo(1).tab(Overtime.TAB_MISC)));

    public static final RegistryObject<SCP035SpawnerItem> SCP035_TENDRIL_SPAWNER = ITEMS.register("scp035_tendril_spawner", () -> new SCP035SpawnerItem(EntityInit.SCP035_TENDRIL));
    public static final RegistryObject<SpawnEggItem> SCP066_SPAWN_EGG = ITEMS.register("scp066_spawn_egg", () -> new ModSpawnEggItem(EntityInit.SCP066, new Color(0xC90000).getRGB(), new Color(0x650101).getRGB()));
    public static final RegistryObject<SpawnEggItem> SCP427_SPAWN_EGG = ITEMS.register("scp427_spawn_egg", () -> new ModSpawnEggItem(EntityInit.SCP427, new Color(0xE9CDCA).getRGB(), new Color(0xC69189).getRGB()));
    public static final RegistryObject<SpawnEggItem> SCP3456_SPAWN_EGG = ITEMS.register("scp3456_spawn_egg", () -> new ModSpawnEggItem(EntityInit.SCP3456, new Color(0x431A24).getRGB(), new Color(0x17080C).getRGB()));
    public static final RegistryObject<SpawnEggItem> SCP5167_SPAWN_EGG = ITEMS.register("scp5167_spawn_egg", () -> new ModSpawnEggItem(EntityInit.SCP5167, new Color(0x981B09).getRGB(), new Color(0x006D7B).getRGB()));
}
