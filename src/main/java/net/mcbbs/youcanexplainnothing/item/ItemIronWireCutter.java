
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemShears;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemIronWireCutter extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:iron_wire_cutter")
	public static final Item block = null;
	public ItemIronWireCutter(ElementsYouCanExplainNothingMod instance) {
		super(instance, 254);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemShears() {
			{
				setMaxDamage(100);
			}
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
				return 4f;
			}
		}.setUnlocalizedName("iron_wire_cutter").setRegistryName("iron_wire_cutter").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:iron_wire_cutter", "inventory"));
	}
}
