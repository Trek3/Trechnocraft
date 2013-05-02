package mods.trechnocraft.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import mods.trechnocraft.common.Trechnocraft;

public class BlockUraniumOre extends Block{
	
	
	
	public BlockUraniumOre(int id, Material mat) {
		super(id,mat);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	@Override
	public void registerIcons(IconRegister iconReg){
		this.blockIcon = iconReg.registerIcon("trechnocraft:UraniumOreTexture");
	}
	
	public int idDropped(int par1, Random rand, int par2) {
		return this.blockID;  //Block.block.blockID   //Item.item.ShiftedIndex
	}
	public int quantityDropped(Random rand){
		return 1;
	}
}

