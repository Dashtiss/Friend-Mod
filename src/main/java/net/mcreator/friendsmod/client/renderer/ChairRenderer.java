
package net.mcreator.friendsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.friendsmod.entity.ChairEntity;
import net.mcreator.friendsmod.client.model.ModelChair;

public class ChairRenderer extends MobRenderer<ChairEntity, ModelChair<ChairEntity>> {
	public ChairRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelChair(context.bakeLayer(ModelChair.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ChairEntity entity) {
		return new ResourceLocation("friends_mod:textures/entities/chair.png");
	}
}
