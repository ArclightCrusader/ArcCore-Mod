package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

public class ItemSapphireStoneSlab extends ItemSlab{

	public ItemSapphireStoneSlab(Block block) {
		super(block, Main.uSapphireStoneSlab, Main.uSapphireStoneSlabDouble, block == Main.uSapphireStoneSlabDouble);
		    this.setUnlocalizedName("USapphireStoneSlab");

	}
}
