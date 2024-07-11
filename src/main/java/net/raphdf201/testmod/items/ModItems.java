package net.raphdf201.testmod.items;

import net.minecraft.component.type.FoodComponent.Builder;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raphdf201.testmod.TestMod;

public class ModItems {
	public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(TestMod.MODID, id);
		return Registry.register(Registries.ITEM, itemID, item);
	}

	public static void initialize() {
	}

	public static final Item SUS_SUBSTANCE = register(
			new Item(new Item.Settings().maxCount(TestMod.ModMaxCount)), "test_item"
	);
}
