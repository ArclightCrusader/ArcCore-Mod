package com.thearclightcrusader.ArcCore.gui;

import com.thearclightcrusader.ArcCore.container.ContainerArcCoreInfuser;
import com.thearclightcrusader.ArcCore.proxy.References;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiArcCoreInfuser extends GuiContainer{
	
	private ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "/textures/gui/InfuserGui.png");
	private TileEntityArcCoreInfuser arcCoreInfuser;

	public GuiArcCoreInfuser(InventoryPlayer invPlayer, TileEntityArcCoreInfuser teArcCore) {
		super(new ContainerArcCoreInfuser(invPlayer, teArcCore));
		arcCoreInfuser = teArcCore;
		
		this.xSize = 176;
		
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j){
		String name = this.arcCoreInfuser.hasCustomInventoryName() ? this.arcCoreInfuser.getInventoryName() : I18n.format(this.arcCoreInfuser.getInventoryName());
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		
		
	}

}
