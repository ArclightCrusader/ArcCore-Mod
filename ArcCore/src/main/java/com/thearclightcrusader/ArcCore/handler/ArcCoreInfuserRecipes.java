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
		
		if(item == Items.quartz && item2 == Items.redstone && item3 == Items.redstone || item2 == Items.redstone && item == Items.redstone && item3 == Items.quartz || item2 == Items.redstone && item3 == Items.quartz && item == Items.redstone || item == Items.quartz && item2 == new ItemStack(Items.redstone, 2).getItem()|| item == Items.quartz && item3 == new ItemStack(Items.redstone, 2).getItem()|| item2 == Items.quartz && item3 == new ItemStack(Items.redstone, 2).getItem() || item2 == Items.quartz && item == new ItemStack(Items.redstone, 2).getItem() || item3 == Items.quartz && item == new ItemStack(Items.redstone, 2).getItem() || item3 == Items.quartz && item2 == new ItemStack(Items.redstone, 2).getItem()) {
			return new ItemStack(Main.infusedQuartz);
		}
		
		//Stone + ingot = ore
		if(item == Item.getItemFromBlock(Blocks.stone) && item2 == Items.iron_ingot || item2 == Item.getItemFromBlock(Blocks.stone) && item == Items.iron_ingot || item3 == Item.getItemFromBlock(Blocks.stone) && item2 == Items.iron_ingot || item2 == Item.getItemFromBlock(Blocks.stone) && item3 == Items.iron_ingot || item == Item.getItemFromBlock(Blocks.stone) && item3 == Items.iron_ingot || item3 == Item.getItemFromBlock(Blocks.stone) && item == Items.iron_ingot ){
			return new ItemStack(Blocks.iron_ore);
		}
		
		if(item == Item.getItemFromBlock(Blocks.stone) && item2 == Items.gold_ingot || item2 == Item.getItemFromBlock(Blocks.stone) && item == Items.gold_ingot || item3 == Item.getItemFromBlock(Blocks.stone) && item2 == Items.gold_ingot || item2 == Item.getItemFromBlock(Blocks.stone) && item3 == Items.gold_ingot || item == Item.getItemFromBlock(Blocks.stone) && item3 == Items.gold_ingot || item3 == Item.getItemFromBlock(Blocks.stone) && item == Items.gold_ingot ){
			return new ItemStack(Blocks.gold_ore);
		}
		
		if(item == Item.getItemFromBlock(Blocks.stone) && item2 == Items.emerald || item2 == Item.getItemFromBlock(Blocks.stone) && item == Items.emerald || item3 == Item.getItemFromBlock(Blocks.stone) && item2 == Items.emerald || item2 == Item.getItemFromBlock(Blocks.stone) && item3 == Items.emerald || item == Item.getItemFromBlock(Blocks.stone) && item3 == Items.emerald || item3 == Item.getItemFromBlock(Blocks.stone) && item == Items.emerald){
			return new ItemStack(Blocks.emerald_ore);
		}
		
		if(item == Item.getItemFromBlock(Blocks.stone) && item2 == new ItemStack(Items.coal, 4).getItem() || item2 == Item.getItemFromBlock(Blocks.stone) && item == new ItemStack(Items.coal, 4).getItem() || item3 == Item.getItemFromBlock(Blocks.stone) && item2 == new ItemStack(Items.coal, 4).getItem() || item2 == Item.getItemFromBlock(Blocks.stone) && item3 == new ItemStack(Items.coal, 4).getItem() || item == Item.getItemFromBlock(Blocks.stone) && item3 == new ItemStack(Items.coal, 4).getItem() || item3 == Item.getItemFromBlock(Blocks.stone) && item == new ItemStack(Items.coal, 4).getItem()){
			return new ItemStack(Blocks.coal_ore);
		}
		
		if(item == Item.getItemFromBlock(Blocks.stone) && item2 == new ItemStack(Items.diamond, 3).getItem() || item2 == Item.getItemFromBlock(Blocks.stone) && item == new ItemStack(Items.diamond, 3).getItem() || item3 == Item.getItemFromBlock(Blocks.stone) && item2 == new ItemStack(Items.diamond, 3).getItem() || item2 == Item.getItemFromBlock(Blocks.stone) && item3 == new ItemStack(Items.diamond, 3).getItem() || item == Item.getItemFromBlock(Blocks.stone) && item3 == new ItemStack(Items.diamond, 3).getItem() || item3 == Item.getItemFromBlock(Blocks.stone) && item == new ItemStack(Items.diamond, 3).getItem()){
			return new ItemStack(Blocks.diamond_ore);
		}
		
		if(item == Item.getItemFromBlock(Blocks.netherrack) && item2 == new ItemStack(Items.quartz, 4).getItem() || item2 == Item.getItemFromBlock(Blocks.netherrack) && item == new ItemStack(Items.quartz, 4).getItem() || item3 == Item.getItemFromBlock(Blocks.netherrack) && item2 == new ItemStack(Items.quartz, 4).getItem() || item2 == Item.getItemFromBlock(Blocks.netherrack) && item3 == new ItemStack(Items.quartz, 4).getItem() || item == Item.getItemFromBlock(Blocks.netherrack) && item3 == new ItemStack(Items.quartz, 4).getItem() || item3 == Item.getItemFromBlock(Blocks.netherrack) && item == new ItemStack(Items.quartz, 4).getItem()){
			return new ItemStack(Blocks.quartz_ore);
		}
		
		//Chocolate cake
		if(item == Item.getItemFromBlock(Blocks.cake) && item2 == Item.getItemFromBlock(Blocks.cocoa) || item2 == Item.getItemFromBlock(Blocks.cake) && item == Item.getItemFromBlock(Blocks.cocoa)  || item3 == Item.getItemFromBlock(Blocks.cake) && item2 == Item.getItemFromBlock(Blocks.cocoa)  || item2 == Item.getItemFromBlock(Blocks.cake) && item3 == Item.getItemFromBlock(Blocks.cocoa)  || item == Item.getItemFromBlock(Blocks.cake) && item3 == Item.getItemFromBlock(Blocks.cocoa)  || item3 == Item.getItemFromBlock(Blocks.cake) && item == Item.getItemFromBlock(Blocks.cocoa)){
			return new ItemStack(Main.chocoCake);
		}
		//Soda
		//TODO Potion Recipes
		//Grass
		
		return null;
	}

}
