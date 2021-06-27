package io.github.connortron110.overtime.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override //It says shapeless but all recipes go here
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        /*
        ShapelessRecipeBuilder.shapeless(ItemInit.INGOT.get(), 9) //9 Ingots makes...
                .requires(BlockInit.OREBLOCK.get())                //One Metal Block!
                .unlockedBy("has_item", has(ItemInit.INGOT.get())) //Generates Advancement
                .save(consumer);                                    //Have to save/build it with consumer attached

         */
        //Here's another Great example with shaped recipes
        /*
        ShapedRecipeBuilder.shaped(BlockInit.OREBLOCK.get())
                .define('#', ItemInit.INGOT.get())
                .define('a', ItemInit.SOMEOTHERITEM.get())
                .pattern("#a#")
                .pattern("#a#")
                .pattern("#a#")
                .save(consumer);
         */
    }
}
