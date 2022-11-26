package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.maxdogsmagicandspells.network.MaxdogsMagicAndSpellsModVariables;
import net.mcreator.maxdogsmagicandspells.init.MaxdogsMagicAndSpellsModItems;
import net.mcreator.maxdogsmagicandspells.init.MaxdogsMagicAndSpellsModEntities;
import net.mcreator.maxdogsmagicandspells.entity.StupefySpellEntity;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

public class StupefyKeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MaxdogsMagicAndSpellsModItems.WAND_1
				.get()
				&& (entity.getCapability(MaxdogsMagicAndSpellsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new MaxdogsMagicAndSpellsModVariables.PlayerVariables())).Recharge == true) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level;
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StupefySpellEntity(MaxdogsMagicAndSpellsModEntities.STUPEFY_SPELL.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 0, 0);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(MaxdogsMagicAndSpellsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Recharge = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			MaxdogsMagicAndSpellsMod.queueServerWork(10, () -> {
				{
					boolean _setval = true;
					entity.getCapability(MaxdogsMagicAndSpellsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Recharge = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
