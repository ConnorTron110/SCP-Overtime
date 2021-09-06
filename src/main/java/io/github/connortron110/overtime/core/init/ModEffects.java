package io.github.connortron110.overtime.core.init;

import io.github.connortron110.overtime.Overtime;
import io.github.connortron110.overtime.common.potions.effects.SCP966StalkingEffect;
import io.github.connortron110.overtime.common.potions.effects.UnconsciousEffect;
import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Overtime.MOD_ID);

    public static final RegistryObject<Effect> UNCONSCIOUS = EFFECTS.register("unconscious", UnconsciousEffect::new);
    public static final RegistryObject<Effect> STALKING966 = EFFECTS.register("966stalking", SCP966StalkingEffect::new);
}
