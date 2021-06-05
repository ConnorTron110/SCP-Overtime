package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Overtime.MOD_ID);

    public static final RegistryObject<SoundEvent> GENERIC_STEP = registerSound("generic_step");
    public static final RegistryObject<SoundEvent> HEAVY_STEP = registerSound("heavy_step");
    public static final RegistryObject<SoundEvent> MASK_BREATHING = registerSound("mask_breathing");

    public static final RegistryObject<SoundEvent> SCP035_TAKEOVER = registerSound("scp035_takeover");
    public static final RegistryObject<SoundEvent> SCP035_ANGRY = registerSound("scp035_angry");
    public static final RegistryObject<SoundEvent> SCP035_IDLE = registerSound("scp035_idle");
    public static final RegistryObject<SoundEvent> SCP035_EQUIP = registerSound("scp035_equip");
    public static final RegistryObject<SoundEvent> SCP035_TENDRIL_IDLE = registerSound("scp035_tendril_idle");
    public static final RegistryObject<SoundEvent> SCP035_TENDRIL_SPAWN = registerSound("scp035_tendril_spawn");

    public static final RegistryObject<SoundEvent> SCP066_ROLLING = registerSound("scp066_rolling");
    public static final RegistryObject<SoundEvent> SCP066_BEETHOVEN = registerSound("scp066_beethoven");
    public static final RegistryObject<SoundEvent> SCP066_IDLE = registerSound("scp066_idle");

    public static final RegistryObject<SoundEvent> SCP1762_OST = registerSound("scp1762_ost");

    public static final RegistryObject<SoundEvent> SCP2761_DEATH = registerSound("scp2761_death");
    public static final RegistryObject<SoundEvent> SCP2761_HURT = registerSound("scp2761_hurt");
    public static final RegistryObject<SoundEvent> SCP2761_IDLE = registerSound("scp2761_idle");

    public static final RegistryObject<SoundEvent> SCP3199_DEATH = registerSound("scp3199_death");
    public static final RegistryObject<SoundEvent> SCP3199_IDLE = registerSound("scp3199_idle");
    public static final RegistryObject<SoundEvent> SCP3199_SCREAM = registerSound("scp3199_scream");

    public static final RegistryObject<SoundEvent> SCP3456_DEATH = registerSound("scp3456_death");
    public static final RegistryObject<SoundEvent> SCP3456_IDLE = registerSound("scp3456_idle");
    public static final RegistryObject<SoundEvent> SCP3456_HURT = registerSound("scp3456_hurt");

    public static final RegistryObject<SoundEvent> SCP5167_DEATH = registerSound("scp5167_death");
    public static final RegistryObject<SoundEvent> SCP5167_MEETING = registerSound("scp5167_meeting");
    public static final RegistryObject<SoundEvent> SCP5167_WALK = registerSound("scp5167_walk");

    private static RegistryObject<SoundEvent> registerSound(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(Overtime.MOD_ID, name)));
    }
}
