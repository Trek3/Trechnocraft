package mods.trechnocraft.common;

import mods.trechnocraft.common.entity.EntityElephant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxyTrechnocraft implements IGuiHandler{
	
	public void registerRenderInformation(){}
	
	public void init(){
		EntityRegistry.registerGlobalEntityID(EntityElephant.class, "Elefante", EntityRegistry.findGlobalUniqueEntityId(),3515848,12102);
		registerRenderInformation();
	}
	
	public void registerRenders(){
	}
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		return null;
	}
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		return null;
	}

}
