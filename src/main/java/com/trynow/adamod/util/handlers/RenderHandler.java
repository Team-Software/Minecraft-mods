package com.trynow.adamod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import com.trynow.adamod.entity.EntityAdamantiumHorse;
import com.trynow.adamod.entity.render.RenderAdamantiumHorse;




public class RenderHandler {

	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAdamantiumHorse.class, new IRenderFactory<EntityAdamantiumHorse>()
		{
			@Override
			public Render<? super EntityAdamantiumHorse> createRenderFor(RenderManager manager) {
			
				return new RenderAdamantiumHorse(manager);
			}
		});
	}
}
