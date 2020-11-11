
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemStibnite;
import net.mcbbs.youcanexplainnothing.item.ItemAntimonyIngot;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeAntimonyIngotSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeAntimonyIngotSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 266);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemStibnite.block, (int) (1)), new ItemStack(ItemAntimonyIngot.block, (int) (1)), 1F);
	}
}
