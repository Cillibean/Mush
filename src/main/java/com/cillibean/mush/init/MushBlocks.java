package com.cillibean.mush.init;

import com.cillibean.mush.MushMod;
import com.cillibean.mush.blocks.TestBlock;
import com.cillibean.mush.items.TestItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MushBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MushMod.MODID);
    /*public static final RegistryObject<Block> SHARD_BLOCK = BLOCKS.register("shard_block", () ->
            new TestBlock(Block.Properties
                    .create(Material.PLANTS)
                    .hardnessAndResistance(1.0f, 2.0f)
                    .sound(SoundType.NETHER_WART)
                    .harvestLevel(1)
                    .harvestTool(ToolType.HOE)
            )
    );*/
    public static final RegistryObject<Block> MYCELIUM_BRICK_BLOCK = BLOCKS.register("mycelium_brick_block", () ->
            new TestBlock(Block.Properties
                    .create(Material.IRON)
                    .hardnessAndResistance(5.0f, 6.0f)
                    .sound(SoundType.STONE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
            )
    );
}
