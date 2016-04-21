package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AscendedOre extends Block{

	public AscendedOre(Material rock) {
		super(Material.rock);
		this.setHardness(3.0F);
		this.setResistance(9.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 4);
		this.setBlockTextureName(References.MODID + ":AscendedOre");
		
	}

}
