package com.cillibean.mush.init;

import com.cillibean.mush.MushMod;
import com.cillibean.mush.items.TestItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MushItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MushMod.MODID);
    /*public static final RegistryObject<Item> MUSH_SHARD = ITEMS.register("mush_shard", () ->
            new TestItem(new Item.Properties().group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> SHARD_BLOCK_ITEM = ITEMS.register("shard_block", () ->
            new BlockItem(
                    MushBlocks.SHARD_BLOCK.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
            )
    );*/
    public static final RegistryObject<Item> HYPHAE = ITEMS.register("hyphae", () ->
            new TestItem(new Item.Properties().group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> MYCELIUM_BRICK = ITEMS.register("mycelium_brick", () ->
            new TestItem(new Item.Properties().group(ItemGroup.MATERIALS))
    );
    public static final RegistryObject<Item> MYCELIUM_BRICK_BLOCK_ITEM = ITEMS.register("mycelium_brick_block", () ->
            new BlockItem(
                    MushBlocks.MYCELIUM_BRICK_BLOCK.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
            )
    );
}
