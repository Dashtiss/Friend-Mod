
package net.mcreator.friendsmod.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.friendsmod.init.FriendsModModTabs;

public class ImaginerDragonsDiscItem extends RecordItem {
	public ImaginerDragonsDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("friends_mod:imagine_dragons_enemy")),
				new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE).stacksTo(1).rarity(Rarity.RARE), 0);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
