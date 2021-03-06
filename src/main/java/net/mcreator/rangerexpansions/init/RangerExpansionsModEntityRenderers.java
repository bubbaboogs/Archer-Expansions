
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rangerexpansions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rangerexpansions.client.renderer.ShortBowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RangerExpansionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RangerExpansionsModEntities.SHORT_BOW, ShortBowRenderer::new);
		event.registerEntityRenderer(RangerExpansionsModEntities.WARP_BOW, ThrownItemRenderer::new);
	}
}
