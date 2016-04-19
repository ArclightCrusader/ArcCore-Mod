package com.thearclightcrusader.ArcCore.gui;

import org.lwjgl.opengl.GL11;

import com.thearclightcrusader.ArcCore.container.ContainerArcCoreInfuser;
import com.thearclightcrusader.ArcCore.proxy.References;
import com.thearclightcrusader.ArcCore.tileEntity.TileEntityArcCoreInfuser;

import net.minecraft.client.Minecraft;
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
		this.ySize = 166;
		
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j){
		String name = "Arc Core Infuser";
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 4, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(arcCoreInfuser.hasPower()){
			int i1 = arcCoreInfuser.getPowerRemainingScaled(43);
			drawTexturedModalRect(guiLeft + 9, guiTop + 49 - i1, 176, 70 - i1, 29, i1);
		}
		
		int j1 = arcCoreInfuser.getInfuserProgressScaled(14);
		drawTexturedModalRect(guiLeft + 84, guiTop + 48 - j1, 176, 29 - j1, 14, j1);
	}

}
