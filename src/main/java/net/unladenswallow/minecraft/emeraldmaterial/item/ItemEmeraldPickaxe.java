package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemPickaxe;

/**
 * It would be easier to simply instantiate ItemPickaxe with the Emerald material,
 * but unfortunately the ItemPickaxe constructor is protected, so extending it
 * is the next best solution. 
 */
public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe() {
		super(ItemEmeraldTool.material);
		setUnlocalizedName("emeraldPickaxe");
	}
}
