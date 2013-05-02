package mods.trechnocraft.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.trechnocraft.common.entity.EntityElephant;
import mods.trechnocraft.common.models.ModelElephant;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;

@SideOnly(Side.CLIENT)
public class RenderElephant extends RenderLiving
{
    public RenderElephant(ModelElephant par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderElephant(EntityElephant entityElephant, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entityElephant, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderElephant((EntityElephant)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderElephant((EntityElephant)par1Entity, par2, par4, par6, par8, par9);
   } 	   
}
