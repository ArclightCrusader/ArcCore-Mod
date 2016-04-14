package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class NihilShovel extends ItemSpade {

	public NihilShovel(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilShovel");
		this.setTextureName(References.MODID + ":NihilShovel");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
