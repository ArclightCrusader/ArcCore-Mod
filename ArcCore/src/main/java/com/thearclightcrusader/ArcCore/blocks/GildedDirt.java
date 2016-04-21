package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GildedDirt extends Block {

	public GildedDirt(Material ground) {
		super(Material.ground);
		this.setHardness(0.6F);
		this.setResistance(1.0F);
		this.setStepSound(soundTypeGravel);
		this.setCreativeTab(Main.arcCoreTab);
		this.setBlockTextureName(References.MODID + ":GildedDirt");
		
	}

}
