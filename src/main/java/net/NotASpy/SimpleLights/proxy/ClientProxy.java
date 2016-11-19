package net.NotASpy.SimpleLights.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation ("net.NotASpy.SimpleLights:solarglow", "inventory");
		final int DEFAULT_ITEM_SUBTYPE = 0;
		ModelLoader.setCustomModelResourceLocation(CommonProxy.itemSolarGlow, DEFAULT_ITEM_SUBTYPE, itemModelResourceLocation);
	}
}
