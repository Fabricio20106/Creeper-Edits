package com.junethewoods.creeperedits.init;

import com.junethewoods.creeperedits.CreeperEdits;
import com.junethewoods.creeperedits.util.CEArmorMaterials;
import com.junethewoods.creeperedits.util.CETiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CEItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreeperEdits.MOD_ID);

    /* Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));*/

    public static final RegistryObject<Item> CREEPER_INGOT = ITEMS.register("creeper_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_NUGGET = ITEMS.register("creeper_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREEPERPOWDER = ITEMS.register("creeperpowder", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_BOWL = ITEMS.register("creeper_bowl", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_BUCKET = ITEMS.register("creeper_bucket", () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CREEPER_SWORD = ITEMS.register("creeper_sword", () -> new SwordItem(CETiers.CREEPER, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_SHOVEL = ITEMS.register("creeper_shovel", () -> new ShovelItem(CETiers.CREEPER, 1.5f, -3, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_PICKAXE = ITEMS.register("creeper_pickaxe", () -> new PickaxeItem(CETiers.CREEPER, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_AXE = ITEMS.register("creeper_axe", () -> new AxeItem(CETiers.CREEPER, 6, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_HOE = ITEMS.register("creeper_hoe", () -> new HoeItem(CETiers.CREEPER, -2, -1, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_LORD_HELMET = ITEMS.register("creeper_lord_helmet", () -> new ArmorItem(CEArmorMaterials.CREEPER_LORD, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> CREEPER_HELMET = ITEMS.register("creeper_helmet", () -> new ArmorItem(CEArmorMaterials.CREEPER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_CHESTPLATE = ITEMS.register("creeper_chestplate", () -> new ArmorItem(CEArmorMaterials.CREEPER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_LEGGINGS = ITEMS.register("creeper_leggings", () -> new ArmorItem(CEArmorMaterials.CREEPER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CREEPER_BOOTS = ITEMS.register("creeper_boots", () -> new ArmorItem(CEArmorMaterials.CREEPER, ArmorItem.Type.BOOTS, new Item.Properties()));
}
