
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.maxdogsmagicandspells.client.particle.StupefyParticlesParticle;
import net.mcreator.maxdogsmagicandspells.client.particle.LeviosaParticlesParticle;
import net.mcreator.maxdogsmagicandspells.client.particle.AccioParticlesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MaxdogsMagicAndSpellsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(MaxdogsMagicAndSpellsModParticleTypes.ACCIO_PARTICLES.get(), AccioParticlesParticle::provider);
		event.register(MaxdogsMagicAndSpellsModParticleTypes.STUPEFY_PARTICLES.get(), StupefyParticlesParticle::provider);
		event.register(MaxdogsMagicAndSpellsModParticleTypes.LEVIOSA_PARTICLES.get(), LeviosaParticlesParticle::provider);
	}
}
