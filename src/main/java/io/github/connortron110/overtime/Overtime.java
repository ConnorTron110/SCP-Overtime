package io.github.connortron110.overtime;

import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModEntities;
import io.github.connortron110.overtime.core.init.ModItems;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Overtime.MOD_ID)
public class Overtime {

    public static final String MOD_ID = "overtime";
    public static final Logger LOGGER = LogManager.getLogger("Overtime");

    //Item Groups
    public static final ItemGroup TAB_ITEMS = new ItemGroup(ItemGroup.TABS.length, "overtimeitems") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON_EUCLID.get());
        }
    };
    public static final ItemGroup TAB_BLOCKS = new ItemGroup(ItemGroup.TABS.length, "overtimeblocks") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON_SAFE.get());
        }
    };
    public static final ItemGroup TAB_MOBS = new ItemGroup(ItemGroup.TABS.length, "overtimemobs") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON_KETER.get());
        }
    };
    public static final ItemGroup TAB_MISC = new ItemGroup(ItemGroup.TABS.length, "overtimemisc") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ICON_SAFE.get());
        }
    };

    public Overtime() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModEntities.ENTITY_TYPES.register(bus);
        ModSounds.SOUNDS.register(bus);

        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
