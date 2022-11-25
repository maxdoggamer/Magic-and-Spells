
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.maxdogsmagicandspells.potion.StunnedMobEffect;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class MaxdogsMagicAndSpellsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<MobEffect> STUNNED = REGISTRY.register("stunned", () -> new StunnedMobEffect());
}
