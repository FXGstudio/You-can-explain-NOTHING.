
package net.mcbbs.youcanexplainnothing.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class NothingSurfaceItemGroup extends YouCanExplainNothingModElements.ModElement {
	public NothingSurfaceItemGroup(YouCanExplainNothingModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnothing_surface") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.GRASS_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
