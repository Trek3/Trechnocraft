package mods.trechnocraft.common.entity;

import java.util.Calendar;

import mods.trechnocraft.common.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTwardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/**
 * 
 * @author Danis
 *
 */
public class EntityTroll extends EntityMob{
	/**
	 * 
	 * @param world
	 */
	public EntityTroll(World world){
		super(world);
		this.texture="/mods/trechnocraft/textures/blocks/MobTexture.png";
		this.moveSpeed=0.30F;
		this.isImmuneToFire();
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0,new EntityAISwimming(this));
		this.tasks.addTask(1,new EntityAIBreakDoor(this));
		this.tasks.addTask(2,new EntityAIAttackOnCollide(this,EntityPlayer.class,this.moveSpeed,true));
		this.tasks.addTask(3,new EntityAIAttackOnCollide(this,EntityVillager.class,this.moveSpeed,true));
		this.tasks.addTask(4,new EntityAIMoveTwardsRestriction(this,this.moveSpeed));
		this.tasks.addTask(5,new EntityAIMoveThroughVillage(this,this.moveSpeed,false));
		this.tasks.addTask(6,new EntityAIWander(this,this.moveSpeed));
		this.tasks.addTask(7,new EntityAIWatchClosest(this,EntityPlayer.class,8.0F));
		this.tasks.addTask(7,new EntityAILookIdle(this));
		this.targetTasks.addTask(1,new EntityAIHurtByTarget(this,true));
		this.targetTasks.addTask(2,new EntityAINearestAttackableTarget(this,EntityPlayer.class,16.0F,0,true));
		this.targetTasks.addTask(2,new EntityAINearestAttackableTarget(this,EntityVillager.class,16.0F,0,false));
		this.tasks.addTask(8,new EntityAITempt(this,0.3F,Trechnocraft.tecnezio.itemID,false));
	}

	protected int func_96121_ay(){
		return 40;
	}

	/**
	 * This method returns a value to be applied directly to entity speed, this
	 * factor is less than 1 when a slowdown potion effect is applied, more than
	 * 1 when a haste potion effect is applied and 2 for fleeing entities.
	 */
	public float getSpeedModifier(){
		return super.getSpeedModifier()*(this.isChild()?1.5F:1.0F);
	}

	protected void entityInit(){
		super.entityInit();
		this.getDataWatcher().addObject(12,Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(13,Byte.valueOf((byte) 0));
		this.getDataWatcher().addObject(14,Byte.valueOf((byte) 0));
	}
	public int getMaxHealth(){
		return 50;
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	protected boolean isAIEnabled(){
		return true;
	}

	/**
	 * If Animal, checks if the age timer is negative
	 */
	public boolean isChild(){
		return this.getDataWatcher().getWatchableObjectByte(12)==1;
	}

	/**
	 * Set whether this zombie is a child.
	 */
	public void setChild(boolean par1){
		this.getDataWatcher().updateObject(12,Byte.valueOf((byte) 1));
	}

	/**
	 * Called frequently so the entity can update its state every tick as
	 * required. For example, zombies and skeletons use this to react to
	 * sunlight and start to burn.
	 */
	public void onLivingUpdate(){
		super.onLivingUpdate();
	    if (this.isWet()){
			this.attackEntityFrom(DamageSource.drown,1);
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate(){
		super.onUpdate();
	}

	public boolean attackEntityAsMob(Entity par1Entity){
		boolean flag=super.attackEntityAsMob(par1Entity);

		if(flag&&this.getHeldItem()==null&&this.isBurning()&&this.rand.nextFloat()<(float) this.worldObj.difficultySetting*0.3F){
			par1Entity.setFire(2*this.worldObj.difficultySetting);
		}

		return flag;
	}

	/**
	 * Returns the amount of damage a mob should deal.
	 */
	public int getAttackStrength(Entity par1Entity){
		ItemStack itemstack=this.getHeldItem();
		float f=(float) (this.getMaxHealth()-this.getHealth())/(float) this.getMaxHealth();
		int i=3+MathHelper.floor_float(f*4.0F);

		if(itemstack!=null){
			i+=itemstack.getDamageVsEntity(this);
		}

		return i;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound(){
		return "mob.zombie.say";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound(){
		return "mob.zombie.hurt";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound(){
		return "mob.zombie.death";
	}

	/**
	 * Plays step sound at given x, y, z for the entity
	 */
	protected void playStepSound(int par1,int par2,int par3,int par4){
		this.playSound("mob.zombie.step",0.15F,1.0F);
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	protected int getDropItemId(){
		return Trechnocraft.amazzonite.itemID;
	}

	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	public EnumCreatureAttribute getCreatureAttribute(){
		return EnumCreatureAttribute.UNDEAD;
	}

	protected void dropRareDrop(int par1){
		switch(this.rand.nextInt(3)){
			case 0:
				this.dropItem(Block.blockDiamond.blockID,1);
				break;
			case 1:
				this.dropItem(Item.carrot.itemID,1);
				break;
			case 2:
				this.dropItem(Item.potato.itemID,1);
		}
	}

	/**
	 * Makes entity wear random armor based on difficulty
	 */
	protected void addRandomArmor(){
		super.addRandomArmor();

		if(this.rand.nextFloat()<(this.worldObj.difficultySetting==3?0.05F:0.01F)){
			int i=this.rand.nextInt(3);

			if(i==0){
				this.setCurrentItemOrArmor(0,new ItemStack(Item.swordSteel));
			}
			else{
				this.setCurrentItemOrArmor(0,new ItemStack(Item.shovelSteel));
			}
		}
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound){
		super.writeEntityToNBT(par1NBTTagCompound);

		if(this.isChild()){
			par1NBTTagCompound.setBoolean("IsBaby",true);
		}
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound){
		super.readEntityFromNBT(par1NBTTagCompound);

		if(par1NBTTagCompound.getBoolean("IsBaby")){
			this.setChild(true);
		}
	}

	/**
	 * This method gets called when the entity kills another one.
	 */
	public void onKillEntity(EntityLiving par1EntityLiving){
		super.onKillEntity(par1EntityLiving);

		if(this.worldObj.difficultySetting>=2&&par1EntityLiving instanceof EntityVillager){
			if(this.worldObj.difficultySetting==2&&this.rand.nextBoolean()){
				return;
			}

			EntityTroll entityzombie=new EntityTroll(this.worldObj);
			entityzombie.func_82149_j(par1EntityLiving);
			this.worldObj.removeEntity(par1EntityLiving);
			entityzombie.initCreature();

			if(par1EntityLiving.isChild()){
				entityzombie.setChild(true);
			}

			this.worldObj.spawnEntityInWorld(entityzombie);
			this.worldObj.playAuxSFXAtEntity((EntityPlayer) null,1016,(int) this.posX,(int) this.posY,(int) this.posZ,0);
		}
	}

	/**
	 * Initialize this creature.
	 */
	public void initCreature(){
		this.setCanPickUpLoot(this.rand.nextFloat()<pickUpLootProability[this.worldObj.difficultySetting]);

		if(this.worldObj.rand.nextFloat()<0.05F){
		}

		this.addRandomArmor();
		this.func_82162_bC();

		if(this.getCurrentItemOrArmor(4)==null){
			Calendar calendar=this.worldObj.getCurrentDate();

			if(calendar.get(2)+1==10&&calendar.get(5)==31&&this.rand.nextFloat()<0.25F){
				this.setCurrentItemOrArmor(4,new ItemStack(this.rand.nextFloat()<0.1F?Block.pumpkinLantern:Block.pumpkin));
				this.equipmentDropChances[4]=0.0F;
			}
		}
	}
	@SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte par1){
		if(par1==16){
			this.worldObj.playSound(this.posX+0.5D,this.posY+0.5D,this.posZ+0.5D,"mob.zombie.remedy",1.0F+this.rand.nextFloat(),this.rand.nextFloat()*0.7F+0.3F,false);
		}
		else{
			super.handleHealthUpdate(par1);
		}
	}
}
