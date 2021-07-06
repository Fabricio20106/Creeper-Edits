package com.akemichan.creeperedits.items;

import com.akemichan.creeperedits.init.StuffInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;

public class CreeperBucketItem extends BucketItem {
    public CreeperBucketItem(Fluid containedFluidIn, Properties builder) {
        super(containedFluidIn, builder);
    }

    protected ItemStack emptyBucket(ItemStack stack, PlayerEntity player) {
        return !player.abilities.isCreativeMode ? new ItemStack(StuffInit.creeper_bucket.get()) : stack;
    }
}
