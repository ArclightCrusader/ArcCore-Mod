package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorArclight extends ItemArmor{

	public ArmorArclight(int i, ArmorMaterial arclight, int j, int k, String string) {
		super(arclight, k, k);
		
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
