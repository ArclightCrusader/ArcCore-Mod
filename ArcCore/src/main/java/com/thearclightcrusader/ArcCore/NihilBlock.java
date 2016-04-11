package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NihilBlock extends Block {

	protected NihilBlock(int i, Material rock) {
		super(rock);
		this.setBlockName("NihilBlock");
		this.setBlockTextureName(References.MODID + ":NihilBlock");
		this.setResistance(20);
		this.setLightLevel(-1);
	}

}
