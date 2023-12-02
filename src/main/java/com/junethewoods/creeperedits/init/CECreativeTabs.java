package com.junethewoods.creeperedits.init;

import com.junethewoods.creeperedits.CreeperEdits;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.junethewoods.creeperedits.init.CEItems.*;

public class CECreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreeperEdits.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREEPER_EDITS_TAB = CREATIVE_TABS.register("creeperedits_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .icon(() -> CREEPER_INGOT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Add the "example item" to the tab. For your own tabs, this method is preferred over the event
                output.accept(CREEPER_INGOT.get());
                output.accept(CREEPER_NUGGET.get());
                output.accept(CREEPERPOWDER.get());
                output.accept(CREEPER_BOWL.get());
                output.accept(CREEPER_BUCKET.get());
                output.accept(CREEPER_LORD_HELMET.get());
                output.accept(CREEPER_HELMET.get());
                output.accept(CREEPER_CHESTPLATE.get());
                output.accept(CREEPER_LEGGINGS.get());
                output.accept(CREEPER_BOOTS.get());
                output.accept(CREEPER_SWORD.get());
                output.accept(CREEPER_SHOVEL.get());
                output.accept(CREEPER_PICKAXE.get());
                output.accept(CREEPER_AXE.get());
                output.accept(CREEPER_HOE.get());
            }).title(Component.translatable("creative_mode_tab.creeperedits.creeperedits_tab")).build());
}
