package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemFairyStoneSlab extends ItemSlab{
	

	public ItemFairyStoneSlab(Block block) {
		super(block, Main.uFairyStoneSlab, Main.uFairyStoneSlabDouble, block == Main.uFairyStoneSlabDouble);
		    this.setUnlocalizedName("UFairyStoneSlab");

	}


	}

