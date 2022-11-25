
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.maxdogsmagicandspells.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.maxdogsmagicandspells.network.StupefyKeyMessage;
import net.mcreator.maxdogsmagicandspells.network.AccioKeyMessage;
import net.mcreator.maxdogsmagicandspells.MaxdogsMagicAndSpellsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MaxdogsMagicAndSpellsModKeyMappings {
	public static final KeyMapping ACCIO_KEY = new KeyMapping("key.maxdogs_magic_and_spells.accio_key", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MaxdogsMagicAndSpellsMod.PACKET_HANDLER.sendToServer(new AccioKeyMessage(0, 0));
				AccioKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping STUPEFY_KEY = new KeyMapping("key.maxdogs_magic_and_spells.stupefy_key", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				MaxdogsMagicAndSpellsMod.PACKET_HANDLER.sendToServer(new StupefyKeyMessage(0, 0));
				StupefyKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ACCIO_KEY);
		event.register(STUPEFY_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				ACCIO_KEY.consumeClick();
				STUPEFY_KEY.consumeClick();
			}
		}
	}
}
