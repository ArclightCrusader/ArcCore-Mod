package com.thearclightcrusader.ArcCore.container;

import com.thearclightcrusader.ArcCore.SlotArcCoreInfuser;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

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
	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		
		return false;
	}

}
