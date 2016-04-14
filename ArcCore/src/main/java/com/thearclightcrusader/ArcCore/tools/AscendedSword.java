package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class AscendedSword extends ItemSword {

	public AscendedSword(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedSword");
		this.setTextureName(References.MODID + ":AscendedSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
