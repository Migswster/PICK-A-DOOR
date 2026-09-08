package net.mcreator.pickadoor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.pickadoor.entity.SewerShadowEntity;
import net.mcreator.pickadoor.client.model.animations.Sewer_ShadowAnimation;
import net.mcreator.pickadoor.client.model.ModelSewer_Shadow;

public class SewerShadowRenderer extends MobRenderer<SewerShadowEntity, ModelSewer_Shadow<SewerShadowEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("pickadoor:textures/entities/sewer_shadow_texture.png");

	public SewerShadowRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSewer_Shadow.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SewerShadowEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelSewer_Shadow<SewerShadowEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SewerShadowEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SewerShadowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, Sewer_ShadowAnimation.sewer_shadow_living, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SewerShadowEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}