package com.thearclightcrusader.ArcCore.entity;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityCyclops extends EntityMob {

	private int attackTimer;
	
	public EntityCyclops(World world) {
		super(world);
	    this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	}
	
	  protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(75D);
	  
	    }
	  
	  protected boolean isAIEnabled()
	    {
	        return true;
	    }
	  
	  protected void addRandomArmor()
	    {
	        super.addRandomArmor();
	        this.setCurrentItemOrArmor(0, new ItemStack(Main.nihilSword));
	        this.setCurrentItemOrArmor(1, new ItemStack(Main.abyssalChest));
	    }
	  
	  protected String getLivingSound()
	    {
	        return References.MODID + ":cyclops-say";
	    }

	    protected String getHurtSound()
	    {
	        return References.MODID + ":cyclops-hurt";
	    }

	    protected String getDeathSound()
	    {
	        return References.MODID + ":cyclops-death";
	    }

	    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
	    {
	        this.playSound("mob.zombie.step", 0.15F, 1.0F);
	    }
	    
	    protected Item getDropItem()
	    {
	        return Items.leather;
	    }
	    
	    protected void dropRareDrop(int p_70600_1_)
	    {
	        switch (this.rand.nextInt(2))
	        {
	            case 0:
	                this.dropItem(Items.iron_ingot, 2);
	                break;
	            case 1:
	                this.dropItem(Main.cyclopsEye, 1);
	                break;
	          
	        }
	    }
	    
	    public boolean attackEntityAsMob(Entity entity)
	    {
	        this.attackTimer = 10;
	        this.worldObj.setEntityState(this, (byte)4);
	        boolean flag = entity.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(2 + this.rand.nextInt(5)));

	        if (flag)
	        {
	        	entity.motionY += 0.3000000059604645D;
	        }

	        this.playSound("mob.irongolem.throw", 1.0F, 1.0F);
	        return flag;
	    }

}
