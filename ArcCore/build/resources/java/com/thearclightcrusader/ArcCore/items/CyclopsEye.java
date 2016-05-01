package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class CyclopsEye extends Item {

	public CyclopsEye(){
		this.setTextureName(References.MODID + ":CyclopsEye");
		this.setUnlocalizedName("CyclopsEye");
		this.setCreativeTab(Main.arcCoreTab);
	}
}
