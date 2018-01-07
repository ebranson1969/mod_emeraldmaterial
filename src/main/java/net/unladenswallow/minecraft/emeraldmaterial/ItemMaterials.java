package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
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
			new int[] {3, 5, 7, 3},
			30,
			SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			0);
	static {
		emeraldToolMaterial.setRepairItem(new ItemStack(Items.EMERALD));
		emeraldBroadswordMaterial.setRepairItem(new ItemStack(Items.EMERALD));
		emeraldArmorMaterial.setRepairItem(new ItemStack(Items.EMERALD));
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
			60,
			new int[] {2, 5, 6, 2},
			30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            1);
	static {
		obsidianToolMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.obsidianIngot));
		obsidianBroadswordMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.obsidianIngot));
		obsidianArmorMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.obsidianIngot));
	}
	
	public static ToolMaterial lapisToolMaterial = EnumHelper.addToolMaterial(
			"LapisTool",
			1,
			131,
			4.0f,
			1.0f,
			30
			);
	public static ToolMaterial lapisBroadswordMaterial = EnumHelper.addToolMaterial(
			"LapisWeapon",
			1,
			131,
			4.0f,
			2.0f,
			30
			);
	public static ArmorMaterial lapisArmorMaterial = EnumHelper.addArmorMaterial(
			"LapisArmor",
			"mod_emeraldmaterial:armor.lapis",
			15,
			new int[] {2, 4, 5, 1},
			30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0);
	static {
		lapisToolMaterial.setRepairItem(new ItemStack(Items.DYE, 1, 4));
		lapisBroadswordMaterial.setRepairItem(new ItemStack(Items.DYE, 1, 4));
		lapisArmorMaterial.setRepairItem(new ItemStack(Items.DYE, 1, 4));
	}
	
	public static ToolMaterial redstoneToolMaterial = EnumHelper.addToolMaterial(
			"RedstoneTool",
			1,
			131,
			4.0f,
			1.0f,
			30
			);
	public static ToolMaterial redstoneBroadswordMaterial = EnumHelper.addToolMaterial(
			"RedstoneWeapon",
			1,
			131,
			4.0f,
			2.0f,
			30
			);
	public static ArmorMaterial redstoneArmorMaterial = EnumHelper.addArmorMaterial(
			"RedstoneArmor",
			"mod_emeraldmaterial:armor.redstone",
			15,
			new int[] {2, 4, 5, 1},
			30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0);
	static {
		redstoneToolMaterial.setRepairItem(new ItemStack(Items.REDSTONE));
		redstoneBroadswordMaterial.setRepairItem(new ItemStack(Items.REDSTONE));
		redstoneArmorMaterial.setRepairItem(new ItemStack(Items.REDSTONE));
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
		goldBroadswordMaterial.setRepairItem(new ItemStack(Items.GOLD_INGOT));
	}


	/* This is a copy of ToolMaterial.IRON values with damage increased by 1.0 */
	public static ToolMaterial ironBroadswordMaterial = EnumHelper.addToolMaterial(
			"IronWeapon",
			2,
			250,
			6.0f,
			3.0f,
			14
			);
	static {
		ironBroadswordMaterial.setRepairItem(new ItemStack(Items.IRON_INGOT));
	}


	/* This is a copy of ToolMaterial.DIAMOND values with damage increased by 1.0 */
	public static ToolMaterial diamondBroadswordMaterial = EnumHelper.addToolMaterial(
			"DiamondWeapon",
			3,
			1561,
			8.0f,
			4.0f,
			10
			);
	static {
		diamondBroadswordMaterial.setRepairItem(new ItemStack(Items.DIAMOND));
	}

	
	public static ToolMaterial diamondObsidianToolMaterial = EnumHelper.addToolMaterial(
			"DiamondObsidianTool",
			3,
			2500,
			8.0f,
			4.0f,
			30
			);
	public static ToolMaterial diamondObsidianBroadswordMaterial = EnumHelper.addToolMaterial(
			"DiamondObsidianWeapon",
			3,
			2500,
			8.0f,
			5.0f,
			30
			);
	public static ArmorMaterial diamondObsidianArmorMaterial = EnumHelper.addArmorMaterial(
			"DiamondObsidianArmor",
			"mod_emeraldmaterial:armor.diamond-obsidian",
			60,
			new int[] {4, 7, 8, 4},
			30,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            3);
	static {
		diamondObsidianToolMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.diamondObsidianIngot));
		diamondObsidianBroadswordMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.diamondObsidianIngot));
		diamondObsidianArmorMaterial.setRepairItem(new ItemStack(ModEmeraldMaterial.diamondObsidianIngot));
	}
	

	public static float getBlockHardness(Block sourceBlock) {
	    return sourceBlock.getDefaultState().getBlockHardness(null, null);
	}
	
    /* Best guess reverse-engineered value of resistance value based on the explosion
     * resistance of the given source block */
	public static float guessResistance(Block sourceBlock) {
	    return sourceBlock.getExplosionResistance(null) * 5.0f / 3.0f;
	}
	
}
