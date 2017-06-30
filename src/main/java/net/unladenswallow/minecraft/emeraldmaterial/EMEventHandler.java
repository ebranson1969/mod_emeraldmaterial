package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomArmor;
import net.unladenswallow.minecraft.emeraldmaterial.item.ItemCustomBow;

/**
 * This class contains all of the event handling hooks required by this mod,
 * aside from FML's preInit and init
 * 
 * @author FreneticFeline
 *
 */
public class EMEventHandler {

/*	private Enchantment[] toolEnchantments = 
		{ Enchantment.fortune, Enchantment.silkTouch, Enchantment.efficiency, Enchantment.unbreaking };
	private Enchantment[] armorEnchantments = 
		{ Enchantment.fireProtection, Enchantment.projectileProtection, Enchantment.blastProtection, 
				Enchantment.protection, Enchantment.unbreaking, Enchantment.respiration, 
				Enchantment.aquaAffinity, Enchantment.thorns };
	private Enchantment[] swordEnchantments =
		{ Enchantment.fireAspect, Enchantment.looting, Enchantment.unbreaking, Enchantment.sharpness,
				Enchantment.smite, Enchantment.baneOfArthropods, Enchantment.knockback };
	private Enchantment[] bowEnchantments =
		{ Enchantment.unbreaking, Enchantment.power, Enchantment.punch, Enchantment.flame, Enchantment.infinity };
*/	
	
	@SubscribeEvent
	public void onItemCraftedEvent(ItemCraftedEvent event) {
		if (event.crafting != null 
				&& !event.player.world.isRemote
				&& (event.crafting.getItem() instanceof ItemCustomBow
						|| event.crafting.getItem() instanceof ItemCustomArmor
						|| event.crafting.getItem() instanceof ItemTool
						|| event.crafting.getItem() instanceof ItemHoe
						|| event.crafting.getItem() instanceof ItemSword)
				&& event.crafting.getItem().getUnlocalizedName().contains("lapis") 
			){
//			EMLogger.info("EMEventhandler onItemCraftedEvent: Crafting a lapis item: %s [worldTime = %d]",
//					event.crafting.getDisplayName(), event.player.worldObj.getWorldTime());
			EnchantmentHelper.addRandomEnchantment(event.player.world.rand, event.crafting, 1, false);
			// TODO: Figure out how to do this so that server and client are in sync
//			((EntityPlayerMP)(event.player)).playerNetServerHandler.sendPacket(new S43PacketCamera());
		}
	}
	
	@SubscribeEvent
	public void onLivingAttackEvent(LivingHurtEvent event) {
		if (event.getEntityLiving() instanceof EntityPlayer) {
//			EMLogger.info("");
//			EMLogger.info("EMEventHandler onLivingAttackEvent:  tick = %d; source = %s; amount = %f", 
//					event.entityLiving.worldObj.getWorldTime(), event.source.getDamageType(), event.ammount);
			int numDOArmorPieces = getNumMatchingArmorPieces((EntityPlayer)event.getEntityLiving(), ItemMaterials.diamondObsidianArmorMaterial);
			int numObsidianArmorPieces = getNumMatchingArmorPieces((EntityPlayer)event.getEntityLiving(), ItemMaterials.obsidianArmorMaterial)
					+ numDOArmorPieces;
//			EMLogger.info("EMEventHanlder onLivingAttachEvent:  tick = %d; numDOArmorPieces = %d; numObsidianArmorPieces = %d",
//					event.getEntityLiving().worldObj.getWorldTime(), numDOArmorPieces, numObsidianArmorPieces);
			float newDamage = event.getAmount();
			if (numDOArmorPieces > 0) {
				// Each Diamond-Infused Obsidian Armor piece reduces all damage by 10%, as a workaround to make
				// it slightly more effective than diamond
				newDamage = Math.max(0.5f, newDamage - (numDOArmorPieces * 0.1f * newDamage));
//				EMLogger.info("EMEventHandler onLivingAttackEvent:  tick = %d; DOArmor reduced %s damage to %f", 
//						event.entityLiving.worldObj.getWorldTime(), event.source.getDamageType(), newDamage);
			}
			if (event.getSource().isExplosion() || event.getSource() == DamageSource.ON_FIRE) { 
				// Each Obsidian Armor piece reduces onFire and explosion damage by 22%.  A full set results
				// in near immunity to onFire and explosions.  Standing in fire and lava will still damage.
				if (numObsidianArmorPieces > 0) {
					newDamage = newDamage - ((float)numObsidianArmorPieces * 0.22f * newDamage);
//					EMLogger.info("EMEventHandler onLivingAttackEvent:  tick = %d; Obsidian armor reduced %s damage to %f", 
//							event.entityLiving.worldObj.getWorldTime(), event.source.getDamageType(), newDamage);
				}
			}
			if (event.getSource() == DamageSource.LAVA) {
				// Each Obsidian Armor piece reduces lava damage by 15%.
				if (numObsidianArmorPieces > 0) {
					newDamage = newDamage - ((float)numObsidianArmorPieces * 0.15f * newDamage);
//					EMLogger.info("EMEventHandler onLivingAttackEvent:  tick = %d; Obsidian armor reduced %s damage to %f", 
//							event.entityLiving.worldObj.getWorldTime(), event.source.getDamageType(), newDamage);
				}
			}
			if (newDamage < event.getAmount()) {
//				EMLogger.info("EMEventHandler onLivingAttackEvent:  tick = %d; Updating %s event, newDamage = %f", 
//						event.entityLiving.worldObj.getWorldTime(), event.source.getDamageType(), newDamage);
				event.setAmount(newDamage);
			}
		}
	}

	private int getNumMatchingArmorPieces(EntityPlayer player, ArmorMaterial armorMaterial) {
        int firstArmorInventorySlot = player.inventory.mainInventory.size();
        return (inventorySlotContainsArmor(player.inventory, firstArmorInventorySlot, armorMaterial) ? 1 : 0)
                + (inventorySlotContainsArmor(player.inventory, firstArmorInventorySlot+1, armorMaterial) ? 1 : 0)
                + (inventorySlotContainsArmor(player.inventory, firstArmorInventorySlot+2, armorMaterial) ? 1 : 0)
                + (inventorySlotContainsArmor(player.inventory, firstArmorInventorySlot+3, armorMaterial) ? 1 : 0);
	}

    private boolean inventorySlotContainsArmor(InventoryPlayer inventory, int inventorySlot, ArmorMaterial armorMaterial) {
        return inventory.getStackInSlot(inventorySlot) != null
                && inventory.getStackInSlot(inventorySlot).getItem() instanceof ItemArmor
                && ((ItemArmor)inventory.getStackInSlot(inventorySlot).getItem()).getArmorMaterial() == armorMaterial;
    }

}
