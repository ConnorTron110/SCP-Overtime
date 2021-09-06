package io.github.connortron110.overtime.mixin.client;

import io.github.connortron110.overtime.core.init.ModEffects;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.SleepInMultiplayerScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(SleepInMultiplayerScreen.class)
public abstract class SleepInMultiplayerScreenMixin extends ChatScreen {

    public SleepInMultiplayerScreenMixin(String p_i1024_1_) {
        super(p_i1024_1_);
    }

    /**
     * @author ConnorTron110
     * @reason Used to Remove the LeaveBed Button when the player has the {@link ModEffects#UNCONSCIOUS} Effect
     */
    @Overwrite
    protected void init() {
        super.init();
        if (!minecraft.player.hasEffect(ModEffects.UNCONSCIOUS.get())) {
            this.addButton(new Button(this.width / 2 - 100, this.height - 40, 200, 20, new TranslationTextComponent("multiplayer.stopSleeping"), (p_212998_1_) -> {
                this.sendWakeUp();
            }));
        }
    }

    @Shadow
    protected abstract void sendWakeUp();
}
