package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PalladiumPick extends ItemPickaxe {

	public PalladiumPick(ToolMaterial palladiumTool) {
		super(palladiumTool);
		this.setUnlocalizedName("PalladiumPick");
		this.setTextureName(References.MODID + ":PalladiumPick");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
