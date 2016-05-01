package com.thearclightcrusader.ArcCore.armor;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorNihil extends ItemArmor{

	public ArmorNihil(ArmorMaterial ArmorNihil, int j, int k, String string) {
		super(ArmorNihil, k, k);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == Main.nihilHelm || stack.getItem() == Main.nihilChest || stack.getItem() == Main.nihilBoots){
        	return References.MODID + ":textures/armor/futile_layer_1.png";
        }else if(stack.getItem() == Main.nihilLegs){
        	return References.MODID + ":textures/armor/futile_layer_2.png";
        }else{
        	return null;
        }
    }

}
