package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class MoissanitePick extends ItemPickaxe {

	public MoissanitePick(ToolMaterial moissaniteTool) {
		super(moissaniteTool);
		this.setUnlocalizedName("MoissanitePick");
		this.setTextureName(References.MODID + ":MoissanitePick");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
