package mods.trechnocraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.liquids.*;

public class IBlockLiquidPetroleum implements IBlockLiquid{
	
	public IBlockLiquidPetroleum(){
		this.setCreativeTab(Trechnocraft.TrechnoTab);
	}
	
	

	private void setCreativeTab(CreativeTabs trechnoTab) {
		
	}



	@Override
	public int stillLiquidId() {
		return 800;
	}

	@Override
	public boolean isMetaSensitive() {
		return false;
	}

	@Override
	public int stillLiquidMeta() {
		return 0;
	}

	@Override
	public boolean willGenerateSources() {
		return false;
	}

	@Override
	public int getFlowDistance() {
		return 5;
	}

	@Override
	public byte[] getLiquidRGB() {
		return null;
	}

	@Override
	public String getLiquidBlockTextureFile() {
		return "/mods/trechnocraft/textures/blocks/petroleum.png";
	}

	@Override
	public NBTTagCompound getLiquidProperties() {
		return null;
	}

   }


