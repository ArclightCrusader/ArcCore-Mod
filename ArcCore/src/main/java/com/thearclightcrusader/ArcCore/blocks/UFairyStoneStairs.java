package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class UFairyStoneStairs extends BlockStairs{

	public UFairyStoneStairs(Block block, int i) {
		super(block , i);
		this.setHardness(-1);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setResistance(9999);
		
	}
	
	  @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        return Main.uFairyStoneBricks.getIcon(p_149691_1_, 1);
	    }

}
