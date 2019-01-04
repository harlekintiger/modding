package com.harlekintiger.forgeModding1.block;

import com.harlekintiger.forgeModding1.FirstForgeMod;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

    public BlockBasic(Material material, String unlocalizedName, String registryName){
        this(material, SoundType.STONE, unlocalizedName, registryName);
    }

    public BlockBasic(Material material, SoundType sound, String unlocalizedName, String registryName){
        super(material);
        setUnlocalizedName(FirstForgeMod.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(FirstForgeMod.TUTORIAL_TAB);
        setSoundType(sound);
    }
}
