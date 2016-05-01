package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemEmeraldStoneSlab extends ItemSlab{

	public ItemEmeraldStoneSlab(Block block) {
		super(block, Main.uEmeraldStoneSlab, Main.uEmeraldStoneSlabDouble, block == Main.uEmeraldStoneSlabDouble);
		    this.setUnlocalizedName("UFairyStoneSlab");

	}
}
