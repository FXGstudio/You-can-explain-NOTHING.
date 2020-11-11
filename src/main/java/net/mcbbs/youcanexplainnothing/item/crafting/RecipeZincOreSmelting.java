
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemZincIngot;
import net.mcbbs.youcanexplainnothing.block.BlockZincOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeZincOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeZincOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 230);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockZincOre.block, (int) (1)), new ItemStack(ItemZincIngot.block, (int) (1)), 0.9099999999999999F);
	}
}
