
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.friendsmod.FriendsModMod;

public class FriendsModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FriendsModMod.MODID);
	public static final RegistryObject<SoundEvent> IMAGINE_DRAGONS_ENEMY = REGISTRY.register("imagine_dragons_enemy",
			() -> new SoundEvent(new ResourceLocation("friends_mod", "imagine_dragons_enemy")));
	public static final RegistryObject<SoundEvent> GUNSHOT = REGISTRY.register("gunshot",
			() -> new SoundEvent(new ResourceLocation("friends_mod", "gunshot")));
}
