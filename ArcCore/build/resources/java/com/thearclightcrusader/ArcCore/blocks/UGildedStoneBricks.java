package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UGildedStoneBricks extends Block {

	public UGildedStoneBricks(Material rock) {
		super(Material.rock);
		this.setHardness(-1F);
		this.setResistance(999F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setBlockTextureName(References.MODID + ":GildedStoneBricks");
		
	}

}
