
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemStibnite;
import net.mcbbs.youcanexplainnothing.block.BlockStibniteOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeStibniteOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeStibniteOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 262);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockStibniteOre.block, (int) (1)), new ItemStack(ItemStibnite.block, (int) (1)), 0.7F);
	}
}
