package com.sophicreeper.creeperedits.block;

import com.sophicreeper.creeperedits.CreeperEdits;
import com.sophicreeper.creeperedits.block.custom.CEStandingSignBlock;
import com.sophicreeper.creeperedits.block.custom.CEWallSignBlock;
import com.sophicreeper.creeperedits.util.CEWoodTypes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CEBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreeperEdits.MOD_ID);

    public static final RegistryObject<Block> CREEPWOOD_SIGN = BLOCKS.register("creepwood_sign", () -> new CEStandingSignBlock(AbstractBlock.Properties.copy(Blocks.SPRUCE_SIGN), CEWoodTypes.CREEPWOOD));
    public static final RegistryObject<Block> CREEPWOOD_WALL_SIGN = BLOCKS.register("creepwood_wall_sign", () -> new CEWallSignBlock(AbstractBlock.Properties.copy(Blocks.SPRUCE_WALL_SIGN).lootFrom(CEBlocks.CREEPWOOD_SIGN), CEWoodTypes.CREEPWOOD));
}
