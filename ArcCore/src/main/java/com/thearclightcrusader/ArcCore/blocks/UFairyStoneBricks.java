package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UFairyStoneBricks extends Block{

	public UFairyStoneBricks(Material rock) {
		super(Material.rock);
		this.setHardness(-1F);
		this.setResistance(9999);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(References.MODID + ":FairyStoneBricks");
		
	}

}
