package com.sophicreeper.creeperedits.item.custom;

import com.sophicreeper.creeperedits.CreeperEdits;
import com.sophicreeper.creeperedits.util.CETags;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.text.Color;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

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
        if (headStack.getItem().is(CETags.Items.PROVIDES_RESISTANCE) && !player.isEyeInFluid(FluidTags.WATER)) {
            player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 200, 0, false, false, true));
        }
    }

    @Override
    public ITextComponent getName(ItemStack stack) {
        return new TranslationTextComponent(this.getDescriptionId()).withStyle(Style.EMPTY.withColor(Color.fromRgb(0x47BF4A)));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("tooltip." + CreeperEdits.MOD_ID + ".creeper_lord_helmet.line1"));
        tooltip.add(new TranslationTextComponent("tooltip." + CreeperEdits.MOD_ID + ".creeper_lord_helmet.line2"));
        super.appendHoverText(stack, world, tooltip, flag);
    }
}
