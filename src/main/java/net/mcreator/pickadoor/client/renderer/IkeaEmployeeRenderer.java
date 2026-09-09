package net.mcreator.pickadoor.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.pickadoor.entity.IkeaEmployeeEntity;

public class IkeaEmployeeRenderer extends HumanoidMobRenderer<IkeaEmployeeEntity, HumanoidModel<IkeaEmployeeEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("pickadoor:textures/entities/ikea_employee_texture.png");

	public IkeaEmployeeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<IkeaEmployeeEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(IkeaEmployeeEntity entity) {
		return entityTexture;
	}
}