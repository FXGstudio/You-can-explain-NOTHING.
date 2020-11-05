
package net.mcbbs.youcanexplainnothing.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class NothingEndItemGroup extends YouCanExplainNothingModElements.ModElement {
	public NothingEndItemGroup(YouCanExplainNothingModElements instance) {
		super(instance, 66);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnothing_end") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.END_STONE, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
