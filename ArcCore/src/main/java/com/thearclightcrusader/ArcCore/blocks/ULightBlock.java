package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ULightBlock extends Block {

	private int blockMeta;
	
	public ULightBlock(Material glass, int meta) {
		super(Material.glass);
		
		blockMeta = meta;
		
		this.setHardness(-1F);
		this.setResistance(999F);
		this.setBlockName(meta == 0 ? "LightBlockPink" : "LightBlockGold");
		this.setLightLevel(1F);
		this.setBlockTextureName(meta == 0 ? References.MODID + ":LightBlockPink" : References.MODID + ":LightBlockGold");
		this.setCreativeTab(Main.arcCoreTab);
	}
	
}
