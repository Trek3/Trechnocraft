package mods.trechnocraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomCreativeTabs extends CreativeTabs {
	public CustomCreativeTabs(String tabID){
		super(tabID);
	}
	@Override
	public ItemStack getIconItemStack(){
		return new ItemStack(Trechnocraft.trechnocraftLogo);
	}

	public String getTranslatedTabLabel(){
		return "Trechnocraft";
	}
}


