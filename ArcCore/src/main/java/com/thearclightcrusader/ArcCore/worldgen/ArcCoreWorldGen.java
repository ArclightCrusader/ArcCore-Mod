package com.thearclightcrusader.ArcCore.worldgen;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class ArcCoreWorldGen implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			//Generates surface world
			generateSuface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			//Generates surface world
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			//Generates surface world
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}

	private void generateSuface(World world, Random random, int x, int z) {
		//this.addOreSpawn(Main.ore, world, random, x=blockXPos, z=blockZPos, maxX, maxZ, minVein Size + random.nextInt(maxSize), chance, minY, MaxY);
		this.addOreSpawn(Main.palladiumOre, world, random, x, z, 16, 16, 1 + random.nextInt(4), 27, 5, 50);
		this.addOreSpawn(Main.moissaniteOre, world, random, x, z, 16, 16, 2 + random.nextInt(5), 12, 3, 16);
		this.addOreSpawn(Main.ascendedOre, world, random, x, z, 16, 16, 1 + random.nextInt(2), 7, 2, 15);

	}

	private void generateNether(World world, Random random, int x, int z) {
	// TODO Auto-generated method stub
	
	}

	
	private void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		

	}
	
	private void addOreSpawn(Block block, World world, Random random, int blockX, int blockZ, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++){
			int posX =  blockX + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY);
			int posZ = blockZ + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}
}
