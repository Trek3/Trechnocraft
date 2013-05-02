package mods.trechnocraft.common.entity;

import java.util.Random;

import mods.trechnocraft.common.Trechnocraft;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityElephant extends EntityAnimal{



	public EntityElephant(World par1World) {
		super(par1World);
		this.texture = "/mods/trechnocraft/textures/blocks/ElephantModelTexture.png";
		this.setSize(2.0F, 2.0F);
		this.getNavigator().setAvoidsWater(true);
		  float f = 0.25F;
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 0.20F));
	        this.tasks.addTask(3, new EntityAIMate(this, f));
	        this.tasks.addTask(6, new EntityAIWander(this, f));
	        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
		
	}
    public boolean isAIEnabled()
    {
        return true;
    }


	@Override
	public int getMaxHealth() {
		
		return 25;
	}

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) {
		
		return null;
	}
	 protected String getLivingSound()
	    {
	        return "mob.pig.say";
	    }

	    protected String getHurtSound()
	    {
	        return "mob.pig.say";
	    }

	    protected String getDeathSound()
	    {
	        return "mob.pig.death";
	    }

	    protected void playStepSound(int par1, int par2, int par3, int par4)
	    {
	        this.playSound("mob.pig.step", 0.15F, 1.0F);
	    }

	    protected void dropFewItems(boolean par1, int par2)
	    {
	        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
	        int k;

	        for (k = 0; k < j; ++k)
	        {
	            this.dropItem(Trechnocraft.ivoryHorn.itemID, 1);
	        }

	        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

	        for (k = 0; k < j; ++k)
	        {
	            if (this.isBurning())
	            {
	                this.dropItem(Item.beefCooked.itemID, 1);
	            }
	            else
	            {
	                this.dropItem(Item.beefRaw.itemID, 1);
	            }

}
	        
	    }
	    
}
