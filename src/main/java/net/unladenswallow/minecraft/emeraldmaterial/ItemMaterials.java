package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
			3.5f,
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
			"ObsidianTool",
			3,
			2500,
			6.0f,
			2.0f,
			30
			);
	public static ToolMaterial obsidianBroadswordMaterial = EnumHelper.addToolMaterial(
			"ObsidianWeapon",
			3,
			2500,
			6.0f,
			3.0f,
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
		obsidianBroadswordMaterial.setRepairItem(new ItemStack(Blocks.obsidian));
		obsidianArmorMaterial.customCraftingMaterial = Item.getItemFromBlock(Blocks.obsidian);
	}
	
	public static ToolMaterial lapisToolMaterial = EnumHelper.addToolMaterial(
			"LapisTool",
			2,
			131,
			4.0f,
			1.0f,
			30
			);
	public static ToolMaterial lapisBroadswordMaterial = EnumHelper.addToolMaterial(
			"LapisWeapon",
			2,
			131,
			4.0f,
			2.0f,
			30
			);
	public static ArmorMaterial lapisArmorMaterial = EnumHelper.addArmorMaterial(
			"LapisArmor",
			"mod_emeraldmaterial:armor.lapis",
			15,
			new int[] {2, 5, 4, 1},
			30);
	static {
		lapisToolMaterial.setRepairItem(new ItemStack(Blocks.obsidian));
		lapisBroadswordMaterial.setRepairItem(new ItemStack(Blocks.obsidian));
		lapisArmorMaterial.customCraftingMaterial = Item.getItemFromBlock(Blocks.obsidian);
	}
	
	/* This is a copy of ToolMaterial.GOLD values with damage increased by 1.0 */
	public static ToolMaterial goldBroadswordMaterial = EnumHelper.addToolMaterial(
			"GoldWeapon",
			0,
			32,
			12.0f,
			1.0f,
			22
			);
	static {
		goldBroadswordMaterial.setRepairItem(new ItemStack(Items.gold_ingot));
	}
}
