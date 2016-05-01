package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class NihilPick extends ItemPickaxe {

	public NihilPick(ToolMaterial NihilTool) {
		super(NihilTool);
		this.setUnlocalizedName("NihilPick");
		this.setTextureName(References.MODID + ":FutilePick");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
