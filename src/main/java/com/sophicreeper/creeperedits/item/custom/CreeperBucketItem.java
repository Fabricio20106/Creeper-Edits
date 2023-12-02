package com.sophicreeper.creeperedits.item.custom;

import com.sophicreeper.creeperedits.item.CEItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;

public class CreeperBucketItem extends BucketItem {
    public CreeperBucketItem(Fluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected ItemStack getEmptySuccessItem(ItemStack stack, PlayerEntity player) {
        return !player.abilities.instabuild ? new ItemStack(CEItems.CREEPER_BUCKET.get()) : stack;
    }
}
