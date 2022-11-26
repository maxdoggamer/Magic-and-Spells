
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogsmagicandspells.entity.StupefySpellEntity;
import net.mcreator.maxdogsmagicandspells.entity.LeviosaSpellEntity;
import net.mcreator.maxdogsmagicandspells.entity.LevicorpusSpellEntity;
import net.mcreator.maxdogsmagicandspells.entity.AccioSpellEntity;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MaxdogsMagicAndSpellsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
			MaxdogsMagicAndSpellsMod.MODID);
	public static final RegistryObject<EntityType<AccioSpellEntity>> ACCIO_SPELL = register("projectile_accio_spell",
			EntityType.Builder.<AccioSpellEntity>of(AccioSpellEntity::new, MobCategory.MISC).setCustomClientFactory(AccioSpellEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StupefySpellEntity>> STUPEFY_SPELL = register("projectile_stupefy_spell",
			EntityType.Builder.<StupefySpellEntity>of(StupefySpellEntity::new, MobCategory.MISC).setCustomClientFactory(StupefySpellEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LeviosaSpellEntity>> LEVIOSA_SPELL = register("projectile_leviosa_spell",
			EntityType.Builder.<LeviosaSpellEntity>of(LeviosaSpellEntity::new, MobCategory.MISC).setCustomClientFactory(LeviosaSpellEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LevicorpusSpellEntity>> LEVICORPUS_SPELL = register("projectile_levicorpus_spell",
			EntityType.Builder.<LevicorpusSpellEntity>of(LevicorpusSpellEntity::new, MobCategory.MISC)
					.setCustomClientFactory(LevicorpusSpellEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
