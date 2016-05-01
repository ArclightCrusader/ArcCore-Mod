package com.thearclightcrusader.ArcCore.proxy;

import com.thearclightcrusader.ArcCore.entity.EntityCyclops;
import com.thearclightcrusader.ArcCore.entity.EntityFairy;
import com.thearclightcrusader.ArcCore.entity.EntityNihil;
import com.thearclightcrusader.ArcCore.model.ModelCyclops;
import com.thearclightcrusader.ArcCore.model.ModelFairy;
import com.thearclightcrusader.ArcCore.model.ModelNihil;
import com.thearclightcrusader.ArcCore.render.RenderCyclops;
import com.thearclightcrusader.ArcCore.render.RenderFairy;
import com.thearclightcrusader.ArcCore.render.RenderNihil;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ProxyClient extends ProxyCommon{

	public void registerRenderers(){
		
		//Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderCyclops(new ModelCyclops(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNihil.class, new RenderNihil(new ModelNihil(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new RenderFairy(new ModelFairy(), 0.3F));
	}
}
