package com.thearclightcrusader.ArcCore.worldgen;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.worldgen.decorator.BiomeDecoratorFireLands;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;

public class BiomeGildedForest extends BiomeGenBase{

	private static final Height biomeHeight = new Height(0.23F, 0.3F);
		
	public BiomeGildedForest(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(14737408);
		this.setTemperatureRainfall(0.7F, 0.7F);
		this.waterColorMultiplier = 6876647;
	    this.theBiomeDecorator.treesPerChunk = 12;
	    this.theBiomeDecorator.deadBushPerChunk = 5;
	    this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityWolf.class, 10, 3, 5));
		
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z) {
		return 16768768;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 16768768;
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 12255228;
	}


}
