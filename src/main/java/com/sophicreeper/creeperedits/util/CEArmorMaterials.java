package com.sophicreeper.creeperedits.util;

import com.sophicreeper.creeperedits.CreeperEdits;
import com.sophicreeper.creeperedits.item.CEItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class CEArmorMaterials implements IArmorMaterial {
    public static final CEArmorMaterials CREEPER = new CEArmorMaterials(CreeperEdits.MOD_ID + ":creeper", 15, new int[] {1, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 0, 0.05f,
            () -> Ingredient.of(CEItems.CREEPER_INGOT.get()));
    public static final CEArmorMaterials CREEPER_LORD = new CEArmorMaterials(CreeperEdits.MOD_ID + ":creeper_lord", 20, new int[] {3, 3, 5, 2}, 25, SoundEvents.ARMOR_EQUIP_GOLD, 1, 0.1f,
            () -> Ingredient.of(CEItems.CREEPER_INGOT.get()));

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionForSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRes;
    private final LazyValue<Ingredient> repairIngredient;

    public CEArmorMaterials(String name, int durabilityMultiplier, int[] protectionPerSlot, int enchValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionForSlot = protectionPerSlot;
        this.enchantmentValue = enchValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.protectionForSlot[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    // Gets the percentage of knockback resistance provided by armor of the material.
    public float getKnockbackResistance() {
        return this.knockbackRes;
    }
}
