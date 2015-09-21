package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemEmeraldBroadsword extends ItemSword {
	
	public static ToolMaterial material = EnumHelper.addToolMaterial(
			"EmeraldWeapon",
			0,
			1000,
			10.0f,
			4.0f,
			30
			);

	public ItemEmeraldBroadsword() {
		super(material);
		setUnlocalizedName("emeraldBroadsword");
	}
	
}
