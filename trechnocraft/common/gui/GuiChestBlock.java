package mods.trechnocraft.common.gui;

import org.lwjgl.opengl.GL11;

import mods.trechnocraft.common.ContainerChestBlock;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiChestBlock extends GuiContainer{

	 
	public GuiChestBlock(InventoryPlayer inventory, int x, int y, int z) {
		super(new ContainerChestBlock());

	}
	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2){
		this.fontRenderer.drawString("Stone Chest", 0, 0, 4210752);
		this.fontRenderer.drawString("Inventory", 0, 0, 4210752);
	}
	
	
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture("/gui/mod/CHEST_GUI.png");
		
		this.xSize = 212;
		this.ySize = 222;
		
		int var1 = (this.width - this.xSize) / 2;
		int var2 = (this.height - this.ySize) / 2;
		
		this.drawTexturedModalRect(var1, var2, 0, 0, this.xSize, this.ySize);
	}

}
