
package net.mcbbs.youcanexplainnothing.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcbbs.youcanexplainnothing.itemgroup.NothingSurfaceItemGroup;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.List;
import java.util.Collections;

@YouCanExplainNothingModElements.ModElement.Tag
public class GumFenceBlock extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:gum_fence")
	public static final Block block = null;
	public GumFenceBlock(YouCanExplainNothingModElements instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(NothingSurfaceItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FenceBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).lightValue(0));
			setRegistryName("gum_fence");
		}

		@Override
		public boolean func_220111_a(BlockState state, boolean checkattach, Direction face) {
			boolean flag = state.getBlock() instanceof FenceBlock && state.getMaterial() == this.material;
			boolean flag1 = state.getBlock() instanceof FenceGateBlock && FenceGateBlock.isParallel(state, face);
			return !cannotAttach(state.getBlock()) && checkattach || flag || flag1;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
