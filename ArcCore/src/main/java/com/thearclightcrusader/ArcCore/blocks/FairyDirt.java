package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyDirt extends Block{

	public FairyDirt(Material ground) {
		super(Material.ground);
		this.setBlockTextureName(References.MODID + ":FairyDirt");
		this.setHardness(.5F);
	}

}
