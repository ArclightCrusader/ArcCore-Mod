package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemBlackStoneSlab extends ItemSlab{
	
	public ItemBlackStoneSlab(Block block) {
		super(block, Main.uBlackStoneSlab, Main.uBlackStoneSlabDouble, block == Main.uBlackStoneSlabDouble);
		    this.setUnlocalizedName("UBlackStoneSlab");

	}

}
