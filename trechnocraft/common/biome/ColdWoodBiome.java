package mods.trechnocraft.common.biome;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;

public class ColdWoodBiome extends BiomeGenBase{

	public ColdWoodBiome(int par1) {
		super(par1);
		this.setBiomeName("North Pole Biome");
		this.fillerBlock = (byte) Block.blockSnow.blockID;
		this.topBlock = (byte) Block.ice.blockID;
		this.maxHeight = 0F;
		this.minHeight = 0F;
		
		
		
	}

}
