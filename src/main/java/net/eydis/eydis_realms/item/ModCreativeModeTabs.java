package net.eydis.eydis_realms.item;

import net.eydis.eydis_realms.eydis_realms;
import net.eydis.eydis_realms.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, eydis_realms.MOD_ID);


    public static final RegistryObject<CreativeModeTab> EYDIS_REALMS_TAB = CREATIVE_MODE_TABS.register("eydis_realms_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.eydis_realms_tab"))
                    .displayItems((displayparameters, output) -> {

                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RAW_RUBY.get());
                        output.accept(ModItems.RUBY_INGOT.get());
                        output.accept(ModItems.RUBY_NUGGET.get());
                        
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
}

}