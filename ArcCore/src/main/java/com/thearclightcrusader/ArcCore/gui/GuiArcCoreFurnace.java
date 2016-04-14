package com.thearclightcrusader.ArcCore.gui;

import com.thearclightcrusader.ArcCore.container.ContainerArcCoreFurnace;
import com.thearclightcrusader.ArcCore.proxy.References;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreFurnace;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiArcCoreFurnace extends GuiContainer {
	
	public static final ResourceLocation bground = new ResourceLocation(References.MODID, "textures/gui/ArcCoreFurnaceGui.png");
	
	public TileEntityArcCoreFurnace teArcCoreF;

	public GuiArcCoreFurnace(InventoryPlayer inventoryPlayer, TileEntityArcCoreFurnace entity) {
		super(new ContainerArcCoreFurnace(inventoryPlayer, entity));
		
		this.teArcCoreF = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2){
		String name = this.teArcCoreF.hasCustomInventoryName() ? this.teArcCoreF.getInventoryName() : I18n.format(this.teArcCoreF.getInventoryName(), new Object[0]);
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		// TODO Auto-generated method stub
		
	}

}
