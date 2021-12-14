package io.github.connortron110.overtime.core.registration;

import io.github.connortron110.overtime.Overtime;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Overtime.MOD_ID);

    public static RegistryObject<Item> register(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    /*
    public static RegistryObject<Item> registerBasicItem(String name) {
        return register(name, () -> new Item(new Item.Properties().tab(Overtime.TAB_ITEMS)));
    }
     */
}
