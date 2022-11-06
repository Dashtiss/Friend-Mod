
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.friendsmod.world.features.TestFeature;
import net.mcreator.friendsmod.FriendsModMod;

@Mod.EventBusSubscriber
public class FriendsModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FriendsModMod.MODID);
	public static final RegistryObject<Feature<?>> TEST = REGISTRY.register("test", TestFeature::feature);
}
