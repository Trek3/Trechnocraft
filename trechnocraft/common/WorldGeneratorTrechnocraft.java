package mods.trechnocraft.common;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorTrechnocraft implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world,random,chunkX*16,chunkZ*16);
		case 0:
			generateSurface(world,random,chunkX*16,chunkZ*16);
		case 1:
			generateEnd(world,random,chunkX*16,chunkZ*16);
		}
		
	}

	private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0;i<5;i++){
			int xCoord=chunkX+random.nextInt(16);
			int yCoord=random.nextInt(15);
			int zCoord=chunkZ+random.nextInt(16);
			
			(new WorldGenMinable(Trechnocraft.titaniumOreID,4)).generate(world,random,xCoord,yCoord,zCoord);
			(new WorldGenMinable(Trechnocraft.tungstenOreID,4)).generate(world,random,xCoord,yCoord,zCoord);
			
			yCoord=random.nextInt(10);
			
			
			yCoord=random.nextInt(30);
			
			(new WorldGenMinable(Trechnocraft.carbonOreID,2)).generate(world,random,xCoord,yCoord,zCoord);
			
			yCoord=random.nextInt(45);
			
			(new WorldGenMinable(Trechnocraft.amazzoniteOreID,4)).generate(world,random,xCoord,yCoord,zCoord);
			
			yCoord=random.nextInt(20);
			
			(new WorldGenMinable(Trechnocraft.uraniumOreID,3)).generate(world,random,xCoord,yCoord,zCoord);
			
			
		}
		for(int i = 0;i<7;i++){
			int xCoord=chunkX+random.nextInt(16);
			int yCoord=random.nextInt(64);
			int zCoord=chunkZ+random.nextInt(16);
			
			(new WorldGenMinable(Trechnocraft.copperOreID,8)).generate(world,random,xCoord,yCoord,zCoord);
			(new WorldGenMinable(Trechnocraft.leadOreID,6)).generate(world,random,xCoord,yCoord,zCoord);
			
			yCoord=random.nextInt(30);
			
			(new WorldGenMinable(Trechnocraft.zincOreID,4)).generate(world,random,xCoord,yCoord,zCoord);

			yCoord=random.nextInt(50);
			
			(new WorldGenMinable(Trechnocraft.tinOreID,8)).generate(world,random,xCoord,yCoord,zCoord);
			(new WorldGenMinable(Trechnocraft.nickelOreID,5)).generate(world,random,xCoord,yCoord,zCoord);
		}
		for(int i = 0;i<1;i++){
			int xCoord=chunkX+random.nextInt(16);
			int yCoord=random.nextInt(5);
			int zCoord=chunkZ+random.nextInt(16);
			
			
			yCoord=random.nextInt(10);
			
			(new WorldGenMinable(Trechnocraft.tecnezioOreID,4)).generate(world,random,xCoord,yCoord,zCoord);
		
			yCoord=random.nextInt(200);
			
			//to add the world generator for trees in the next versions
		}
		for(int i = 0;i<10;i++){
			int xCoord=chunkX+random.nextInt(16);
			int yCoord=random.nextInt(20);
			int zCoord=chunkZ+random.nextInt(16);
			

		}
	}

	private void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

}
