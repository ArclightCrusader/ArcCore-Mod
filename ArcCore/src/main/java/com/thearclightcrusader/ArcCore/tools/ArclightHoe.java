package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ArclightHoe extends ItemHoe {

	public ArclightHoe(ToolMaterial ArclightTool) {
		super(ArclightTool);
		this.setUnlocalizedName("ArclightHoe");
		this.setTextureName(References.MODID + ":ArclightHoe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
