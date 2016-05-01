package com.thearclightcrusader.ArcCore.tools;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class AbyssalSword extends ItemSword {

	public AbyssalSword(ToolMaterial AbyssalTool) {
		super(AbyssalTool);
		this.setUnlocalizedName("AbyssalSword");
		this.setTextureName(References.MODID + ":AbyssalSword");
		this.setCreativeTab(Main.arcCoreTab);
	}

}
