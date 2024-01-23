package com.sophicreeper.creeperedits.item;

import com.sophicreeper.creeperedits.CreeperEdits;
import com.sophicreeper.creeperedits.block.CEBlocks;
import com.sophicreeper.creeperedits.config.CEConfigs;
import com.sophicreeper.creeperedits.item.custom.CreeperBucketItem;
import com.sophicreeper.creeperedits.item.custom.CreeperLordArmorItem;
import com.sophicreeper.creeperedits.item.custom.CreeperMilkBucketItem;
import com.sophicreeper.creeperedits.util.CEArmors;
import com.sophicreeper.creeperedits.util.CETab;
import com.sophicreeper.creeperedits.util.CETiers;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CEItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreeperEdits.MOD_ID);

    public static final RegistryObject<Item> CREEPWOOD_SIGN = ITEMS.register("creepwood_sign", () -> new SignItem(new Item.Properties().stacksTo(16).tab(CETab.TAB), CEBlocks.CREEPWOOD_SIGN.get(), CEBlocks.CREEPWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> RAW_CREEPER = ITEMS.register("raw_creeper", () -> new Item(new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_INGOT = ITEMS.register("creeper_ingot", () -> new Item(new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_NUGGET = ITEMS.register("creeper_nugget", () -> new Item(new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_LORD_HELMET = ITEMS.register("creeper_lord_helmet", () -> new CreeperLordArmorItem(CEArmors.CREEPER_LORD, EquipmentSlotType.HEAD, new Item.Properties().rarity(Rarity.UNCOMMON).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_HELMET = ITEMS.register("creeper_helmet", () -> new ArmorItem(CEArmors.CREEPER, EquipmentSlotType.HEAD, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_CHESTPLATE = ITEMS.register("creeper_chestplate", () -> new ArmorItem(CEArmors.CREEPER, EquipmentSlotType.CHEST, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_LEGGINGS = ITEMS.register("creeper_leggings", () -> new ArmorItem(CEArmors.CREEPER, EquipmentSlotType.LEGS, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_BOOTS = ITEMS.register("creeper_boots", () -> new ArmorItem(CEArmors.CREEPER, EquipmentSlotType.FEET, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_BOWL = ITEMS.register("creeper_bowl", () -> new Item(new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_POWDER = ITEMS.register("creeper_powder", () -> new Item(new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_BUCKET = ITEMS.register("creeper_bucket", () -> new CreeperBucketItem(Fluids.EMPTY, new Item.Properties().stacksTo(16).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_WATER_BUCKET = ITEMS.register("creeper_water_bucket", () -> new CreeperBucketItem(Fluids.WATER, new Item.Properties().stacksTo(1).craftRemainder(CREEPER_BUCKET.get()).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_LAVA_BUCKET = ITEMS.register("creeper_lava_bucket", () -> new CreeperBucketItem(Fluids.LAVA, new Item.Properties().stacksTo(1).craftRemainder(CREEPER_BUCKET.get()).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_MILK_BUCKET = ITEMS.register("creeper_milk_bucket", () -> new CreeperMilkBucketItem(new Item.Properties().stacksTo(1).craftRemainder(CREEPER_BUCKET.get()).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_POWDER_SNOW_BUCKET = ITEMS.register("creeper_powder_snow_bucket", () -> new Item(new Item.Properties().stacksTo(1).craftRemainder(CREEPER_BUCKET.get()).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_HORSE_ARMOR = ITEMS.register("creeper_horse_armor", () -> new HorseArmorItem(CEConfigs.COMMON_CONFIGS.creeperHorseArmorPoints.get(), CreeperEdits.resourceLoc("textures/entity/horse/armor/horse_armor_creeper.png"), new Item.Properties().stacksTo(1).tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_SWORD = ITEMS.register("creeper_sword", () -> new SwordItem(CETiers.CREEPER, 3, -2.4f, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_PICKAXE = ITEMS.register("creeper_pickaxe", () -> new PickaxeItem(CETiers.CREEPER, 1, -2.8f, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_SHOVEL = ITEMS.register("creeper_shovel", () -> new ShovelItem(CETiers.CREEPER, 1.5f, -3, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_AXE = ITEMS.register("creeper_axe", () -> new AxeItem(CETiers.CREEPER, 6, -3.1f, new Item.Properties().tab(CETab.TAB)));
    public static final RegistryObject<Item> CREEPER_HOE = ITEMS.register("creeper_hoe", () -> new HoeItem(CETiers.CREEPER, -2, -1, new Item.Properties().tab(CETab.TAB)));
}
