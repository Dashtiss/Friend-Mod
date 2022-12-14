
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.friendsmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.friendsmod.entity.MinigunEntity;
import net.mcreator.friendsmod.entity.GunEntity;
import net.mcreator.friendsmod.entity.BluedragonEntityProjectile;
import net.mcreator.friendsmod.entity.BluedragonEntity;
import net.mcreator.friendsmod.FriendsModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FriendsModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FriendsModMod.MODID);
	public static final RegistryObject<EntityType<GunEntity>> GUN = register("projectile_gun",
			EntityType.Builder.<GunEntity>of(GunEntity::new, MobCategory.MISC).setCustomClientFactory(GunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MinigunEntity>> MINIGUN = register("projectile_minigun",
			EntityType.Builder.<MinigunEntity>of(MinigunEntity::new, MobCategory.MISC).setCustomClientFactory(MinigunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BluedragonEntity>> BLUEDRAGON = register("bluedragon",
			EntityType.Builder.<BluedragonEntity>of(BluedragonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(500).setUpdateInterval(3).setCustomClientFactory(BluedragonEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BluedragonEntityProjectile>> BLUEDRAGON_PROJECTILE = register("projectile_bluedragon",
			EntityType.Builder.<BluedragonEntityProjectile>of(BluedragonEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BluedragonEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BluedragonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLUEDRAGON.get(), BluedragonEntity.createAttributes().build());
	}
}
