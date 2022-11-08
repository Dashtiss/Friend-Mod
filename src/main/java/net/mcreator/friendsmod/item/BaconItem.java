
package net.mcreator.friendsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.friendsmod.init.FriendsModModTabs;

public class BaconItem extends Item {
	public BaconItem() {
		super(new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(3f)

						.meat().build()));
	}
}
