package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.unladenswallow.minecraft.emeraldmaterial.ModEmeraldMaterial;

public class ItemEmeraldArmor extends ItemArmor {

	public static ArmorMaterial material = EnumHelper.addArmorMaterial(
			"EmeraldArmor",
			"mod_emeraldmaterial:armor.emerald",
			20,
			new int[] {3, 7, 5, 3},
			30);
	static {
		material.customCraftingMaterial = Items.emerald;
	}
	
	public ItemEmeraldArmor(String unlocalizedName, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(unlocalizedName);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (playerIsWearingFullSet(player)) {
			this.effectPlayer(player, Potion.moveSpeed, 0);
		}
	}
	
	private boolean playerIsWearingFullSet(EntityPlayer player) {
		return (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModEmeraldMaterial.emeraldHelmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModEmeraldMaterial.emeraldChest
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModEmeraldMaterial.emeraldPants
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModEmeraldMaterial.emeraldBoots
			   );
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, false));
	}
}
