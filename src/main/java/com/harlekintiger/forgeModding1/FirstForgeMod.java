package com.harlekintiger.forgeModding1;

import com.harlekintiger.forgeModding1.proxy.IProxy;
import com.harlekintiger.forgeModding1.tabs.TutorialTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
//import com.harlekintiger.forgeModding1.proxy.ServerProxy;

@Mod(modid = FirstForgeMod.MODID, name = FirstForgeMod.NAME, version = FirstForgeMod.VERSION)
public class FirstForgeMod
{
    public static final String MODID = "firstforgemod";
    public static final String NAME = "FirstForgeMod";
    public static final String VERSION = "@VERSION@";
    public static final String MC_VERSION = "[1.12.2]";

    public static final String CLIENT = "com.harlekintiger.forgeModding1.proxy.ClientProxy";
    public static final String SERVER = "com.harlekintiger.forgeModding1.proxy.ServerProxy";

    public static final CreativeTabs TUTORIAL_TAB = new TutorialTab("tabFirstForgeMod");

    @SidedProxy(clientSide = FirstForgeMod.CLIENT, serverSide = FirstForgeMod.SERVER)
    public static IProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
