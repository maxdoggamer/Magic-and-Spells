package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.maxdogsmagicandspells.init.MaxdogsMagicAndSpellsModParticleTypes;

public class LeviosaSpellWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (MaxdogsMagicAndSpellsModParticleTypes.LEVIOSA_PARTICLES.get()), x, y, z, 3, 0, 0, 0, 1);
	}
}
