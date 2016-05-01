package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class InfusedQuartz extends Item {
	
	public InfusedQuartz(){
		this.setTextureName(References.MODID + ":InfusedQuartz");
		this.setUnlocalizedName("InfusedQuartz");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
