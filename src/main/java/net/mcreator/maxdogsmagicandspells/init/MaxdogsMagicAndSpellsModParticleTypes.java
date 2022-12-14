
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class MaxdogsMagicAndSpellsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<SimpleParticleType> ACCIO_PARTICLES = REGISTRY.register("accio_particles", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> STUPEFY_PARTICLES = REGISTRY.register("stupefy_particles",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> LEVIOSA_PARTICLES = REGISTRY.register("leviosa_particles",
			() -> new SimpleParticleType(false));
}
