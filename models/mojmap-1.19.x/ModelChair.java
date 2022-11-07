// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelChair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "chair"), "main");
	private final ModelPart bone;

	public ModelChair(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 27)
						.addBox(-2.0F, -15.0F, 0.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 27)
						.addBox(-16.0F, -15.0F, 0.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-16.0F, -15.0F, 14.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-16.0F, -22.0F, 14.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -22.0F, 14.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-16.0F, -30.0F, 14.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 27)
						.addBox(-2.0F, -15.0F, 14.0F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -16.0F, 0.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}