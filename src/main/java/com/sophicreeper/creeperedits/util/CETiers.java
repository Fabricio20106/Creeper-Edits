package com.sophicreeper.creeperedits.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public class CETiers implements IItemTier {
    public static final CETiers CREEPER = new CETiers(2, 250, 12, 2, 22, () -> Ingredient.of(CETags.Items.INGOTS_CREEPER));

    private final int harvestLevel;
    private final int durability;
    private final float harvestSpeed;
    private final float attackDamage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    public CETiers(int harvestLevel, int durability, float harvestSpeed, float attackDamage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.harvestSpeed = harvestSpeed;
        this.attackDamage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() {
        return this.durability;
    }

    public float getSpeed() {
        return this.harvestSpeed;
    }

    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    public int getLevel() {
        return this.harvestLevel;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
