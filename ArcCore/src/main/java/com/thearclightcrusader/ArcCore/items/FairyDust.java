package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class FairyDust extends Item {
	
	public FairyDust(){
		this.setCreativeTab(Main.arcCoreTab);
		this.setTextureName(References.MODID + ":FairyDust");
		this.setUnlocalizedName("FairyDust");
	}
}
