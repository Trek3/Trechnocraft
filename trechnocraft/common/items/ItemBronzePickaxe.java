package mods.trechnocraft.common.items;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemBronzePickaxe extends ItemPickaxe{

	public ItemBronzePickaxe(int i, EnumToolMaterial enumToolMaterial){
		
		super(i, enumToolMaterial);
		
		this.setCreativeTab(Trechnocraft.TrechnoTab);
	}
	public void updateIcons(IconRegister iconReg){
		iconIndex = iconReg.registerIcon("trechnocraft:BronzePickaxeTexture");
	}
	
}
