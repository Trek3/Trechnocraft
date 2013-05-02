package mods.trechnocraft.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class TrechnocraftFuelHandler implements IFuelHandler{

	
	public int getBurnTime(ItemStack fuel) {
		if(fuel.itemID == Trechnocraft.copperIngot.itemID){
			return 400;
		}else{
			if(fuel.itemID == Trechnocraft.carbon.itemID){
				return 400;
			}else{
				if(fuel.itemID == fuel.itemID){}
				else{}
				}
		return 0;
			}
			
	}
}

