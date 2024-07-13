package net.raphdf201.testmod.misc;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raphdf201.testmod.items.ModItems;

import static net.raphdf201.testmod.TestMod.MODID;

public class ModItemGroups {
	public static final RegistryKey<ItemGroup> PETROL_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MODID, "item_group"));
	public static final ItemGroup PETROL = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModItems.PLASTIC_BIT))
			.displayName(Text.translatable("itemgroup.petrol"))
			.build();
}
