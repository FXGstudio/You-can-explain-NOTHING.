
package net.mcbbs.youcanexplainnothing.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class TabNothingNether extends ElementsYouCanExplainNothingMod.ModElement {
	public TabNothingNether(ElementsYouCanExplainNothingMod instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnothing_nether") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.NETHERRACK, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
