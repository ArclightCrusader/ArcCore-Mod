package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class BaconAxe extends ItemAxe {

	public BaconAxe(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconAxe");
		this.setTextureName(References.MODID + ":BaconAxe");
	}

}
