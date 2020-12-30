package mrp_v2.mrplibrary.datagen.providers;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

import javax.annotation.Nullable;

public abstract class ItemTagsProvider extends net.minecraft.data.ItemTagsProvider
{
    protected final String modId;
    protected final ExistingFileHelper existingFileHelper;

    protected ItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, String modId,
            @Nullable ExistingFileHelper existingFileHelper)
    {
        super(dataGenerator);
        this.modId = modId;
        this.existingFileHelper = existingFileHelper;
    }

    @Override protected abstract void registerTags();

    @Override public String getName()
    {
        return super.getName() + ": " + this.modId;
    }
}
