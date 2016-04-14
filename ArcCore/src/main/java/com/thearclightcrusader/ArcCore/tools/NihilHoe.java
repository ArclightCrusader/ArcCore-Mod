package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class NihilHoe extends ItemHoe {

	public NihilHoe(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilHoe");
		this.setTextureName(References.MODID + ":NihilHoe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
