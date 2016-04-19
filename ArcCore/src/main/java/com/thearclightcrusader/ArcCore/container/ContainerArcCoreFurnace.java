package com.thearclightcrusader.ArcCore.container;

import com.thearclightcrusader.ArcCore.handler.ArcCoreFurnaceRecipes;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerArcCoreFurnace extends Container{
	
	private TileEntityArcCoreFurnace teArcCoreF;
	
	public int lastBurnTime;
	public int lastCurrentItemBurnTime;
	public int lastCookTime;

	public ContainerArcCoreFurnace(InventoryPlayer inventory, TileEntityArcCoreFurnace tileEntity){
		this.teArcCoreF = tileEntity;
		
		this.addSlotToContainer(new Slot(tileEntity, 0, 56, 35));
		this.addSlotToContainer(new Slot(tileEntity, 1, 8, 62));
		this.addSlotToContainer(new SlotFurnace(inventory.player, tileEntity, 2, 116, 35));
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}
	
	 public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
	    {
	        ItemStack itemstack = null;
	        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

	        if (slot != null && slot.getHasStack())
	        {
	            ItemStack itemstack1 = slot.getStack();
	            itemstack = itemstack1.copy();

	            if (p_82846_2_ == 2)
	            {
	                if (!this.mergeItemStack(itemstack1, 3, 39, true))
	                {
	                    return null;
	                }

	                slot.onSlotChange(itemstack1, itemstack);
	            }
	            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
	            {
	                if (ArcCoreFurnaceRecipes.Mixing().getArcCoreFurnaceingResult(itemstack1) != null)
	                {
	                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (TileEntityArcCoreFurnace.isItemFuel(itemstack1))
	                {
	                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
	                {
	                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
	                    {
	                        return null;
	                    }
	                }
	                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
	                {
	                    return null;
	                }
	            }
	            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
	            {
	                return null;
	            }

	            if (itemstack1.stackSize == 0)
	            {
	                slot.putStack((ItemStack)null);
	            }
	            else
	            {
	                slot.onSlotChanged();
	            }

	            if (itemstack1.stackSize == itemstack.stackSize)
	            {
	                return null;
	            }

	            slot.onPickupFromSlot(p_82846_1_, itemstack1);
	        }

	        return itemstack;
	    }
	
	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		return true;
	}


public void addCraftingToCrafters(ICrafting iCrafting){
	super.addCraftingToCrafters(iCrafting);
	iCrafting.sendProgressBarUpdate(this, 0, this.teArcCoreF.cookTime);
	iCrafting.sendProgressBarUpdate(this, 1, this.teArcCoreF.burnTime);
	iCrafting.sendProgressBarUpdate(this, 2, this.teArcCoreF.currentItemBurnTime);
}

public void detectAndSendChanges(){
	super.detectAndSendChanges();
	for(int i = 0; i < this.crafters.size(); i++){
		ICrafting iCrafting = (ICrafting) this.crafters.get(i);
		
		if(this.lastCookTime != this.teArcCoreF.cookTime) {
			iCrafting.sendProgressBarUpdate(this, 1, this.teArcCoreF.cookTime);
		}
		
		if(this.lastBurnTime != this.teArcCoreF.burnTime) {
			iCrafting.sendProgressBarUpdate(this, 0, this.teArcCoreF.burnTime);
		}
		
		if(this.lastCurrentItemBurnTime != this.teArcCoreF.currentItemBurnTime) {
			iCrafting.sendProgressBarUpdate(this, 2, this.teArcCoreF.currentItemBurnTime);
		}
	}
	
	this.lastCookTime = this.teArcCoreF.cookTime;
	this.lastBurnTime = this.teArcCoreF.burnTime;
	this.lastCurrentItemBurnTime = this.teArcCoreF.currentItemBurnTime;
}

@SideOnly(Side.CLIENT)
public void updateProgressBar(int par1, int par2){
	
	if(par1 == 1){
		this.teArcCoreF.cookTime = par2;
	}
	
	if(par1 == 0){
		this.teArcCoreF.burnTime = par2;
	}
	
	if(par1 == 2){
		this.teArcCoreF.currentItemBurnTime = par2;
	}
}

}
