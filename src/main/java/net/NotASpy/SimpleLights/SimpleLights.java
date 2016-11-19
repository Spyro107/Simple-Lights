package net.NotASpy.SimpleLights;


import mcjty.lib.block.CompatItem;
import net.NotASpy.SimpleLights.proxy.CommonProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SimpleLights.MODID, name = SimpleLights.MODNAME, version = SimpleLights.VERSION, dependencies = "required-after:Forge@[12.18.2.2097,)", useMetadata = true)
public class SimpleLights {

    public static final String MODID = "SimpleLights";
    public static final String MODNAME = "Simple Lights";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "net.NotASpy.SimpleLights.proxy.ClientProxy", serverSide = "net.NotASpy.SimpleLights.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static SimpleLights instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
