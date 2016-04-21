package com.thearclightcrusader.ArcCore.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class GildedLeaf extends BlockLeaves {

	public static final String[][] leaftypes = new String[][] {{"LeafGilded"}, {"LeafGildedOpaque"}};
	public static final String[] leaves = new String[] {"Gilded"};
	
	protected void func_150124_c(World world, int x, int y, int z, int side, int meta)
    {
        if ((side & 3) == 1 && world.rand.nextInt(meta) == 0)
        {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.gold_nugget));
          
        }
    }
    

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i)
    {
        return super.damageDropped(i) + 4;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) & 3;
    }
    
    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
    	for (int i = 0; i < leaves.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
    }

	   public int quantityDropped(Random random)
	    {
	        return random.nextInt(20) == 0 ? 1 : 0;
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(Main.gildedSapling);
	    }
	    
	    public void harvestBlock(World world, EntityPlayer player, int x, int y, int z, int p_149636_6_)
	    {
	        {
	            super.harvestBlock(world, player, x, y, z, p_149636_6_);
	        }
	    }
	    protected ItemStack createStackedBlock(int p_149644_1_)
	    {
	        return new ItemStack(Item.getItemFromBlock(this), 1, p_149644_1_ & 3);
	    }


	    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }

	    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune)
	    {
	        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
	        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
	        return ret;
	    }

	    @Override
	    public void beginLeavesDecay(World world, int x, int y, int z)
	    {

	        int i2 = world.getBlockMetadata(x, y, z);

	        if ((i2 & 8) == 0)
	        {
	            world.setBlockMetadataWithNotify(x, y, z, i2 | 8, 4);
	        }
	        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
	    }

	    @Override
	    public boolean isLeaves(IBlockAccess world, int x, int y, int z)
	    {
	        return true;
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconregister){
	    	for(int i = 0; i < leaftypes.length; i++){
	    		this.field_150129_M[i] = new IIcon[leaftypes[i].length];
	    		
	    		for (int j = 0; j < leaftypes[i].length; j++){
	    			this.field_150129_M[i][j] = iconregister.registerIcon(References.MODID + ":" + leaftypes[i][j]);
	    		}
	    	}
	    }
		public IIcon getIcon(int side, int meta) {
			
			return (meta & 2) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
		}
		
		 @Override
		    public String[] func_150125_e() {
				return leaves;
			}
}
