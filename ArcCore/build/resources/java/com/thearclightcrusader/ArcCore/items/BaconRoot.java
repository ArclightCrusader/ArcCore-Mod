package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaconRoot extends Item {

	public BaconRoot() {
		this.setTextureName(References.MODID + ":BaconRoot");
		this.setUnlocalizedName("Bacon Root");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
