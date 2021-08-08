package io.github.connortron110.overtime.core.util.soundmanager;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.registries.ForgeRegistries;

public final class SoundData {

    public final SoundEvent soundEvent;
    public final SoundCategory soundCategory;
    public final float volume;
    public final float pitch;
    public final boolean looping;
    public final int delay;
    public final BlockPos pos;

    public SoundData(SoundEvent soundEvent, SoundCategory soundCategory, float volume, float pitch, boolean looping, int delay, BlockPos pos) {
        this.soundEvent = soundEvent;
        this.soundCategory = soundCategory;
        this.volume = volume;
        this.pitch = pitch;
        this.looping = looping;
        this.delay = delay;
        this.pos = pos;
    }

    public SoundData(SoundEvent soundEvent, SoundCategory soundCategory, boolean looping, int delay, BlockPos pos) {
        this(soundEvent, soundCategory, 1F, 1F, looping, delay, pos);
    }

    public CompoundNBT toNBT() {
        CompoundNBT nbt = new CompoundNBT();
        nbt.putString("Location", soundEvent.getRegistryName().toString());
        nbt.putString("Category", soundCategory.toString());
        nbt.putFloat("Volume", volume);
        nbt.putFloat("Pitch", pitch);
        nbt.putBoolean("Looping", looping);
        nbt.putInt("Delay", delay);
        nbt.put("Pos", NBTUtil.writeBlockPos(pos));
        return nbt;
    }

    public static SoundData fromNBT(CompoundNBT nbt) {
        return new SoundData(
                ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(nbt.getString("Location"))),
                SoundCategory.valueOf(nbt.getString("Category")),
                nbt.getFloat("Volume"),
                nbt.getFloat("Pitch"),
                nbt.getBoolean("Looping"),
                nbt.getInt("Delay"),
                NBTUtil.readBlockPos(nbt.getCompound("Pos"))
        );
    }
}
