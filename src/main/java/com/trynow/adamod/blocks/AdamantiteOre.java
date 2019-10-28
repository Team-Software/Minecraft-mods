package com.trynow.adamod.blocks;

import java.util.Random;

import com.trynow.adamod.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AdamantiteOre extends BlockBase{
	
	public AdamantiteOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ItemInit.BLUEADAMANTIUMINGOT;
	} 	

	@Override
	public int quantityDropped(Random rand) 
	{
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min; 
	}
}
