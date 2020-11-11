
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemAntimonyNugget;
import net.mcbbs.youcanexplainnothing.item.ItemAntimonyDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeAntimonyNuggetSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeAntimonyNuggetSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 269);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemAntimonyDust.block, (int) (1)), new ItemStack(ItemAntimonyNugget.block, (int) (1)), 0.4F);
	}
}
