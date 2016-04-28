package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyPlanks extends Block{

	public FairyPlanks(Material material) {
		super(Material.wood);
		this.setBlockTextureName(References.MODID + ":FairyPlanks");
		this.setHardness(0.75F);
	}

}
