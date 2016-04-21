package com.thearclightcrusader.ArcCore.worldgen;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeFireLands extends BiomeGenBase{

	private static final Height biomeHeight = new Height(0.4F, 0.9F);
	
	public BiomeFireLands(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(15869720);
		this.setTemperatureRainfall(0.9F, 0.3F);
		this.waterColorMultiplier = 12193551;
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z) {
		return 15869720;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 15869720;
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 4849664;
	}

}
