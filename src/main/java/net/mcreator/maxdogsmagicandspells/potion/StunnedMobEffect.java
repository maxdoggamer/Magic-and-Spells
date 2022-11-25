
package net.mcreator.maxdogsmagicandspells.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.maxdogsmagicandspells.procedures.StunnedOnEffectActiveTickProcedure;

public class StunnedMobEffect extends MobEffect {
	public StunnedMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.maxdogs_magic_and_spells.stunned";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StunnedOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
