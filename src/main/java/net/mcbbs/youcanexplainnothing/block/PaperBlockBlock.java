
package net.mcbbs.youcanexplainnothing.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.util.Direction;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcbbs.youcanexplainnothing.itemgroup.NothingLinneaItemGroup;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.List;
import java.util.Collections;

@YouCanExplainNothingModElements.ModElement.Tag
public class PaperBlockBlock extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:paper_block")
	public static final Block block = null;
	public PaperBlockBlock(YouCanExplainNothingModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(NothingLinneaItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOL).sound(SoundType.CLOTH).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("paper_block");
		}

		@OnlyIn(Dist.CLIENT)
		public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
			return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Items.PAPER, (int) (4)));
		}
	}
}
