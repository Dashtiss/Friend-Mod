package net.mcreator.friendsmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelNUKE<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("friends_mod", "model_nuke"), "main");
	public final ModelPart bone;

	public ModelNUKE(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(2, 55).addBox(-23.0F, -8.0F, 4.0F, 30.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 46)
						.mirror().addBox(7.0F, -5.0F, 7.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(16, 50)
						.addBox(11.0F, -7.0F, 7.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(11.0F, -5.0F, 5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(5, 53)
						.addBox(11.0F, -6.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 48)
						.addBox(11.0F, -6.0F, 11.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 52)
						.addBox(11.0F, -7.0F, 10.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(11.0F, -7.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 54)
						.addBox(11.0F, -8.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 54)
						.addBox(11.0F, -8.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 48).mirror()
						.addBox(11.0F, -8.0F, 6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(40, 52)
						.addBox(11.0F, -2.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(47, 54)
						.addBox(11.0F, -2.0F, 5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 48)
						.addBox(11.0F, -1.0F, 6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(52, 54)
						.addBox(11.0F, -2.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 53)
						.addBox(11.0F, -2.0F, 10.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(-24.0F, -7.0F, 5.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-25.0F, -6.0F, 6.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 46)
						.addBox(7.0F, -7.0F, 5.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 50)
						.addBox(8.0F, -6.0F, 6.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 53)
						.addBox(-26.0F, -5.0F, 7.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-23.0F, -9.0F, 5.0F, 30.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-23.0F, 0.0F, 5.0F, 30.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(-23.0F, -6.0F, 3.0F, 30.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-23.0F, -6.0F, 12.0F, 30.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
