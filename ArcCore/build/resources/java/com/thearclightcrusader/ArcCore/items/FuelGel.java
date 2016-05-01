package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class FuelGel extends Item {

	public FuelGel(){
		this.setTextureName(References.MODID + ":" + "FuelGel");
		this.setUnlocalizedName("FuelGel");
		this.setCreativeTab(Main.arcCoreTab);
	}


}
