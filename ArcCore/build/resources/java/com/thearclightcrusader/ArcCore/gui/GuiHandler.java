package com.thearclightcrusader.ArcCore.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.container.ContainerArcCoreFurnace;
import com.thearclightcrusader.ArcCore.container.ContainerArcCoreInfuser;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Main.getIDArcCoreFurnace:
				if (entity instanceof TileEntityArcCoreFurnace) {
					return new ContainerArcCoreFurnace(player.inventory, (TileEntityArcCoreFurnace) entity);
				}
				return null;
				
			case Main.getIDArcCoreInfuser:
				if (entity instanceof TileEntityArcCoreInfuser) {
					return new ContainerArcCoreInfuser(player.inventory, (TileEntityArcCoreInfuser) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case Main.getIDArcCoreFurnace:
				if (entity instanceof TileEntityArcCoreFurnace) {
					return new GuiArcCoreFurnace(player.inventory, (TileEntityArcCoreFurnace) entity);
				}
				return null;
				
			case Main.getIDArcCoreInfuser:
				if (entity instanceof TileEntityArcCoreInfuser) {
					return new GuiArcCoreInfuser(player.inventory, (TileEntityArcCoreInfuser) entity);
				}
				return null;
			}
		}
		
		
		return null;
	}
}