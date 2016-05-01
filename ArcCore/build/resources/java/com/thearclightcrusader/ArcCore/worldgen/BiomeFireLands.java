package com.thearclightcrusader.ArcCore.worldgen;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.worldgen.decorator.BiomeDecoratorFireLands;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;

public class BiomeFireLands extends BiomeGenBase{

	private static final Height biomeHeight = new Height(0.4F, 0.9F);
		
	public BiomeFireLands(int id) {
		super(id);
		
		this.setHeight(biomeHeight);
		this.setColor(15869720);
		this.setTemperatureRainfall(0.9F, 0.3F);
		this.waterColorMultiplier = 12193551;
		this.topBlock = Main.fireStone;
	    this.fillerBlock = Main.fireStone;
	    this.theBiomeDecorator.treesPerChunk = -999;
	    this.theBiomeDecorator.deadBushPerChunk = 5;
	    this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityBlaze.class, 10, 3, 5));
	    this.spawnableCreatureList.clear();
		
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
	
	@Override
	 public BiomeDecorator createBiomeDecorator()
	    {
	        return getModdedBiomeDecorator(new BiomeDecoratorFireLands());
	    }


}
