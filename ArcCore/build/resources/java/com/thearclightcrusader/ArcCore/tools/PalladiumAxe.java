package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class PalladiumAxe extends ItemAxe {

	public PalladiumAxe(ToolMaterial palladiumTool) {
		super(palladiumTool);
		this.setUnlocalizedName("PalladiumAxe");
		this.setTextureName(References.MODID + ":PalladiumAxe");
		this.setCreativeTab(Main.arcCoreTab);
	}


}
