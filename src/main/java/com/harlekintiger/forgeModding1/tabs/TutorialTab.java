package com.harlekintiger.forgeModding1.tabs;


import com.harlekintiger.forgeModding1.FirstForgeMod;
import com.harlekintiger.forgeModding1.init.TutorialItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class TutorialTab extends CreativeTabs{

    public TutorialTab(String name){
        super(FirstForgeMod.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(TutorialItems.BASIC_ITEM);
    }
}
