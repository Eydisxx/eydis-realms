package net.eydis.eydis_realms.item;

import net.eydis.eydis_realms.eydis_realms;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, eydis_realms.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> RUBY_INGOT = ITEMS.register("ruby_ingot",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ_INGOT = ITEMS.register("topaz_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ_NUGGET = ITEMS.register("topaz_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> SAPPHIRE_INGOT = ITEMS.register("sapphire_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget",
            () -> new Item(new Item.Properties()));
            
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
