package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GildedPlanks extends Block {

	public GildedPlanks(Material wood) {
		super(Material.wood);
		this.setHardness(1.1F);
		this.setResistance(1.7F);
		this.setStepSound(soundTypeWood);
		this.setCreativeTab(Main.arcCoreTab);
		this.setBlockTextureName(References.MODID + ":GildedPlanks");
		
	}

}
