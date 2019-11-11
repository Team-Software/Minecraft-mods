package com.trynow.adamod.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.trynow.adamod.world.biome.BiomeCopper;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomTrees implements IWorldGenerator
{
    private final WorldGenerator COPPER = new WorldGenCopperTree();
    
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider)
    {
    	Dimension(random, chunkX, chunkZ, world);
    }
	public void Dimension(Random random, int chunkX, int chunkZ, World world) {
		switch(world.provider.getDimension())
    	{
    	case 1:
    		break;
    	
    	
    	case 0:
    		runGenerator(COPPER,world,random,chunkX,chunkZ,3,-1,0,BiomeCopper.class);
    		break;
    	
    	case -1:
    	}
	}
    private void runGenerator(WorldGenerator generator,World world, Random random,int chunkX, int chunkZ,double chancestoSpawn, int minHeight, int maxHeight, Class<?>...classes)
    {
    	if(chancestoSpawn < 1)
    	{
    		if(random.nextDouble() < chancestoSpawn) chancestoSpawn = 1;
    		else chancestoSpawn = 0;
    		
    	}
    	ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
    	
    	BlockHeight(generator, world, random, chunkX, chunkZ, chancestoSpawn, minHeight, maxHeight, classesList,
				classes);
    }
    
	public void BlockHeight(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ,
			double chancestoSpawn, int minHeight, int maxHeight, ArrayList<Class<?>> classesList, Class<?>... classes) {
		int heightDiff = maxHeight - minHeight +1;
    	for(int i = 0 ;i<chancestoSpawn; i++)
    	{
    		BlockPos pos = new BlockPos(chunkX *16 + 10 + random.nextInt(15), minHeight + random.nextInt(heightDiff),chunkZ *16 + 10 + random.nextInt(15));
    		if(minHeight < 0) pos = world.getHeight(pos);
    		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
    		if(classesList.contains(biome) || classes.length == 0) generator.generate(world, random, pos);
    	}
	}

    
	
}
