package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class MoissaniteShovel extends ItemSpade {

	public MoissaniteShovel(ToolMaterial moissaniteTool) {
		super(moissaniteTool);
		this.setUnlocalizedName("MoissaniteShovel");
		this.setTextureName(References.MODID + ":MoissaniteShovel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
