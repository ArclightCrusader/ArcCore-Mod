package com.thearclightcrusader.ArcCore.blocks;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MoissaniteOre extends Block{

	public MoissaniteOre(Material rock) {
		super(Material.rock);
		this.setHardness(3.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setBlockTextureName(References.MODID + ":MoissaniteOre");
		this.setHarvestLevel("pickaxe", 2);
		
	}
	
	public Item getItemDropped(int i, Random random, int j){
		return Main.moissanite;
	}

}
