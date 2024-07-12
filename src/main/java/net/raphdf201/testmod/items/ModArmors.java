package net.raphdf201.testmod.items;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.raphdf201.testmod.materials.ModArmorMaterials;

import java.util.Map;

public class ModArmors {
	public static final RegistryEntry<ArmorMaterial> PLASTIC = ModArmorMaterials.registerMaterial("plastic",
			Map.of(
					ArmorItem.Type.HELMET, 1,
					ArmorItem.Type.CHESTPLATE, 1,
					ArmorItem.Type.LEGGINGS, 1,
					ArmorItem.Type.BOOTS, 1
			),
			0,
			SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			() -> Ingredient.ofItems(ModItems.PLASTIC_BIT),
			0f,
			0f,
			false);
}
