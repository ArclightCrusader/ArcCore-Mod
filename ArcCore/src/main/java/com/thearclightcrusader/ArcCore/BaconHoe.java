package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class BaconHoe extends ItemHoe {

	public BaconHoe(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconHoe");
		this.setTextureName(References.MODID + ":BaconHoe");
	}

}
