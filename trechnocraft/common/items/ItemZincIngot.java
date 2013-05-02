package mods.trechnocraft.common.items;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemZincIngot extends Item{

	public ItemZincIngot(int par1) {
		super(par1);
		setMaxStackSize(16);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	
	public void updateIcons(IconRegister iconReg){
		iconIndex = iconReg.registerIcon("trechnocraft:ZincIngotTexture");
	
}
}

