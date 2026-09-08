package net.mcreator.pickadoor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.pickadoor.entity.ArachnidEntity;
import net.mcreator.pickadoor.client.model.animations.ArachnidAnimation;
import net.mcreator.pickadoor.client.model.ModelArachnid;

public class ArachnidRenderer extends MobRenderer<ArachnidEntity, ModelArachnid<ArachnidEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("pickadoor:textures/entities/arachnid_texture.png");

	public ArachnidRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelArachnid.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ArachnidEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelArachnid<ArachnidEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ArachnidEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ArachnidEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, ArachnidAnimation.arachnid_idle, ageInTicks, 1f);
				this.animateWalk(ArachnidAnimation.arachnid_walk, limbSwing, limbSwingAmount, 1.5f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ArachnidEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}