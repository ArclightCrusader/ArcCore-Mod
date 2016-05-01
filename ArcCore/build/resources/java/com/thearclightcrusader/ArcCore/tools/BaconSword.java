package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class BaconSword extends ItemSword {

	public BaconSword(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconSword");
		this.setTextureName(References.MODID + ":BaconSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
