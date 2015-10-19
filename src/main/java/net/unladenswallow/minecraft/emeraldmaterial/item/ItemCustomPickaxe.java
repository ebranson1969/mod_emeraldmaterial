package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemPickaxe;

/**
 * It would be easier to simply instantiate ItemPickaxe with the Emerald material,
 * but unfortunately the ItemPickaxe constructor is protected, so extending it
 * is the next best solution. 
 */
public class ItemCustomPickaxe extends ItemPickaxe {

	public ItemCustomPickaxe(ToolMaterial toolMaterial, String unlocalizedName) {
		super(toolMaterial);
		setUnlocalizedName(unlocalizedName);
	}
}
