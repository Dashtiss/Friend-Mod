
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
import net.mcreator.friendsmod.world.features.NoobhutFeature;
import net.mcreator.friendsmod.world.features.Noobhut3Feature;
import net.mcreator.friendsmod.world.features.Noobhut2Feature;
import net.mcreator.friendsmod.FriendsModMod;

@Mod.EventBusSubscriber
public class FriendsModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FriendsModMod.MODID);
	public static final RegistryObject<Feature<?>> TEST = REGISTRY.register("test", TestFeature::feature);
	public static final RegistryObject<Feature<?>> NOOBHUT = REGISTRY.register("noobhut", NoobhutFeature::feature);
	public static final RegistryObject<Feature<?>> NOOBHUT_2 = REGISTRY.register("noobhut_2", Noobhut2Feature::feature);
	public static final RegistryObject<Feature<?>> NOOBHUT_3 = REGISTRY.register("noobhut_3", Noobhut3Feature::feature);
}
