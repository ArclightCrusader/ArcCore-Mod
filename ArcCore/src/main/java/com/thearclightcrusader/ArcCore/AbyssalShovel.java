package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class AbyssalShovel extends ItemSpade {

	public AbyssalShovel(ToolMaterial AbyssalTool) {
		super(AbyssalTool);
		this.setUnlocalizedName("AbyssalShovel");
		this.setTextureName(References.MODID + ":AbyssalShovel");
	}

}
