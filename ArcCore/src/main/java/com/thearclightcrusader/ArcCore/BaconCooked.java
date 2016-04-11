package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class BaconCooked extends ItemFood {

	public BaconCooked(int j, boolean b) {
		super(j, b);
		this.setTextureName(References.MODID + ":CookedBacon");
		this.setUnlocalizedName("Cooked Bacon");
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
