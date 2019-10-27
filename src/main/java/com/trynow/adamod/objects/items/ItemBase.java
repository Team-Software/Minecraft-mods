package com.trynow.adamod.objects.items;

import com.trynow.adamod.Main;
import com.trynow.adamod.init.ItemInit;
import com.trynow.adamod.proxy.ClientProxy;
import com.trynow.adamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name) {
	
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "invent");
	}

}
