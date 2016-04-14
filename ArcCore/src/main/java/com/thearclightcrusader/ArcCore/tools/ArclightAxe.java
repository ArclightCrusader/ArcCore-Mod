package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ArclightAxe extends ItemAxe {

	public ArclightAxe(ToolMaterial ArclightTool) {
		super(ArclightTool);
		this.setUnlocalizedName("ArclightAxe");
		this.setTextureName(References.MODID + ":ArclightAxe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
