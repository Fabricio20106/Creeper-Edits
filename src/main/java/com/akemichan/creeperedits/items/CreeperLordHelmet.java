package com.akemichan.creeperedits.items;

import com.akemichan.creeperedits.init.StuffInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CreeperLordHelmet extends ArmorItem {
    public CreeperLordHelmet(IArmorMaterial material, EquipmentSlotType slotTypeIn, Properties properties) {
        super(material, slotTypeIn, properties);
    }

    public ActionResult<ItemStack> onItemRightClickPlayer(World worldIn, PlayerEntity playerIn, Hand handIn, PlayerEntity playerEntity) {
        ItemStack itemStack = playerEntity.getItemStackFromSlot(EquipmentSlotType.HEAD);
        if (itemStack.getItem() == StuffInit.creeper_lord_helmet.get() && !playerEntity.areEyesInFluid(FluidTags.WATER)) {
            playerEntity.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 200, 0));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
