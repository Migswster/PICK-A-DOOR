/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pickadoor.client.model.ModelSewer_Shadow;

@EventBusSubscriber(Dist.CLIENT)
public class PickadoorModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSewer_Shadow.LAYER_LOCATION, ModelSewer_Shadow::createBodyLayer);
	}
}