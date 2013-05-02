package mods.trechnocraft.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.trechnocraft.common.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemIvoryArmor extends ItemArmor implements IArmorTextureProvider{
	public ItemIvoryArmor(int id, EnumArmorMaterial enumArmorMaterial,int render, int piece) {
		super(id,enumArmorMaterial,render,piece);
		setCreativeTab(Trechnocraft.TrechnoTab);
	}
	@Override
	public String getArmorTextureFile(ItemStack itemstack) {
		if(itemstack.itemID==Trechnocraft.ivoryHelmet.itemID||itemstack.itemID==Trechnocraft.ivoryPlate.itemID||itemstack.itemID==Trechnocraft.ivoryBoots.itemID){
			return "/mods/trechnocraft/textures/items/ItemIvoryArmorTexture_1.png";
		}
		if(itemstack.itemID==Trechnocraft.ivoryLeggins.itemID){
			return "/mods/trechnocraft/textures/items/ItemIvoryArmorTexture_2.png";
		}
		else return null;
	}
	@SideOnly(Side.CLIENT)
	public void updateIcons(IconRegister iconreg){
		if(this==Trechnocraft.ivoryHelmet){
			iconIndex=iconreg.registerIcon("trechnocraft:IvoryHelmetTexture");
		}
		if(this==Trechnocraft.ivoryPlate){
			iconIndex=iconreg.registerIcon("trechnocraft:IvoryChestplateTexture");
		}
		if(this==Trechnocraft.ivoryLeggins){
			iconIndex=iconreg.registerIcon("trechnocraft:IvoryLegginsTexture");
		}
		if(this==Trechnocraft.ivoryBoots){
			iconIndex=iconreg.registerIcon("trechnocraft:IvoryBootsTexture");
		}
	}
}
