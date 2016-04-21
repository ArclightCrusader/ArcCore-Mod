package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class MoissaniteHoe extends ItemHoe {

	public MoissaniteHoe(ToolMaterial moissaniteTool) {
		super(moissaniteTool);
		this.setUnlocalizedName("MoissaniteHoe");
		this.setTextureName(References.MODID + ":MoissaniteHoe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
