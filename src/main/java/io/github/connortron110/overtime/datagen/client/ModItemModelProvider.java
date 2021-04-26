package io.github.connortron110.overtime.datagen.client;

import io.github.connortron110.overtime.Reference;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Reference.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //TODO Quite self explanatory stuff, will help out in the long run
        //withExistingParent("block_name", modLoc("block/block_name"))

        //ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        //getBuilder("item_name").parent(itemGenerated).texture("layer0", "item/item_name");
    }
}
