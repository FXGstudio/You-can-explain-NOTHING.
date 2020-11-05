
package net.mcbbs.youcanexplainnothing.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class NothingLinneaItemGroup extends YouCanExplainNothingModElements.ModElement {
	public NothingLinneaItemGroup(YouCanExplainNothingModElements instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnothing_linnea") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.PAPER, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
