package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BaconPick extends ItemPickaxe {

	public BaconPick(ToolMaterial BaconTool) {
		super(BaconTool);
		this.setUnlocalizedName("BaconPick");
		this.setTextureName(References.MODID + ":BaconPick");
	}

}
