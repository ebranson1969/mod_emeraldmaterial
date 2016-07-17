package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCustomArmor extends ItemArmor {

	private Potion fullSetEffect = null;
	
	public ItemCustomArmor(String unlocalizedName, int renderIndex, EntityEquipmentSlot armorType, ArmorMaterial material, Potion fullSetEffect) {
		super(material, renderIndex, armorType);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.fullSetEffect = fullSetEffect;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (this.fullSetEffect !=  null && playerIsWearingFullSet(player)) {
			this.effectPlayer(player, this.fullSetEffect, 0);
		}
	}
	
	private boolean playerIsWearingFullSet(EntityPlayer player) {
		return (playerIsWearingInSlot(player, 0)
			&& playerIsWearingInSlot(player, 1)
			&& playerIsWearingInSlot(player, 2)
			&& playerIsWearingInSlot(player, 3)
			   );
	}

	private boolean playerIsWearingInSlot(EntityPlayer player, int slot) {
		return player.inventory.armorItemInSlot(slot) != null 
				&& player.inventory.armorItemInSlot(slot).getItem() instanceof ItemArmor 
				&& ((ItemArmor)(player.inventory.armorItemInSlot(slot).getItem())).getArmorMaterial() == this.getArmorMaterial();
	}
	
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, false));
	}
}
