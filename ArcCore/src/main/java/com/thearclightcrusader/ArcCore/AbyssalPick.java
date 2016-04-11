package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class AbyssalPick extends ItemPickaxe {

	public AbyssalPick(ToolMaterial AbyssalTool) {
		super(AbyssalTool);
		this.setUnlocalizedName("AbyssalPick");
		this.setTextureName(References.MODID + ":AbyssalPick");
	}

}
