package net.raphdf201.testmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raphdf201.testmod.TestMod;
import net.raphdf201.testmod.materials.ToolPlasticMaterial;

import static net.raphdf201.testmod.TestMod.MODID;
import static net.raphdf201.testmod.misc.ModItemGroups.PETROL;
import static net.raphdf201.testmod.misc.ModItemGroups.PETROL_KEY;

public class ModItems {
	// NORMAL ITEMS
	public static final Item SUS_SUBSTANCE = register(
			new Item(new Item.Settings().maxCount(TestMod.ModMaxCount).fireproof().food(ModFoods.SUS_THINGS)), "sus_substance"
	);
	public static final Item PLASTIC_BIT = register(
			new Item(new Item.Settings().maxCount(TestMod.ModMaxCount)), "plastic_bit"  // TODO : Add model
	);
	// TOOLS/WEAPONS ITEMS
	public static final Item PLASTIC_SWORD = register(
			new SwordItem(ToolPlasticMaterial.INSTANCE, new Item.Settings()), "plastic_sword"
	);
	// ARMOR ITEMS
	public static final Item PLASTIC_HELMET = register(
			new ArmorItem(ModArmors.PLASTIC, ArmorItem.Type.HELMET, new Item.Settings()), "plastic_helmet"  // TODO : Finish layer 1 and make layer 2
	);
	public static final Item PLASTIC_BOOTS = register(
			new ArmorItem(ModArmors.PLASTIC, ArmorItem.Type.BOOTS, new Item.Settings()), "plastic_boots"
	);

	public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(MODID, id);
		return Registry.register(Registries.ITEM, itemID, item);
	}

	public static void initialize() {
		Registry.register(Registries.ITEM_GROUP, PETROL_KEY, PETROL);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
				.register((itemGroup) -> {
					itemGroup.add(SUS_SUBSTANCE);
					itemGroup.add(PLASTIC_BIT);
				});
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
				.register((itemGroup) -> {
					itemGroup.add(PLASTIC_SWORD);
					itemGroup.add(PLASTIC_HELMET);
					itemGroup.add(PLASTIC_BOOTS);
				});
		ItemGroupEvents.modifyEntriesEvent(PETROL_KEY).
				register((itemGroup) -> {
					itemGroup.add(PLASTIC_HELMET);
					itemGroup.add(PLASTIC_BOOTS);
					itemGroup.add(PLASTIC_SWORD);
					itemGroup.add(PLASTIC_BIT);
				});
	}
}
