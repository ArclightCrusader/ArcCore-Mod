package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class UFairyStoneStairs extends BlockStairs{

	private int blockNumber;
	
	public UFairyStoneStairs(Block block, int i, int j) {
		super(block , i);
		
		blockNumber = j;
		
		this.setHardness(-1);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setResistance(9999);
		
		
	}
	
	  @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int side, int meta)
	    {
		  if(this.blockNumber == 1){
			  return Main.uFairyStoneBricks.getIcon(side, 1);
		  
		  }else if(this.blockNumber == 2){
			  return Main.uEmeraldStoneBricks.getIcon(side, 1);
			  
		  }else if(this.blockNumber == 3){
			  return Main.uGildedStoneBricks.getIcon(side, 1); 
	
		  }else if(this.blockNumber == 4){
			  return Main.uSapphireStoneBricks.getIcon(side, 1);
			  
		  }else if(this.blockNumber == 5){
			   return Main.uPlatinumStoneBricks.getIcon(side, 1);
			   
		  }else if(this.blockNumber == 6){
			  return Main.uWhiteStoneBricks.getIcon(side, 1);
			  
		  }else if(this.blockNumber == 7){
			  return Main.uBlackStoneBricks.getIcon(side, 1);
			  
		  }else{
			  
			  return null;
		  }
		 
	        
	    }

}
