
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemTechnetiumIngot;
import net.mcbbs.youcanexplainnothing.block.BlockTechnetiumOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeTechnetiumSRecipe extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeTechnetiumSRecipe(ElementsYouCanExplainNothingMod instance) {
		super(instance, 116);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTechnetiumOre.block, (int) (1)), new ItemStack(ItemTechnetiumIngot.block, (int) (1)), 1F);
	}
}
