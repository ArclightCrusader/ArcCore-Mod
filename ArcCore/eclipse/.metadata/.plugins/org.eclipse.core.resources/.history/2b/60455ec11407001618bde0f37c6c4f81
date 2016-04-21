package com.thearclightcrusader.ArcCore.handler;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == Main.calciumAcetate) return 300;
		if(fuel.getItem() == Main.fuelGel) return 1900;
		if(fuel.getItem() == Main.survivalistFuelGel) return 2100;
		if(fuel.getItem() == Main.organicFuelGel) return 800;
		
		return 0;
	}

}
