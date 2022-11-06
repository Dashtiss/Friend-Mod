
package net.mcreator.friendsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.friendsmod.init.FriendsModModTabs;

public class ReinforcedIronItem extends Item {
	public ReinforcedIronItem() {
		super(new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
