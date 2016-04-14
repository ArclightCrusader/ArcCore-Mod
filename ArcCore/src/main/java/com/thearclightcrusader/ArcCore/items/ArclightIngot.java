package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ArclightIngot extends Item {

	public ArclightIngot() {
		this.setTextureName(References.MODID + ":ArclightIngot");
		this.setUnlocalizedName("Arclight Ingot");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
