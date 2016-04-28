package com.thearclightcrusader.ArcCore.entity;

import com.thearclightcrusader.ArcCore.Main;
import com.thearclightcrusader.ArcCore.proxy.References;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;

public class EntityFairy extends EntityMob implements IRangedAttackMob {

	private int attackTimer;
	private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
    private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false);
	
	public EntityFairy(World world) {
		super(world);
	    this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.tasks.addTask(4, this.aiArrowAttack);
        
    }
	
	
	  protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30D);
	  
	    }
	  
	  
	  protected boolean isAIEnabled()
	    {
	        return true;
	    }
	  
	  protected String getLivingSound()
	    {
	        return References.MODID + ":fairy-say";
	    }

	    protected String getHurtSound()
	    {
	        return References.MODID + ":fairy-hurt";
	    }

	    protected String getDeathSound()
	    {
	        return References.MODID + ":fairy-death";
	    }
	    
	    protected Item getDropItem()
	    {
	        return Items.gold_nugget;
	    }
	    
	    protected void dropRareDrop(int p_70600_1_)
	    {
	        switch (this.rand.nextInt(2))
	        {
	            case 0:
	                this.dropItem(Items.iron_ingot, 2);
	                break;
	            case 1:
	                this.dropItem(Main.fairyDust, 1);
	                break;
	          
	        }
	    }

		@Override
		public void attackEntityWithRangedAttack(EntityLivingBase entity, float f) {
			
			 EntityArrow entityarrow = new EntityArrow(this.worldObj, this, entity, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
		        int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
		        int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
		        entityarrow.setDamage((double)(f * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.difficultySetting.getDifficultyId() * 0.11F));

		            entityarrow.setDamage(entityarrow.getDamage() + 1.5D);
		            entityarrow.setFire(100);

		        this.playSound(References.MODID + ":fairy-attack", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		        this.worldObj.spawnEntityInWorld(entityarrow);
		    }

}
