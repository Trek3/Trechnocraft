package mods.trechnocraft.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.trechnocraft.common.ContainerChestBlock;
import mods.trechnocraft.common.Trechnocraft;
import mods.trechnocraft.common.gui.GuiChestBlock;
import mods.trechnocraft.common.tileentity.TileEntityChestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockChestBlock extends Block{
	
	private String TexturePath;

	public BlockChestBlock(int par1,Material mat, String par2Str) {
		super(par1, Material.wood);
		setCreativeTab(Trechnocraft.TrechnoTab);
		
		this.TexturePath = par2Str;
	}
	
	@SideOnly(Side.CLIENT)
	public void RegisterIcons(IconRegister iconReg){
		this.blockIcon = iconReg.registerIcon(this.TexturePath);
		
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c){
		if(player instanceof EntityPlayerMP){
			ModLoader.serverOpenWindow((EntityPlayerMP) player, new ContainerChestBlock(), 30, x, y, z);
		}else{
			ModLoader.openGUI((EntityPlayerSP) player, new GuiChestBlock(player.inventory, x, y, z));
		}
		return true;
	}
	
	public TileEntity createNewTileEntity(World par1world){
		return new TileEntityChestBlock();
	}

}
