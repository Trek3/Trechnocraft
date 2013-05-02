package mods.trechnocraft.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerChestBlock extends Container {

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return false;
	}

}
