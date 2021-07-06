package com.akemichan.creeperedits.init;

import com.akemichan.creeperedits.CreeperEdits;
import com.akemichan.creeperedits.items.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.nio.file.AccessDeniedException;

public class StuffInit {
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, CreeperEdits.mod_id);

    public static final ModArmorMaterial creeper_armor = new ModArmorMaterial(CreeperEdits.mod_id + ":creeper", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () ->
            Ingredient.fromItems(StuffInit.creeper_ingot.get()));
    public static final ModArmorMaterial creeper_helm = new ModArmorMaterial(CreeperEdits.mod_id + ":c_helm", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () ->
            Ingredient.fromItems(StuffInit.creeper_ingot.get()));

    public static final CrepItemTier creeper_tool_tier = new CrepItemTier(1, 500, 3.0F, 3, 35, () ->
            Ingredient.fromItems(StuffInit.creeper_ingot.get()));

    public static final RegistryObject<Item> creeper_ingot = items.register("creeper_ingot", () -> new Item(new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_nugget = items.register("creeper_nugget", () -> new Item(new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_helmet = items.register("creeper_helmet", () -> new ArmorItem(creeper_armor, EquipmentSlotType.HEAD, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_chestplate = items.register("creeper_chestplate", () -> new ArmorItem(creeper_armor, EquipmentSlotType.CHEST, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_leggings = items.register("creeper_leggings", () -> new ArmorItem(creeper_armor, EquipmentSlotType.LEGS, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_boots = items.register("creeper_boots", () -> new ArmorItem(creeper_armor, EquipmentSlotType.FEET, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_lord_helmet = items.register("creeper_lord_helmet", () -> new CreeperLordHelmet(creeper_helm, EquipmentSlotType.HEAD, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_bowl = items.register("creeper_bowl", () -> new Item(new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_powder = items.register("creeper_powder", () -> new Item(new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_bucket = items.register("creeper_bucket", () -> new CreeperBucketItem(Fluids.EMPTY, new Item.Properties().maxStackSize(16).group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_water_bucket = items.register("creeper_water_bucket", () -> new CreeperBucketItem(Fluids.WATER, new Item.Properties().maxStackSize(1).containerItem(creeper_bucket.get()).group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_lava_bucket = items.register("creeper_lava_bucket", () -> new CreeperBucketItem(Fluids.LAVA, new Item.Properties().maxStackSize(1).containerItem(creeper_bucket.get()).group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_milk_bucket = items.register("creeper_milk_bucket", () -> new MilkBucketItem(new Item.Properties().maxStackSize(1).containerItem(creeper_bucket.get()).group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_horse_armor = items.register("creeper_horse_armor", () -> new HorseArmorItem(7, new ResourceLocation(CreeperEdits.mod_id,
            "textures/entity/horse/armor/horse_armor_creeper.png"), new Item.Properties().group(StuffInitTab.creeper).maxStackSize(1)));
    public static final RegistryObject<Item> creeper_sword = items.register("creeper_sword", () -> new SwordItem(creeper_tool_tier, 3, -2.4F, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_pickaxe = items.register("creeper_pickaxe", () -> new PickaxeItem(creeper_tool_tier, 1, -2.8F, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_shovel = items.register("creeper_shovel", () -> new ShovelItem(creeper_tool_tier, 1.5F, -3.0F, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_axe = items.register("creeper_axe", () -> new AxeItem(creeper_tool_tier, 6.0F, -3.0F, new Item.Properties().group(StuffInitTab.creeper)));
    public static final RegistryObject<Item> creeper_hoe = items.register("creeper_hoe", () -> new HoeItem(creeper_tool_tier, 0, -3.0F, new Item.Properties().group(StuffInitTab.creeper)));

}
