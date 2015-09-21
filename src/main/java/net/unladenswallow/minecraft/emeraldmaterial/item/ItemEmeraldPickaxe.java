package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemPickaxe;
import net.unladenswallow.minecraft.emeraldmaterial.EmeraldMaterials;

/**
 * It would be easier to simply instantiate ItemPickaxe with the Emerald material,
 * but unfortunately the ItemPickaxe constructor is protected, so extending it
 * is the next best solution. 
 */
public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe() {
		super(EmeraldMaterials.toolMaterial);
		setUnlocalizedName("emeraldPickaxe");
	}
}
