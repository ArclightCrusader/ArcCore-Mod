package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ArclightShovel extends ItemSpade {

	public ArclightShovel(ToolMaterial ArclightTool) {
		super(ArclightTool);
		this.setUnlocalizedName("ArclightShovel");
		this.setTextureName(References.MODID + ":ArclightShovel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
