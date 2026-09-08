package net.mcreator.pickadoor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.pickadoor.entity.SandSpiritEntity;

public class SandSpiritRenderer extends HumanoidMobRenderer<SandSpiritEntity, HumanoidModel<SandSpiritEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("pickadoor:textures/entities/a88ed61c-fe48-45ea-b1c2-148b0ad0d64a.png");

	public SandSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<SandSpiritEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(SandSpiritEntity entity) {
		return entityTexture;
	}
}