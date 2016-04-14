package com.thearclightcrusader.ArcCore;

import java.util.Iterator;

import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import scala.collection.concurrent.Debug;

public class WaterTalisman extends Item{

	public WaterTalisman(){
		
		this.setTextureName(References.MODID + ":WaterTalisman");
		this.setUnlocalizedName("WaterTalisman");
		this.setCreativeTab(CreativeTabs.tabTools);
		
	}
		
		@Override
		public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
			
			if(world.getBlock(x, y, z) == Main.nihilBlock && itemStack == new ItemStack(Main.waterTalisman) && world.difficultySetting != EnumDifficulty.PEACEFUL && !world.isRemote){
				 
				 	int l = -2;
		            EntityWither entitywither;
		            Iterator iterator;
		            int i1;
					
				if (!world.isRemote)
                 {
                     entitywither = new EntityWither(world);
                     entitywither.setLocationAndAngles((double)x + 0.5D, (double)z - 1.45D, (double)(y + l) + 1.5D, 90.0F, 0.0F);
                     entitywither.renderYawOffset = 90.0F;
                     entitywither.func_82206_m();

                     if (!world.isRemote)
                     {
                         iterator = world.getEntitiesWithinAABB(EntityPlayer.class, entitywither.boundingBox.expand(50.0D, 50.0D, 50.0D)).iterator();

                         while (iterator.hasNext())
                         {
                             player = (EntityPlayer)iterator.next();
                             player.triggerAchievement(AchievementList.field_150963_I);
                         }
                     }
                     
                 

                     world.spawnEntityInWorld(entitywither);
                 }
				//EntityCow entityCow = new EntityCow(world);
				
				//world.spawnEntityInWorld(entityCow);
				Debug.log("Working!");
			}
			return true;
			
		
			
		}

	}



		
	


