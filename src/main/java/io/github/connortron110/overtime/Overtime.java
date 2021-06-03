package io.github.connortron110.overtime;

import io.github.connortron110.overtime.core.init.BlockInit;
import io.github.connortron110.overtime.core.init.EntityInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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
        EntityInit.ENTITY_TYPES.register(bus);
        ModSounds.SOUNDS.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::onEntityAttributeCreation);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
        event.put(EntityInit.SCP035_TENDRIL.get(), createBaseAttributes(20, 0, 4,2).add(Attributes.KNOCKBACK_RESISTANCE, 1000).build());
        event.put(EntityInit.SCP066.get(), createBaseAttributes(66, .2, 1,2).build());
        event.put(EntityInit.SCP066_CAT.get(), createBaseAttributes(66, .2, 0,0).build());
        event.put(EntityInit.SCP427.get(), createBaseAttributes(800, .4, 6,10).build());
        event.put(EntityInit.SCP1762.get(), createBaseAttributes(2, .3, 3,2).add(Attributes.FLYING_SPEED, .3).build());
        event.put(EntityInit.SCP3199.get(), createBaseAttributes(450, .4, 5, 1).build());
        event.put(EntityInit.SCP3199_EGG.get(), createBaseAttributes(1000, 0, 0, 0).build());
        event.put(EntityInit.SCP3456.get(), createBaseAttributes(750, .3, 9, 2).build());
        event.put(EntityInit.SCP5167.get(), createBaseAttributes(50, .4, 3, 1).build());
    }

    private static AttributeModifierMap.MutableAttribute createBaseAttributes(double health, double moveSpeed, double attackDamage, double attackKnockback) {
        return MobEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, health)
                .add(Attributes.FOLLOW_RANGE, 32)
                .add(Attributes.MOVEMENT_SPEED, moveSpeed)
                .add(Attributes.ATTACK_DAMAGE, attackDamage)
                .add(Attributes.ATTACK_KNOCKBACK, attackKnockback);
    }
}
