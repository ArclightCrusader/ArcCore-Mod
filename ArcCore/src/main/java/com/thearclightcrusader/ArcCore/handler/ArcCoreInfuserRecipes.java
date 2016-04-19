package com.thearclightcrusader.ArcCore.handler;

import com.thearclightcrusader.ArcCore.Main;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArcCoreInfuserRecipes {
	
	public ArcCoreInfuserRecipes(){
		
	}
	
	public static ItemStack getInfusingResult(Item item, Item item2, Item item3){
		return getOutput(item, item2, item3);
	}
	
	public static ItemStack getOutput(Item item, Item item2, Item item3){
		//Arc Diamond
		if(item == Items.diamond && item2 == Items.quartz && item3 == Items.redstone || item2 == Items.diamond && item == Items.quartz && item3 == Items.redstone || item2 == Items.diamond && item3 == Items.quartz && item == Items.redstone || item3 == Items.diamond && item == Items.quartz && item2 == Items.redstone || item3 == Items.diamond && item2 == Items.quartz && item == Items.redstone || item == Items.diamond && item3 == Items.quartz && item2 == Items.redstone ) {
			return new ItemStack(Main.arcDiamond);
		}
		//Power Infused Quartz
		//Stone + ingot = ore
		//Chocolate cake
		//Soda
		//Potion Recipes
		//Grass
		return null;
	}

}
