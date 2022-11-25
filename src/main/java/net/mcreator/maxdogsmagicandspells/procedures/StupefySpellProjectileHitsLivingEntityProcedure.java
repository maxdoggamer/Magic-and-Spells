package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maxdogsmagicandspells.init.MaxdogsMagicAndSpellsModMobEffects;

public class StupefySpellProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Stunlevel = 0;
		Stunlevel = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get())
				? _livEnt.getEffect(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get()).getAmplifier()
				: 0;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get(), 1200, (int) Stunlevel, (false), (false)));
	}
}
