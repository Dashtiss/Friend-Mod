
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FriendsModModTabs {
	public static CreativeModeTab TAB_FURNITURE;

	public static void load() {
		TAB_FURNITURE = new CreativeModeTab("tabfurniture") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FriendsModModItems.MINIGUN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
