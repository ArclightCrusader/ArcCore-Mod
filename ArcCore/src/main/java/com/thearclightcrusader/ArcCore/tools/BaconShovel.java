package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class BaconShovel extends ItemSpade {

	public BaconShovel(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconShovel");
		this.setTextureName(References.MODID + ":BaconShovel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
