
package mods.trechnocraft.common.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelElephant extends ModelBase
{
  //fields
    ModelRenderer orecchio1;
    ModelRenderer orecchio2;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer udders;
    ModelRenderer horn1;
    ModelRenderer Proboscide;
    ModelRenderer horn2;
    ModelRenderer Shape1;
  
  public ModelElephant()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      orecchio1 = new ModelRenderer(this, 25, 0);
      orecchio1.addBox(0F, 0F, 0F, 1, 8, 5);
      orecchio1.setRotationPoint(-5F, -8F, -13F);
      orecchio1.setTextureSize(64, 64);
      orecchio1.mirror = true;
      setRotation(orecchio1, 0F, 0F, 0F);
      orecchio2 = new ModelRenderer(this, 52, 0);
      orecchio2.addBox(0F, 0F, 0F, 1, 8, 5);
      orecchio2.setRotationPoint(5F, -8F, -13F);
      orecchio2.setTextureSize(64, 64);
      orecchio2.mirror = true;
      setRotation(orecchio2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 13, 14);
      head.addBox(-4F, -4F, -6F, 9, 10, 8);
      head.setRotationPoint(0F, -4F, -10F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 8, 24);
      body.addBox(-6F, -10F, -7F, 14, 26, 14);
      body.setRotationPoint(0F, -1F, 2F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
      leg1.addBox(-3F, 0F, 0F, 4, 18, 4);
      leg1.setRotationPoint(-3F, 6F, 8F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
      leg2.addBox(0F, 0F, 0F, 4, 18, 4);
      leg2.setRotationPoint(3F, 6F, 8F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
      leg3.addBox(0F, 0F, 0F, 4, 18, 4);
      leg3.setRotationPoint(-5F, 6F, -5F);
      leg3.setTextureSize(64, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
      leg4.addBox(0F, 0F, 0F, 4, 18, 4);
      leg4.setRotationPoint(3F, 6F, -5F);
      leg4.setTextureSize(64, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
      udders = new ModelRenderer(this, 52, 13);
      udders.addBox(-2F, -3F, 0F, 5, 6, 2);
      udders.setRotationPoint(0F, 7F, 10F);
      udders.setTextureSize(64, 64);
      udders.mirror = true;
      setRotation(udders, 1.570796F, 0F, 0F);
      horn1 = new ModelRenderer(this, 0, 0);
      horn1.addBox(0F, 0F, 0F, 1, 1, 12);
      horn1.setRotationPoint(4F, 6F, -21F);
      horn1.setTextureSize(64, 64);
      horn1.mirror = true;
      setRotation(horn1, 1.041002F, 0F, 0F);
      Proboscide = new ModelRenderer(this, 20, 3);
      Proboscide.addBox(0F, 0F, 0F, 4, 3, 21);
      Proboscide.setRotationPoint(-1.5F, 12F, -23F);
      Proboscide.setTextureSize(64, 64);
      Proboscide.mirror = true;
      setRotation(Proboscide, 1.239184F, 0F, 0F);
      horn2 = new ModelRenderer(this, 0, 0);
      horn2.addBox(0F, 0F, 0F, 1, 1, 12);
      horn2.setRotationPoint(-4F, 6F, -21F);
      horn2.setTextureSize(64, 64);
      horn2.mirror = true;
      setRotation(horn2, 1.041001F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 25, 1);
      Shape1.setRotationPoint(0F, -7F, 17F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0.1115358F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    orecchio1.render(f5);
    orecchio2.render(f5);
    head.render(f5);
    body.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    leg3.render(f5);
    leg4.render(f5);
    udders.render(f5);
    horn1.render(f5);
    Proboscide.render(f5);
    horn2.render(f5);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }
  public void renderAll(float f1){
	    head.render(f1);
	    body.render(f1);
	    leg1.render(f1);
	    leg2.render(f1);
	    leg3.render(f1);
	    leg4.render(f1);
	    udders.render(f1);
	    Proboscide.render(f1);
	    horn2.render(f1);
	    horn1.render(f1);
	    Shape1.render(f1);
	    orecchio1.render(f1);
	    orecchio2.render(f1);
	  
  }
}
