package com.thearclightcrusader.ArcCore.armor;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorMoissanite extends ItemArmor{

	public ArmorMoissanite(ArmorMaterial armorMoissanite, int j, int k, String string) {
		super(armorMoissanite, k, k);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.moissaniteHelm || stack.getItem() == Main.moissaniteChest || stack.getItem() == Main.moissaniteBoots){
        	return References.MODID + ":textures/armor/moissanite_layer_1.png";
        }else if(stack.getItem() == Main.moissaniteLegs){
        	return References.MODID + ":textures/armor/moissanite_layer_2.png";
        }else{
        	return null;
        }
    }


}
