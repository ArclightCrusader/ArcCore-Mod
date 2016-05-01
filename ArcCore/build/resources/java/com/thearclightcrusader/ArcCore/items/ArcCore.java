package com.thearclightcrusader.ArcCore.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

public class ArcCore extends Item {

	public ArcCore() {
		this.setTextureName(References.MODID + ":ArcCore");
		this.setUnlocalizedName("Arc Core");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
