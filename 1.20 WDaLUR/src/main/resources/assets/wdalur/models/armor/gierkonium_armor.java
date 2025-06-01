// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class gierkonium_armor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "gierkonium_armor"), "main");
	private final ModelPart bipedLeftArm;
	private final ModelPart armorLeftArm;
	private final ModelPart bipedHead;
	private final ModelPart armorHead;
	private final ModelPart bipedBody;
	private final ModelPart armorBody;
	private final ModelPart bipedRightArm;
	private final ModelPart armorRightArm;
	private final ModelPart bipedLeftLeg;
	private final ModelPart armorLeftLeg;
	private final ModelPart armorLeftBoot;
	private final ModelPart bipedRightLeg;
	private final ModelPart armorRightLeg;
	private final ModelPart armorRightBoot;

	public gierkonium_armor(ModelPart root) {
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.armorLeftArm = this.bipedLeftArm.getChild("armorLeftArm");
		this.bipedHead = root.getChild("bipedHead");
		this.armorHead = this.bipedHead.getChild("armorHead");
		this.bipedBody = root.getChild("bipedBody");
		this.armorBody = this.bipedBody.getChild("armorBody");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.armorRightArm = this.bipedRightArm.getChild("armorRightArm");
		this.bipedLeftLeg = root.getChild("bipedLeftLeg");
		this.armorLeftLeg = this.bipedLeftLeg.getChild("armorLeftLeg");
		this.armorLeftBoot = this.bipedLeftLeg.getChild("armorLeftBoot");
		this.bipedRightLeg = root.getChild("bipedRightLeg");
		this.armorRightLeg = this.bipedRightLeg.getChild("armorRightLeg");
		this.armorRightBoot = this.bipedRightLeg.getChild("armorRightBoot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition armorLeftArm = bipedLeftArm.addOrReplaceChild("armorLeftArm", CubeListBuilder.create().texOffs(84, 81).addBox(-0.3F, 4.75F, -2.35F, 4.6F, 1.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(100, 58).addBox(-0.4F, -1.25F, -2.45F, 4.8F, 6.0F, 4.9F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-0.45F, -0.25F, -2.55F, 4.9F, 10.0F, 5.1F, new CubeDeformation(0.0F))
		.texOffs(76, 86).mirror().addBox(2.7F, 8.25F, -2.6F, 1.85F, 2.0F, 5.2F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorLeftArm_r1 = armorLeftArm.addOrReplaceChild("armorLeftArm_r1", CubeListBuilder.create().texOffs(82, 50).addBox(-2.75F, -1.5F, -2.75F, 5.5F, 3.0F, 5.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -1.75F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition bipedHead = partdefinition.addOrReplaceChild("bipedHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead = bipedHead.addOrReplaceChild("armorHead", CubeListBuilder.create().texOffs(0, 29).addBox(-4.65F, -8.1F, -5.05F, 9.3F, 5.8F, 9.65F, new CubeDeformation(0.0F))
		.texOffs(25, 89).addBox(-4.85F, -6.1F, -5.25F, 9.7F, 1.1F, 9.55F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-5.25F, -2.5F, -4.75F, 10.5F, 3.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(87, 25).addBox(-3.5F, -11.607F, -4.6608F, 7.0F, 3.0F, 7.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorHead_r1 = armorHead.addOrReplaceChild("armorHead_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.25F, -4.3618F, -6.8971F, 10.5F, 3.0F, 12.2F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5535F, -0.6411F, -0.1745F, 0.0F, 0.0F));

		PartDefinition armorHead_r2 = armorHead.addOrReplaceChild("armorHead_r2", CubeListBuilder.create().texOffs(8, 101).addBox(-6.5F, -1.7838F, -8.5996F, 13.0F, 2.0F, 14.95F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5535F, -0.6411F, -0.2618F, 0.0F, 0.0F));

		PartDefinition armorHead_r3 = armorHead.addOrReplaceChild("armorHead_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.378F, -1.4825F, -2.695F, 2.44F, 2.44F, 0.549F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5375F, -5.6503F, 0.0F, 0.7854F, 0.0F));

		PartDefinition armorHead_r4 = armorHead.addOrReplaceChild("armorHead_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.062F, -1.4825F, -2.695F, 2.44F, 2.44F, 0.549F, new CubeDeformation(0.0F))
		.texOffs(74, 0).addBox(-2.2687F, -2.5125F, -2.2687F, 5.8F, 5.55F, 5.8F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.5375F, -5.6503F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorBody = bipedBody.addOrReplaceChild("armorBody", CubeListBuilder.create().texOffs(32, 44).addBox(-4.25F, -0.25F, -2.75F, 8.5F, 12.35F, 5.5F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.6038F, 9.5377F, -3.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.4538F, 9.4377F, -4.1F, 1.3F, 0.45F, 1.4F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(1.7538F, 8.7877F, -3.75F, 0.7F, 0.75F, 0.7F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-4.5F, -0.35F, -3.75F, 9.0F, 5.1F, 6.6F, new CubeDeformation(0.0F))
		.texOffs(0, 116).addBox(0.4F, -5.7185F, 6.9961F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.2F, -5.7185F, 6.6961F, 2.4F, 0.9F, 2.6F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorBody_r1 = armorBody.addOrReplaceChild("armorBody_r1", CubeListBuilder.create().texOffs(40, 20).addBox(-3.5F, -6.45F, -3.5F, 7.0F, 1.9F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-2.5F, -7.45F, -2.5F, 5.0F, 1.9F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(30, 61).addBox(-3.5F, 4.55F, -3.5F, 7.0F, 1.9F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(58, 60).addBox(-3.25F, -5.45F, -3.25F, 6.5F, 10.9F, 6.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.7914F, 7.5097F, 0.1309F, 0.0F, 0.0F));

		PartDefinition armorBody_r2 = armorBody.addOrReplaceChild("armorBody_r2", CubeListBuilder.create().texOffs(0, 99).mirror().addBox(0.4F, -0.3076F, -2.0524F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 106).mirror().addBox(-0.1F, 1.6924F, -2.0524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 1.2914F, 6.9097F, 0.1231F, -0.0447F, 0.3463F));

		PartDefinition armorBody_r3 = armorBody.addOrReplaceChild("armorBody_r3", CubeListBuilder.create().texOffs(0, 106).addBox(-0.9F, 1.6924F, -2.0524F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 99).addBox(-0.4F, -0.3076F, -2.0524F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.2914F, 6.9097F, 0.1231F, 0.0447F, -0.3463F));

		PartDefinition armorBody_r4 = armorBody.addOrReplaceChild("armorBody_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8584F, 11.2243F, 0.0928F, 0.0924F, -0.7811F));

		PartDefinition armorBody_r5 = armorBody.addOrReplaceChild("armorBody_r5", CubeListBuilder.create().texOffs(9, 104).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9889F, 11.2329F, 0.1309F, 0.0F, 0.0F));

		PartDefinition armorBody_r6 = armorBody.addOrReplaceChild("armorBody_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9991F, -0.5789F, -0.9991F, 1.9982F, 0.7719F, 1.9982F, new CubeDeformation(0.0F))
		.texOffs(1, 112).addBox(-0.7719F, -0.5789F, -0.7719F, 1.5438F, 1.5438F, 1.5438F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, -1.4685F, 7.4961F, 0.0F, -0.7854F, 0.0F));

		PartDefinition armorBody_r7 = armorBody.addOrReplaceChild("armorBody_r7", CubeListBuilder.create().texOffs(52, 0).addBox(-5.15F, -0.4F, 0.25F, 10.3F, 19.9F, 1.75F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition armorBody_r8 = armorBody.addOrReplaceChild("armorBody_r8", CubeListBuilder.create().texOffs(0, 0).addBox(0.4602F, -1.1546F, -0.35F, 0.7F, 0.75F, 0.7F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.1602F, -0.5046F, -0.7F, 1.3F, 0.45F, 1.4F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.3102F, -0.4046F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0088F, 10.8502F, -3.4F, 0.0F, 0.0F, 0.1309F));

		PartDefinition armorBody_r9 = armorBody.addOrReplaceChild("armorBody_r9", CubeListBuilder.create().texOffs(68, 87).addBox(-1.75F, -1.175F, -0.5F, 3.5F, 2.35F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6462F, 10.1127F, -3.4F, 0.0F, 0.0F, 1.5708F));

		PartDefinition armorBody_r10 = armorBody.addOrReplaceChild("armorBody_r10", CubeListBuilder.create().texOffs(60, 86).addBox(-0.6119F, -9.8157F, -2.4F, 1.5F, 9.35F, 5.9F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 11.925F, -0.5F, 0.0F, 0.0F, -1.3526F));

		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition armorRightArm = bipedRightArm.addOrReplaceChild("armorRightArm", CubeListBuilder.create().texOffs(82, 58).addBox(-4.4F, -1.25F, -2.45F, 4.8F, 6.0F, 4.9F, new CubeDeformation(0.0F))
		.texOffs(85, 89).addBox(-4.45F, -0.25F, -2.55F, 4.9F, 10.0F, 5.1F, new CubeDeformation(0.0F))
		.texOffs(84, 76).addBox(-4.3F, 4.75F, -2.35F, 4.6F, 1.0F, 4.7F, new CubeDeformation(0.0F))
		.texOffs(76, 86).addBox(-4.55F, 8.25F, -2.6F, 1.85F, 2.0F, 5.2F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorRightArm_r1 = armorRightArm.addOrReplaceChild("armorRightArm_r1", CubeListBuilder.create().texOffs(82, 50).mirror().addBox(-2.75F, -1.5F, -2.75F, 5.5F, 3.0F, 5.5F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.75F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition armorLeftLeg = bipedLeftLeg.addOrReplaceChild("armorLeftLeg", CubeListBuilder.create().texOffs(0, 80).addBox(-2.25F, -0.25F, -2.25F, 4.5F, 9.0F, 4.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorLeftBoot = bipedLeftLeg.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create().texOffs(64, 76).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 4.35F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(40, 17).addBox(-2.0F, 10.75F, -3.75F, 4.0F, 1.35F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition armorRightLeg = bipedRightLeg.addOrReplaceChild("armorRightLeg", CubeListBuilder.create().texOffs(48, 76).addBox(-2.25F, -0.25F, -2.25F, 4.5F, 9.0F, 4.5F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition armorRightBoot = bipedRightLeg.addOrReplaceChild("armorRightBoot", CubeListBuilder.create().texOffs(74, 10).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 4.35F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(40, 15).addBox(-2.0F, 10.75F, -3.75F, 4.0F, 1.35F, 1.25F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedHead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}