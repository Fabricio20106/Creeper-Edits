package com.sophicreeper.creeperedits.item.custom;

import com.sophicreeper.creeperedits.item.CEItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MilkBucketItem;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class CreeperMilkBucketItem extends MilkBucketItem {
    public CreeperMilkBucketItem(Properties properties) {
        super(properties);
    }

    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity livEntity) {
        // FORGE - move up so stack.shrink does not turn stack into air.
        if (!world.isClientSide) livEntity.curePotionEffects(stack);

        if (livEntity instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayer = (ServerPlayerEntity) livEntity;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (livEntity instanceof PlayerEntity && !((PlayerEntity)livEntity).abilities.instabuild) {
            stack.shrink(1);
        }

        return stack.isEmpty() ? new ItemStack(CEItems.CREEPER_BUCKET.get()) : stack;
    }
}
