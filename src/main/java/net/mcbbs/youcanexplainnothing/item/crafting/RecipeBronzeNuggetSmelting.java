
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemBronzeNugget;
import net.mcbbs.youcanexplainnothing.item.ItemBronzeDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeBronzeNuggetSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeBronzeNuggetSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemBronzeDust.block, (int) (1)), new ItemStack(ItemBronzeNugget.block, (int) (1)), 5F);
	}
}
