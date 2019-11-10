package com.trynow.adamod.init;

import java.util.List;

import com.trynow.adamod.objects.items.ItemBase;
import com.trynow.adamod.objects.items.tools.ToolSword;

import java.util.ArrayList;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>(); 
	
	//Materiales
	public static final ToolMaterial MATERIAL_BLUEADAMANTIUM = EnumHelper.addToolMaterial("material_blueadamantium", 3, 1700, 8.0F, 4.0F, 10);
	
	//Items
	public static final Item BLUEADAMANTIUMINGOT = new ItemBase("blueadamantiumingot");
	public static final Item BLUEADAMANTIUMNUGGET = new ItemBase("blueadamantiumnugget");
	
	public static final Item VIBRANIUMINGOT = new ItemBase("vibraniumingot");
	
	//Items Gemas del infinito
	public static final Item GEMAALMA = new ItemBase("gemaalma");
	public static final Item GEMAESPACIO = new ItemBase("gemaespacio");
	public static final Item GEMAMENTE = new ItemBase("gemamente");
	public static final Item GEMAPODER = new ItemBase("gemapoder");
	public static final Item GEMAREALIDAD = new ItemBase("gemarealidad");
	public static final Item GEMATIEMPO = new ItemBase("gematiempo");

	//Tools
	public static final ItemSword BLUEADAMANTIUMSWORD = new ToolSword("blue_adamantium_sword",MATERIAL_BLUEADAMANTIUM);
	
}
