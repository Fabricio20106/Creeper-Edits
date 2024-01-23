package com.sophicreeper.creeperedits.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CECommonConfigs {
    public final ForgeConfigSpec.IntValue creeperHorseArmorPoints;

    public CECommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to the Creeper Edits (R.P.to Mod) config. This was made on 22/01/2024.");

        builder.push("items");
        this.creeperHorseArmorPoints = builder.comment("How much armor Creeper Horse Armor gives.").defineInRange("creeperHorseArmorPoints", 7, 0, Integer.MAX_VALUE);
        builder.pop();
    }
}
