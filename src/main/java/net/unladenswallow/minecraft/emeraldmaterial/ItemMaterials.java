package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMaterials {

	public static ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial(
			"EmeraldTool",
			3,
			1000,
			10.0f,
			2.5f,
			30
			);
	public static ToolMaterial emeraldBroadswordMaterial = EnumHelper.addToolMaterial(
			"EmeraldWeapon",
			0,
			1000,
			10.0f,
			4.0f,
			30
			);
	public static ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial(
			"EmeraldArmor",
			"mod_emeraldmaterial:armor.emerald",
			20,
			new int[] {3, 7, 5, 3},
			30);
	static {
		emeraldToolMaterial.setRepairItem(new ItemStack(Items.emerald));
		emeraldBroadswordMaterial.setRepairItem(new ItemStack(Items.emerald));
		emeraldArmorMaterial.customCraftingMaterial = Items.emerald;
	}

	public static ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial(
			"EmeraldTool",
			3,
			2500,
			6.0f,
			2.0f,
			30
			);
	public static ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial(
			"ObsidianArmor",
			"mod_emeraldmaterial:armor.obsidian",
			40,
			new int[] {2, 6, 5, 2},
			30);
	static {
		obsidianToolMaterial.setRepairItem(new ItemStack(Blocks.obsidian));
		obsidianArmorMaterial.customCraftingMaterial = Item.getItemFromBlock(Blocks.obsidian);
	}
	
}
