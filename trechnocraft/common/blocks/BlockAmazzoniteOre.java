package mods.trechnocraft.common.blocks;

import java.util.Random;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAmazzoniteOre extends Block{

	public BlockAmazzoniteOre(int par1, Material par2Material) {
		super(par1, par2Material);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	@Override
	public void registerIcons(IconRegister iconReg){
		this.blockIcon = iconReg.registerIcon("trechnocraft:AmazzoniteOreTexture");
	}
	public int idDropped(int par1, Random rand, int par2) {
		return this.blockID;   //Block.block.blockID   //Item.item.ShiftedIndex
	}
	public int quantityDropped(Random rand){
		return rand.nextInt(2);
	}

}
