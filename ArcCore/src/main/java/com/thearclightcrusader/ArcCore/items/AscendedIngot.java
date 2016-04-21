package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class AscendedIngot extends Item {
	
	public AscendedIngot(){
		this.setCreativeTab(Main.arcCoreTab);
		this.setTextureName(References.MODID + ":AscendedIngot");
		this.setUnlocalizedName("AscendedIngot");	
		}

}
