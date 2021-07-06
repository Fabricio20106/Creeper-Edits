package com.akemichan.creeperedits.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class StuffInitTab extends ItemGroup {
    public static final StuffInitTab creeper = new StuffInitTab("creeper");

    public StuffInitTab(String label) {
        super(label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(StuffInit.creeper_ingot.get());
    }
}
