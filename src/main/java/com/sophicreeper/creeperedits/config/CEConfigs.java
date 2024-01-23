package com.sophicreeper.creeperedits.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class CEConfigs {
    private static final Pair<CECommonConfigs, ForgeConfigSpec> COMMON_CONFIG_PAIR = new ForgeConfigSpec.Builder().configure(CECommonConfigs::new);
    public static final CECommonConfigs COMMON_CONFIGS = COMMON_CONFIG_PAIR.getLeft();
    public static final ForgeConfigSpec COMMON_SPEC = COMMON_CONFIG_PAIR.getRight();
}
