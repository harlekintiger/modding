package com.harlekintiger.forgeModding1.item;

import com.harlekintiger.forgeModding1.FirstForgeMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item{

    public  ItemBasic(String unlocalizedName, String registryName)
    {
        setUnlocalizedName(FirstForgeMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FirstForgeMod.TUTORIAL_TAB);
    }
}
