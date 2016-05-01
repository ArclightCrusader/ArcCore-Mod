package com.thearclightcrusader.ArcCore.container;

import com.thearclightcrusader.ArcCore.SlotArcCoreInfuser;
import com.thearclightcrusader.ArcCore.handler.ArcCoreFurnaceRecipes;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerArcCoreInfuser extends Container {

	private TileEntityArcCoreInfuser infuser;
	private int trioCookTime;
	private int trioPower;
	private int lastItemBurnTime;
	
	public ContainerArcCoreInfuser(InventoryPlayer invPlayer, TileEntityArcCoreInfuser teArcCore){
		trioCookTime = 0;
		trioPower = 0;
		lastItemBurnTime = 0;
		
		infuser = teArcCore;
		//Inputs
		this.addSlotToContainer(new Slot(teArcCore, 0, 53, 19));
		this.addSlotToContainer(new Slot(teArcCore, 1, 80, 14));
		this.addSlotToContainer(new Slot(teArcCore, 2, 107, 19));
		//Fuel
		this.addSlotToContainer(new Slot(teArcCore, 3, 8, 52));
		//Output
		this.addSlotToContainer(new SlotArcCoreInfuser(invPlayer.player, teArcCore, 4, 80, 52));
		
		//Inventory
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//Hot Bar
		for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
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

 
	
	public void addCraftingToCrafters(ICrafting crafting){
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, this.infuser.trioCookTime);
		crafting.sendProgressBarUpdate(this, 1, this.infuser.trioPower); 
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return infuser.isUseableByPlayer(player);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.crafters.size(); i++){
			ICrafting par1 = (ICrafting)this.crafters.get(i);
			
			if(this.trioCookTime != this.infuser.trioCookTime){
				par1.sendProgressBarUpdate(this, 0, this.infuser.trioCookTime);
			}
			
			if(this.trioPower != this.infuser.trioPower){
				par1.sendProgressBarUpdate(this, 1, this.infuser.trioPower);
		}
	}
		this.trioCookTime = this.infuser.trioCookTime;
		this.trioPower = this.infuser.trioPower;
	}

	public void updateProgressBar(int i, int j){
		if(i == 0){
			infuser.trioCookTime = j;
		}
		
		if(i == 1){
			infuser.trioPower = j;
		}
	}
}
