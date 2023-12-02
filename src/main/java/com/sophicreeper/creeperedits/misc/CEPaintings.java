package com.sophicreeper.creeperedits.misc;

import com.sophicreeper.creeperedits.CreeperEdits;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CEPaintings {
    public static final DeferredRegister<PaintingType> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, CreeperEdits.MOD_ID);

    public static final RegistryObject<PaintingType> SOPHIBET = PAINTINGS.register("sophibet", () -> new PaintingType(32, 16));
}
