package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorArclight extends ItemArmor{

	public ArmorArclight(ArmorMaterial Arclight, int j, int k, String string) {
		super(Arclight, j, k);
		
		if (k == 0) {
		    this.setTextureName(References.MODID + ":arclight_helmet");
	}
		else if (k == 1) {
			this.setTextureName(References.MODID + ":arclight_chestplate");
	}
		else if (k == 2) {
				this.setTextureName(References.MODID + ":arclight_leggings");
	}
		else if (k == 3) {
				this.setTextureName(References.MODID + ":arclight_boots");
		}
			
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.arclightHelm || stack.getItem() == Main.arclightChest || stack.getItem() == Main.arclightBoots){
        	return References.MODID + ":textures/armor/arclightArmor1.png";
        }else if(stack.getItem() == Main.arclightLegs){
        	return References.MODID + ":textures/armor/arclightArmor2.png";
        }else{
        	return null;
        }
    }

}
