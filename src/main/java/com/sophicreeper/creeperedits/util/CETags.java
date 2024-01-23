package com.sophicreeper.creeperedits.util;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class CETags {
    public static class Items {
        public static final ITag.INamedTag<Item> INGOTS_CREEPER = tag("forge", "ingots/creeper");
        public static final ITag.INamedTag<Item> PROVIDES_RESISTANCE = tag("melony", "provides_effect/resistance");

        public static ITag.INamedTag<Item> tag(String modID, String name) {
            return ItemTags.bind(new ResourceLocation(modID, name).toString());
        }
    }
}
