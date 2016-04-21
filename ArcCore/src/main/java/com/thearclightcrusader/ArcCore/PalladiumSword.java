package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class PalladiumSword extends ItemSword {

	public PalladiumSword(ToolMaterial palladiumTool) {
		super(palladiumTool);
		this.setUnlocalizedName("PalladiumSword");
		this.setTextureName(References.MODID + ":PalladiumSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
