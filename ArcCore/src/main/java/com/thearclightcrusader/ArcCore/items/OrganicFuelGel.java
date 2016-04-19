package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class OrganicFuelGel extends Item {

	public OrganicFuelGel(){
		this.setTextureName(References.MODID + ":" + "OrganicFuelGel");
		this.setUnlocalizedName("OrganicFuelGel");
		this.setCreativeTab(Main.arcCoreTab);
	}


}
