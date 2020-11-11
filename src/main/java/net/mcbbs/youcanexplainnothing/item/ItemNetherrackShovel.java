
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Set;
import java.util.HashMap;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemNetherrackShovel extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:netherrack_shovel")
	public static final Item block = null;
	public ItemNetherrackShovel(ElementsYouCanExplainNothingMod instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("NETHERRACK_SHOVEL", 1, 95, 4f, -3f, 7)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("netherrack_shovel").setRegistryName("netherrack_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:netherrack_shovel", "inventory"));
	}
}
