
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.friendsmod.world.inventory.TableGUIMenu;
import net.mcreator.friendsmod.FriendsModMod;

public class FriendsModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FriendsModMod.MODID);
	public static final RegistryObject<MenuType<TableGUIMenu>> TABLE_GUI = REGISTRY.register("table_gui",
			() -> IForgeMenuType.create(TableGUIMenu::new));
}
