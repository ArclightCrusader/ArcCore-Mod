package com.thearclightcrusader.ArcCore.blocks;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class FairyGrass extends Block{

    @SideOnly(Side.CLIENT)
    private IIcon icon1;
    @SideOnly(Side.CLIENT)
    private IIcon icon2;
    @SideOnly(Side.CLIENT)
    private IIcon icon3;
    
	public FairyGrass(Material grass) {
		super(Material.grass);
		this.setHardness(1F);
		this.setResistance(1F);
		this.setStepSound(soundTypeGrass);
	}
	
	   @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int side, int meta)
	    {
	        return side == 1 ? this.icon1 : (side == 0 ? Main.fairyDirt.getBlockTextureFromSide(side) : this.blockIcon);
	    }
	   
	   public Item getItemDropped(int i, Random random, int j)
	    {
	        return Main.fairyDirt.getItemDropped(0, random, j);
	    }
	   
	   @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        this.blockIcon = iconRegister.registerIcon(this.getTextureName() + "_side");
	        this.icon1 = iconRegister.registerIcon(this.getTextureName() + "_top");
	      
	    }


}
