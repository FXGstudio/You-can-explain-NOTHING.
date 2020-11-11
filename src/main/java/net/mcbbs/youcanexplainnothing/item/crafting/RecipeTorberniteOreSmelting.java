
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemTorbernite;
import net.mcbbs.youcanexplainnothing.block.BlockTorberniteOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeTorberniteOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeTorberniteOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 185);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTorberniteOre.block, (int) (1)), new ItemStack(ItemTorbernite.block, (int) (1)), 2.8F);
	}
}
