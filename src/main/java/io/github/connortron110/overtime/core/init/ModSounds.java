package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Reference.MOD_ID);

    public static final RegistryObject<SoundEvent> SCP066_ROLLING = registerSound("scp066_rolling");
    public static final RegistryObject<SoundEvent> SCP066_BEETHOVEN = registerSound("scp066_beethoven");
    public static final RegistryObject<SoundEvent> SCP066_IDLE = registerSound("scp066_idle");

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Reference.MOD_ID, name)));
    }
}
