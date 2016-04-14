package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Bacon extends ItemFood {

	public Bacon(int j, boolean b) {
		super(j, b);
		this.setTextureName(References.MODID + ":RawBacon.png");
		this.setUnlocalizedName("Raw Bacon");
		this.setCreativeTab(Main.arcCoreTab);

	}

}
