package io.github.connortron110.overtime.datagen;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.datagen.client.ModBlockStateProvider;
import io.github.connortron110.overtime.datagen.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Overtime.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        gen.addProvider(new ModBlockStateProvider(gen, event.getExistingFileHelper()));
        gen.addProvider(new ModItemModelProvider(gen, event.getExistingFileHelper()));

        gen.addProvider(new ModLootTableProvider(gen));
        gen.addProvider(new ModRecipeProvider(gen));

        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(gen, event.getExistingFileHelper());
        gen.addProvider(blockTags);
    }
}
