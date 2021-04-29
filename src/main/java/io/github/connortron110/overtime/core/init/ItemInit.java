package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> ICON_SAFE = ITEMS.register("icon_safe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_EUCLID = ITEMS.register("icon_euclid", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_KETER = ITEMS.register("icon_keter", () -> new Item(new Item.Properties()));
}
