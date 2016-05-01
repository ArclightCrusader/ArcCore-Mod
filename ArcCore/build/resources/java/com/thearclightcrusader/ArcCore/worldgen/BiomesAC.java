package com.thearclightcrusader.ArcCore.worldgen;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesAC {
	
	public static BiomeGenBase biomeFireLands;
	public static BiomeGenBase biomeRedForest;
	public static BiomeGenBase biomeGildedForest;
	public static BiomeGenBase biomeGildedPlains;
	public static BiomeGenBase biomeNihilLand;

	public static void init(){
		registerBiomes();
	}

	private static void registerBiomes() {
		
		//FireLands
		biomeFireLands = new BiomeFireLands(78).setBiomeName("Fire Lands");
		BiomeDictionary.registerBiomeType(biomeFireLands, Type.MOUNTAIN);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeFireLands, 10));
		
		//GildedForest
		biomeGildedForest = new BiomeGildedForest(79).setBiomeName("Gilded Forest");
		BiomeDictionary.registerBiomeType(biomeGildedForest, Type.FOREST);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeGildedForest, 10));
		
		//RedForest
		biomeRedForest = new BiomeRedForest(80).setBiomeName("Red Forest");
		BiomeDictionary.registerBiomeType(biomeRedForest, Type.FOREST);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeRedForest, 10));
		
		//GildedPlains
		biomeGildedPlains = new BiomeGildedPlains(81).setBiomeName("Gilded Plains");
		BiomeDictionary.registerBiomeType(biomeGildedPlains, Type.PLAINS);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeGildedPlains, 10));
		
		//NihilLands
		biomeNihilLand = new BiomeNihilLand(82).setBiomeName("Land of the Nihil");
		BiomeDictionary.registerBiomeType(biomeNihilLand, Type.CONIFEROUS);
		BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(biomeNihilLand, 10));
		
		/**
		  BiomeManager.removeSpawnBiome(BiomeGenBase.beach);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.birchForest);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.birchForestHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.coldBeach);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.coldTaiga);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.coldTaigaHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.deepOcean);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.desert);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.desertHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHillsEdge);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.extremeHillsPlus);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.forest);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.forestHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.frozenOcean);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.frozenRiver);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.hell);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.iceMountains);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.icePlains);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.jungle);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.jungleEdge);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.jungleHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.megaTaiga);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.megaTaigaHills);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.mesa);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.mesaPlateau);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.mushroomIsland);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.mushroomIslandShore);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.ocean);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.plains);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.river);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.roofedForest);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.savanna);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.savannaPlateau);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.sky);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.stoneBeach);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.swampland);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.taiga);
		  BiomeManager.removeSpawnBiome(BiomeGenBase.taigaHills);
		  
		  **/
		  BiomeManager.addSpawnBiome(biomeNihilLand);
		  BiomeManager.addSpawnBiome(biomeRedForest);
		  BiomeManager.addSpawnBiome(biomeGildedForest);
		  BiomeManager.addSpawnBiome(biomeFireLands);
		
	}
}
