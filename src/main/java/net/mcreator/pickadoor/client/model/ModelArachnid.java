package net.mcreator.pickadoor.client.model;

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

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelArachnid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("pickadoor", "model_arachnid"), "main");
	public final ModelPart head;
	public final ModelPart leg_1;
	public final ModelPart leg_2;
	public final ModelPart leg_3;
	public final ModelPart leg_4;
	public final ModelPart leg_5;
	public final ModelPart leg_6;
	public final ModelPart leg_7;
	public final ModelPart leg_8;

	public ModelArachnid(ModelPart root) {
		this.head = root.getChild("head");
		this.leg_1 = root.getChild("leg_1");
		this.leg_2 = root.getChild("leg_2");
		this.leg_3 = root.getChild("leg_3");
		this.leg_4 = root.getChild("leg_4");
		this.leg_5 = root.getChild("leg_5");
		this.leg_6 = root.getChild("leg_6");
		this.leg_7 = root.getChild("leg_7");
		this.leg_8 = root.getChild("leg_8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition leg_1 = partdefinition.addOrReplaceChild("leg_1",
				CubeListBuilder.create().texOffs(20, 20).addBox(0.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 26).addBox(-2.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.5F, 16.0F, -3.5F));
		PartDefinition leg_2 = partdefinition.addOrReplaceChild("leg_2",
				CubeListBuilder.create().texOffs(16, 20).addBox(0.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 22).addBox(-2.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.5F, 16.0F, -1.5F));
		PartDefinition leg_3 = partdefinition.addOrReplaceChild("leg_3",
				CubeListBuilder.create().texOffs(32, 24).addBox(-2.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 20).addBox(0.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.5F, 16.0F, 1.5F));
		PartDefinition leg_4 = partdefinition.addOrReplaceChild("leg_4",
				CubeListBuilder.create().texOffs(24, 32).addBox(-2.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 20).addBox(0.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.5F, 16.0F, 3.5F));
		PartDefinition leg_5 = partdefinition.addOrReplaceChild("leg_5",
				CubeListBuilder.create().texOffs(4, 20).addBox(-1.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32).addBox(-0.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5F, 16.0F, -3.5F));
		PartDefinition leg_6 = partdefinition.addOrReplaceChild("leg_6",
				CubeListBuilder.create().texOffs(8, 32).addBox(-0.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 20).addBox(-1.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5F, 16.0F, -1.5F));
		PartDefinition leg_7 = partdefinition.addOrReplaceChild("leg_7",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.5F, -3.0F, -0.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-0.5F, -3.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5F, 16.0F, 1.5F));
		PartDefinition leg_8 = partdefinition.addOrReplaceChild("leg_8",
				CubeListBuilder.create().texOffs(32, 20).addBox(-0.5F, -3.0F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 20).addBox(-1.5F, -3.0F, -1.5F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5F, 16.0F, 4.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_4.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_5.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_6.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_7.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		leg_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}