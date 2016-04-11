package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class AscendedAxe extends ItemAxe {

	public AscendedAxe(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedPick");
		this.setTextureName(References.MODID + ":AscendedPick");
	}

}
