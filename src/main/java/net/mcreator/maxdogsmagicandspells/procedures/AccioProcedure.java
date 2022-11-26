package net.mcreator.maxdogsmagicandspells.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class AccioProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof ItemEntity) {
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = (entity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			{
				Entity _ent = entity;
				_ent.teleportTo((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), _ent.getYRot(),
							_ent.getXRot());
			}
		}
	}
}
