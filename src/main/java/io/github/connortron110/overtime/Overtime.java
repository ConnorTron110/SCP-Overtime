package io.github.connortron110.overtime;

import io.github.connortron110.overtime.core.init.BlockInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MOD_ID)
public class Overtime {

    public static final Logger LOGGER = LogManager.getLogger("Overtime");

    //Item Groups
    public static final ItemGroup TAB_ITEMS = (new ItemGroup(ItemGroup.TABS.length, "overtimeitems") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ICON_EUCLID.get());
        }
    });
    public static final ItemGroup TAB_BLOCKS = (new ItemGroup(ItemGroup.TABS.length, "overtimeblocks") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ICON_SAFE.get());
        }
    });
    public static final ItemGroup TAB_MOBS = (new ItemGroup(ItemGroup.TABS.length, "overtimemobs") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ICON_KETER.get());
        }
    });
    public static final ItemGroup TAB_MISC = (new ItemGroup(ItemGroup.TABS.length, "overtimemisc") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ICON_SAFE.get());
        }
    });

    public Overtime() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
