package com.thearclightcrusader.ArcCore.render;

import com.thearclightcrusader.ArcCore.entity.EntityCyclops;
import com.thearclightcrusader.ArcCore.entity.EntityFairy;
import com.thearclightcrusader.ArcCore.model.ModelCyclops;
import com.thearclightcrusader.ArcCore.model.ModelFairy;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderFairy extends RenderLiving {
	
	public static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/model/Fairy.png");
	
	protected ModelFairy modelEntity;

	public RenderFairy(ModelBase modelBase, float par2) {
		super(modelBase, par2);
		modelEntity = ((ModelFairy) mainModel);
	}
	
	public void renderFairy(EntityFairy entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderFairy((EntityFairy)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderFairy((EntityFairy)entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}


}
