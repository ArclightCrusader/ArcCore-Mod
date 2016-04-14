package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class AscendedShovel extends ItemSpade {

	public AscendedShovel(ToolMaterial AscendedTool) {
		super(AscendedTool);
		this.setUnlocalizedName("AscendedShovel");
		this.setTextureName(References.MODID + ":AscendedShovel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
