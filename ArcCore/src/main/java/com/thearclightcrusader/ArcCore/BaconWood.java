package com.thearclightcrusader.ArcCore;

import java.util.List;

import com.thearclightcrusader.ArcCore.proxy.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BaconWood extends BlockLog {
	
	
	public BaconWood() {
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks (Item item, CreativeTabs tabs, List list){
		for (int i = 0; i < 1; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister){
		this.field_150167_a = new IIcon[1];
		this.field_150166_b = new IIcon[1];
		
		for(int i = 0; i < this.field_150167_a.length; i++){
			this.field_150167_a[i] = iconRegister.registerIcon(References.MODID + ":" + "BaconWood");
			this.field_150166_b[i] = iconRegister.registerIcon(References.MODID + ":" + "BaconWoodTop");

		}
	}

}
