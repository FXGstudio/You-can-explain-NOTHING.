
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcbbs.youcanexplainnothing.itemgroup.NothingSurfaceItemGroup;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

@YouCanExplainNothingModElements.ModElement.Tag
public class BrassCompressedPlateItem extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:brass_compressed_plate")
	public static final Item block = null;
	public BrassCompressedPlateItem(YouCanExplainNothingModElements instance) {
		super(instance, 249);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NothingSurfaceItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("brass_compressed_plate");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
