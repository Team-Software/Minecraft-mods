package com.trynow.adamod.entity.render;

import com.trynow.adamod.entity.EntityAdamantiumHorse;
import com.trynow.adamod.util.Reference;
import com.trynow.adamod.entity.model.ModelAdamantiumHorse;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdamantiumHorse extends RenderLiving<EntityAdamantiumHorse>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/adamantium_horse.png");
	
	public RenderAdamantiumHorse(RenderManager manager) {
		super(manager, new ModelAdamantiumHorse(), 0.5F);
	}
	
	//Recibe las texturas personalizadas
	@Override
	protected ResourceLocation getEntityTexture(EntityAdamantiumHorse entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityAdamantiumHorse entityLiving, float p_77043_2_, float rotationYaw,float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
