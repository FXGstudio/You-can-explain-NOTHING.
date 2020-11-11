
package net.mcbbs.youcanexplainnothing.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class TabNothingSurface extends ElementsYouCanExplainNothingMod.ModElement {
	public TabNothingSurface(ElementsYouCanExplainNothingMod instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnothing_surface") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.GRASS, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
