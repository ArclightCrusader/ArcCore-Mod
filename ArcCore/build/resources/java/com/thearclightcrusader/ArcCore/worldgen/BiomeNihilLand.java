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
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;

public class BiomeNihilLand extends BiomeGenBase{

	private static final Height biomeHeight = new Height(0.6F, 0.9F);
		
	public BiomeNihilLand(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(345356);
		this.setTemperatureRainfall(0.7F, 0.9F);
		this.waterColorMultiplier = 1383239;
	    this.theBiomeDecorator.treesPerChunk = 11;
	    this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityWolf.class, 10, 3, 5));
		
	}
	
	@Override
	public int getBiomeGrassColor(int x, int y, int z) {
		return 345356;
	}
	
	@Override
	public int getBiomeFoliageColor(int x, int y, int z){
		return 345356;
	}
	
	@Override
	public int getSkyColorByTemp(float par1){
		return 0;
	}
	
	   public WorldGenAbstractTree func_150567_a(Random random){
	        return random.nextInt(4) == 0 ? new WorldGenMegaPineTree(false, false) : new WorldGenMegaPineTree(false, false);
	    }


}
