/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.pickadoor.client.particle.SandParticlesParticle;

@EventBusSubscriber(Dist.CLIENT)
public class PickadoorModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(PickadoorModParticleTypes.SAND_PARTICLES.get(), SandParticlesParticle::provider);
	}
}