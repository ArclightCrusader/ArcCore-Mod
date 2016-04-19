package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class CalciumAcetate extends Item {
	
	public CalciumAcetate(){
		this.setTextureName(References.MODID + ":" + "CalciumAcetate");
		this.setUnlocalizedName("CalciumAcetate");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
