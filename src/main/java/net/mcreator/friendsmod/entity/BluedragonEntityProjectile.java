
package net.mcreator.friendsmod.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.friendsmod.init.FriendsModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BluedragonEntityProjectile extends AbstractArrow implements ItemSupplier {
	public BluedragonEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(FriendsModModEntities.BLUEDRAGON_PROJECTILE.get(), world);
	}

	public BluedragonEntityProjectile(EntityType<? extends BluedragonEntityProjectile> type, Level world) {
		super(type, world);
	}

	public BluedragonEntityProjectile(EntityType<? extends BluedragonEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BluedragonEntityProjectile(EntityType<? extends BluedragonEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.FIRE_CHARGE);
	}
}
