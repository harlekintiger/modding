package com.harlekintiger.forgeModding1.util;


import com.harlekintiger.forgeModding1.block.BlockBasic;
import com.harlekintiger.forgeModding1.init.TutorialBlocks;
import com.harlekintiger.forgeModding1.item.ItemBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event){
        final Block[] blocks ={
                new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
        };

        event.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public  static  void registerItems(Register<Item> event){
        final Item[] items = {
                new ItemBasic("itemBasic", "basic_item")
        };

        final Item[] itemBlocks = {
                new ItemBlock(TutorialBlocks.BASIC_BLOCK).setRegistryName(TutorialBlocks.BASIC_BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
