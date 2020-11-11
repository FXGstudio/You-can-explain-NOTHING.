
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemTourmalineGem;
import net.mcbbs.youcanexplainnothing.block.BlockTourmalineOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeTourmalineOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeTourmalineOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTourmalineOre.block, (int) (1)), new ItemStack(ItemTourmalineGem.block, (int) (1)), 0.7F);
	}
}
