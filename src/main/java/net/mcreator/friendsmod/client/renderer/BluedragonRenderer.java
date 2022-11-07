
package net.mcreator.friendsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.friendsmod.entity.BluedragonEntity;
import net.mcreator.friendsmod.client.model.Modelcustom_model;

public class BluedragonRenderer extends MobRenderer<BluedragonEntity, Modelcustom_model<BluedragonEntity>> {
	public BluedragonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BluedragonEntity entity) {
		return new ResourceLocation("friends_mod:textures/entities/bluedragon.png");
	}
}
