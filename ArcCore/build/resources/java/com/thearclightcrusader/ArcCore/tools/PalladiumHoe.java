package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class PalladiumHoe extends ItemHoe {

	public PalladiumHoe(ToolMaterial palladiumTool) {
		super(palladiumTool);
		this.setUnlocalizedName("PalladiumHoe");
		this.setTextureName(References.MODID + ":PalladiumHoe");
		this.setCreativeTab(Main.arcCoreTab);
	}


}
