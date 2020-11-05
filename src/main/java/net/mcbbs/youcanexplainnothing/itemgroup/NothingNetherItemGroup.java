
package net.mcbbs.youcanexplainnothing.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class NothingNetherItemGroup extends YouCanExplainNothingModElements.ModElement {
	public NothingNetherItemGroup(YouCanExplainNothingModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnothing_nether") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.NETHERRACK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
