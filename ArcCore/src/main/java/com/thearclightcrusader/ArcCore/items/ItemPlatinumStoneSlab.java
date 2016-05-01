package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemPlatinumStoneSlab extends ItemSlab{

	public ItemPlatinumStoneSlab(Block block) {
		super(block, Main.uPlatinumStoneSlab, Main.uPlatinumStoneSlabDouble, block == Main.uPlatinumStoneSlabDouble);
		    this.setUnlocalizedName("UPlatinumStoneSlab");

	}
}
