package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class MoissaniteSword extends ItemSword {

	public MoissaniteSword(ToolMaterial moissaniteTool) {
		super(moissaniteTool);
		this.setUnlocalizedName("MoissaniteSword");
		this.setTextureName(References.MODID + ":MoissaniteSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
