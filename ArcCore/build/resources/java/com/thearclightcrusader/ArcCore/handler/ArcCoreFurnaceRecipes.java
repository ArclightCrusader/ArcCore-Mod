package com.thearclightcrusader.ArcCore.handler;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
 
public class ArcCoreFurnaceRecipes
{
    private static final ArcCoreFurnaceRecipes ArcCoreFurnaceingBase = new ArcCoreFurnaceRecipes();
   
    private Map ArcCoreFurnaceingList = new HashMap();
    private Map experienceList = new HashMap();
    private static final String __OBFID = "CL_00000085";
 
 
    public static ArcCoreFurnaceRecipes Mixing()
    {
        return ArcCoreFurnaceingBase;
    }
 
    private ArcCoreFurnaceRecipes()
    {
          //ITEM TO ITEM, Input, output, xp
 this.func_151396_a(Items.coal, new ItemStack(Main.fuelGel), 0.25F);
 this.func_151396_a(Items.carrot, new ItemStack(Main.organicFuelGel), 0.25F);
 this.func_151396_a(Items.wheat, new ItemStack(Main.organicFuelGel), 0.25F);
 this.func_151396_a(Items.potato, new ItemStack(Main.organicFuelGel), 0.25F);
 this.func_151396_a(Items.baked_potato, new ItemStack(Main.organicFuelGel), 0.25F);
 this.func_151396_a(Items.bread, new ItemStack(Main.organicFuelGel), 0.25F);
 this.func_151396_a(Main.baconBeer, new ItemStack(Main.survivalistFuelGel), 0.35F);
 
         //BLOCK TO ITEM
  //this.func_151393_a([modid].[input], new ItemStack([modid].[output]), 0.7F);
 
 
    }
 
    public void func_151393_a(Block p_151393_1_, ItemStack p_151393_2_, float p_151393_3_)
    {
        this.func_151396_a(Item.getItemFromBlock(p_151393_1_), p_151393_2_, p_151393_3_);
    }
 
    public void func_151396_a(Item p_151396_1_, ItemStack p_151396_2_, float p_151396_3_)
    {
        this.func_151394_a(new ItemStack(p_151396_1_, 1, 32767), p_151396_2_, p_151396_3_);
    }
 
    public void func_151394_a(ItemStack p_151394_1_, ItemStack p_151394_2_, float p_151394_3_)
    {
        this.ArcCoreFurnaceingList.put(p_151394_1_, p_151394_2_);
        this.experienceList.put(p_151394_2_, Float.valueOf(p_151394_3_));
    }
 
    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getArcCoreFurnaceingResult(ItemStack p_151395_1_)
    {
        Iterator iterator = this.ArcCoreFurnaceingList.entrySet().iterator();
        Entry entry;
 
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
 
            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151395_1_, (ItemStack)entry.getKey()));
 
        return (ItemStack)entry.getValue();
    }
 
    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
    {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }
 
    public Map getSmeltingList()
    {
        return this.ArcCoreFurnaceingList;
    }
 
    public float func_151398_b(ItemStack p_151398_1_)
    {
        float ret = p_151398_1_.getItem().getSmeltingExperience(p_151398_1_);
        if (ret != -1) return ret;
 
        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;
 
        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }
 
            entry = (Entry)iterator.next();
        }
        while (!this.func_151397_a(p_151398_1_, (ItemStack)entry.getKey()));
 
        return ((Float)entry.getValue()).floatValue();
    }
}