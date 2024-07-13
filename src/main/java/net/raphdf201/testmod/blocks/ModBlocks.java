package net.raphdf201.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.raphdf201.testmod.TestMod.MODID;

public class ModBlocks {
	public static Block register(Block block, String name, boolean shouldRegisterItem) {
		Identifier blockID = Identifier.of(MODID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, blockID, blockItem);
		}

		return Registry.register(Registries.BLOCK, blockID, block);
	}

	public static void initialize() {
	}
}
