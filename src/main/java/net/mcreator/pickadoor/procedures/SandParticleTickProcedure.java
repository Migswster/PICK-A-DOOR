package net.mcreator.pickadoor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.pickadoor.init.PickadoorModParticleTypes;

public class SandParticleTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (PickadoorModParticleTypes.SAND_PARTICLES.get()), x, y, z, 1, 0.4, 0.9, 0.4, 0.005);
		if (entity.isInWaterRainOrBubble()) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 6);
		}
	}
}