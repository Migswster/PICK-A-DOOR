/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.pickadoor.PickadoorMod;

public class PickadoorModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PickadoorMod.MODID);
	public static final DeferredItem<Item> SEWER_SHADOW_SPAWN_EGG;
	public static final DeferredItem<Item> ARACHNID_SPAWN_EGG;
	public static final DeferredItem<Item> SAND_SPIRIT_SPAWN_EGG;
	static {
		SEWER_SHADOW_SPAWN_EGG = REGISTRY.register("sewer_shadow_spawn_egg", () -> new DeferredSpawnEggItem(PickadoorModEntities.SEWER_SHADOW, -1, -1, new Item.Properties()));
		ARACHNID_SPAWN_EGG = REGISTRY.register("arachnid_spawn_egg", () -> new DeferredSpawnEggItem(PickadoorModEntities.ARACHNID, -1, -1, new Item.Properties()));
		SAND_SPIRIT_SPAWN_EGG = REGISTRY.register("sand_spirit_spawn_egg", () -> new DeferredSpawnEggItem(PickadoorModEntities.SAND_SPIRIT, -1, -1, new Item.Properties()));
	}
	// Start of user code block custom items
	// End of user code block custom items
}