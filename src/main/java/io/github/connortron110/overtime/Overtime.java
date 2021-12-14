package io.github.connortron110.overtime;

import io.github.connortron110.overtime.core.registration.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Overtime.MOD_ID)
public class Overtime {

    public static final String MOD_ID = "overtime";

    //public static final CreativeModeTab TAB_ITEMS = new CreativeModeTab("overtimeitems") {@Override public ItemStack makeIcon() { return null; }};
    //public static final CreativeModeTab TAB_BLOCKS = new CreativeModeTab("overtimeblocks") {@Override public ItemStack makeIcon() { return null; }};
    //public static final CreativeModeTab TAB_MOBS = new CreativeModeTab("overtimemobs") {@Override public ItemStack makeIcon() { return null; }};
    //public static final CreativeModeTab TAB_MISC = new CreativeModeTab("overtimemisc") {@Override public ItemStack makeIcon() { return null; }};

    public Overtime() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
    }
}
