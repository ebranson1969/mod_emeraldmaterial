package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

/**
 * It would be easier to simply instantiate ItemAxe with the Emerald material,
 * but unfortunately the ItemAxe constructor is protected, so extending it
 * is the next best solution. 
 */
public class ItemCustomSpade extends ItemSpade {

public ItemCustomSpade(ToolMaterial toolMaterial, String unlocalizedName) {
		super(toolMaterial);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
	}

}
