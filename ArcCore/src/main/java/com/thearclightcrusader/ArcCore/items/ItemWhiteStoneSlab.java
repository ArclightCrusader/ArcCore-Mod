package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemWhiteStoneSlab extends ItemSlab{

	public ItemWhiteStoneSlab(Block block) {
		super(block, Main.uWhiteStoneSlab, Main.uWhiteStoneSlabDouble, block == Main.uWhiteStoneSlabDouble);
		    this.setUnlocalizedName("UWhiteStoneSlab");

	}
}
