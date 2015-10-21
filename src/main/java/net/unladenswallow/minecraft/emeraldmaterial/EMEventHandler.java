package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.play.server.S43PacketCamera;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
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
