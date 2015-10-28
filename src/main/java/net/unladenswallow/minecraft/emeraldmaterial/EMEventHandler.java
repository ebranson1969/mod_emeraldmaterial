package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.server.S43PacketCamera;
import net.minecraft.util.DamageSource;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.unladenswallow.minecraft.emeraldmaterial.entity.EntityCustomHorse;
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

	private static DamageSource lastHandledDamageSource = null;
	
/*	private Enchantment[] toolEnchantments = 
		{ Enchantment.fortune, Enchantment.silkTouch, Enchantment.efficiency, Enchantment.unbreaking };
	private Enchantment[] armorEnchantments = 
		{ Enchantment.fireProtection, Enchantment.projectileProtection, Enchantment.blastProtection, 
				Enchantment.protection, Enchantment.unbreaking, Enchantment.respiration, 
				Enchantment.aquaAffinity, Enchantment.thorns };
	private Enchantment[] swordEnchantments =
		{ Enchantment.fireAspect, Enchantment.looting, Enchantment.unbreaking, Enchantment.sharpness,
				Enchantment.smite, Enchantment.baneOfArthropods, Enchantment.knockback };
*/	
	
	@SubscribeEvent
	public void onItemCraftedEvent(ItemCraftedEvent event) {
		if (event.crafting != null 
				&& !event.player.worldObj.isRemote
				&& (event.crafting.getItem() instanceof ItemCustomBow
						|| event.crafting.getItem() instanceof ItemCustomArmor
						|| event.crafting.getItem() instanceof ItemTool
						|| event.crafting.getItem() instanceof ItemHoe
						|| event.crafting.getItem() instanceof ItemSword)
				&& event.crafting.getItem().getUnlocalizedName().contains("lapis") 
			){
			EMLogger.info("EMEventhandler onItemCraftedEvent: Crafting a lapis item: %s",
					event.crafting.getDisplayName());
			EnchantmentHelper.addRandomEnchantment(event.player.worldObj.rand, event.crafting, 1);
			((EntityPlayerMP)(event.player)).playerNetServerHandler.sendPacket(new S43PacketCamera());
			// TODO: Figure out how to do this so that server and client are in sync
		}
	}
	
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event) {
		if (event.entityLiving instanceof EntityPlayer) {
			if (event.source != lastHandledDamageSource) { // Avoid recursively handling this event
				EMLogger.info("EMEventHandler onLivingAttackEvent: entityLiving = %s; source = %s; amount = %f", 
						event.entityLiving.toString(), event.source.getDamageType(), event.ammount);
				int numDOArmorPieces = getNumMatchingArmorPieces((EntityPlayer)event.entityLiving, ItemMaterials.diamondObsidianArmorMaterial);
				float newDamage = event.ammount;
				if (numDOArmorPieces > 0) {
					// Each Diamond-Infused Obsidian Armor piece reduces all damage by 10%
					newDamage = Math.max(1.0f, newDamage - (numDOArmorPieces * 0.1f * newDamage));
					EMLogger.info("EMEventHandler onLivingAttackEvent: DOArmor reduced damage to %f", newDamage);
				}
				if (event.source.isExplosion()) { 
					// Each Obsidian Armor piece reduced explosion damage by 25%.  A full set results
					// in immunity to explosions
					EMLogger.info("EMEventHandler onLivingAttackEvent: entityLiving = %s; source = %s; amount = %f", 
							event.entityLiving.toString(), event.source.getDamageType(), event.ammount);
					int numObsidianArmorPieces = getNumMatchingArmorPieces((EntityPlayer)event.entityLiving, ItemMaterials.obsidianArmorMaterial)
							+ numDOArmorPieces;
					EMLogger.info("EMEventHandler onLivingAttackEvent: EXPLOSION!  numObsidianArmorPieces = %d", numObsidianArmorPieces);
					if (numObsidianArmorPieces > 0) {
						newDamage = newDamage - ((float)numObsidianArmorPieces * newDamage / 4.0f);
						EMLogger.info("EMEventHandler onLivingAttackEvent: Obsidian armor reduced damage to %f", newDamage);
					}
				}
				if (newDamage < event.ammount) {
					EMLogger.info("EMEventHandler onLivingAttackEvent: Cancelling event, newDamage = %f", newDamage);
					event.setCanceled(true);
					if (newDamage > 0.1f) {
						lastHandledDamageSource = event.source;
						event.entityLiving.attackEntityFrom(event.source, newDamage);
					}
				}
			}
		}
	}

	private int getNumMatchingArmorPieces(EntityPlayer player, ArmorMaterial armorMaterial) {
		return ((player.inventory.armorItemInSlot(0) != null && ((ItemArmor)(player.inventory.armorItemInSlot(0).getItem())).getArmorMaterial() == armorMaterial) ? 1 : 0)
			 + ((player.inventory.armorItemInSlot(1) != null && ((ItemArmor)(player.inventory.armorItemInSlot(1).getItem())).getArmorMaterial() == armorMaterial) ? 1 : 0)
			 + ((player.inventory.armorItemInSlot(2) != null && ((ItemArmor)(player.inventory.armorItemInSlot(2).getItem())).getArmorMaterial() == armorMaterial) ? 1 : 0)
			 + ((player.inventory.armorItemInSlot(3) != null && ((ItemArmor)(player.inventory.armorItemInSlot(3).getItem())).getArmorMaterial() == armorMaterial) ? 1 : 0)
			 ;
	}

	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event) {
//		EMLogger.info("EMEventHandler onEntityJoinWorld(): Handling entiny spawn for " + event.entity.getName());
		/* Intercept spawning of horses and spawn our custom horses instead */
		if (!event.world.isRemote) {
			if (event.entity instanceof EntityHorse && !(event.entity instanceof EntityCustomHorse)) {
				EMLogger.info("EMEventHandler onEntityLivingSpawn(): Intercepting horse spawn");
				EntityHorse h = (EntityHorse) event.entity;
				if (h.getCanSpawnHere()) {
					EntityCustomHorse customHorse = new EntityCustomHorse(event.world);
					customHorse.setLocationAndAngles(h.posX, h.posY, h.posZ, h.rotationYaw, h.rotationPitch);
					customHorse.setHorseType(h.getHorseType());
					customHorse.setHorseVariant(h.getHorseVariant());
					h.setDead();
					event.world.spawnEntityInWorld(customHorse);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onRenderLivingEvent(RenderLivingEvent.Pre event) {
		if (event.entity instanceof EntityHorse && ((EntityHorse)event.entity).isTame() && ((EntityHorse)event.entity).isHorseSaddled()) {
//			EMLogger.info("EMEventHandler onRenderLivingEvent(): " + event.entity.getName() + " [" + event.renderer.getClass() + "]");
		}
	}
	
}
