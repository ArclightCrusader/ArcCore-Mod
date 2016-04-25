package com.thearclightcrusader.ArcCore.entity;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityNihil extends EntityMob {

	private int stareTimer;
    private boolean isAggressive;
	
	public EntityNihil(World world) {
		super(world);
	    this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        
        if(this.isAggressive == true){
        	this.teleportRandomly();
        }
	}
	
	  protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(60.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.33000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50D);
	  
	    }
	  
	  protected Entity findPlayerToAttack()
	    {
	        EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity(this, 64.0D);

	        if (entityplayer != null)
	        {
	            if (this.shouldAttackPlayer(entityplayer))
	            {
	                this.isAggressive = true;
	                
	                if (this.stareTimer == 0)
	                {
	                    this.worldObj.playSoundEffect(entityplayer.posX, entityplayer.posY, entityplayer.posZ, References.MODID + ":nihil-stalking", 1.0F, 1.0F);
	                }

	                if (this.stareTimer++ == 5)
	                {
	                    this.stareTimer = 0;
	                    return entityplayer;
	                }
	            }
	            else
	            {
	                this.stareTimer = 0;
	            }
	        }

	        return null;
	    }
	  
	  public boolean attackEntityFrom(DamageSource dmgSource, float f)
	    {
	        if (this.isEntityInvulnerable())
	        {
	            return false;
	        }
	        else
	        {

	            if (dmgSource instanceof EntityDamageSource && dmgSource.getEntity() instanceof EntityPlayer)
	            {
	                this.isAggressive = true;
	            }

	            if (dmgSource instanceof EntityDamageSourceIndirect)
	            {
	                this.isAggressive = false;

	                for (int i = 0; i < 64; ++i)
	                {
	                    if (this.teleportRandomly())
	                    {
	                        return true;
	                    }
	                }

	                return super.attackEntityFrom(dmgSource, f);
	            }
	            else
	            {
	                return super.attackEntityFrom(dmgSource, f);
	            }
	        }
	    }

	  
	    private boolean shouldAttackPlayer(EntityPlayer entityPlayer)
	    {
	    	ItemStack itemstack = entityPlayer.inventory.armorInventory[0];
	    	ItemStack itemstack1 = entityPlayer.inventory.armorInventory[1];
	    	ItemStack itemstack2 = entityPlayer.inventory.armorInventory[2];
	        ItemStack itemstack3 = entityPlayer.inventory.armorInventory[3];

	        if (itemstack != null && itemstack.getItem() == Main.nihilBoots && itemstack1.getItem() == Main.nihilLegs && itemstack2.getItem() == Main.nihilChest && itemstack3.getItem() == Main.nihilHelm ||itemstack != null && itemstack.getItem() == Main.abyssalBoots && itemstack1.getItem() == Main.abyssalLegs && itemstack2.getItem() == Main.abyssalChest && itemstack3.getItem() == Main.abyssalHelm)
	        {
	            return false;
	        }
	        else
	        {
	            Vec3 vec3 = entityPlayer.getLook(1.0F).normalize();
	            Vec3 vec31 = Vec3.createVectorHelper(this.posX - entityPlayer.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - (entityPlayer.posY + (double)entityPlayer.getEyeHeight()), this.posZ - entityPlayer.posZ);
	            double d0 = vec31.lengthVector();
	            vec31 = vec31.normalize();
	            double d1 = vec3.dotProduct(vec31);
	            return d1 > 1.0D - 0.025D / d0 && entityPlayer.canEntityBeSeen(this);
	        }
	    }
	    
	    protected boolean teleportRandomly()
	    {
	        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
	        double d1 = this.posY + (double)(this.rand.nextInt(64) - 32);
	        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
	        return this.teleportTo(d0, d1, d2);
	    }
	    
	    protected boolean teleportTo(double x, double y, double z)
	    {
	        EnderTeleportEvent event = new EnderTeleportEvent(this, x, y, z, 0);
	        if (MinecraftForge.EVENT_BUS.post(event)){
	            return false;
	        }
	        double d3 = this.posX;
	        double d4 = this.posY;
	        double d5 = this.posZ;
	        this.posX = event.targetX;
	        this.posY = event.targetY;
	        this.posZ = event.targetZ;
	        boolean flag = false;
	        int i = MathHelper.floor_double(this.posX);
	        int j = MathHelper.floor_double(this.posY);
	        int k = MathHelper.floor_double(this.posZ);

	        if (this.worldObj.blockExists(i, j, k))
	        {
	            boolean flag1 = false;

	            while (!flag1 && j > 0)
	            {
	                Block block = this.worldObj.getBlock(i, j - 1, k);

	                if (block.getMaterial().blocksMovement())
	                {
	                    flag1 = true;
	                }
	                else
	                {
	                    --this.posY;
	                    --j;
	                }
	            }

	            if (flag1)
	            {
	                this.setPosition(this.posX, this.posY, this.posZ);

	                if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
	                {
	                    flag = true;
	                }
	            }
	        }

	        if (!flag)
	        {
	            this.setPosition(d3, d4, d5);
	            return false;
	        }
	        else
	        {
	            short short1 = 128;

	            for (int l = 0; l < short1; ++l)
	            {
	                double d6 = (double)l / ((double)short1 - 1.0D);
	                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
	                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
	                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
	                double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
	                double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * (double)this.height;
	                double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
	                this.worldObj.spawnParticle("portal", d7, d8, d9, (double)f, (double)f1, (double)f2);
	            }

	            this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
	            this.playSound("mob.endermen.portal", 1.0F, 1.0F);
	            return true;
	        }
	    }

	  
	  protected boolean isAIEnabled()
	    {
	        return true;
	    }
	  
	  protected void addRandomArmor()
	    {
	        super.addRandomArmor();
	        this.setCurrentItemOrArmor(0, new ItemStack(Main.nihilSword));
	    }
	  
	  protected String getLivingSound()
	    {
	        return References.MODID + ":nihil-say";
	    }

	    protected String getHurtSound()
	    {
	        return References.MODID + ":nihil-hurt";
	    }

	    protected String getDeathSound()
	    {
	        return References.MODID + ":nihil-death";
	    }

	    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
	    {
	        this.playSound("mob.zombie.step", 0.15F, 1.0F);
	    }
	    
	    protected Item getDropItem()
	    {
	        return Items.quartz;
	    }
	    
	    protected void dropRareDrop(int p_70600_1_)
	    {
	        switch (this.rand.nextInt(1))
	        {
	            case 0:
	                this.dropItem(Main.nihilianSoulShard, 1);
	                break;
	          
	        }
	    }

}
