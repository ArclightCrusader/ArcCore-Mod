package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class NihilSword extends ItemSword {

	public NihilSword(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilSword");
		this.setTextureName(References.MODID + ":FutileSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
