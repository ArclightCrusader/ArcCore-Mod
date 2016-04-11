package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class BaconShovel extends ItemSpade {

	public BaconShovel(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconShovel");
		this.setTextureName(References.MODID + ":BaconShovel");
	}

}
