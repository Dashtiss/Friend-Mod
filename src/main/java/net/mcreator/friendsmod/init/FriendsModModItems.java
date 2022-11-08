
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.friendsmod.item.ReinforcedIronItem;
import net.mcreator.friendsmod.item.MinigunItem;
import net.mcreator.friendsmod.item.MilitaryArmorItem;
import net.mcreator.friendsmod.item.ImaginerDragonsDiscItem;
import net.mcreator.friendsmod.item.GunItem;
import net.mcreator.friendsmod.item.BulletItem;
import net.mcreator.friendsmod.item.BaconItem;
import net.mcreator.friendsmod.FriendsModMod;

public class FriendsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FriendsModMod.MODID);
	public static final RegistryObject<Item> TABLE = block(FriendsModModBlocks.TABLE, FriendsModModTabs.TAB_FURNITURE);
	public static final RegistryObject<Item> VIRTICAL_SLAB = block(FriendsModModBlocks.VIRTICAL_SLAB, FriendsModModTabs.TAB_FURNITURE);
	public static final RegistryObject<Item> IMAGINER_DRAGONS_DISC = REGISTRY.register("imaginer_dragons_disc", () -> new ImaginerDragonsDiscItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());
	public static final RegistryObject<Item> MINIGUN = REGISTRY.register("minigun", () -> new MinigunItem());
	public static final RegistryObject<Item> REINFORCED_IRON = REGISTRY.register("reinforced_iron", () -> new ReinforcedIronItem());
	public static final RegistryObject<Item> MILITARY_ARMOR_HELMET = REGISTRY.register("military_armor_helmet", () -> new MilitaryArmorItem.Helmet());
	public static final RegistryObject<Item> MILITARY_ARMOR_CHESTPLATE = REGISTRY.register("military_armor_chestplate",
			() -> new MilitaryArmorItem.Chestplate());
	public static final RegistryObject<Item> MILITARY_ARMOR_LEGGINGS = REGISTRY.register("military_armor_leggings",
			() -> new MilitaryArmorItem.Leggings());
	public static final RegistryObject<Item> MILITARY_ARMOR_BOOTS = REGISTRY.register("military_armor_boots", () -> new MilitaryArmorItem.Boots());
	public static final RegistryObject<Item> BACON = REGISTRY.register("bacon", () -> new BaconItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
