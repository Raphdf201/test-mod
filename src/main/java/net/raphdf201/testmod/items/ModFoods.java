package net.raphdf201.testmod.items;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoods {
	public static final FoodComponent SUS_THINGS = new FoodComponent.Builder()
			.alwaysEdible()
			.snack()
			.nutrition(696)
			.saturationModifier(6969)
			.statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 696969, 2, false, false, false), 1)
			.build();
}
