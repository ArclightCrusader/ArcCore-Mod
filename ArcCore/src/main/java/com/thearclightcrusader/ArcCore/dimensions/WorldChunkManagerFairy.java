package com.thearclightcrusader.ArcCore.dimensions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.thearclightcrusader.ArcCore.worldgen.BiomeFairyPlains;
import com.thearclightcrusader.ArcCore.worldgen.BiomeFireLands;
import com.thearclightcrusader.ArcCore.worldgen.BiomesAC;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import scala.collection.concurrent.Debug;

public class WorldChunkManagerFairy extends WorldChunkManagerHell {
	
	private BiomeGenBase biomeGenerator;
	private BiomeGenBase biomeFairy;
	private BiomeGenBase biomeIce;
	private int radius = 250;
	private int radius2 = 300;
	private List biomeList;
	private BiomeGenBase[] mainBiomes;
	private BiomeGenBase[] mountainBiomes;
	private boolean flagerino = false;
	private GenLayer biomeIndexLayer;
	private float[] rainFall;
	
	  public WorldChunkManagerFairy(BiomeGenBase biome, BiomeGenBase[] biomes1, BiomeGenBase[] biomes2, float f) {
		  super(biome, f);
		  this.biomeIce = BiomesAC.biomeIceMountains;
		  this.biomeFairy = BiomesAC.biomeGildedPlains;
		  this.mainBiomes = biomes1;
		  this.mountainBiomes = biomes2;
		  rainFall = new float[]{f};
	}
	  
	  public BiomeGenBase getBiomeGenAt(int x, int z)
	    {
		  if((x * x) + (z * z) >= radius * radius){
			  return BiomesAC.biomeIceMountains;
			  
		  }else if((x*x) + (z*z) == (radius * radius)){
			  return BiomesAC.biomeGildedPlains;
		  }else{
			  
			  return BiomesAC.biomeGildedForest;
		  }
	    }
	  
	  public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] biomes, int x, int z, int j, int k)
	    {
		  
		  if (biomes == null || biomes.length < j * k)
	        {
	            biomes = new BiomeGenBase[j * k];
	        }
		  
		  if((x * x) + (z * z) >= radius * radius && (x * x) + (z * z) <=  (radius2 * radius2)){
			  System.out.print("Working");
			  Arrays.fill(biomes, 0, j * k, BiomesAC.biomeIceMountains);
			  return biomes;
			  
			  
		  }else{
			  Arrays.fill(biomes, 0, j * k, BiomesAC.biomeGildedPlains);
			  return biomes;
		  }
	    }

	    public ChunkPosition findBiomePosition(int x, int y, int z, List list, Random random)
	    {
	    		if((x * x) + (z * z) < (radius * radius)){
	    			return new ChunkPosition(x, y, z);
	    			
	    		}else if((x * x) + (z * z) >= radius * radius && (x * x) + (x * z) <= (radius2 * radius2)){
	    				
	    				return new ChunkPosition(x++, y, z++);
	    			}
	    		
	    		return null;
	    }
	    
	    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] biomes, int x, int z, int j, int k)
	    {
			  
			  if (biomes == null || biomes.length < j * k)
		        {
		            biomes = new BiomeGenBase[j * k];
		        }
			  
			  if((x * x) + (z * z) >= radius * radius && (x * x) + (x * z) <= (radius2 * radius2)){
				  Arrays.fill(biomes, 0, j * k, BiomesAC.biomeIceMountains);
				  return biomes;
				  
				  
			  }else{
				  Arrays.fill(biomes, 0, j * k, BiomesAC.biomeGildedPlains);
				  return biomes;
			  }
		    }

	    /**
	     * checks given Chunk's Biomes against List of allowed ones
	     */
	    public boolean areBiomesViable(int p_76940_1_, int p_76940_2_, int p_76940_3_, List p_76940_4_)
	    {
	        return p_76940_4_.contains(BiomesAC.biomeIceMountains) || p_76940_4_.contains(BiomesAC.biomeGildedPlains);
	    }
}
