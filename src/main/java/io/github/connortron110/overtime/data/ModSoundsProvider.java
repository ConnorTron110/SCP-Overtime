package io.github.connortron110.overtime.data;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.core.init.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.minecraftforge.fml.RegistryObject;

import java.util.Arrays;

public class ModSoundsProvider extends SoundDefinitionsProvider {
    public ModSoundsProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, Overtime.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        add(ModSounds.GENERIC_STEP, new ModSoundDefinition().sound("generic_step", 4));
        add(ModSounds.HEAVY_STEP, new ModSoundDefinition().sound("heavy_step", 4));
        add(ModSounds.MASK_BREATHING, new ModSoundDefinition().sound("mask_breathing", 2));
        add(ModSounds.VENDING_AMBIENCE, new ModSoundDefinition().sound("vending_machine_ambience"));
        add(ModSounds.VENDING_COIN, new ModSoundDefinition().sound("vending_machine_coin"));
        add(ModSounds.VENDING_DROP_ITEM, new ModSoundDefinition().sound("vending_machine_drop_item"));

        add(ModSounds.SCP035_TENDRIL_IDLE, new ModSoundDefinition("035/tendril").sound("idle"));
        add(ModSounds.SCP035_TENDRIL_SPAWN, new ModSoundDefinition("035/tendril").sound("spawn"));
        add(ModSounds.SCP035_ANGRY, new ModSoundDefinition("035").sound("angry", 4));
        add(ModSounds.SCP035_EQUIP, new ModSoundDefinition("035").sound("equip"));
        add(ModSounds.SCP035_IDLE, new ModSoundDefinition("035").sound("idle", 6));
        add(ModSounds.SCP035_TAKEOVER, new ModSoundDefinition("035").sound("takeover", 2));

        add(ModSounds.SCP066_BEETHOVEN, new ModSoundDefinition("066").sound("beethoven"));
        add(ModSounds.SCP066_IDLE, new ModSoundDefinition("066").sound("eric", 3).sound("notes", 6));
        add(ModSounds.SCP066_ROLLING, new ModSoundDefinition("066").sound("rolling"));

        add(ModSounds.SCP131_DANGER, new ModSoundDefinition(131).sound("danger"));
        add(ModSounds.SCP131_DEATH, new ModSoundDefinition(131).sound("death"));
        add(ModSounds.SCP131_IDLE, new ModSoundDefinition(131).sound("idle", 3));
        add(ModSounds.SCP131_WALK, new ModSoundDefinition(131).sound("walkshort", "walkmedium", "walklong"));

        add(ModSounds.SCP303_DEATH, new ModSoundDefinition(303).sound("death"));
        add(ModSounds.SCP303_HURT, new ModSoundDefinition(303).sound("hurt"));
        add(ModSounds.SCP303_IDLE, new ModSoundDefinition(303).sound("idle", 3));

        add(ModSounds.SCP745_DEATH, new ModSoundDefinition(745).sound("death"));
        add(ModSounds.SCP745_HURT, new ModSoundDefinition(745).sound("hurt"));
        add(ModSounds.SCP745_IDLE, new ModSoundDefinition(745).sound("idle"));

        add(ModSounds.SCP1762_OST, new ModSoundDefinition().sound("scp/1762ost", true));

        add(ModSounds.SCP2761_DEATH, new ModSoundDefinition(2761).sound("death"));
        add(ModSounds.SCP2761_HURT, new ModSoundDefinition(2761).sound("hurt", 3));
        add(ModSounds.SCP2761_IDLE, new ModSoundDefinition(2761).sound("idle", 8));

        add(ModSounds.SCP3199_DEATH, new ModSoundDefinition(3199).sound("death"));
        add(ModSounds.SCP3199_IDLE, new ModSoundDefinition(3199).sound("idle", 4));
        add(ModSounds.SCP3199_SCREAM, new ModSoundDefinition(3199).sound("scream", 2));

        add(ModSounds.SCP3456_DEATH, new ModSoundDefinition(3456).sound("death"));
        add(ModSounds.SCP3456_HURT, new ModSoundDefinition(3456).sound("hurt"));
        add(ModSounds.SCP3456_IDLE, new ModSoundDefinition(3456).sound("idle", 3).sound("scream"));

        add(ModSounds.SCP5167_DEATH, new ModSoundDefinition(5167).sound("death"));
        add(ModSounds.SCP5167_MEETING, new ModSoundDefinition(5167).sound("meeting"));
        add(ModSounds.SCP5167_WALK, new ModSoundDefinition(5167).sound("walk"));
    }

    private void add(RegistryObject<? extends SoundEvent> reg, ModSoundDefinition modSoundDefinition) {
        String path = reg.get().getLocation().getPath();
        add(path, modSoundDefinition.subtitle("subtitle."+path).build());
    }

    private static class ModSoundDefinition {
        private final SoundDefinition definition = definition();
        private final String scpID;

        public ModSoundDefinition(String scpID) {
            this.scpID = scpID;
        }
        public ModSoundDefinition(int scpID) {
            this(String.valueOf(scpID));
        }
        public ModSoundDefinition() {
            this("");
        }

        public ModSoundDefinition subtitle(String subtitle) {
            definition.subtitle(subtitle);
            return this;
        }

        /**
         * Used for sounds with more than one variant,
         * Sounds using this method should start with a 1
         * The number is appended after name E.G. hurt1, hurt2 etc..
         */
        public ModSoundDefinition sound(String name, int amount) {
            if (amount < 2) {
                Overtime.LOGGER.warn("Invalid Amount on Sound name: " + name);
                Overtime.LOGGER.warn("Adding one sound and proceeding");
                sound(name, false);
                return this;
            }

            for (int i = 1; i != amount+1; i++) {
                sound(name+i, false);
            }

            return this;
        }

        public ModSoundDefinition sound(String name, boolean stream) {
            definition.with(ModSoundsProvider.sound(new ResourceLocation(Overtime.MOD_ID, (scpID.equals("") ? name : "scp/"+scpID+"/"+name))).stream(stream));
            return this;
        }

        /**
         * Alternative to number version however doesnt add numbers and adds list of Strings as-is provided
         */
        public ModSoundDefinition sound(String... name) {
            Arrays.asList(name).forEach(s -> sound(s, false));
            return this;
        }

        public ModSoundDefinition sound(String name) {
            this.sound(name, false);
            return this;
        }

        public SoundDefinition build() {
            return definition;
        }

    }
}
