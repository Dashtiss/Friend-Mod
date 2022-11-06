
package net.mcreator.friendsmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.friendsmod.init.FriendsModModTabs;
import net.mcreator.friendsmod.init.FriendsModModItems;

public abstract class MilitaryArmorItem extends ArmorItem {
	public MilitaryArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_gold"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(FriendsModModItems.REINFORCED_IRON.get()));
			}

			@Override
			public String getName() {
				return "military_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MilitaryArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "friends_mod:textures/models/armor/military__armor_layer_1.png";
		}
	}

	public static class Chestplate extends MilitaryArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "friends_mod:textures/models/armor/military__armor_layer_1.png";
		}
	}

	public static class Leggings extends MilitaryArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "friends_mod:textures/models/armor/military__armor_layer_2.png";
		}
	}

	public static class Boots extends MilitaryArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(FriendsModModTabs.TAB_FURNITURE));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "friends_mod:textures/models/armor/military__armor_layer_1.png";
		}
	}
}
