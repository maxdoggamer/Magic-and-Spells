package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class LeviosaSpellProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 60, 1, (false), (false)));
		MaxdogsMagicAndSpellsMod.queueServerWork(60, () -> {
			entity.setNoGravity((true));
		});
		MaxdogsMagicAndSpellsMod.queueServerWork(60, () -> {
			entity.setNoGravity((false));
		});
	}
}
