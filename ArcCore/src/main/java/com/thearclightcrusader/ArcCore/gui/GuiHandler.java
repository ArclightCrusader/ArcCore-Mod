package com.thearclightcrusader.ArcCore.gui;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.container.ContainerArcCoreFurnace;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
			TileEntity entity = world.getTileEntity(x, y, z);
			
			if(entity != null){
				switch(ID){
				case Main.getIDArcCoreFurnace:
					if(entity instanceof TileEntityArcCoreFurnace){
						return new ContainerArcCoreFurnace(player.inventory, (TileEntityArcCoreFurnace) entity);
					}
					return null;
				}
			}
			return null;
		}


	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null){
			switch(ID){
			case Main.getIDArcCoreFurnace:
				if(entity instanceof TileEntityArcCoreFurnace){
					return new GuiArcCoreFurnace(player.inventory, (TileEntityArcCoreFurnace) entity);
				}
				return null;
			}
		}
		return null;
	}

}
