
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcbbs.youcanexplainnothing.creativetab.TabNothingSurface;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class ItemTheEaster extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:the_easter")
	public static final Item block = null;
	public ItemTheEaster(ElementsYouCanExplainNothingMod instance) {
		super(instance, 120);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("you_can_explain_nothing:the_easter", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("the_easter", ElementsYouCanExplainNothingMod.sounds.get(new ResourceLocation("you_can_explain_nothing:the_easter")));
			setUnlocalizedName("the_easter");
			setRegistryName("the_easter");
			setCreativeTab(TabNothingSurface.tab);
		}
	}
}
