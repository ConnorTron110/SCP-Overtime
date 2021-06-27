package io.github.connortron110.overtime.client;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.client.render.entity.*;
import io.github.connortron110.overtime.common.items.ModSpawnEggItem;
import io.github.connortron110.overtime.core.init.ModBlocks;
import io.github.connortron110.overtime.core.init.ModEntities;
import io.github.connortron110.overtime.core.init.ModItems;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.LlamaSpitRenderer;
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

@Mod.EventBusSubscriber(modid = Overtime.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.ACID_SPIT.get(), LlamaSpitRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP035_TENDRIL.get(), SCP035TendrilRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP066.get(), SCP066Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP066_CAT.get(), CatRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP427.get(), SCP427Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP650.get(), SCP650Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP745.get(), SCP745Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP835_JP.get(), SCP835_JPRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP1529.get(), SCP1529Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP1762.get(), SCP1762Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP2761.get(), SCP2761Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP3199.get(), SCP3199Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP3199_EGG.get(), SCP3199EggRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP3456.get(), SCP3456Renderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.SCP5167.get(), SCP5167Renderer::new);
    }


    private static void setBlockLayers() {
        setRenderLayer(ModBlocks.CONTAINMENT_GLASS.get(), RenderType.translucent());
        setRenderLayer(ModBlocks.CONTAINMENT_GLASS_PANE.get(), RenderType.translucent());
        setRenderLayer(ModBlocks.VENT_ENTRANCE.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.MESH_FLOOR.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.MESH_STAIR.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.MESH_SLAB.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.SCP2845_PLANT.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.GIFT.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.DRAWER.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.BLOOD_PUDDLE.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.SCP066_BLOCK.get(), RenderType.cutout());
    }

    private static void registerItemModelOverrides() {
        ItemModelsProperties.register(ModItems.SCP035.get(), new ResourceLocation(Overtime.MOD_ID, "state"), (stack, world, entity) -> stack.getOrCreateTag().getFloat("state"));
        ItemModelsProperties.register(ModItems.SCP500_CONTAINER.get(), new ResourceLocation(Overtime.MOD_ID, "empty"), (stack, world, entity) -> (stack.getDamageValue() == stack.getMaxDamage()) ? 1F : 0F);
    }
}
