
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.maxdogsmagicandspells.world.features.ores.ManaStoneOreFeature;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

@Mod.EventBusSubscriber
public class MaxdogsMagicAndSpellsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<Feature<?>> MANA_STONE_ORE = REGISTRY.register("mana_stone_ore", ManaStoneOreFeature::feature);
}
