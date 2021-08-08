package io.github.connortron110.overtime.core.util.soundmanager;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.network.client.SoundHandlerMessage;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.network.PacketDistributor;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


//TODO Send packet to nearby players and not entire dimension
public class SoundManager {

    private static final Map<BlockPos, SoundData> positionalBlockSound = new HashMap<>();
    private static final Map<UUID, SoundData> positionalEntitySound = new HashMap<>();


    public static void playSoundAtPos(BlockPos pos, SoundData data) {
        positionalBlockSound.put(pos, data);
        Overtime.NETWORK.send(PacketDistributor.ALL.noArg(), new SoundHandlerMessage(data, true));
    }

    public static void playSoundAtEntity(Entity entity, SoundData data) {
        positionalEntitySound.put(entity.getUUID(), data);
        //TODO Send Packet to all players to play sound
    }

    public static void stopSoundAtPos(BlockPos pos, SoundData data) {
        Overtime.NETWORK.send(PacketDistributor.ALL.noArg(), new SoundHandlerMessage(data, false));
        positionalBlockSound.remove(pos);
    }

    public static void stopSoundAtEntity(Entity entity, SoundData data) {
        //TODO Send packet to all players to stop sound
        positionalEntitySound.remove(entity.getUUID());
    }
}
