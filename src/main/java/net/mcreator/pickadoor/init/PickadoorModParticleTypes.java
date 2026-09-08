/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.pickadoor.PickadoorMod;

public class PickadoorModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, PickadoorMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SAND_PARTICLES = REGISTRY.register("sand_particles", () -> new SimpleParticleType(true));
}