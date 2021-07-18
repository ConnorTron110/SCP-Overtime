package io.github.connortron110.overtime.data;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class ModSoundsProvider extends SoundDefinitionsProvider {
    public ModSoundsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Overtime.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.GENERIC_STEP, SoundDefinition.definition().subtitle("subtitle.generic_step").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "generic_step1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "generic_step2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "generic_step3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "generic_step4"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.HEAVY_STEP, SoundDefinition.definition().subtitle("subtitle.heavy_step").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "heavy_step1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "heavy_step2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "heavy_step3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "heavy_step4"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.MASK_BREATHING, SoundDefinition.definition().subtitle("subtitle.mask_breathing").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "mask_breathing_1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "mask_breathing_2"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP035_TAKEOVER, SoundDefinition.definition().subtitle("subtitle.scp035_takeover").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/takeover_1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/takeover_2"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP035_ANGRY, SoundDefinition.definition().subtitle("subtitle.scp035_angry").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/angry_1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/angry_2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/angry_3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/angry_4"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP035_IDLE, SoundDefinition.definition().subtitle("subtitle.scp035_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_4"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_5"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/idle_6"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP035_EQUIP, SoundDefinition.definition().subtitle("subtitle.scp035_equip").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/equip"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP035_TENDRIL_IDLE, SoundDefinition.definition().subtitle("subtitle.scp035_tendril_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/tendril/idle"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP035_TENDRIL_SPAWN, SoundDefinition.definition().subtitle("subtitle.scp035_tendril_spawn").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/035/tendril/spawn"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP066_ROLLING, SoundDefinition.definition().subtitle("subtitle.scp066_rolling").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/rolling"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP066_BEETHOVEN, SoundDefinition.definition().subtitle("subtitle.scp066_beethoven").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/beethoven"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP066_IDLE, SoundDefinition.definition().subtitle("subtitle.scp066_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/eric1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/eric2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/eric3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes4"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes5"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/066/notes6"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP131_DANGER, SoundDefinition.definition().subtitle("subtitle.scp131_danger").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/danger"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP131_DEATH, SoundDefinition.definition().subtitle("subtitle.scp131_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP131_IDLE, SoundDefinition.definition().subtitle("subtitle.scp131_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/idle1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/idle2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/idle3"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP131_WALK, SoundDefinition.definition().subtitle("subtitle.scp131_walk").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/walkshort"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/walkmedium"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/131/walklong"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP303_DEATH, SoundDefinition.definition().subtitle("subtitle.scp303_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/303/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP303_HURT, SoundDefinition.definition().subtitle("subtitle.scp303_hurt").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/303/hurt"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP303_IDLE, SoundDefinition.definition().subtitle("subtitle.scp303_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/303/idle1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/303/idle2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/303/idle3"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP745_DEATH, SoundDefinition.definition().subtitle("subtitle.scp745_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/745/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP745_HURT, SoundDefinition.definition().subtitle("subtitle.scp745_hurt").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/745/hurt"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP745_IDLE, SoundDefinition.definition().subtitle("subtitle.scp745_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/745/idle"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP1762_OST, SoundDefinition.definition().subtitle("subtitle.scp1762_ost").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/1762ost"), SoundDefinition.SoundType.SOUND).stream(true)));

        add(ModSounds.SCP2761_DEATH, SoundDefinition.definition().subtitle("subtitle.scp2761_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP2761_HURT, SoundDefinition.definition().subtitle("subtitle.scp2761_hurt").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/hurt1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/hurt2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/hurt3"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP2761_IDLE, SoundDefinition.definition().subtitle("subtitle.scp2761_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle4"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle5"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle6"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle7"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/2761/idle8"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP3199_DEATH, SoundDefinition.definition().subtitle("subtitle.scp3199_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP3199_IDLE, SoundDefinition.definition().subtitle("subtitle.scp3199_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/idle1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/idle2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/idle3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/idle4"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP3199_SCREAM, SoundDefinition.definition().subtitle("subtitle.scp3199_scream").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/scream1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3199/scream2"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP3456_DEATH, SoundDefinition.definition().subtitle("subtitle.scp3456_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP3456_IDLE, SoundDefinition.definition().subtitle("subtitle.scp3456_idle").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/idle1"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/idle2"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/idle3"), SoundDefinition.SoundType.SOUND),
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/scream"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP3456_HURT, SoundDefinition.definition().subtitle("subtitle.scp3456_hurt").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/3456/hurt"), SoundDefinition.SoundType.SOUND)));

        add(ModSounds.SCP5167_DEATH, SoundDefinition.definition().subtitle("subtitle.scp5167_death").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/5167/death"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP5167_MEETING, SoundDefinition.definition().subtitle("subtitle.scp5167_meeting").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/5167/meeting"), SoundDefinition.SoundType.SOUND)));
        add(ModSounds.SCP5167_WALK, SoundDefinition.definition().subtitle("subtitle.scp5167_walk").with(
                SoundDefinition.Sound.sound(new ResourceLocation(Overtime.MOD_ID, "scp/5167/walk"), SoundDefinition.SoundType.SOUND)));
    }
}
