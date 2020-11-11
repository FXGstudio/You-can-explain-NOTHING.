
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemBrassNugget;
import net.mcbbs.youcanexplainnothing.item.ItemBrassDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeBrassNuggetSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeBrassNuggetSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 238);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBrassDust.block, (int) (1)), new ItemStack(ItemBrassNugget.block, (int) (1)), 5F);
	}
}
