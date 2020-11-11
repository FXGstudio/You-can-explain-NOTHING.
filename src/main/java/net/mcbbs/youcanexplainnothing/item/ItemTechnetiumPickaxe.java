
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Set;
import java.util.HashMap;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemTechnetiumPickaxe extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:technetium_pickaxe")
	public static final Item block = null;
	public ItemTechnetiumPickaxe(ElementsYouCanExplainNothingMod instance) {
		super(instance, 101);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("TECHNETIUM_PICKAXE", 5, 902, 10f, 1f, 35)) {
			{
				this.attackSpeed = -1.8f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("technetium_pickaxe").setRegistryName("technetium_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:technetium_pickaxe", "inventory"));
	}
}
