package mods.trechnocraft.common.biome;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;

public class SavanaBiome extends BiomeGenBase{

	public SavanaBiome(int par1) {
		super(par1);
		this.setBiomeName("Savana Biome");
		this.fillerBlock = (byte) Block.dirt.blockID;
		this.topBlock = (byte) Block.grass.blockID;
		this.setColor(17716639);
		this.maxHeight = 1F;
		this.minHeight = 0F;
		
		
		
	}

}
