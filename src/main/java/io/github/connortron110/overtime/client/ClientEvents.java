package io.github.connortron110.overtime.client;

import io.github.connortron110.overtime.Reference;
import io.github.connortron110.overtime.client.render.entity.*;
import io.github.connortron110.overtime.common.items.ModSpawnEggItem;
import io.github.connortron110.overtime.core.init.BlockInit;
import io.github.connortron110.overtime.core.init.EntityInit;
import io.github.connortron110.overtime.core.init.ItemInit;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.minecraft.client.renderer.RenderTypeLookup.setRenderLayer;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        setEntityRenderers();
        setBlockLayers();
        event.enqueueWork(ClientEvents::registerItemModelOverrides);
    }

    private static void setEntityRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP035_TENDRIL.get(), SCP035TendrilRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP066.get(), SCP066Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP066_CAT.get(), CatRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP427.get(), SCP427Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP1762.get(), SCP1762Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP3456.get(), SCP3456Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.SCP5167.get(), SCP5167Renderer::new);
    }


    private static void setBlockLayers() {
        setRenderLayer(BlockInit.CONTAINMENT_GLASS.get(), RenderType.translucent());
        setRenderLayer(BlockInit.CONTAINMENT_GLASS_PANE.get(), RenderType.translucent());
        setRenderLayer(BlockInit.VENT_ENTRANCE.get(), RenderType.cutout());
        setRenderLayer(BlockInit.MESH_FLOOR.get(), RenderType.cutout());
        setRenderLayer(BlockInit.MESH_STAIR.get(), RenderType.cutout());
        setRenderLayer(BlockInit.MESH_SLAB.get(), RenderType.cutout());
        setRenderLayer(BlockInit.SCP2845_PLANT.get(), RenderType.cutout());
        setRenderLayer(BlockInit.GIFT.get(), RenderType.cutout());
        setRenderLayer(BlockInit.DRAWER.get(), RenderType.cutout());
        setRenderLayer(BlockInit.BLOOD_PUDDLE.get(), RenderType.cutout());
        setRenderLayer(BlockInit.SCP066_BLOCK.get(), RenderType.cutout());
    }

    private static void registerItemModelOverrides() {
        ItemModelsProperties.register(ItemInit.SCP035.get(), new ResourceLocation(Reference.MOD_ID, "state"), (stack, world, entity) -> stack.getOrCreateTag().getFloat("state"));
        ItemModelsProperties.register(ItemInit.SCP500_CONTAINER.get(), new ResourceLocation(Reference.MOD_ID, "empty"), (stack, world, entity) -> (stack.getDamageValue() == stack.getMaxDamage()) ? 1F : 0F);
    }
}
