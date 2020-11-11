
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemCopperIngot;
import net.mcbbs.youcanexplainnothing.block.BlockCopperOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeCopperOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeCopperOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 41);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockCopperOre.block, (int) (1)), new ItemStack(ItemCopperIngot.block, (int) (1)),
				0.5249999999999999F);
	}
}
