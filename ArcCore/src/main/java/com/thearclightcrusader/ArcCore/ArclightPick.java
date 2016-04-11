package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ArclightPick extends ItemPickaxe {

	public ArclightPick(ToolMaterial ArclightTool) {
		super(ArclightTool);
		this.setUnlocalizedName("ArclightPick");
		this.setTextureName(References.MODID + ":ArclightPick");
	}

}
