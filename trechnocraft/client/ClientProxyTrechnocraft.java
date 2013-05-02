package mods.trechnocraft.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import mods.trechnocraft.common.*;
import mods.trechnocraft.common.entity.EntityElephant;
import mods.trechnocraft.common.entity.EntityTroll;
import mods.trechnocraft.common.models.ModelElephant;
import mods.trechnocraft.common.models.ModelTroll;




public class ClientProxyTrechnocraft extends CommonProxyTrechnocraft{
	
	public void RegisterRendersInformation(){
	RenderingRegistry.registerEntityRenderingHandler(EntityElephant.class, new RenderElephant(new ModelElephant(), 1.0F));
	RenderingRegistry.registerEntityRenderingHandler(EntityTroll.class,new RenderTroll(new ModelTroll(),1.0F));

	}
	public void registerMobs(){
		EntityRegistry.registerGlobalEntityID(EntityTroll.class,"Troll",EntityRegistry.findGlobalUniqueEntityId(),16777215,9474208);	
	}
	
	public void RegisterRenders(){

	}

	public int addArmor(String string) {
		return 0;
	}
	

}
