package com.sophicreeper.creeperedits;

import com.sophicreeper.creeperedits.block.CEBlocks;
import com.sophicreeper.creeperedits.blockentity.CEBlockEntities;
import com.sophicreeper.creeperedits.item.CEItems;
import com.sophicreeper.creeperedits.misc.CEPaintings;
import com.sophicreeper.creeperedits.util.CEWoodTypes;
import net.minecraft.block.WoodType;
import net.minecraft.client.renderer.Atlases;
import net.minecraft.client.renderer.tileentity.SignTileEntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreeperEdits.MOD_ID)
public class CreeperEdits {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "creeperedits";

    public CreeperEdits() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::commonSetup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);

        CEBlocks.BLOCKS.register(eventBus);
        CEBlockEntities.BLOCK_ENTITIES.register(eventBus);
        CEItems.ITEMS.register(eventBus);
        CEPaintings.PAINTINGS.register(eventBus);
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        WoodType.register(CEWoodTypes.CREEPWOOD);
    }

    public void clientSetup(final FMLClientSetupEvent event) {
        Atlases.addWoodType(CEWoodTypes.CREEPWOOD);

        ClientRegistry.bindTileEntityRenderer(CEBlockEntities.CREEPER_SIGN.get(), SignTileEntityRenderer::new);
    }

    @SubscribeEvent
    public static void serverSetup(final FMLServerStartingEvent event) {}
}
