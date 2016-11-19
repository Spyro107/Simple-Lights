package net.NotASpy.SimpleLights;

import mcjty.lib.block.CompatBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;
import mcjty.lib.block.CompatItem;

public class SolarGlow extends CompatBlock {
	public SolarGlow() {
		super(material.GLASS);
		setUnlocalizedName(SimpleLights.MODID + ".solarglow");
		setBlockName(unlocalized);
		setBlockTextureName(unlocalized);
		setRegistryName("solarglow");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
		if (world.canBlockSeeTheSky(x,y,z)) {
			setLightValue(1.0F);
		}
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT_MIPPED;
	}

	@Override
	public boolean isOpaqueCube(IBlockState iBlockState) {
		return false;
	}

}
