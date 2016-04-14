package com.thearclightcrusader.ArcCore.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock{
	
	public ItemLogBlocks(Block block) {
		super(block);
		this.setHasSubtypes(false);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if(i < 0 || i >= 1) {
			i = 0;
		}
		
		return super.getUnlocalizedName() + "." + "bacon";
	}
	
	public int getMetadata (int meta) {
		return meta;
	}

}
