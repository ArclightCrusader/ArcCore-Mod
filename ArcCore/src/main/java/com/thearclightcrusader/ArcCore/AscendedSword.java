package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class AscendedSword extends ItemSword {

	public AscendedSword(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedSword");
		this.setTextureName(References.MODID + ":AscendedSword");
	}

}
