
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.friendsmod.block.VirticalSlabBlock;
import net.mcreator.friendsmod.block.TableBlock;
import net.mcreator.friendsmod.FriendsModMod;

public class FriendsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FriendsModMod.MODID);
	public static final RegistryObject<Block> TABLE = REGISTRY.register("table", () -> new TableBlock());
	public static final RegistryObject<Block> VIRTICAL_SLAB = REGISTRY.register("virtical_slab", () -> new VirticalSlabBlock());
}
