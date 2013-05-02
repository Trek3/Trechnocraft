package mods.trechnocraft.common.items;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemSteelHoe extends ItemHoe{

	public ItemSteelHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	public void updateIcons(IconRegister iconReg){
		iconIndex = iconReg.registerIcon("trechnocraft:SteelHoeTexture");
	}
}
