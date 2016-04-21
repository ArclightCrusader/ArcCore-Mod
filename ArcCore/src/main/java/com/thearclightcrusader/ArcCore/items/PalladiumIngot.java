package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class PalladiumIngot extends Item {
	
	public PalladiumIngot(){
		this.setCreativeTab(Main.arcCoreTab);
		this.setTextureName(References.MODID + ":PalladiumIngot");
		this.setUnlocalizedName("PalladiumIngot");
	}

}
