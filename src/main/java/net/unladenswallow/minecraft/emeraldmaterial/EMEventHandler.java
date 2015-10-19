package net.unladenswallow.minecraft.emeraldmaterial;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.unladenswallow.minecraft.emeraldmaterial.entity.EntityCustomHorse;

/**
 * This class contains all of the event handling hooks required by this mod,
 * aside from FML's preInit and init
 * 
 * @author FreneticFeline
 *
 */
public class EMEventHandler {

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
