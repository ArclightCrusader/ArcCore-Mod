package com.thearclightcrusader.ArcCore.handler;

import java.util.Random;

import com.thearclightcrusader.ArcCore.Main;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler {

	public static void registerMonsters(Class entityClass, String name, int spawnChance, int biomeId, int minGroup, int maxGroup){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 16777215;
		int subColor = random.nextInt() * 16777215;
		BiomeGenBase biome = BiomeGenBase.getBiome(biomeId);
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(name, spawnChance, minGroup, maxGroup, EnumCreatureType.monster, biome);
		EntityRegistry.registerModEntity(entityClass, name, entityId, Main.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));

	}
	
	public static void registerFairy(Class entityClass, String name, int spawnChance, int minGroup, int maxGroup){
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int mainColor = random.nextInt() * 16777215;
		int subColor = random.nextInt() * 16777215;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(name, spawnChance, minGroup, maxGroup, EnumCreatureType.monster, BiomeGenBase.getBiome(79), BiomeGenBase.getBiome(81));
		EntityRegistry.registerModEntity(entityClass, name, entityId, Main.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));

	}
}
