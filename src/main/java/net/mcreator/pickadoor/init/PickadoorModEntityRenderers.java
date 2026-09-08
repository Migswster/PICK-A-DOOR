/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pickadoor.client.renderer.SewerShadowRenderer;
import net.mcreator.pickadoor.client.renderer.ArachnidRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class PickadoorModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PickadoorModEntities.SEWER_SHADOW.get(), SewerShadowRenderer::new);
		event.registerEntityRenderer(PickadoorModEntities.ARACHNID.get(), ArachnidRenderer::new);
	}
}