package com.thearclightcrusader.ArcCore.blocks;

import java.util.List;
import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class UGildedStoneSlab extends BlockSlab{

	 @SideOnly(Side.CLIENT)
	    private IIcon side;
	
	public UGildedStoneSlab(boolean b, Material rock) {
		super(b, Material.rock);
		this.setHardness(-1);
		this.setResistance(9999);
		this.setCreativeTab(Main.arcCoreTab);
		this.useNeighborBrightness = true;
		this.setBlockName("UGildedStoneSlab");
	}

	@Override
	public String func_150002_b(int i) {
		
		return super.getUnlocalizedName();
	}
	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(References.MODID + ":GildedStoneBricks");
        this.side = iconRegister.registerIcon(References.MODID + ":GildedStoneBricks");
    }
    
    public IIcon getIcon(int side, int meta){
    	int i = meta & 7;
    	
    	if(this.field_150004_a && (meta & 2) != 0){
    		side = 1;
    	}
    	return side == 1 ? this.side : (side == 0 ? this.side : this.blockIcon);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
    	if(item != Item.getItemFromBlock(Main.uGildedStoneSlabDouble)){
    		list.add(new ItemStack(item, 1, 0));
    	}
    }
    
    @SideOnly(Side.CLIENT)
    private static boolean isBlockSingleSlab(Block block){
    	return block == Main.uGildedStoneSlab;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z){
    	return isBlockSingleSlab(this) ? Item.getItemFromBlock(this) : (this == Main.uGildedStoneSlabDouble ? Item.getItemFromBlock(Main.uGildedStoneSlab) : Item.getItemFromBlock(Main.uGildedStoneSlab));
    }
    
    @Override
    public Item getItemDropped(int i, Random random, int j){
    	return Item.getItemFromBlock(Main.uGildedStoneSlab);
    }
    
    protected ItemStack createStackedBlock(int i){
    	return new ItemStack(Main.uGildedStoneSlab, 2, 0);
    }
    
    

}
