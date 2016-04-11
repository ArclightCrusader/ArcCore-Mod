package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class AbyssalAxe extends ItemAxe {

	public AbyssalAxe(ToolMaterial AbyssalTool) {
		super(AbyssalTool);
		this.setUnlocalizedName("AbyssalAxe");
		this.setTextureName(References.MODID + ":AbyssalAxe");
	}

}
