
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
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.creativetab.TabNothingSurface;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

import java.util.Set;
import java.util.HashMap;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemBronzeHammer extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:bronze_hammer")
	public static final Item block = null;
	public ItemBronzeHammer(ElementsYouCanExplainNothingMod instance) {
		super(instance, 224);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("BRONZE_HAMMER", 2, 300, 4f, 0f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("bronze_hammer").setRegistryName("bronze_hammer").setCreativeTab(TabNothingSurface.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:bronze_hammer", "inventory"));
	}
}
