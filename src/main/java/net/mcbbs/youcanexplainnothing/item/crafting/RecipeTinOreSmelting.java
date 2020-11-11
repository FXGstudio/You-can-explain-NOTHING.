
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemTinIngot;
import net.mcbbs.youcanexplainnothing.block.BlockTinOre;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeTinOreSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeTinOreSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 204);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTinOre.block, (int) (1)), new ItemStack(ItemTinIngot.block, (int) (1)), 0.7F);
	}
}
