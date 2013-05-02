package mods.trechnocraft.common.biome;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;

public class RedHotBiome extends BiomeGenBase{

	public RedHotBiome(int par1) {
		super(par1);
		this.setBiomeName("Red Hot Biome");
		this.fillerBlock = (byte) Block.lavaStill.blockID;
		this.topBlock = (byte) Block.obsidian.blockID;
		this.maxHeight = 1F;
		this.minHeight = 0F;
		
		
		
	}

}
