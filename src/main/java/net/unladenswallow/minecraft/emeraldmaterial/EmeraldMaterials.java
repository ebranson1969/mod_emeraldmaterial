package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EmeraldMaterials {

	public static ToolMaterial toolMaterial = EnumHelper.addToolMaterial(
			"EmeraldTool",
			3,
			1000,
			10.0f,
			2.5f,
			30
			);

	public static ToolMaterial broadswordMaterial = EnumHelper.addToolMaterial(
			"EmeraldWeapon",
			0,
			1000,
			10.0f,
			4.0f,
			30
			);

}
