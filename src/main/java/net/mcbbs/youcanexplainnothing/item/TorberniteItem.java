
package net.mcbbs.youcanexplainnothing.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcbbs.youcanexplainnothing.itemgroup.NothingSurfaceItemGroup;
import net.mcbbs.youcanexplainnothing.YouCanExplainNothingModElements;

import java.util.List;

@YouCanExplainNothingModElements.ModElement.Tag
public class TorberniteItem extends YouCanExplainNothingModElements.ModElement {
	@ObjectHolder("you_can_explain_nothing:torbernite")
	public static final Item block = null;
	public TorberniteItem(YouCanExplainNothingModElements instance) {
		super(instance, 180);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NothingSurfaceItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("torbernite");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cu(UO2)2[PO4]2\u00B712H2O"));
		}
	}
}
