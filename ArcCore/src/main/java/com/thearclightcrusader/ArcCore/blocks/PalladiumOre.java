package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PalladiumOre extends Block {

	public PalladiumOre(Material material) {
		super(Material.rock);
		this.setHardness(2.5F);
		this.setResistance(7.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName(References.MODID + ":PalladiumOre");
	}
	
}
