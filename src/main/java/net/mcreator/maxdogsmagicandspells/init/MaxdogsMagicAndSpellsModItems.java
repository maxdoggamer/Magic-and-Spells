
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.maxdogsmagicandspells.item.ManaStoneItem;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class MaxdogsMagicAndSpellsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<Item> MANA_STONE = REGISTRY.register("mana_stone", () -> new ManaStoneItem());
	public static final RegistryObject<Item> MANA_STONE_ORE = block(MaxdogsMagicAndSpellsModBlocks.MANA_STONE_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MANA_STONE_BLOCK = block(MaxdogsMagicAndSpellsModBlocks.MANA_STONE_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
