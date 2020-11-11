
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Set;
import java.util.HashMap;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemNetherrackHoe extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:netherrack_hoe")
	public static final Item block = null;
	public ItemNetherrackHoe(ElementsYouCanExplainNothingMod instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("NETHERRACK_HOE", 1, 95, 4f, 0f, 7)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("netherrack_hoe").setRegistryName("netherrack_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:netherrack_hoe", "inventory"));
	}
}
