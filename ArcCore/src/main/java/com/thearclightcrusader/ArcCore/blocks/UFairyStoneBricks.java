package com.thearclightcrusader.ArcCore.blocks;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class UFairyStoneBricks extends Block{

	private int blockNumber;
	
	public UFairyStoneBricks(Material rock , int i) {
		super(Material.rock);
		
		blockNumber = i;
		
		this.setHardness(-1F);
		this.setResistance(9999);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(Main.arcCoreTab);
		this.setHarvestLevel("pickaxe", 0);
	
		if (blockNumber == 1){
			this.setBlockTextureName(References.MODID + ":FairyStoneBricks");
			
		}else if(blockNumber == 2){
			this.setBlockTextureName(References.MODID + ":GildedStoneBricks");
			
		}else if(blockNumber == 3){
			this.setBlockTextureName(References.MODID + ":ChiseledFairyStoneBricks");
			
		}else if(blockNumber == 4){
			this.setBlockTextureName(References.MODID + ":ChiseledGildedStoneBricks");
			
		}else if(blockNumber == 5){
			this.setBlockTextureName(References.MODID + ":EmeraldStoneBricks");
			
		}else if(blockNumber == 6){
			this.setBlockTextureName(References.MODID + ":ChiseledEmeraldStoneBricks");
			
		}else if(blockNumber == 7){
			this.setBlockTextureName(References.MODID + ":PlatinumStoneBricks");
			
		}else if(blockNumber == 8){
			this.setBlockTextureName(References.MODID + ":ChiseledPlatinumStoneBricks");
			
		}else if(blockNumber == 9){
			this.setBlockTextureName(References.MODID + ":SapphireStoneBricks");
			
		}else if(blockNumber == 10){
			this.setBlockTextureName(References.MODID + ":ChiseledSapphireStoneBricks");
			
		}else if(blockNumber == 11){
			this.setBlockTextureName(References.MODID + ":WhiteStoneBricks");
			
		}else if(blockNumber == 12){
			this.setBlockTextureName(References.MODID + ":ChiseledWhiteStoneBricks");
			
		}else if(blockNumber == 13){
				this.setBlockTextureName(References.MODID + ":BlackStoneBricks");
				
		}else if(blockNumber == 14){
				this.setBlockTextureName(References.MODID + ":ChiseledBlackStoneBricks");
			
		}
		
	}

}
