package com.thearclightcrusader.ArcCore.armor;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorAscended extends ItemArmor{

	public ArmorAscended(ArmorMaterial ArmorAscended, int j, int k, String string) {
		super(ArmorAscended, k, k);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.ascendedHelm || stack.getItem() == Main.ascendedChest || stack.getItem() == Main.ascendedBoots){
        	return References.MODID + ":textures/armor/ascended_layer_1.png";
        }else if(stack.getItem() == Main.ascendedLegs){
        	return References.MODID + ":textures/armor/ascended_layer_2.png";
        }else{
        	return null;
        }
    }

}
