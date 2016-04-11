package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ArclightSword extends ItemSword {

	public ArclightSword(ToolMaterial ArclightTool) {
		super(ArclightTool);
		this.setUnlocalizedName("ArclightSword");
		this.setTextureName(References.MODID + ":ArclightSword");
	}

}
