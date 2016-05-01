package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class AscendedAxe extends ItemAxe {

	public AscendedAxe(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedAxe");
		this.setTextureName(References.MODID + ":AscendedAxe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
