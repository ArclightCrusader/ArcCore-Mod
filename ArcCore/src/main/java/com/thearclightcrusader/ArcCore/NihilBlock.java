package com.thearclightcrusader.ArcCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NihilBlock extends Block {

	protected NihilBlock(int i, Material rock) {
		super(rock);
		this.setResistance(20);
		this.setLightLevel(-1);
	}

}
