/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.pickadoor.entity.SewerShadowEntity;
import net.mcreator.pickadoor.entity.SandSpiritEntity;
import net.mcreator.pickadoor.entity.IkeaEmployeeEntity;
import net.mcreator.pickadoor.entity.ArachnidEntity;
import net.mcreator.pickadoor.PickadoorMod;

@EventBusSubscriber
public class PickadoorModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, PickadoorMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SewerShadowEntity>> SEWER_SHADOW = register("sewer_shadow",
			EntityType.Builder.<SewerShadowEntity>of(SewerShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ArachnidEntity>> ARACHNID = register("arachnid",
			EntityType.Builder.<ArachnidEntity>of(ArachnidEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SandSpiritEntity>> SAND_SPIRIT = register("sand_spirit",
			EntityType.Builder.<SandSpiritEntity>of(SandSpiritEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<IkeaEmployeeEntity>> IKEA_EMPLOYEE = register("ikea_employee",
			EntityType.Builder.<IkeaEmployeeEntity>of(IkeaEmployeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		SewerShadowEntity.init(event);
		ArachnidEntity.init(event);
		SandSpiritEntity.init(event);
		IkeaEmployeeEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SEWER_SHADOW.get(), SewerShadowEntity.createAttributes().build());
		event.put(ARACHNID.get(), ArachnidEntity.createAttributes().build());
		event.put(SAND_SPIRIT.get(), SandSpiritEntity.createAttributes().build());
		event.put(IKEA_EMPLOYEE.get(), IkeaEmployeeEntity.createAttributes().build());
	}
}