package mods.trechnocraft.common.blocks;

import java.util.Random;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class BlockCopperOre extends Block{

	public BlockCopperOre(int id, Material mat) {
		super(id,mat);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	@Override
	public void registerIcons(IconRegister iconReg){
		this.blockIcon = iconReg.registerIcon("trechnocraft:CopperOreTexture");
	}
	public int idDropped(int par1, Random rand, int par2) {
		return this.blockID;   //Block.block.blockID   //Item.item.ShiftedIndex
	}
	public int quantityDropped(Random rand){
		return 1; 
	}
}


