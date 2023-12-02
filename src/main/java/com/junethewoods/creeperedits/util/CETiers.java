package com.junethewoods.creeperedits.util;

import com.junethewoods.creeperedits.init.CEItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class CETiers implements Tier {
    public static final CETiers CREEPER = new CETiers(2, 250, 12, 2, 22, () -> Ingredient.of(CEItems.CREEPER_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private CETiers(int harvestLevel, int durability, float miningSpeed, float attackDamage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = harvestLevel;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
