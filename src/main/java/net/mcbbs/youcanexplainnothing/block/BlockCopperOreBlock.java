
package net.mcbbs.youcanexplainnothing.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcbbs.youcanexplainnothing.creativetab.TabNothingSurface;
import net.mcbbs.youcanexplainnothing.ElementsYouCanExplainNothingMod;

@ElementsYouCanExplainNothingMod.ModElement.Tag
public class BlockCopperOreBlock extends ElementsYouCanExplainNothingMod.ModElement {
	@GameRegistry.ObjectHolder("you_can_explain_nothing:copper_ore_block")
	public static final Block block = null;
	public BlockCopperOreBlock(ElementsYouCanExplainNothingMod instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("copper_ore_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("you_can_explain_nothing:copper_ore_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("copper_ore_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 2);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabNothingSurface.tab);
		}
	}
}
