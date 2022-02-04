
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rangerexpansions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rangerexpansions.client.model.ModelRedstone_Arrow;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RangerExpansionsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRedstone_Arrow.LAYER_LOCATION, ModelRedstone_Arrow::createBodyLayer);
	}
}
