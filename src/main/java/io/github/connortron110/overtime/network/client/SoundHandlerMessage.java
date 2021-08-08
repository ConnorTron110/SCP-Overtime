package io.github.connortron110.overtime.network.client;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.util.soundmanager.SoundData;
import io.github.connortron110.overtime.core.util.soundmanager.client.ClientSoundHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.UUID;
import java.util.function.Supplier;

public class SoundHandlerMessage {

    //Sound Data Has pos Stored Inside
    private final MessageType type;
    private final SoundData data;
    private UUID entityUUID;

    //Used To Play and Stop a Sound at a Pos
    public SoundHandlerMessage(SoundData data, boolean shouldPlay) {
        this.type = shouldPlay ? MessageType.PLAY_POS : MessageType.STOP_POS;
        this.data = data;
    }

    //Used To Play a sound on an Entity
    public SoundHandlerMessage(SoundData data, Entity entity, boolean shouldPlay) {
        this(data, entity.getUUID(), shouldPlay);
    }

    //UUID Version of Entity Stop and Play
    public SoundHandlerMessage(SoundData data, UUID entityUUID, boolean shouldPlay) {
        this.type = shouldPlay ? MessageType.PLAY_ENTITY : MessageType.STOP_ENTITY;
        this.data = data;
        this.entityUUID = entityUUID;
    }

    public static void encode(SoundHandlerMessage msg, PacketBuffer buffer) {
        buffer.writeEnum(msg.type);
        buffer.writeNbt(msg.data.toNBT());
        if (msg.type == MessageType.PLAY_ENTITY || msg.type == MessageType.STOP_ENTITY) {
            buffer.writeUUID(msg.entityUUID);
        }
    }

    public static SoundHandlerMessage decode(PacketBuffer buffer) {
        MessageType type = buffer.readEnum(MessageType.class);
        switch (type) {
            case PLAY_POS: default: return new SoundHandlerMessage(SoundData.fromNBT(buffer.readNbt()), true);
            case STOP_POS: return new SoundHandlerMessage(SoundData.fromNBT(buffer.readNbt()), false);
            case PLAY_ENTITY: return new SoundHandlerMessage(SoundData.fromNBT(buffer.readNbt()), buffer.readUUID(), true);
            case STOP_ENTITY: return new SoundHandlerMessage(SoundData.fromNBT(buffer.readNbt()), buffer.readUUID(), false);
        }
    }

    public static boolean handle(SoundHandlerMessage msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            if (msg.type == MessageType.PLAY_POS) {
                ClientSoundHandler.playPositionalSound(msg.data);
            } else if (msg.type == MessageType.STOP_POS) {
                ClientSoundHandler.stopPositionalSound(msg.data);
            }

            else if (msg.type == MessageType.PLAY_ENTITY) {
                Overtime.LOGGER.warn("Entity Tracking Sounds Not Implemented, if this was called please implement this");
                //TODO Make Entity Tracking Sound
            }

        });
        return true;
    }

    public enum MessageType {
        PLAY_POS,
        STOP_POS,
        PLAY_ENTITY,
        STOP_ENTITY
    }
}
