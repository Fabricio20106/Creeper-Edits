package com.sophicreeper.creeperedits.blockentity;

import com.sophicreeper.creeperedits.CreeperEdits;
import com.sophicreeper.creeperedits.block.CEBlocks;
import com.sophicreeper.creeperedits.blockentity.custom.CESignBlockEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CEBlockEntities {
    public static final DeferredRegister<TileEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, CreeperEdits.MOD_ID);

    public static final RegistryObject<TileEntityType<CESignBlockEntity>> CREEPER_SIGN = BLOCK_ENTITIES.register("creeper_sign", () -> TileEntityType.Builder.of(CESignBlockEntity::new, CEBlocks.CREEPWOOD_SIGN.get(), CEBlocks.CREEPWOOD_WALL_SIGN.get())
            .build(null));
}
