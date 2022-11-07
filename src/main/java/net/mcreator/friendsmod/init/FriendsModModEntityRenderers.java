
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.friendsmod.client.renderer.BluedragonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FriendsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FriendsModModEntities.GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FriendsModModEntities.MINIGUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(FriendsModModEntities.BLUEDRAGON.get(), BluedragonRenderer::new);
		event.registerEntityRenderer(FriendsModModEntities.BLUEDRAGON_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
