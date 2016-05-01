package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GildedStoneBricks extends Block {

	public GildedStoneBricks(Material rock) {
		super(Material.rock);
		this.setHardness(1.7F);
		this.setResistance(3.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(References.MODID + ":GildedStoneBricks");
		
	}

}
