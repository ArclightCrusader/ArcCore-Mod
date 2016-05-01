package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class NihilAxe extends ItemAxe {

	public NihilAxe(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilAxe");
		this.setTextureName(References.MODID + ":FutileAxe");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
