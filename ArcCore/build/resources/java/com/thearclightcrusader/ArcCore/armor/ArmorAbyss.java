package com.thearclightcrusader.ArcCore.armor;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorAbyss extends ItemArmor{

	public ArmorAbyss(ArmorMaterial ArmorAbyss, int j, int k, String string) {
		super(ArmorAbyss, j, k);
		

		if (k == 0) {
		    this.setTextureName(References.MODID + ":abyssal_helmet");
	}
		else if (k == 1) {
			this.setTextureName(References.MODID + ":abyssal_chestplate");
	}
		else if (k == 2) {
				this.setTextureName(References.MODID + ":abyssal_leggings");
	}
		else if (k == 3) {
				this.setTextureName(References.MODID + ":abyssal_boots");
		}
			
		
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.abyssalHelm || stack.getItem() == Main.abyssalChest || stack.getItem() == Main.abyssalBoots){
        	return References.MODID + ":textures/armor/arclightArmor1.png";
        }else if(stack.getItem() == Main.abyssalLegs){
        	return References.MODID + ":textures/armor/arclightArmor2.png";
        }else{
        	return null;
        }
    }

}
