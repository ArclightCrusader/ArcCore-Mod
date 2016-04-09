package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorNihil extends ItemArmor{

	public ArmorNihil(int i, ArmorMaterial ArmorNihil, int j, int k, String string) {
		super(ArmorNihil, k, k);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.arclightHelm || stack.getItem() == Main.arclightChest || stack.getItem() == Main.arclightBoots){
        	return References.MODID + ":textures/armor/nihilArmor1.png";
        }else if(stack.getItem() == Main.arclightLegs){
        	return References.MODID + ":textures/armor/nihilArmor2.png";
        }else{
        	return null;
        }
    }

}
