package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.common.items.ItemSCP714;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> ICON_SAFE = ITEMS.register("icon_safe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_EUCLID = ITEMS.register("icon_euclid", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_KETER = ITEMS.register("icon_keter", () -> new Item(new Item.Properties()));

    public static final RegistryObject<ItemSCP714> SCP714 = ITEMS.register("scp714", () -> new ItemSCP714(new Item.Properties().stacksTo(1).tab(Overtime.TAB_ITEMS)));
    public static final RegistryObject<Item> CUPCAKE = ITEMS.register("cupcake", () -> new Item(new Item.Properties().tab(Overtime.TAB_ITEMS).stacksTo(16).rarity(Rarity.COMMON).food(new Food.Builder().nutrition(4).saturationMod(0.3F).build())));
    public static final RegistryObject<SwordItem> MOB_DESPAWNER = ITEMS.register("mob_despawner", () -> new SwordItem(ItemTier.NETHERITE, 69420, 42069, new Item.Properties().tab(Overtime.TAB_ITEMS).fireResistant()));
}
