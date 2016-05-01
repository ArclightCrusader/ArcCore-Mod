package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GildedGrass extends Block {

	public GildedGrass(Material grass) {
		super(Material.grass);
		this.setHardness(0.75F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeGrass);
		this.setCreativeTab(Main.arcCoreTab);
		this.setBlockTextureName(References.MODID + ":GildedGrass");
		
	}

}
