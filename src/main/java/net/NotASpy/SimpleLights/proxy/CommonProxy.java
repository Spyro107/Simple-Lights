package net.NotASpy.SimpleLights.proxy;

import mcjty.lib.block.CompatBlock;
import mcjty.lib.block.CompatItem;
import net.NotASpy.SimpleLights.SolarGlow;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public static SolarGlow solarGlow;
	public static ItemBlock itemSolarGlow;
	
	public void preInit(FMLPreInitializationEvent e) {
		solarGlow = (SolarGlow)(new SolarGlow().setUnlocalizedName("solarGlow_unlocalized"));
		solarGlow.setRegistryName("solarGlow_registry");
		GameRegistry.register(solarGlow);
		itemSolarGlow = new ItemBlock(solarGlow);
		itemSolarGlow.setRegistryName(solarGlow.getRegistryName());
		GameRegistry.register(itemSolarGlow);
		GameRegistry.addShapelessRecipe(new ItemStack(solarGlow, 1), 
    	CompatItem.redstone, CompatBlock.glass, CompatItem.glowstone_dust);
	}
	
	public void init (FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}
