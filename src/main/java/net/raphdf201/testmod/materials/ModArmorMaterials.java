package net.raphdf201.testmod.materials;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static net.raphdf201.testmod.TestMod.MODID;

public class ModArmorMaterials {
	public static void initialize() {
	}

	public static RegistryEntry<ArmorMaterial> registerMaterial(String id, Map<ArmorItem.Type, Integer> defensePoints, int enchantability, RegistryEntry<SoundEvent> equipSound, Supplier<Ingredient> repairIngredientSupplier, float toughness, float knockbackResistance, boolean dyeable) {
		// Get the supported layers for the armor material
		List<ArmorMaterial.Layer> layers = List.of(
				// The ID of the texture layer, the suffix, and whether the layer is dyeable.
				// We can just pass the armor material ID as the texture layer ID.
				// We have no need for a suffix, so we'll pass an empty string.
				// We'll pass the dyeable boolean we received as the dyeable parameter.
				new ArmorMaterial.Layer(Identifier.of(MODID, id), "", dyeable)
		);

		ArmorMaterial material = new ArmorMaterial(defensePoints, enchantability, equipSound, repairIngredientSupplier, layers, toughness, knockbackResistance);
		// Register the material within the ArmorMaterials registry.
		material = Registry.register(Registries.ARMOR_MATERIAL, Identifier.of(MODID, id), material);

		// The majority of the time, you'll want the RegistryEntry of the material - especially for the ArmorItem constructor.
		return RegistryEntry.of(material);
	}
}
