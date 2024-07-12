package net.raphdf201.testmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
				.register((itemGroup) -> itemGroup.add(SUS_SUBSTANCE));
	}

	public static final FoodComponent SUS_THINGS = new FoodComponent.Builder()
			.alwaysEdible()
			.snack()
			.nutrition(69)
			.saturationModifier(69)
			.statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 69, 255, false, false, false), 1)
			.build();

	public static final Item SUS_SUBSTANCE = register(
			new Item(new Item.Settings().maxCount(TestMod.ModMaxCount).fireproof().food(SUS_THINGS)), "sus_substance"
	);
}
