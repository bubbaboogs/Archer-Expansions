
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rangerexpansions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.rangerexpansions.item.WarpBowItem;
import net.mcreator.rangerexpansions.item.ShortBowItem;
import net.mcreator.rangerexpansions.item.RedstoneArrowItem;
import net.mcreator.rangerexpansions.item.BowFragmentItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RangerExpansionsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SHORT_BOW = register(new ShortBowItem());
	public static final Item REDSTONE_ARROW = register(new RedstoneArrowItem());
	public static final Item WARP_BOW = register(new WarpBowItem());
	public static final Item BOW_FRAGMENT = register(new BowFragmentItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
