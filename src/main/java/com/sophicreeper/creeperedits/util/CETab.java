package com.sophicreeper.creeperedits.util;

import com.sophicreeper.creeperedits.item.CEItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CETab extends ItemGroup {
    public static final CETab TAB = new CETab("creeper");

    public CETab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(CEItems.CREEPER_INGOT.get());
    }
}
