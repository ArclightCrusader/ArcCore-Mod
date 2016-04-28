package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemGildedStoneSlab extends ItemSlab{

	public ItemGildedStoneSlab(Block block) {
		super(block, Main.uGildedStoneSlab, Main.uGildedStoneSlabDouble, block == Main.uGildedStoneSlabDouble);
		this.setUnlocalizedName("UGildedStoneSlab");
	}


	}

