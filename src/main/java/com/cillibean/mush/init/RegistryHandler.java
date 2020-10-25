package com.cillibean.mush.init;

import com.cillibean.mush.MushMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static void init() {
        // attach DeferredRegister to the event bus
        MushItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MushBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
