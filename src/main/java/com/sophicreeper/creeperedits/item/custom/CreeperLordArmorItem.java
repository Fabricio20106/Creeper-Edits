package com.sophicreeper.creeperedits.item.custom;

import com.sophicreeper.creeperedits.item.CEItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.World;

public class CreeperLordArmorItem extends ArmorItem {
    public CreeperLordArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        this.creeperLordHelmetTick(player);
        super.onArmorTick(stack, world, player);
    }

    private void creeperLordHelmetTick(PlayerEntity player) {
        ItemStack headStack = player.getItemBySlot(EquipmentSlotType.HEAD);
        if (headStack.getItem() == CEItems.CREEPER_LORD_HELMET.get() && !player.isEyeInFluid(FluidTags.WATER)) {
            player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 200, 0, false, false, true));
        }
    }
}
