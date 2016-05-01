package com.thearclightcrusader.ArcCore.render;

import com.thearclightcrusader.ArcCore.entity.EntityCyclops;
import com.thearclightcrusader.ArcCore.entity.EntityNihil;
import com.thearclightcrusader.ArcCore.model.ModelCyclops;
import com.thearclightcrusader.ArcCore.model.ModelNihil;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderNihil extends RenderLiving {
	
	public static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/model/NihilSpirit.png");
	
	protected ModelNihil modelEntity;

	public RenderNihil(ModelBase modelBase, float par2) {
		super(modelBase, par2);
		modelEntity = ((ModelNihil) mainModel);
	}
	
	public void renderNihil(EntityNihil entity, double x, double y, double z, float u, float v){
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderNihil((EntityNihil)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderNihil((EntityNihil)entity, x, y, z, u, v);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}


}
