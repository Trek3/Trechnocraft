package mods.trechnocraft.common;

import mods.trechnocraft.common.*;
import mods.trechnocraft.common.entity.EntityTroll;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderTroll extends RenderLiving{
	/**
	 * 
	 * @param modelBase
	 * @param shadowSize
	 */
	public RenderTroll(ModelBase modelBase,float shadowSize){
		super(modelBase,shadowSize);
	}

	public void renderCyborg(EntityTroll par1EntityVenio,double par2,double par4,double par6,float par8,float par9){
		super.doRenderLiving(par1EntityVenio,par2,par4,par6,par8,par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving,double par2,double par4,double par6,float par8,float par9){
		this.renderCyborg((EntityTroll) par1EntityLiving,par2,par4,par6,par8,par9);
	}
	public void doRender(Entity par1Entity,double par2,double par4,double par6,float par8,float par9){
		this.renderCyborg((EntityTroll) par1Entity,par2,par4,par6,par8,par9);
	}
}
