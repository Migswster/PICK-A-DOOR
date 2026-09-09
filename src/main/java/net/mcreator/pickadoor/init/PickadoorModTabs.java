/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pickadoor.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.pickadoor.PickadoorMod;

@EventBusSubscriber
public class PickadoorModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PickadoorMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PickadoorModItems.SEWER_SHADOW_SPAWN_EGG.get());
			tabData.accept(PickadoorModItems.ARACHNID_SPAWN_EGG.get());
			tabData.accept(PickadoorModItems.SAND_SPIRIT_SPAWN_EGG.get());
			tabData.accept(PickadoorModItems.IKEA_EMPLOYEE_SPAWN_EGG.get());
		}
	}
}