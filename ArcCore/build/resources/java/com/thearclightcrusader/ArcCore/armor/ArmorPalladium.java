package com.thearclightcrusader.ArcCore.armor;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorPalladium extends ItemArmor{

	public ArmorPalladium(ArmorMaterial armorPalladium, int j, int k, String string) {
		super(armorPalladium, k, k);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.palladiumHelm || stack.getItem() == Main.palladiumChest || stack.getItem() == Main.palladiumBoots){
        	return References.MODID + ":textures/armor/palladium_layer_1.png";
        }else if(stack.getItem() == Main.palladiumLegs){
        	return References.MODID + ":textures/armor/palladium_layer_2.png";
        }else{
        	return null;
        }
    }


}
