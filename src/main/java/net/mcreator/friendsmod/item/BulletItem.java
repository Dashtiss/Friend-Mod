
package net.mcreator.friendsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.friendsmod.init.FriendsModModTabs;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE).stacksTo(64).rarity(Rarity.COMMON));
	}
}
