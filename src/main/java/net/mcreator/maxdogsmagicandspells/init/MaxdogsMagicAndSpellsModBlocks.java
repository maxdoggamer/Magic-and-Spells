
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.maxdogsmagicandspells.block.ManaStoneOreBlock;
import net.mcreator.maxdogsmagicandspells.block.ManaStoneBlockBlock;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class MaxdogsMagicAndSpellsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<Block> MANA_STONE_ORE = REGISTRY.register("mana_stone_ore", () -> new ManaStoneOreBlock());
	public static final RegistryObject<Block> MANA_STONE_BLOCK = REGISTRY.register("mana_stone_block", () -> new ManaStoneBlockBlock());
}
