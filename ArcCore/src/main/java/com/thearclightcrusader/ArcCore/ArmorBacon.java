package com.thearclightcrusader.ArcCore;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorBacon extends ItemArmor{

	public ArmorBacon(ArmorMaterial ArmorBacon, int j, int k, String string) {
		super(ArmorBacon, k, k);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.baconHelm || stack.getItem() == Main.baconChestplate || stack.getItem() == Main.baconBoots){
        	return References.MODID + ":textures/armor/baconArmor1.png";
        }else if(stack.getItem() == Main.baconLegs){
        	return References.MODID + ":textures/armor/baconArmor2.png";
        }else{
        	return null;
        }
    }

}
