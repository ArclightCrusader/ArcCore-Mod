package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyRitualStone extends Block {

	public FairyRitualStone(Material material) {
		super(Material.rock);
		this.setBlockTextureName(References.MODID + ":FairyRitualStone");
		this.setBlockName("FairyRitualStone");
		this.setHardness(1.2F);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(70F);
	}

}
