package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class SurvivalistFuelGel extends Item {
	
	public SurvivalistFuelGel(){
		this.setTextureName(References.MODID + ":" + "SurvivalistFuelGel");
		this.setUnlocalizedName("SurvivalistFuelGel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
