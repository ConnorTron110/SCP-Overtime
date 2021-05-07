package io.github.connortron110.overtime.client;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.core.init.BlockInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.minecraft.client.renderer.RenderTypeLookup.setRenderLayer;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        setRenderLayer(BlockInit.CONTAINMENT_GLASS.get(), RenderType.translucent());
        setRenderLayer(BlockInit.CONTAINMENT_GLASS_PANE.get(), RenderType.translucent());
        setRenderLayer(BlockInit.VENT_ENTRANCE.get(), RenderType.cutout());
        setRenderLayer(BlockInit.SCP2845_PLANT.get(), RenderType.cutout());
        setRenderLayer(BlockInit.GIFT.get(), RenderType.cutout());
        setRenderLayer(BlockInit.DRAWER.get(), RenderType.cutout());
        setRenderLayer(BlockInit.BLOOD_PUDDLE.get(), RenderType.cutout());
    }
}
