package net.raphdf201.testmod.materials;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class ToolPlasticMaterial implements ToolMaterial {
	public static final ToolPlasticMaterial INSTANCE = new ToolPlasticMaterial();

	@Override
	public int getDurability() {
		return 69;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 0.1f;
	}

	@Override
	public float getAttackDamage() {
		return 0.5f;
	}

	@Override
	public TagKey<Block> getInverseTag() {
		return BlockTags.INCORRECT_FOR_WOODEN_TOOL;
	}

	@Override
	public int getEnchantability() {
		return 0;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return null;    // TODO : Petrol
	}
}
