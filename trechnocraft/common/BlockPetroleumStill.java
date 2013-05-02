package mods.trechnocraft.common;

import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockPetroleumStill extends BlockStationary{


	protected BlockPetroleumStill(int par1) {
		super(par1,Trechnocraft.petroleum);
		this.blockHardness = 100F;
		this.setLightOpacity(3);
		this.disableStats();

	}

public void registerIcons(IconRegister iconReg){
	blockIcon = iconReg.registerIcon("trechnocraft:StillPetroleumTexture");
}

}
