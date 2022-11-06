
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.friendsmod.block.entity.TableBlockEntity;
import net.mcreator.friendsmod.FriendsModMod;

public class FriendsModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			FriendsModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TABLE = register("table", FriendsModModBlocks.TABLE, TableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
