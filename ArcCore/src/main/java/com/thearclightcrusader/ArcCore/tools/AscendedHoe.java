package com.thearclightcrusader.ArcCore.tools;

import net.minecraft.item.Item.ToolMaterial;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.ItemHoe;

public class AscendedHoe extends ItemHoe {

	public AscendedHoe(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedHoe");
		this.setTextureName(References.MODID + ":AscendedHoe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
