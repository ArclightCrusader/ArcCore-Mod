package com.thearclightcrusader.ArcCore.container;

import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerArcCoreFurnace extends Container{
	
	private TileEntityArcCoreFurnace teArcCoreF;

	public ContainerArcCoreFurnace(InventoryPlayer inventory, TileEntityArcCoreFurnace tileEntity){
		this.teArcCoreF = tileEntity;
	}
	
	
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		// TODO Auto-generated method stub
		return false;
	}

}
