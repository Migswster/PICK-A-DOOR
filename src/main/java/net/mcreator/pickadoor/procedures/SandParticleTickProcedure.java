package net.mcreator.pickadoor.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.pickadoor.init.PickadoorModParticleTypes;

public class SandParticleTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (PickadoorModParticleTypes.SAND_PARTICLES.get()), x, y, z, 1, 0.4, 0.9, 0.4, 0.005);
	}
}