package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class MoissaniteAxe extends ItemAxe {

	public MoissaniteAxe(ToolMaterial moissaniteTool) {
		super(moissaniteTool);
		this.setUnlocalizedName("MoissaniteAxe");
		this.setTextureName(References.MODID + ":MoissaniteAxe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
