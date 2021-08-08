package io.github.connortron110.overtime.core.util.soundmanager.client;

import io.github.connortron110.overtime.core.util.soundmanager.SoundData;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@OnlyIn(Dist.CLIENT)
public class ClientSoundHandler {

    private static final Map<BlockPos, ISound> positionalBlockSound = new HashMap<>();
    private static final Map<UUID, ISound> positionalEntitySound = new HashMap<>(); //TODO

    private static final SoundHandler soundHandler;
    static {
        soundHandler = Minecraft.getInstance().getSoundManager();
    }

    public static void playPositionalSound(SoundData data) {
        ISound sound = dataToSimpleSound(data);
        positionalBlockSound.put(data.pos, sound);
        soundHandler.play(sound);
    }

    public static void stopPositionalSound(SoundData data) {
        soundHandler.stop(positionalBlockSound.get(data.pos));
        positionalBlockSound.remove(data.pos);
    }

    private static SimpleSound dataToSimpleSound(SoundData data) {
        return new SimpleSound(data.soundEvent.getLocation(), data.soundCategory, data.volume, data.pitch, data.looping, data.delay, ISound.AttenuationType.LINEAR, data.pos.getX() + 0.5D, data.pos.getY() + 0.5D, data.pos.getZ() + 0.5D, false);
    }
}
