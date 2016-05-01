package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;

public class PrototypeCore extends Item {

	public PrototypeCore() {
		this.setTextureName(References.MODID + ":PrototypeCore");
		this.setUnlocalizedName("protoArcCore");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
