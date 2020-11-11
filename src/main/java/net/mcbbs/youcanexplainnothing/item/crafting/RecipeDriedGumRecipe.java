
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemGum;
import net.mcbbs.youcanexplainnothing.item.ItemDriedGum;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeDriedGumRecipe extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeDriedGumRecipe(ElementsYouCanExplainNothingMod instance) {
		super(instance, 158);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemGum.block, (int) (1)), new ItemStack(ItemDriedGum.block, (int) (1)), 1F);
	}
}
