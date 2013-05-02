package mods.trechnocraft.common.biome;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;


public class MoonBiome extends BiomeGenBase {
		public MoonBiome(int par1) {
			
			super(par1);
			this.setBiomeName("Moon Biome");
			this.fillerBlock = (byte) Block.blockClay.blockID;
			this.topBlock = (byte) Block.blockClay.blockID;
			this.maxHeight = 0F;
			this.minHeight = 0F;
			
			
			
		}

	}

