//Creacion de EntityINIT Clase padre de la entidad que vamos a ingresar
package com.trynow.adamod.init;

import com.trynow.adamod.Main;
import com.trynow.adamod.entity.EntityAdamantiumHorse;
import com.trynow.adamod.util.Reference;
import net.minecraft.entity.Entity; //Pertenencia a la clase entidades de minecraft
import net.minecraft.util.ResourceLocation; //
import net.minecraftforge.fml.common.registry.EntityRegistry; // Importamos la clase de regitro para los atributos de la entidad

public class EntityInit {

	public static void registerEntities() {
		registerEntity("AdamantiumHorse", EntityAdamantiumHorse.class, Reference.ENTITY_ADAMANTIUMHORSE, 120, 58111, 2149);
	}
	private static void registerEntity(String name, Class <? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
