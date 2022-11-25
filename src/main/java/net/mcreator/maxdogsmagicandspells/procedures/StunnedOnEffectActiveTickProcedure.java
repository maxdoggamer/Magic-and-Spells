package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maxdogsmagicandspells.network.MaxdogsMagicAndSpellsModVariables;
import net.mcreator.maxdogsmagicandspells.init.MaxdogsMagicAndSpellsModMobEffects;

public class StunnedOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get())
				? _livEnt.getEffect(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get()).getAmplifier()
				: 0) > (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 400, 255, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 400, 255, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 400, 2, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 400, 2, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 400, 255, (false), (false)));
			{
				double _setval = 0;
				entity.getCapability(MaxdogsMagicAndSpellsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Stunned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MaxdogsMagicAndSpellsModMobEffects.STUNNED.get());
		}
	}
}
