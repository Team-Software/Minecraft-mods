package com.trynow.adamod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

//

public class EntityAdamantiumHorse extends EntitySkeletonHorse {

	public EntityAdamantiumHorse(World worldIn) {
		super(worldIn); //Autogeneración
	}
	
	//Añadir Caracterísitcas de AI
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(1, new EntityAIRunAroundLikeCrazy(this, 0.5D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D, AbstractHorse.class));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.7D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }

	//Añadir Atributos
	 protected void applyEntityAttributes()
	 {
		 super.applyEntityAttributes();
		 this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
		 this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
		 //this.getEntityAttribute(JUMP_STRENGTH).setBaseValue(this.getModifiedJumpStrength());
		 this.getEntityAttribute(JUMP_STRENGTH).setBaseValue(0.3D);
	 }

	@Override
	//Se utilizan los sonidos del Skeleton Horse de Minecraft
	protected SoundEvent getAmbientSound()
	{
		return SoundEvents.ENTITY_SKELETON_HORSE_AMBIENT;
	}
	
	 protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	    {
	        super.getHurtSound(damageSourceIn);
	        return SoundEvents.ENTITY_SKELETON_HORSE_HURT;
	    }

	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_SKELETON_HORSE_DEATH;
	}
}


