package com.thearclightcrusader.ArcCore.items;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class BaconBeer extends ItemFood {

	public BaconBeer(int j, boolean b) {
		super(j, b);
		this.setTextureName(References.MODID + ":BaconBeer");
		this.setUnlocalizedName("Bacon Beer");
		this.setCreativeTab(Main.arcCoreTab);
		this.setPotionEffect(6, 1, 1, 1f);
	}

}
