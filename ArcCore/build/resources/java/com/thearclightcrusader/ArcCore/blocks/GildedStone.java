package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GildedStone extends Block {

	public GildedStone(Material rock) {
		super(Material.rock);
		this.setHardness(1.5F);
		this.setResistance(2.5F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(References.MODID + ":GildedStone");
		
	}

}
