
package net.mcbbs.youcanexplainnothing.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemSolderingAlloyNugget;
import net.mcbbs.youcanexplainnothing.item.ItemSolderingAlloyDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class RecipeSolderingAlloyNuggetSmelting extends ElementsYouCanExplainNothingMod.ModElement {
	public RecipeSolderingAlloyNuggetSmelting(ElementsYouCanExplainNothingMod instance) {
		super(instance, 275);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemSolderingAlloyDust.block, (int) (1)), new ItemStack(ItemSolderingAlloyNugget.block, (int) (1)),
				0.5F);
	}
}
