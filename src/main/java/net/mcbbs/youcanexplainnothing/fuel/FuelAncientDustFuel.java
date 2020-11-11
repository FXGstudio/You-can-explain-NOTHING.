
package net.mcbbs.youcanexplainnothing.fuel;

import net.minecraft.item.ItemStack;

import net.mcbbs.youcanexplainnothing.item.ItemAncientDust;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class FuelAncientDustFuel extends ElementsYouCanExplainNothingMod.ModElement {
	public FuelAncientDustFuel(ElementsYouCanExplainNothingMod instance) {
		super(instance, 62);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemAncientDust.block, (int) (1)).getItem())
			return 800;
		return 0;
	}
}
