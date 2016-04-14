package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class ArcDiamond extends Item {

	public ArcDiamond() {
		this.setUnlocalizedName("ArcDiamond");
		this.setTextureName(References.MODID + ":ArcDiamond");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
