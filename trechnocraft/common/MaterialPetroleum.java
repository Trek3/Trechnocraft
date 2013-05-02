package mods.trechnocraft.common;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialPetroleum extends Material {

	public static final MapColor petroleumColor = new MapColor(0, 0);
	
	public MaterialPetroleum(MapColor petroleumColor) {
		super(petroleumColor);
		this.setNoPushMobility();
		this.isLiquid();
		this.getMaterialMobility();
		this.setBurning();

	}
}
