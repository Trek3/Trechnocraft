package mods.trechnocraft.common;

import mods.trechnocraft.common.gui.GuiFoundry;
import mods.trechnocraft.common.tileentity.TileEntityFoundry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class TrechnocaftGuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
	switch(id){
	case 0: 
		return new ContainerFoundry(player.inventory, (TileEntityFoundry) tile_entity);
	}
	return null;
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id){
		case 0: 
			return new GuiFoundry(player.inventory, (TileEntityFoundry) tile_entity);
		}
		return null;
	}

}
