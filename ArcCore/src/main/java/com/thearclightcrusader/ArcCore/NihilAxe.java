package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class NihilAxe extends ItemAxe {

	public NihilAxe(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilAxe");
		this.setTextureName(References.MODID + ":NihilAxe");
	}

}
