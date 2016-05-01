package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EmeraldBacon extends Item {

	public EmeraldBacon() {
		this.setTextureName(References.MODID + ":EmeraldBacon");
		this.setUnlocalizedName("Emerald Encrusted Bacon");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
