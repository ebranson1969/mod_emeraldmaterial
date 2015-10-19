package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCustomArmor extends ItemArmor {

	private Potion fullSetEffect = null;
	
	public ItemCustomArmor(String unlocalizedName, int renderIndex, int armorType, ArmorMaterial material, Potion fullSetEffect) {
		super(material, renderIndex, armorType);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName(unlocalizedName);
		this.fullSetEffect = fullSetEffect;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.fullSetEffect !=  null && playerIsWearingFullSet(player)) {
			this.effectPlayer(player, this.fullSetEffect, 0);
		}
	}
	
	private boolean playerIsWearingFullSet(EntityPlayer player) {
		return (player.inventory.armorItemInSlot(3) != null && ((ItemArmor)(player.inventory.armorItemInSlot(3).getItem())).getArmorMaterial() == this.getArmorMaterial()
			&& player.inventory.armorItemInSlot(2) != null && ((ItemArmor)(player.inventory.armorItemInSlot(2).getItem())).getArmorMaterial() == this.getArmorMaterial()
			&& player.inventory.armorItemInSlot(1) != null && ((ItemArmor)(player.inventory.armorItemInSlot(1).getItem())).getArmorMaterial() == this.getArmorMaterial()
			&& player.inventory.armorItemInSlot(0) != null && ((ItemArmor)(player.inventory.armorItemInSlot(0).getItem())).getArmorMaterial() == this.getArmorMaterial()
			   );
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, false));
	}
}
