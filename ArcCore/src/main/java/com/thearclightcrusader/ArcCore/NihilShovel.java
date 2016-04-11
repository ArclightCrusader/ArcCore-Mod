package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class NihilShovel extends ItemSpade {

	public NihilShovel(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilShovel");
		this.setTextureName(References.MODID + ":NihilShovel");
	}

}
