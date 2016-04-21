package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class Moissanite extends Item {
	
	public Moissanite(){
		this.setTextureName(References.MODID + ":Moissanite");
		this.setUnlocalizedName("Moissanite");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
