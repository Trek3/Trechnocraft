package mods.trechnocraft.common;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import mods.trechnocraft.common.*;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorStructures implements IWorldGenerator{

	@Override
	public void generate(Random random,int chunkX,int chunkZ,World world,IChunkProvider chunkGenerator,IChunkProvider chunkProvider){
		if(world.provider.dimensionId!=1 && world.provider.dimensionId!=-1){
			generateSurface(world,random,chunkX*16,chunkZ*16);
			
		}
	}
	private void generateSurface(World world,Random random,int x,int z){
		generateTrechnoHouse(world, random,x,z);
	}
	private void generateTrechnoHouse(World world, Random random, int ChunkX, int ChunkZ) {
		world.provider.setAllowedSpawnTypes(true, false);
		if(random.nextInt(32)==1){
			for(int i=0;i<1;i++){
				int xCoord=ChunkX+random.nextInt(16);
				int zCoord=ChunkZ+random.nextInt(16);
				int yCoord=getSurfaceLevel(world,xCoord,zCoord);
				int blockSteel=Block.blockDiamond.blockID;
				int torch=Block.torchWood.blockID;
				int glass=Block.glass.blockID;
				int door=Block.doorWood.blockID;
				
				for(int z=0;z<10;z++){
					for(int x=0;x<10;x++){
						createBlock(world,xCoord+10,yCoord-1,zCoord+10,blockSteel,0);
					}
				}
				for(int z=0;z<10;z++){
					for(int x=0;x<10;x++){
						createBlock(world,xCoord+x,yCoord-1,zCoord+z,blockSteel,0);
					}
				}
				for(int z=0;z<7;z++){
					for(int x=0;x<10;x++){
						createBlock(world, xCoord+10, yCoord+4, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+8, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+12, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+16, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+20, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+24, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+28, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+32, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+36, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+40, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+44, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+48, zCoord+10, blockSteel,0);
						createBlock(world, xCoord+10, yCoord+52, zCoord+10, blockSteel,0);
					}
				}
				for(int z=0;z<7;z++){
					for(int x=0;x<10;x++){
						createBlock(world,xCoord+x,yCoord+4,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+8,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+12,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+16,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+20,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+24,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+28,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+32,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+36,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+40,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+44,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+48,zCoord+z+1,blockSteel,0);
						createBlock(world,xCoord+x,yCoord+52,zCoord+z+1,blockSteel,0);
					}
				}
				for(int y=0;y<53;y++){
					createBlock(world,xCoord,yCoord+y,zCoord,blockSteel,0);
					createBlock(world,xCoord+9,yCoord+y,zCoord+10,blockSteel,0);
					createBlock(world,xCoord,yCoord+y,zCoord+10,blockSteel,0);
					createBlock(world,xCoord+9,yCoord+y,zCoord,blockSteel,0);
				}
				for(int y=0;y<53;y++){
					createBlock(world,xCoord,yCoord+y,zCoord,blockSteel,0);
					createBlock(world,xCoord+9,yCoord+y,zCoord+10,blockSteel,0);
					createBlock(world,xCoord,yCoord+y,zCoord+10,blockSteel,0);
					createBlock(world,xCoord+9,yCoord+y,zCoord,blockSteel,0);
				}
				for(int z=0;z<9;z++){
					for(int y=0;y<53;y++){
						createBlock(world, xCoord+1, yCoord+y,zCoord+z, glass,0);
						createBlock(world, xCoord+9, yCoord+y,zCoord+z, glass,0);
					}
				}
				for(int x=0;x<9;x++){
					for(int y=0;y<53;y++){
						createBlock(world, xCoord+x, yCoord+y,zCoord+1, glass,0);
						createBlock(world, xCoord+x, yCoord+y,zCoord+9, glass,0);
					}
				}
				
				createBlock(world,xCoord+2,yCoord,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+1,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+2,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+3,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+4,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+4,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+4,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+4,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+4,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+5,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+6,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+7,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+8,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+8,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+8,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+8,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+8,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+8,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+9,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+10,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+11,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+12,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+12,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+12,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+12,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+12,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+12,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+13,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+14,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+15,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+16,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+16,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+16,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+16,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+16,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+16,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+17,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+18,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+19,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+20,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+20,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+20,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+20,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+20,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+20,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+21,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+22,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+23,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+24,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+24,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+24,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+24,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+24,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+24,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+25,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+26,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+27,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+28,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+28,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+28,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+28,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+28,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+28,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+29,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+30,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+31,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+32,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+32,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+32,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+32,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+32,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+32,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+33,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+34,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+35,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+36,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+36,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+36,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+36,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+36,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+36,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+37,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+38,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+39,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+40,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+40,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+40,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+40,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+40,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+40,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+41,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+42,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+43,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+44,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+44,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+44,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+44,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+44,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord+1,yCoord+44,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+2,yCoord+45,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+3,yCoord+46,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+4,yCoord+47,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+5,yCoord+48,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+6,yCoord+48,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+7,yCoord+48,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+8,yCoord+48,zCoord+8,blockSteel,0);
				createBlock(world,xCoord+9,yCoord+48,zCoord+8,blockSteel,0);
				
				createBlock(world,xCoord,yCoord,zCoord+5,door,0);
				createBlock(world,xCoord,yCoord+1,zCoord+5,door,8);
				createBlock(world,xCoord,yCoord,zCoord+6,door,0);
				createBlock(world,xCoord,yCoord+1,zCoord+6,door,8);
				
				createBlock(world,xCoord+5,yCoord+5,zCoord+5,Block.mobSpawner.blockID,0);
				createBlock(world,xCoord+5,yCoord+13,zCoord+5,Block.mobSpawner.blockID,0);
				createBlock(world,xCoord+5,yCoord+21,zCoord+5,Block.mobSpawner.blockID,0);
				createBlock(world,xCoord+5,yCoord+29,zCoord+5,Block.mobSpawner.blockID,0);
				createBlock(world,xCoord+5,yCoord+37,zCoord+5,Block.mobSpawner.blockID,0);
				

				createBlock(world,xCoord+5,yCoord+49,zCoord+5,Block.chest.blockID,0);
				TileEntityChest tileChest=new TileEntityChest();
				world.setBlockTileEntity(xCoord+1,yCoord,zCoord+1,tileChest);
				for(int slot=0;slot<tileChest.getSizeInventory();slot++){
					int item = random.nextInt(128);
					int stackSize;
					
					if(item==0||item==1||item==2){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.titaniumIngot, stackSize));
					}
					if(item==3||item==4||item==5){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.tinIngot, stackSize));
					}
					if(item==6||item==7||item==8){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.copperIngot, stackSize));
					}
					if(item==9||item==10||item==11){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.amazzonite, stackSize));
					}
					if(item==12){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.tecnezio, stackSize));
					}
					if(item==13){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.bronzeIngot, stackSize));
					}
					if(item==14){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.uraniumIngot, stackSize));
					}
					if(item==15){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.carbon, stackSize));
					}
					if(item==16||item==17||item==18){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.zincIngot, stackSize));
					}
					if(item==19||item==20||item==21){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.leadIngot, stackSize));
					}
					if(item==22||item==23||item==24){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.tungstenIngot, stackSize));
					}
					if(item==25||item==26||item==27){
						stackSize = random.nextInt(2) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.nickelIngot, stackSize));
					}
					if(item==28||item==29||item==30){
						stackSize = random.nextInt(3) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.ivoryHorn, stackSize));
					}
					if(item==31||item==32||item==33){
						stackSize = random.nextInt(1) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.ivoryLeggins, stackSize));
					}
					if(item==34||item==35||item==36){
						stackSize = random.nextInt(1) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.ivoryPlate, stackSize));
					}
					if(item==37||item==38||item==39){
						stackSize = random.nextInt(1) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.ivoryBoots, stackSize));
					}
					if(item==40||item==41||item==42){
						stackSize = random.nextInt(1) + 1;
						tileChest.setInventorySlotContents(slot, new ItemStack(Trechnocraft.ivoryHelmet, stackSize));
					}
				}
			}
		}	
		
	}

	private void createBlock(World world,int xCoord,int yCoord,int zCoord,int blockID,int metadata){
		world.setBlock(xCoord,yCoord,zCoord,blockID,metadata,2);
	}
	private int getSurfaceLevel(World world,int x,int z){
		return world.getHeightValue(x, z);

	}
}