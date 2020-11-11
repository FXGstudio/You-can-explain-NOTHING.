
package net.mcbbs.youcanexplainnothing.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.creativetab.CreativeTabs;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class TabNothingLinnea extends ElementsYouCanExplainNothingMod.ModElement {
	public TabNothingLinnea(ElementsYouCanExplainNothingMod instance) {
		super(instance, 67);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnothing_linnea") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Items.PAPER, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
